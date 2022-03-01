package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	
	WebDriver driver;
	
	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement FirstName;

	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement LastName;
	
	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement BillingAddress;
	
	@FindBy(xpath = "//input[@id='cc_num']")
	private WebElement CreditCardNo;
	
	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement CreditCardType;
	
	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement ExpiryMonth;
	
	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement ExpiryYear;
	
	@FindBy(xpath = "//input[@id='cc_cvv']")
	private WebElement CvvNumber;
	
	@FindBy(xpath = "//input[@id='book_now']")
	private WebElement BookNow;

	public Book_Hotel(WebDriver drive) {
		this.driver=drive;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getBillingAddress() {
		return BillingAddress;
	}

	public WebElement getCreditCardNo() {
		return CreditCardNo;
	}

	public WebElement getCreditCardType() {
		return CreditCardType;
	}

	public WebElement getExpiryMonth() {
		return ExpiryMonth;
	}

	public WebElement getExpiryYear() {
		return ExpiryYear;
	}

	public WebElement getCvvNumber() {
		return CvvNumber;
	}

	public WebElement getBookNow() {
		return BookNow;
	}
	
}
