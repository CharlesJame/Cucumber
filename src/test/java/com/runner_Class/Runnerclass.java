package com.runner_Class;

import com.Base_Class.BaseClass;
import com.spd.Page_Object_Manager;

public class Runnerclass extends BaseClass {

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	public static void main(String[] args) {

		// Launch Browser & go to URL
		openBrowser("https://adactinhotelapp.com/HotelAppBuild2/");

		// Login-Page

	}

}
