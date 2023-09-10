package restassuredmaven;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;
public class PostReqRes 
{
	public static void main(String[] args) 
	{  
		   Response res = given().spec(Spec_BuilderReqResPost.req_spec())
		.when().post("/api/users").
		then().spec(Spec_BuilderReqResPost.res_spec(201)).extract().response();
		res.prettyPrint();
		
	}
}
