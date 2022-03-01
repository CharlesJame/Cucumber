package com.stepdefinition;

import org.openqa.selenium.By;

import com.Base_Class.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableWithExample extends BaseClass {
	
	@Given("^user open the browser$")
	public void user_open_the_browser() throws Throwable {
	    launchBrowser();
	}

	@When("^go to the OrangeHRM Homepage$")
	public void go_to_the_OrangeHRM_Homepage() throws Throwable {
	    getURL("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}

	@Then("^user enter credentials \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_credentials_and(String arg1, String arg2) throws Throwable {
		driver.findElement(By.id("txtUsername")).sendKeys(arg1);
		driver.findElement(By.id("txtPassword")).sendKeys(arg2);
	}

	@Then("^press the Login button$")
	public void press_the_Login_button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	}


}
