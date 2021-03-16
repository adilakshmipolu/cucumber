package stepdefination;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class stepdefination5 {
	
	Response response;
	String uri;
	
	@Test
	@Given("API for foreign exchange")
	public void api_for_foreign_exchange() {
		
		uri="https://api.ratesapi.io/api/";
	   
	}
    @Test
	@When("posted with correct Information")
	public void posted_with_correct_information() {
    	//GET the uri from api
    	response = RestAssured.get(uri);	
    	
	    
	}
    @Test 
	@Then("validate positive response code received")
	public void validate_positive_response_code_received() {
    	  //print status code 
    	System.out.println("response code ---> "+ response.getStatusCode());
    	//print the status line
    	System.out.println("status Line --->" + response.getStatusLine());
    	//validating the status code 
    	Assert.assertNotEquals(response.getStatusCode(),200);
    	//validating the status line using assertion
    	Assert.assertFalse(response.getStatusLine()=="HTTP/1.1 400 Bad Request");
    	
    	
	   
	}

}
