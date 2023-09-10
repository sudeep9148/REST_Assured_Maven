package restassuredmaven;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static  io.restassured.RestAssured.given;;

public class GetSingleuser 
{
public static void main(String[] args) 
{
	RestAssured.baseURI="https://reqres.in/";
	given()
	.when().get("/api/users/2")
	.then().statusCode(200)
	.and().contentType(ContentType.JSON);
	System.out.println("Done");
}
}
