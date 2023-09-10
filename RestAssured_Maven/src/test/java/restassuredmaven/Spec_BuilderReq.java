package restassuredmaven;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class Spec_BuilderReq
{
	public static RequestSpecification ReqSpecbuilder() 
	{
		RequestSpecBuilder req=new RequestSpecBuilder();
		RequestSpecification r= req.setBaseUri("https://reqres.in/")
		.setContentType(ContentType.JSON).build();
		return null;
		
	}
}
