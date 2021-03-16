package stepdefination;

import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class stepdefination6 {
	
	Response response;
	@Test
	@Given("API for foreign exchange")
	public void api_for_foreign_exchange() {
		//base uri of api
		RestAssured.baseURI = "https://ratesapi.io/documentation/";

	}

	@Test
	@When("posted with future date information")
	public void posted_with_future_date_information() {
	    //GET api by providing future date
		RequestSpecification httpRequest = RestAssured.given(); 	
    	response = httpRequest.request(Method.GET,"https://api.ratesapi.io/api/2010-13-35");
	}

	@Test
	@Then("validate positive response code received")
	public void validate_positive_response_code_received() {
		//getting status using log() Method
		RestAssured.given()
    	.when()
    	.get("https://api.ratesapi.io/api/2010-25-35")
    	.then()
    	.log().status();
    	
	   
	}

}
