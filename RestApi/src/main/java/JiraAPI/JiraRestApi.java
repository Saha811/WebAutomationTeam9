package JiraAPI;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class JiraRestApi {
    //getting status code
    public void test2(){
        RestAssured.baseURI = "http://localhost:8080";
        Response response = given().header("Content-Type", "application/json").
                body("{\"username\": \"naim_khan\",\"password\": \"jira123\"}").
                when().post("/rest/auth/1/session").then().
                statusCode(200).extract().response();
        JsonPath js = CommonRestAPI.rawToJson(response);
        String sessionId = js.get("session.value");
        System.out.println(sessionId);
    }

    //creating issue/Defact
    public void JiraApi(){
        RestAssured.baseURI = "http://localhost:8080";
       Response response = given().header("Content-Type", "application/json").
          header("Cookie","JSESSIONID="+CommonRestAPI.getSessionKEY()).
                body("{\n" +
                        "\t\"fields\": {\n" +
                        "\t\t\"project\":\n" +
                        "\t\t{\n" +
                        "\t\t\t\"key\":\"TEAM\"\n" +
                        "\t\t},\n" +
                        "\t\t\"summary\":\"Credit Card Defact\",\n" +
                        "\t\t\"description\": \"rest api testing ...\",\n" +
                        "\t\t\"issuetype\": {\n" +
                        "\t\t\t\"name\": \"Bug\"\n" +
                        "\t\t}\n" +
                        "\t}\n" +
                        "}").
                when().post("/rest/api/2/issue").then().statusCode(201).extract().response();
        JsonPath js = CommonRestAPI.rawToJson(response);
        String ID = js.get("id");
        System.out.println(ID);
    }

    //insert comment
    public void testInsertComment(){
        RestAssured.baseURI = "http://localhost:8080";
        Response response = given().header("Content-Type", "application/json").
                header("Cookie","JSESSIONID="+CommonRestAPI.getSessionKEY()).
                body("{ \"body\": \"random updated comment\", \"visibility\": { \"type'\": \"role\", \"value\": \"Administrators\"} } ").
                when().post("/rest/api/2/issue/10001/comment").then().statusCode(201).extract().response();
        JsonPath js = CommonRestAPI.rawToJson(response);
        String ID = js.get("id");
        System.out.println(ID);
    }

    //update comment --put
    public void testUpdateComment(){
        RestAssured.baseURI = "http://localhost:8080";
        Response response = given().header("Content-Type", "application/json").
                header("Cookie","JSESSIONID="+CommonRestAPI.getSessionKEY()).
                body("{ \"body\": \"random comment\", \"visibility\": { \"type'\": \"role\", \"value\": \"Administrators\"} } ").
                when().post("/rest/api/2/issue/10000/comment/10001").then().statusCode(200).extract().response();
        JsonPath js = CommonRestAPI.rawToJson(response);
        String ID = js.get("id");
        System.out.println(ID);
    }
}
