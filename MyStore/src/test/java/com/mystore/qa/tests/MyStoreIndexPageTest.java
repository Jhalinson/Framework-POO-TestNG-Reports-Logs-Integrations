package com.mystore.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mystore.qa.baseTest.BaseTest;
import com.mystore.qa.pages.MyStoreIndexPage;
import com.mystore.qa.utils.ExcelUtils;

public final class MyStoreIndexPageTest extends BaseTest {
	private final MyStoreIndexPage myStoreIndexPage = new MyStoreIndexPage();

	private MyStoreIndexPageTest() {

	}

	@Test(priority = 0)
	public void validateMyStoreTitle() throws Exception {

		String title = myStoreIndexPage.getMyStoreTitle();
		Assert.assertEquals(title, ExcelUtils.getCellStringData("resultdata", 0, 0), "The title does not match.");

	}

	@Test(priority = 1)
	public void validateMyStoreLogo() {

		Assert.assertTrue(myStoreIndexPage.getMyStoreLogo());
	}

	@Test(priority = 2)
	public void clickSignInLink() {

		myStoreIndexPage.doClickSignInLink();
	}

	@Test(priority = 3)
	public void searchProduct() throws Exception {

		myStoreIndexPage.searchItem(ExcelUtils.getCellStringData("appdata", 0, 0));
		String productName = myStoreIndexPage.getProductName();
		Assert.assertEquals(productName, ExcelUtils.getCellStringData("appdata", 0, 0));
		Assert.assertTrue(myStoreIndexPage.getProductImage());
	}

	@Test(priority = 4)
	public void searchInvalidProduct() throws Exception {

		String wrongProduct = myStoreIndexPage.searchForNonExistentItems(ExcelUtils.getCellStringData("appdata", 1, 0));
		Assert.assertEquals(wrongProduct, ExcelUtils.getCellStringData("resultdata", 1, 0));

	}

	@Test(priority = 5)
	public void validateStoreInformationFooter() throws Exception {

		Assert.assertEquals(
				myStoreIndexPage.getMultipleElementsText().contains(ExcelUtils.getCellStringData("appdata", 2, 0)),
				true);
		Assert.assertEquals(
				myStoreIndexPage.getMultipleElementsText().contains(ExcelUtils.getCellStringData("resultdata", 3, 0)),
				true, "The information does not match");
		Assert.assertEquals(
				myStoreIndexPage.getMultipleElementsText().contains(ExcelUtils.getCellStringData("resultdata", 4, 0)),
				true);
		Assert.assertEquals(myStoreIndexPage.getStoreInformationText(),
				ExcelUtils.getCellStringData("resultdata", 5, 0));

	}

}
