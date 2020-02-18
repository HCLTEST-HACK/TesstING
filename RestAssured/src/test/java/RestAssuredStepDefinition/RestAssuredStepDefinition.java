package RestAssuredStepDefinition;

import static io.restassured.RestAssured.*;

import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;

import Pages.Login;
import Pages.PostApi;
import Pages.Post_emp;
import cucumber.api.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.*;
import restutills.ApiConstants;
import restutills.ReadData_Property;
import restutills.Restutills;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

public class RestAssuredStepDefinition {
	
	Response res;
	public static JSONObject mapAuth =new JSONObject();
	static String authToken;
	Login login=new Login();
	
	
	@Given("^Set the Login UserName and Password$")
	public void set_the_Login_UserName_and_Password() throws Throwable {
		RestAssured.baseURI = ApiConstants.BASEURI;
		RestAssured.basePath = ApiConstants.LOGIN;
		
		login.setUsername(ReadData_Property.getproper("username"));
		login.setPassword(ReadData_Property.getproper("password"));
		
	}

	@When("^Send the Post request for generate the token$")
	public void send_the_get_request_for_generate_the_token() throws Throwable {
	/*	mapAuth.put("username", "test");
		mapAuth.put("password", "1234");
		
		
		res=given().auth().basic("test", "1234").contentType(ContentType.JSON).body(mapAuth)
				.when().post();*/
		
		res=given().auth().basic(login.getUsername(), login.getPassword()).contentType(ContentType.JSON).body(login)
				.when().post();
	}

	@Then("^Save the Token code$")
	public void save_the_Token_code() throws Throwable {
		System.out.println(res.asString());
		JsonPath jsonRes=new JsonPath(res.asString());
		authToken = jsonRes.get("token");
	    
	}
	

@Given("^Set the URI and param for create order$")
public void set_the_URI_and_param_for_create_order() throws Throwable {
	
	RestAssured.baseURI = "http://localhost:8080";
	RestAssured.basePath = "/orders";
    
}

@When("^Send the Post request for create Order$")
public void send_the_Post_request_for_create_Order()  {
	
	JSONObject deliverDetails =new JSONObject();
	JSONObject mapOrder =new JSONObject();
	
	// Fetch data from data table
			//List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);
			mapOrder.put("description", "DOSA1");
			mapOrder.put("food", true);
			mapOrder.put("vip", false);
			deliverDetails.put("latitude", "41.385063");
			deliverDetails.put("longitude", "2.173404");
			
			mapOrder.put("pickup", deliverDetails);
			mapOrder.put("delivery", deliverDetails);
			
			res=given().auth().oauth2(authToken).contentType(ContentType.JSON).body(mapOrder)
					.when().post();
			
			
  
}
@Then("^Validate the order$")
public void validate_the_order()  {
  
				System.out.println("OrderDetails:"+res.asString());
			
   
}

	


}
