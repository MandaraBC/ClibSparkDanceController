package CRUDOperationUsingTDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetRequest1Test {
	
	@Test
	public void getRequestTest() {
		
		baseURI="http://localhost:8080";
		
		when()
		.get("/danceclubs")
		
		.then()
		.assertThat().statusCode(200)
		.log().all();
		
	}

}
