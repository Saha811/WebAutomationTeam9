package JiraAPI;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import static io.restassured.RestAssured.given;
import io.restassured.response.Response;

public class CommonRestAPI {

    public static XmlPath rawToXML(Response r) {
        String respon=r.asString();
        XmlPath x=new XmlPath(respon);
        return x;
    }

    public static JsonPath rawToJson(Response r) {
        String respon=r.asString();
        JsonPath x=new JsonPath(respon);
        return x;
    }

    public static String getSessionKEY(){
        RestAssured.baseURI = "http://localhost:8080";
        Response res = given().header("Content-Type", "application/json").
                body("{\"username\": \"naim_khan\",\"password\": \"jira123\"}").
                when().post("/rest/auth/1/session").then().
                statusCode(200).extract().response();
        JsonPath js = CommonRestAPI.rawToJson(res);
        String sessionId = js.get("session.value");
        System.out.println(sessionId);
        return sessionId;
    }
}
