package com.runner_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Open_Adactin {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Home\\eclipse-workspace\\com.cucumber\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.homedepot.ca/en/home.html");
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//a[contains(@href,'Bath')]"));

	}

}
