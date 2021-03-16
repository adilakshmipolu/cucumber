package stepdefination;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class stepdefination9 {
	
Response response;
	//using dataprovider
	@DataProvider(name="date")
	public Object[][] dataprovider(){
		Object [][] value= new Object[2][3];
	
		value[0][0]="2019";
        value[0][1]="10";
        value[0][2]="16";
        
        value[1][0]="2020";
        value[1][1]="01";
        value[1][2]="07";
        return value;
        
	}
	
	@Test
	@Given("API for foreign exchange")
	public void api_for_foreign_exchange() {
		//base uri from api
		RestAssured.baseURI = "https://api.ratesapi.io";
   
	}

	@Test(dataProvider="date")
	@When("posted with dataprovider")
	public void posted_with_dataprovider(String year, String month,String day) {
	
		response = RestAssured.given().get("/api/"+year+"-"+month+"-"+day);		
	    
	}

	@Test(dataProvider="date")
	@Then("validate positive response code received--")
	public void validate_positive_response_code_received(String year,String month, String day) {
		
		response = RestAssured.given().get("/api/"+year+"-"+month+"-"+day);
		int responsecode=response.getStatusCode();
		//validation using assertion
		Assert.assertEquals(responsecode,200);
	    System.out.println(" status code --->"+ responsecode);
	    
	    System.out.println("satusline---"+response.getStatusLine());
	    Assert.assertTrue(response.getStatusLine().contains("OK"));
	    
	    
	}
}