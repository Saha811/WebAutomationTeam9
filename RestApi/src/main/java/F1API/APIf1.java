package F1API;

import base.CommonAPI;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class APIf1 extends CommonAPI {

    public void f1API() {
        Response response = given().when().get("http://ergast.com/api/f1/2008/5/results.json");
        String status = response.getStatusLine();
        int code = response.getStatusCode();
        String body = response.getBody().print();
        Assert.assertEquals(status, "HTTP/1.1 200 OK");
        Assert.assertEquals(code, 200);
        System.out.println("Response code of the page is : " + code);
        System.out.println("Body of the page is : " + body);
    }

    public void f1APIBadCall() {
        Response response = null;
        int code;
        try {
            response = given().when().get("http://ergast.com/api/f1/2008/5/results.json");
            code = response.getStatusCode();
            String body = response.getBody().print();
            System.out.println("Response code of the page is : " + code);
        } catch (Exception ex) {
            code = response.getStatusCode();
            Assert.assertEquals(code, 404);
        }
    }

    public void f1APIserverErrors() {
        Response response = null;
        int statusCode = 0;
        try {
            response = given().when().get("http://ergast.com/api/f1/2008/5/rsults.json");
            statusCode = response.getStatusCode();
        } catch (Exception ex) {
        }
        Assert.assertEquals(statusCode, 400);
        System.out.println("Status code of the page is : " + statusCode);
        System.out.println("Response code of the page is : " + response);
    }
    //http://ergast.com/api/f1/drivers.json?limit=10&offset=20
    public static void main(String[] args) {
        RestAssured.baseURI = "http://ergast.com";
        String b = "{'MRData':{'xmlns':'http://ergast.com/mrd/1.4','series':'f1','url':'http://ergast.com/api/f1/drivers/alonso.json','limit':'30','offset':'0','total':'1','DriverTable':{'driverId':'alonso','Drivers':[{'driverId':'alonso','permanentNumber':'14','code':'ALO','url':'http://en.wikipedia.org/wiki/Fernando_Alonso','givenName':'Fernando','familyName':'Alonso','dateOfBirth':'1981-07-29','nationality':'Spanish'}]}}";
        Response response = given().
        queryParam("limit", "10").
        body(b).
        when().
        post("/api/f1/drivers/alonso.json").
        then().assertThat().statusCode(200).and().contentType(ContentType.JSON).
        and().
        body("Content-Length", equalTo(null)). //supposed to be 416
        extract().response();
        String responseString = response.asString();
        System.out.println(responseString);
        JsonPath jsonpath = new JsonPath(responseString);
        System.out.println(jsonpath);
        String series = jsonpath.get("MRData.series");
        System.out.println(series);
        given().body("{'series':"+series+"");
    }
    //assert if status code and content type matches and travel to specific place
    public void test2() {
        RestAssured.baseURI = "http://ergast.com";
        given().
                param("limit", "10").
                when().get("api/f1/drivers.json").
                then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
                body("MRData.DriverTable.Drivers[8].nationality", equalTo("Dutch")).
                and().
                body("MRData.limit", equalTo("10"));
    }

    //check if server is correct or not
    public void test3() {
        RestAssured.baseURI = "http://ergast.com";
        given().
                param("limit", "10").
                when().get("api/f1/drivers.json").
                then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
                header("Server", "Apache/2.2.15 (CentOS)");
    }

    //post request must declare what type of parameter we are gonna use
    //-Path prm - https://example.com/books/{book_id}
    //-Query prm - https://example.com?q=searchitem
    //-Header prm -- content type-application por json
    public void test4() {
        RestAssured.baseURI = "http://ergast.com";
        given().
                queryParam("limit", "10").
                when().
                post("/api/f1/drivers.json").
                then().assertThat().statusCode(200).and().contentType(ContentType.JSON);
    }
}
