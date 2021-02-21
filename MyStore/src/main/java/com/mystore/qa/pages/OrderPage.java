package com.mystore.qa.pages;

import org.openqa.selenium.By;

import com.mystore.qa.basePage.BasePage;
import com.mystore.qa.enums.WaitStrategy;

public final class OrderPage extends BasePage {
	private final By deleteBtn = By.xpath("//a[@title='Delete']//child::i");
	private final By alert = By.xpath("//p[@class='alert alert-warning']");
	private final By productName = By
			.xpath("*//p[@class='product-name']//child::a[text()='Faded Short Sleeve T-shirts']");
	private final By productImage = By
			.xpath("*//tr[@class='cart_item last_item first_item address_444547 odd']//child::img");

	public OrderPage() {

	}

	public void clickDeleteBtn() {
		doClick(deleteBtn, WaitStrategy.CLICKABLE);
	}

	public String getAlertText() throws InterruptedException {
		Thread.sleep(3000);
		return getText(alert, WaitStrategy.PRESENCE);
	}

	public String getProductNameText() {
		return getText(productName, WaitStrategy.PRESENCE);
	}

	public boolean getProductPicture() {
		return getDisplayedImage(productImage, WaitStrategy.VISIBLE);
	}

}
