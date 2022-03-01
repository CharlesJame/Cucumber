package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import com.Base_Class.BaseClass;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableWithHeader extends BaseClass {

	@Given("^open the browser$")
	public void open_the_browser() throws Throwable {
	    launchBrowser();
	}

	@When("^go to OrangeHRM Homepage$")
	public void go_to_OrangeHRM_Homepage() throws Throwable {
	    getURL("https://opensource-demo.orangehrmlive.com/index.php/auth/login");	}

	@Then("^user enter the credentials from datatable with Header$")
	public void user_enter_the_credentials_from_datatable_with_Header(DataTable dataTable) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<Map<String, String>> keyvalue = dataTable.asMaps(String.class, String.class);
		String username = keyvalue.get(0).get("username");
		String password = keyvalue.get(0).get("password");
		
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	    
	}

	@Then("^click the Login button$")
	public void click_the_Login_button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	}

	
}
