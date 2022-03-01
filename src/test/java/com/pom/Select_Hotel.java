package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	
	WebDriver driver;
	
	@FindBy(xpath = "//input[@id='radiobutton_0'][@name='radiobutton_0']")
	private WebElement selectHotel;
	
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement Continue;

	public Select_Hotel(WebDriver drive) {
		this.driver=drive;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getSelectHotel() {
		return selectHotel;
	}

	public WebElement getContinue() {
		return Continue;
	}

}
