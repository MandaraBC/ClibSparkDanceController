package authentication;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class BasicAuth {
	
	@Test

	public void basicAuth() {


	baseURI="http://github.com/";

	given().auth().basic("MandaraBC","Mand@ara789")
	        .when().get("/login")
	        .then().log().all();

	}
	

	}




