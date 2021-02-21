package com.mystore.qa.baseTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.asserts.SoftAssert;

import com.mystore.qa.driver.Driver;
import com.mystore.qa.enums.ConfigProperties;
import com.mystore.qa.utils.ReaderPropertyFile;

@Listeners(com.mystore.qa.listeners.ListenerClass.class)
public class BaseTest {
	protected SoftAssert softAssert = new SoftAssert();
	@BeforeMethod
	protected void setUp() throws Exception {
		
		Driver.initDriver(ReaderPropertyFile.getValue(ConfigProperties.BROWSER));

	}

	@AfterMethod

	protected void tearDown() {
		Driver.quitDriver();
	}

}
