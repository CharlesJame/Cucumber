package com.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;

import com.Base_Class.BaseClass;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableWithoutHeader extends BaseClass {

	@Given("^launch the browser$")
	public void launch_the_browser() throws Throwable {
		launchBrowser();
	}

	@When("^navigate to OrangeHRM Homepage$")
	public void navigate_to_OrangeHRM_Homepage() throws Throwable {
		getURL("https://opensource-demo.orangehrmlive.com/");
	}

	@Then("^user enter the credentials from datatable$")
	public void user_enter_the_credentials_from_datatable(DataTable datatable) throws Throwable {
		List<String> credentials = datatable.asList(String.class);

		driver.findElement(By.id("txtUsername")).sendKeys(credentials.get(0));
		driver.findElement(By.id("txtPassword")).sendKeys(credentials.get(1));
	}

	@Then("^the user clicks the Login button$")
	public void the_user_clicks_the_Login_button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	}

}
