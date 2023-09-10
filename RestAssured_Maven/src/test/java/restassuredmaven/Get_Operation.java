package restassuredmaven;


import static io.restassured.RestAssured.given;

public class Get_Operation
{
public static void main(String[] args) 
{  
	given().spec(Spec_BuilderReq.ReqSpecbuilder())
	.when().get("/api/users/2");
	System.out.println("Done");
}
}
