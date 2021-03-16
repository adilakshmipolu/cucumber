package stepdefination;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class stepdefination1 {
	Response response;
	@Test
	@Given("API for foreign exchange")
	public void api_for_foreign_exchange() {
		//base uri of the api
		RestAssured.baseURI = "https://ratesapi.io/documentation/";
		
	}
	@Test
	@When("posted with correct Information")
	public void posted_with_correct_information() {
		//GET uri of the api
		RequestSpecification httpRequest = RestAssured.given(); 	
    	response = httpRequest.request(Method.GET,"https://api.ratesapi.io/api/latest");
	   
	}
	@Test
	@Then("validate positive response code received")
	public void validate_positive_response_code_received() { 
		//getting the response code
		System.out.println("Status code is --> " +response.getStatusCode());
		int code=response.getStatusCode();
		//validate the response code
		Assert.assertEquals(code, 200);
		
	}
}
