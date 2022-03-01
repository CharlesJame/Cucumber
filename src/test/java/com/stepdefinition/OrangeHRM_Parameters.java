package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.Base_Class.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRM_Parameters extends BaseClass {

	@Given("^user launch the browser$")
	public void user_launch_the_browser() throws Throwable {
		launchBrowser();
	}

	@When("^navigates to OrangeHRM Homepage$")
	public void navigates_to_OrangeHRM_Homepage() throws Throwable {
		getURL("https://opensource-demo.orangehrmlive.com/");
	}

	@Then("^user enter the credentials \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_the_credentials_and(String username, String password) throws Throwable {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	}

	@Then("^user clicks the Login button$")
	public void user_clicks_the_Login_button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^user should be logged in$")
	public void user_should_be_logged_in() throws Throwable {
		boolean displayed = driver.findElement(By.partialLinkText("Welcome")).isDisplayed();
		Assert.assertTrue(displayed);
	}

}
