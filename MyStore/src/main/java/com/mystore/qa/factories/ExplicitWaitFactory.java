package com.mystore.qa.factories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mystore.qa.constants.FrameworkConstants;
import com.mystore.qa.driver.DriverManager;
import com.mystore.qa.enums.WaitStrategy;

public class ExplicitWaitFactory {

	public static WebElement performExplicitWait(WaitStrategy waitStrategy, By locator) {
		WebElement element = null;
		if (waitStrategy == WaitStrategy.CLICKABLE) {
			element = new WebDriverWait(DriverManager.getDriver(), FrameworkConstants.getExplicitwait())
					.until(ExpectedConditions.elementToBeClickable(locator));
		} else if (waitStrategy == WaitStrategy.PRESENCE) {
			element = new WebDriverWait(DriverManager.getDriver(), FrameworkConstants.getExplicitwait())
					.until(ExpectedConditions.presenceOfElementLocated(locator));
		} else if (waitStrategy == WaitStrategy.VISIBLE) {
			element = new WebDriverWait(DriverManager.getDriver(), FrameworkConstants.getExplicitwait())
					.until(ExpectedConditions.visibilityOfElementLocated(locator));
		} else if (waitStrategy == WaitStrategy.NONE) {
			
			element= DriverManager.getDriver().findElement(locator);
		}
		return element;
	}

}
