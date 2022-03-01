package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {

	WebDriver driver;
	
	@FindBy(xpath = "//select[@id='location']")
	private WebElement Location;
	
	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement Hotel;
	
	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement Roomtype;
	
	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement NoofRooms;
	
	@FindBy(xpath = "//input[@id='datepick_in']")
	private WebElement CheckinDate;
	
	@FindBy(xpath = "//input[@id='datepick_out']")
	private WebElement CheckoutDate;
	
	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement Adultsperroom;
	
	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement Childperroom;
	
	@FindBy(xpath = "//input[@id='Submit']")
	private WebElement Search;

	public Search_Hotel(WebDriver drive) {
		this.driver=drive;
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotel() {
		return Hotel;
	}

	public WebElement getRoomtype() {
		return Roomtype;
	}

	public WebElement getNoofRooms() {
		return NoofRooms;
	}

	public WebElement getCheckinDate() {
		return CheckinDate;
	}

	public WebElement getCheckoutDate() {
		return CheckoutDate;
	}

	public WebElement getAdultsperroom() {
		return Adultsperroom;
	}

	public WebElement getChildperroom() {
		return Childperroom;
	}

	public WebElement getSearch() {
		return Search;
	}
	
	}
