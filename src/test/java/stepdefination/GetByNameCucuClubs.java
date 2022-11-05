package stepdefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetByNameCucuClubs {
	
	Response res;
	ValidatableResponse val;
	
	@When("User should be able to perform get action using the api {string}")
	public void user_should_be_able_to_perform_get_action_using_the_api(String getURL) {
	    res = RestAssured.get(getURL);
	}

	@Then("Validate the statusCode {int}")
	public void validate_the_status_code(Integer int1) {
	    val = res.then();
	    val.assertThat().statusCode(int1).log().all();
	}

}
