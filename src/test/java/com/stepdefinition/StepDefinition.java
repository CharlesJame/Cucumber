package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Base_Class.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {

	WebDriver driver;
	
	
	@Given("^user Launch the Browser$")
	public void user_Launch_the_Browser() throws Throwable {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Home\\eclipse-workspace\\com.cucumber\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

	}

	@When("^navigates to google\\.co\\.in$")
	public void navigates_to_google_co_in() throws Throwable {
		driver.get("https://www.google.com/");
	}

	@Then("^search for charles$")
	public void search_for_charles() throws Throwable {
		driver.findElement(By.xpath("//input[@name='q'][@type='text']")).sendKeys("Charles");
		driver.findElement(By.xpath("//input[@name='btnK'][@type='submit']")).click();
	}

	@Then("^user should see the results$")
	public void user_should_see_the_results() throws Throwable {
		boolean displayed = driver.findElement(By.partialLinkText("charles")).isDisplayed();
		if(displayed) {
			System.out.println("Results Displayed");
		}

	}

}
