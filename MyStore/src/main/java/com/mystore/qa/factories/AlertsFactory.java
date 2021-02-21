package com.mystore.qa.factories;

import org.openqa.selenium.By;

import com.mystore.qa.driver.DriverManager;
import com.mystore.qa.enums.AlertsStrategy;

public class AlertsFactory {

	public static void performAlerts(AlertsStrategy alertsStrategy, By locator) {

		if (alertsStrategy == AlertsStrategy.ACCEPT) {
			DriverManager.getDriver().switchTo().alert().accept();

		} else if (alertsStrategy == AlertsStrategy.DISMISS) {
			DriverManager.getDriver().switchTo().alert().dismiss();
		} else if (alertsStrategy == AlertsStrategy.SENDTEXT) {
			DriverManager.getDriver().switchTo().alert().sendKeys("");
		} else if (alertsStrategy == AlertsStrategy.NONE) {

			DriverManager.getDriver().findElement(locator);
		}

	}
	public static String performAlertsGetText(AlertsStrategy alertsStrategy, By locator) {
		
		 String  text = "";
				if (alertsStrategy == AlertsStrategy.GETTEXT) {
					text = DriverManager.getDriver().switchTo().alert().getText();
		} 
				return text;
	}
}
