package CRUDOperationUsingTDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class DeleteRequestTest {
	@Test
	public void getRequestTest() {
		
		baseURI="http://localhost:8080";
		
		when()
		.delete("/danceclubs/Dance%20club")
		
		.then()
		.assertThat().statusCode(200)
		.log().all();
		
	}

}

