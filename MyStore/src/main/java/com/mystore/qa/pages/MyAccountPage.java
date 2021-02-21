package com.mystore.qa.pages;

import org.openqa.selenium.By;

import com.mystore.qa.basePage.BasePage;
import com.mystore.qa.enums.WaitStrategy;

public class MyAccountPage extends BasePage {

	private final By userAccount = By
			.xpath("//div[contains(@class, 'header_user_info')]//child::span[text()='Jhalinson Acosta']");

	public MyAccountPage() {

	}

	public String getUserAccount() {
		return getText(userAccount, WaitStrategy.PRESENCE);
	}

}
