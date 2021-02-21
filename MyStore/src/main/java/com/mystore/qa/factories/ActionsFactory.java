package com.mystore.qa.factories;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import com.mystore.qa.driver.DriverManager;
import com.mystore.qa.enums.ActionsStrategy;

public class ActionsFactory {

	
	public static void performActions(ActionsStrategy actionsStrategy, By locator) {
		
		Actions actions = new Actions(DriverManager.getDriver());
		if (actionsStrategy == ActionsStrategy.MOVETOELEMENT) {

			actions.moveToElement(DriverManager.getDriver().findElement(locator)).build().perform();

		} else if (actionsStrategy == ActionsStrategy.DOUBLECLICK) {

			actions.doubleClick(DriverManager.getDriver().findElement(locator)).build().perform();
		} else if (actionsStrategy == ActionsStrategy.CLICKANDHOLD) {

			actions.clickAndHold(DriverManager.getDriver().findElement(locator)).build().perform();

//		} else if (actionsStrategy == ActionsStrategy.DRAGANDDROP) {
//			
//			actions.dragAndDrop(element.findElement(locator)).build().perform();
//			
//		}
		} else if (actionsStrategy == ActionsStrategy.NONE) {

			DriverManager.getDriver().findElement(locator);
		}
		
	}

}
