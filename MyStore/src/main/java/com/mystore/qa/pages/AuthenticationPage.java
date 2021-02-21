package com.mystore.qa.pages;

import org.openqa.selenium.By;

import com.mystore.qa.basePage.BasePage;
import com.mystore.qa.enums.WaitStrategy;

public class AuthenticationPage extends BasePage {

	private final By email = By.xpath(
			"//input[contains(@class, 'is_required validate account_input form-control') and @name='email' and @type='text']");
	private final By password = By.xpath(
			"//input[contains(@class, 'is_required validate account_input form-control') and @name='passwd' and @type='password']");
	private final By signInBtn = By.xpath(
			"//button[contains(@class, 'button btn btn-default button-medium') and @name='SubmitLogin' and @type='submit']");

	public AuthenticationPage() {

	}

	public CategoryPage doLogin(String email, String pass) {
		doSendKeys(this.email, email, WaitStrategy.PRESENCE);
		doSendKeys(this.password, pass, WaitStrategy.PRESENCE);
		doClick(signInBtn, WaitStrategy.CLICKABLE);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new CategoryPage();
	}

}
