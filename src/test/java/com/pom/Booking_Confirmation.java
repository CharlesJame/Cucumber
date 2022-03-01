package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirmation {

	WebDriver driver;
	@FindBy(xpath = "//input[@id='my_itinerary']")
	public WebElement MyIniterary;

	public Booking_Confirmation(WebDriver drive) {
		this.driver=drive;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getMyIniterary() {
		return MyIniterary;
	}
	
}
