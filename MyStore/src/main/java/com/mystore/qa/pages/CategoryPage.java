package com.mystore.qa.pages;

import org.openqa.selenium.By;

import com.mystore.qa.basePage.BasePage;
import com.mystore.qa.enums.ActionsStrategy;
import com.mystore.qa.enums.WaitStrategy;

public class CategoryPage extends BasePage {

	private By womenMenu = By.xpath("//a[contains(@class, 'sf-with-ul') and @title='Women']");
	private By tshirtsLink = By
			.xpath("//ul[@style='display: none;']//child::a[contains(text(), 'T-shirts') and @title='T-shirts']");
	private By inStockLink = By.xpath(
			"//link[contains(@itemprop, 'availability')]//parent::span[@class='available-now']//parent::span[@class='availability']");
	private By addToCartBtn = By.xpath(
			"//span[contains(@class, 'availability')]//preceding-sibling::div[@class='button-container']//a[contains(@class, 'button ajax_add_to_cart_button btn btn-default')]");
	private By proceedToCheckoutBtn = By.xpath("//span[@title='Continue shopping']//following-sibling::a");
	private By productName = By.xpath(
			"*//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line']//child::a[contains(text(),'Faded Short Sleeve T-shirts')]");

	public CategoryPage() {

	}

	public void clickLinkMenu() {
		getActions(womenMenu, ActionsStrategy.MOVETOELEMENT);
		doClick(tshirtsLink, WaitStrategy.PRESENCE);

	}

	public void clickAddToCartBtn() {
		getActions(inStockLink, ActionsStrategy.MOVETOELEMENT);
		doClick(addToCartBtn, WaitStrategy.PRESENCE);

	}

	public OrderPage clickProceedToCheckoutBtn() throws InterruptedException {
		Thread.sleep(3000);
		doClick(proceedToCheckoutBtn, WaitStrategy.CLICKABLE);

		return new OrderPage();

	}

	public String getProductNameText() {
		return getText(productName, WaitStrategy.PRESENCE);
	}
}
