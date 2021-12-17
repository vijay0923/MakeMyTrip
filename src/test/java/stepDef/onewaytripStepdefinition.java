package stepDef;

import java.util.Map;

import base.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.GooglePage;
import pageObject.Makemytrip;

public class onewaytripStepdefinition extends  Setup{
	
	
	Makemytrip makemytrip = new Makemytrip(driver);
	
	@Given("I am on makemytrip")
	public void i_am_on_makemytrip() {

		System.out.println("I am on makemytrip page");
	}
	
	
	@When("I perform one-way search")
	public void i_perform_one_way_search(io.cucumber.datatable.DataTable dataTable) {
		Map<String, String> userDetails = dataTable.asMap(String.class, String.class);
		makemytrip.fromto(userDetails);
	
	}
	@Then("Search results should be display available flights")
	public void search_results_should_be_display_available_flights() {
	    // Write code here that turns the phrase above into concrete actions

	}


}
