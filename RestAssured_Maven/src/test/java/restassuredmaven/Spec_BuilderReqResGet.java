package restassuredmaven;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Spec_BuilderReqResGet
{
	public static RequestSpecification req_spec() 
	{
		RequestSpecBuilder req=new RequestSpecBuilder();
		RequestSpecification rq=req.setBaseUri("https://reqres.in/")
		.setContentType(ContentType.JSON).build();
		return rq;
	}
	public static ResponseSpecification res_spec(int code) 
	{
		ResponseSpecBuilder res=new ResponseSpecBuilder();
		ResponseSpecification rs=res.expectStatusCode(code)
		.expectContentType(ContentType.JSON).build();
		return rs;
	}
}
