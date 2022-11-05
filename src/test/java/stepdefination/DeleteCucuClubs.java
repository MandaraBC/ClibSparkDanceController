package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class DeleteCucuClubs {
	
	Response res;
	ValidatableResponse val;
	

	@When("User gives the path to delete the data {string}")
	public void user_gives_the_path_to_delete_the_data(String string) {
		res=RestAssured.delete(string);
	}

	@Then("User gets the statusCode {int}")
	public void user_gets_the_status_code(Integer int1) {
	    val=res.then();
	    val.assertThat().statusCode(int1);
	}

}
