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

public class stepdefination3 {


	Response response;
	String uri="https://api.ratesapi.io/api/latest";
	
	@Test
	@Given("API for foreign exchange")
	public void api_for_foreign_exchange() {
		// base uri of api
	   
		RestAssured.baseURI = "https://ratesapi.io/documentation/";
		
	}  
	
	@Test
	@When("posted with correct Information")
	public void posted_with_correct_information() {
	   // GET uri of api
		RequestSpecification httpRequest = RestAssured.given(); 	
    	response = httpRequest.request(Method.GET,uri);
		
	}

	@Test
	@Then("validate positive response code received")
	public void validate_positive_response_code_received() {
	  
		System.out.println("start");
		//getting response code from api
		System.out.println("Status code is --> " +response.getStatusCode());
		int code=response.getStatusCode();
		//getying status line
		String statusLine = response.getStatusLine();
		System.out.println(statusLine);
		//validating the status code and status line
		Assert.assertEquals(code, 200);
		Assert.assertEquals(statusLine , "HTTP/1.1 200 OK" , "INCorrect status Line returned");
		
	}
	

}


