package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;


public class GetCucuClubs {
	
	Response res;
	ValidatableResponse validate;
	
	@Given("User should be able to get data")
	public void user_should_be_able_to_get_data() {
	 
	}

	@When("User should be able to provide by providing URI {string}")
	public void user_should_be_able_to_provide_by_providing_uri(String url) {
		res=RestAssured.get(url);
	}

	@Then("User should validate the statusCode {int}")
	public void user_should_validate_the_status_code(Integer int1) {
		 validate=res.then();
		   validate.assertThat().statusCode(int1).log().all();
	   
	}
}