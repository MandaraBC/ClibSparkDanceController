package stepdefination;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PutCucuClubs {
	RequestSpecification req;
	Response res;
	ValidatableResponse val;
	@Given("User wants to put data into database")
	public void user_wants_to_put_data_into_database() {
	    JSONObject jobj=new JSONObject();
	    jobj.put("description", "Hello");
		  jobj.put("leader", "manith");
		 jobj.put("address", "rajajinagara");
		  jobj.put("name", "Dance clubs1");
		 jobj.put("ranking", 4);
		 req=RestAssured.given()
				  .body(jobj)
				  .contentType(ContentType.JSON);
	}

	@When("User is able to put the data into URI {string}")
	public void user_is_able_to_put_the_data_into_uri(String string) {
	 res=req.put(string);
	
	}

	@Then("User should be able to get the statusCode {int}")
	public void user_should_be_able_to_get_the_status_code(Integer int1) {
	   val=res.then();
	   val.assertThat().statusCode(int1).log().all();
	   
	}
}


