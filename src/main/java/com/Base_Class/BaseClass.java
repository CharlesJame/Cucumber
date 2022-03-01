package com.Base_Class;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;

	// LaunchBrowser
	public static void launchBrowser() {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Home\\eclipse-workspace\\com.cucumber\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();

	}

	// getURL
	public static void getURL(String URL) {
		driver.get(URL);

	}

	// OpenBrowser
	public static void openBrowser(String URL) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Home\\eclipse-workspace\\com.cucumber\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(URL);

	}

	// Send-Keys
	public static void enterText(WebElement element, String Text) {
		element.sendKeys(Text);

	}

	// Click on WebElement
	public static void click(WebElement element) {
		element.click();

	}

	// DropDown by Value
	public static void dropdownByValue(WebElement dropbyval, String drop) {
		Select select = new Select(dropbyval);
		select.selectByValue(drop);

	}

	// Takes ScreenShot
	public static void screenShot(String Path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = (ts.getScreenshotAs(OutputType.FILE));
		File file = new File(Path);
		FileHandler.copy(source, file);

	}

	// Driver-Close
	public static void driverClose() {
		driver.close();

	}

	// Driver-Quit
	public static void driverQuit() {
		driver.quit();

	}
}