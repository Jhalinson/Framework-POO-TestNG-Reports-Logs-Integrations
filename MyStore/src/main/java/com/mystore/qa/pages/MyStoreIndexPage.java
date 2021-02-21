package com.mystore.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.mystore.qa.basePage.BasePage;
import com.mystore.qa.enums.JavaScriptExecutorStrategy;
import com.mystore.qa.enums.WaitStrategy;

public class MyStoreIndexPage extends BasePage {

	private final By signInLink = By.xpath("//a[contains(text(), 'Sign in')]");
	private final By logo = By.xpath("//a[@title='My Store']//child::img");
	private final By search = By.xpath("//input[@class='search_query form-control ac_input' and@type='text']");
	private final By searchBtn = By.xpath("//button[@class='btn btn-default button-search' and@type='submit']");
	private final By productName = By.xpath("//a[@class='product-name' and @title='Blouse']");
	private final By imageItem = By.xpath("//img[@class='replace-2x img-responsive' and @title='Blouse']");
	private final By alert = By
			.xpath("//div[@class='center_column col-xs-12 col-sm-9' ]//p[@class='alert alert-warning']");
	private final By storeInformation = By.xpath("//h4[text()='Store information' ]");
	private final By storeInformationelements = By.xpath("//ul[contains(@class, toggle-footer) and @style]");
	private final By shoppingCart = By.xpath("*//a[@title='View my shopping cart']");
	private final By quantityShoppingCart = By
			.xpath("*//a[@title='View my shopping cart']//child::span[contains(@class, 'ajax_cart_quantity')]");

	public String getMyStoreTitle() {
		return getTitle();
	}

	public boolean getMyStoreLogo() {
		return getDisplayedImage(logo, WaitStrategy.PRESENCE);
	}

	public AuthenticationPage doClickSignInLink() {
		doClick(signInLink, WaitStrategy.CLICKABLE);

		return new AuthenticationPage();
	}

	public void searchItem(String text) {
		doSendKeys(search, text, WaitStrategy.PRESENCE);
		doClick(searchBtn, WaitStrategy.CLICKABLE);
	}

	public String getProductName() {
		return getText(productName, WaitStrategy.PRESENCE);

	}

	public boolean getProductImage() {

		getDisplayedImage(imageItem, WaitStrategy.VISIBLE);
		return true;
	}

	public String searchForNonExistentItems(String text) {
		doClearField(search, WaitStrategy.VISIBLE);
		doSendKeys(search, text, WaitStrategy.PRESENCE);
		doClick(searchBtn, WaitStrategy.CLICKABLE);
		return getText(alert, WaitStrategy.VISIBLE);
	}

	public String getStoreInformationText() {
		return getText(storeInformation, WaitStrategy.PRESENCE);
	}

	public String getMultipleElementsText() {
		String text = "";
		getJS(storeInformationelements, JavaScriptExecutorStrategy.SCROLLBOTTOM);
		for (WebElement iterator : getMultipleElementsText(storeInformationelements)) {

			text = iterator.getText();
		}
		return text;
	}

	public int quantityShoppingCart() {
		System.out.println(getText(quantityShoppingCart, WaitStrategy.PRESENCE));
		String q = (getText(quantityShoppingCart, WaitStrategy.PRESENCE));
		int quantity = Integer.parseInt(q);
		if (quantity == 1 || quantity > 1) {
			doClick(shoppingCart, WaitStrategy.CLICKABLE);

		} else {
			new Throwable("The shopping cart is empty");
		}
		return quantity;
	}
}
