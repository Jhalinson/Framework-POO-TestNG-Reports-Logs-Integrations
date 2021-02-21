package com.mystore.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mystore.qa.baseTest.BaseTest;
import com.mystore.qa.pages.AuthenticationPage;
import com.mystore.qa.pages.CategoryPage;
import com.mystore.qa.pages.MyAccountPage;
import com.mystore.qa.pages.MyStoreIndexPage;
import com.mystore.qa.utils.ExcelUtils;

public class MyAccountPageTest extends BaseTest {
	private MyAccountPage myAccountPage = new MyAccountPage();
	private MyStoreIndexPage myStoreIndexPage = new MyStoreIndexPage();
	private AuthenticationPage authenticationPage = new AuthenticationPage();
	private CategoryPage categoryPage = new CategoryPage();

	@Test
	public void validateUserAccount() throws Exception {
		myStoreIndexPage.doClickSignInLink();
		try {
			authenticationPage.doLogin(ExcelUtils.getCellStringData("userdata", 0, 0),
					ExcelUtils.getCellStringData("userdata", 0, 1));
		} catch (Exception e) {
			System.out.println(
					"No se pudo loguear" + e.getMessage() + e.getLocalizedMessage() + e.getCause() + e.getStackTrace());
			e.printStackTrace();
		}
		String user = myAccountPage.getUserAccount();
		Assert.assertEquals(user, ExcelUtils.getCellStringData("userdata", 0, 2));
	}

	@Test
	public void softAsserteUserAccount() throws Exception {
		myStoreIndexPage.doClickSignInLink();
		authenticationPage.doLogin(ExcelUtils.getCellStringData("userdata", 0, 0),
				ExcelUtils.getCellStringData("userdata", 0, 1));
		String user = myAccountPage.getUserAccount();
		softAssert.assertEquals(user, ExcelUtils.getCellStringData("userdata", 0, 3));
		categoryPage.clickLinkMenu();
		softAssert.assertAll();
	}
}
