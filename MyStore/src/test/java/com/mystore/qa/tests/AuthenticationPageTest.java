package com.mystore.qa.tests;

import org.testng.annotations.Test;

import com.mystore.qa.baseTest.BaseTest;
import com.mystore.qa.pages.AuthenticationPage;
import com.mystore.qa.pages.MyStoreIndexPage;
import com.mystore.qa.utils.ExcelUtils;

public class AuthenticationPageTest extends BaseTest {
	private AuthenticationPage authenticationPage = new AuthenticationPage();
	private MyStoreIndexPage myStoreIndexPage = new MyStoreIndexPage();

	@Test
	public void loginMyStoreApp() throws Exception {
		myStoreIndexPage.doClickSignInLink();
		authenticationPage.doLogin(ExcelUtils.getCellStringData("userdata", 0, 0),
				ExcelUtils.getCellStringData("userdata", 0, 1));
	}
}
