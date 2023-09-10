package restassuredmaven;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;

public class GetReqRes 
{
	public static void main(String[] args) 
	{  
		 Response res = given().spec(Spec_BuilderReqResGet.req_spec())
		.when().get("api/users/2").
		then().spec(Spec_BuilderReqResGet.res_spec(200)).extract().response();  //We should change only end point and status code for all get operations
		res.prettyPrint();
		
	}
}
