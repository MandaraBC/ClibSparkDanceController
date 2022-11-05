package CRUDOperationUsingTDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;


import static io.restassured.RestAssured.*;

public class PutRequestTest {

	@Test
		public void postRequestTest() {
			 
		     baseURI = "http://localhost:8080";
		     
		     JSONObject obj=new JSONObject();
			 obj.put("description", "Hello");
		     obj.put("leader", "manith");
		     obj.put("address", "rajajinagara");
		     obj.put("name", "Dance clubs1");
		     obj.put("ranking", 4);
		    
		    
		    
		    given()
		    .body(obj)
		    .contentType(ContentType.JSON)
		    
		    .when()
		    .put("/danceclubs")
		    
		    .then()
		    .assertThat().statusCode(200)
		    .log().all();
		}
	

}
