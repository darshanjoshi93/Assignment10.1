package Base;
import static io.restassured.RestAssured.*;

import Utils.utility;

public class Base1 {

	public static void getMethod(String uri)
	{
     given().log().all().get(uri).then().log().all();
	}
	
	public static void getMethod1()
	{
	
		given().log().all().queryParam("page","2").get(utility.api()).then().log().all();
	}
	public static void postMethod()
	{
		given().log().all().body(utility.body("Darshan","1234")).post(utility.api()).then().log().all();
		
	}
	
}
