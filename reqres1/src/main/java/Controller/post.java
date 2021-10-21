//Here serialization is taking place

package Controller;

import Pojo.details;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class post {
    public static void main(String[] args) {

        RestAssured.baseURI = "https://reqres.in/api/users";

        details det = new details();
        det.setName("Aditya");
        det.setJob("Developer");

        Response res=given().log().all().body(det).when().post().then().assertThat().statusCode(201).extract().response();

        String resString=res.asString();
        System.out.println(resString);

    }
}
