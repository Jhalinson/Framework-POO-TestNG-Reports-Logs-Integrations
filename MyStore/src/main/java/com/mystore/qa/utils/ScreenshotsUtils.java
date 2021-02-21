package com.mystore.qa.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.mystore.qa.driver.DriverManager;

public final class ScreenshotsUtils {
	

	private ScreenshotsUtils() {

	}

	public static String getBase64Image() {
		
			
			return ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BASE64);
		
	}
}
