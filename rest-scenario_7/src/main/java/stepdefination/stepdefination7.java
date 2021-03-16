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

public class stepdefination7 {
	
	Response response;
	
	@Test
	@Given("API for foreign exchange")
	public void api_for_foreign_exchange() {
	   //base uri from api
		RestAssured.baseURI = "https://ratesapi.io/documentation/";
	}
    @Test
	@When("posted with future date information")
	public void posted_with_future_date_information() {
    	//GET uri from api
    	RequestSpecification httpRequest = RestAssured.given(); 	
    	response = httpRequest.request(Method.GET,"https://api.ratesapi.io/api/2010-13-35");
	   
	}

    @Test
	@Then("validate positive response code received")
	public void validate_positive_response_code_received() {
    	
    	System.out.println("response code ---> "+ response.getStatusCode());
    	System.out.println("statusLine --->"  +response.statusLine());
    	//assertion for status code and status line
    	Assert.assertNotEquals(response.getStatusCode(),200);
    	Assert.assertFalse(response.statusLine()=="HTTP/1.1 400 Bad Request");
	   
		
	}


}
