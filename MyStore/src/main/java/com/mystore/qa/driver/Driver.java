package com.mystore.qa.driver;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import com.mystore.qa.constants.FrameworkConstants;
import com.mystore.qa.enums.ConfigProperties;
import com.mystore.qa.utils.ReaderPropertyFile;

import io.github.bonigarcia.wdm.WebDriverManager;

public final class Driver {

	private Driver() {
	}

	public static void initDriver(String browser) throws Exception {

		if (Objects.isNull(DriverManager.getDriver())) {

			if (browser.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				DriverManager.setDriver(new ChromeDriver());

			} else if (browser.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				DriverManager.setDriver(new FirefoxDriver());

			} else if (browser.equalsIgnoreCase("ie")) {
				WebDriverManager.iedriver().setup();
				DriverManager.setDriver(new InternetExplorerDriver());

			} else if (browser.equalsIgnoreCase("opera")) {
				WebDriverManager.operadriver().setup();
				DriverManager.setDriver(new OperaDriver());

			} else if (browser.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				DriverManager.setDriver(new EdgeDriver());

			}

			DriverManager.getDriver().manage().deleteAllCookies();
			DriverManager.getDriver().manage().timeouts().pageLoadTimeout(FrameworkConstants.getPageload(),
					TimeUnit.SECONDS);
			DriverManager.getDriver().manage().window().maximize();
			DriverManager.getDriver().get(ReaderPropertyFile.getValue(ConfigProperties.URL));

		}
	}

	public static void quitDriver() {
		if (Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unLoad();

		}

	}

}
