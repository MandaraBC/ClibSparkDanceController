package CRUDOperationUsingTDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class GetRequest2Test {
	@Test
	public void getRequestTest() {
		
		baseURI="http://localhost:8080";
		
		when()
		.get("/danceclubs/?name=tejaclubs")
		
		.then()
		.assertThat().statusCode(200)
		.log().all();
		
	}

}


