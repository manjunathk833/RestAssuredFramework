package RestassuredAutomation.RestassuredAutomation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC001_GET_Request {
	@Test
	void getweatherDetails() {
		//Specify base uri/endpoint
		
		RestAssured.baseURI="https://gorest.co.in//public/v2/users";
		
		//Response Object
		RequestSpecification httpRequest = RestAssured.given();
		
		//Response object		
		Response response = httpRequest.request(Method.GET,"/7/posts");
		
		//print the response 
		String responseBody = response.getBody().asString();
		System.out.print("Response body" + responseBody);
		
	}

}
