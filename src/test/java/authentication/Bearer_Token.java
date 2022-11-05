package authentication;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Bearer_Token {
	@Test
	public void bearerPost() {
		JSONObject obj=new JSONObject();
		obj.put("name","pramodh");
		given().auth().oauth2("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")
		.body(obj).contentType(ContentType.JSON)
		.when().post("https://api.github.com/user/repos")
		.then().log().all();
		
	}
	
}
