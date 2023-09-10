package restassuredmaven;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;;

public class GetSingleusernotfound 
{
public static void main(String[] args) 
{
	RestAssured.baseURI="https://reqres.in/";
	given()
	.when().get("/api/users/23")
	.then().statusCode(404)
	.and().contentType(ContentType.JSON);
	System.out.println("Done");
	
}
}
