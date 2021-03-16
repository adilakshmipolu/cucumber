package setup;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class setup {
  @Test
  public void f() {
	// Specify the base URL to the RESTful web service
	  RestAssured.baseURI = "https://reqres.in/";
	//The server is specified by the BaseURI that we have specified in the above step.  
	  RequestSpecification httpRequest = RestAssured.given();
	// Make a request to the server by specifying the method Type and the method URL.
	// This will return the Response from the server. Store the response in a variable. 
	  Response response = httpRequest.request(Method.GET,"api/users?page=2");
	  //print the body
	  response.prettyPrint();
  //getting the status code
	  System.out.println("Status code is --> " +response.statusCode());
  }
}
