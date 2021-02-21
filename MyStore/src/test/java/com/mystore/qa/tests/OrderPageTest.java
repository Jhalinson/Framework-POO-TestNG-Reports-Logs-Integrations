package com.mystore.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mystore.qa.baseTest.BaseTest;
import com.mystore.qa.pages.AuthenticationPage;
import com.mystore.qa.pages.CategoryPage;
import com.mystore.qa.pages.MyStoreIndexPage;
import com.mystore.qa.pages.OrderPage;
import com.mystore.qa.utils.ExcelUtils;

public class OrderPageTest extends BaseTest {
	private MyStoreIndexPage myStoreIndexPage = new MyStoreIndexPage();
	private AuthenticationPage authenticationPage = new AuthenticationPage();
	private CategoryPage categoryPage = new CategoryPage();
	private OrderPage orderPage = new OrderPage();

	@Test(priority = 0)
	public void addItemToShoppingCart() throws Exception {

		myStoreIndexPage.doClickSignInLink();
		authenticationPage.doLogin(ExcelUtils.getCellStringData("userdata", 0, 0),
				ExcelUtils.getCellStringData("userdata", 0, 1));
		categoryPage.clickLinkMenu();
		String productNameCategory = categoryPage.getProductNameText();
		categoryPage.clickAddToCartBtn();
		try {
			categoryPage.clickProceedToCheckoutBtn();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String productNameOrder = orderPage.getProductNameText();
		Assert.assertEquals(productNameCategory, productNameOrder);
		Assert.assertTrue(orderPage.getProductPicture(), "The image of the product is not visible");

	}

	@Test(priority = 1)
	public void deleteItemFromShoppingCart() throws Exception {

		myStoreIndexPage.doClickSignInLink();
		authenticationPage.doLogin(ExcelUtils.getCellStringData("userdata", 0, 0),
				ExcelUtils.getCellStringData("userdata", 0, 1));
		categoryPage.clickLinkMenu();
		categoryPage.clickAddToCartBtn();
		try {
			categoryPage.clickProceedToCheckoutBtn();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		orderPage.clickDeleteBtn();
		String alert = orderPage.getAlertText();
		Assert.assertEquals(alert, ExcelUtils.getCellStringData("resultdata", 6, 0));

	}

}
