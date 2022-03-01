package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {

	WebDriver driver;
	@FindBy(xpath = "//input[@id='logout']")
	private WebElement Logout;

	public Logout(WebDriver drive) {
		this.driver=drive;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getLogout() {
		return Logout;
	}
	
}
