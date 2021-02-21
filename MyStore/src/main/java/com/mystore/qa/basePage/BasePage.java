package com.mystore.qa.basePage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.mystore.qa.driver.DriverManager;
import com.mystore.qa.enums.ActionsStrategy;
import com.mystore.qa.enums.AlertsStrategy;
import com.mystore.qa.enums.JavaScriptExecutorStrategy;
import com.mystore.qa.enums.WaitStrategy;
import com.mystore.qa.factories.ActionsFactory;
import com.mystore.qa.factories.AlertsFactory;
import com.mystore.qa.factories.ExplicitWaitFactory;
import com.mystore.qa.factories.JavaScriptExecutorFactory;
import com.mystore.qa.reports.ExtentLogger;

public class BasePage {

	protected String getTitle() {
		return DriverManager.getDriver().getTitle();
	}

	protected void doClick(By locator, WaitStrategy waitStrategy) {
		ExplicitWaitFactory.performExplicitWait(waitStrategy, locator).click();
		ExtentLogger.pass(getTitle());

	}

	protected void doSendKeys(By locator, String text, WaitStrategy waitStrategy) {
		ExplicitWaitFactory.performExplicitWait(waitStrategy, locator).sendKeys(text);

	}

	protected void doClearField(By locator, WaitStrategy waitStrategy) {
		ExplicitWaitFactory.performExplicitWait(waitStrategy, locator).clear();

	}

	protected boolean getDisplayedImage(By locator, WaitStrategy waitStrategy) {
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, locator);
		return element.isDisplayed();

	}

	protected void getActions(By locator, ActionsStrategy actionsStrategy) {

		ActionsFactory.performActions(actionsStrategy, locator);

	}

	protected void getJS(By locator, JavaScriptExecutorStrategy javaScriptExecutorStrategy) {

		JavaScriptExecutorFactory.performJavaScript(javaScriptExecutorStrategy, locator);

	}

	protected void getAlerts(By locator, AlertsStrategy alertsStrategy) {
		AlertsFactory.performAlerts(alertsStrategy, locator);
	}

	protected String getAlertsText(By locator, AlertsStrategy alertsStrategy) {
		return AlertsFactory.performAlertsGetText(alertsStrategy, locator);
	}

	protected String getText(By locator, WaitStrategy waitStrategy) {
		return ExplicitWaitFactory.performExplicitWait(waitStrategy, locator).getText();

	}

	protected List<WebElement> getMultipleElementsText(By locator) {

		List<WebElement> elements = DriverManager.getDriver().findElements(locator);

		return elements;

	}
}
