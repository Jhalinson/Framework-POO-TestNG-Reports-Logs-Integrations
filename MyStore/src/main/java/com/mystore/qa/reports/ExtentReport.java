package com.mystore.qa.reports;

import java.awt.Desktop;
import java.io.File;
import java.util.Objects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.mystore.qa.constants.FrameworkConstants;

public final class ExtentReport {
	public static ExtentReports extent;

	private ExtentReport() {

	}

	public static void initReports() throws Exception {

		if (Objects.isNull(extent)) {
			extent = new ExtentReports();
			ExtentSparkReporter spark = new ExtentSparkReporter(FrameworkConstants.getExtentreportpath());
			spark.config().setTheme(Theme.DARK);
			spark.config().setDocumentTitle("My Store Report");
			extent.attachReporter(spark);
		}
		extent.setSystemInfo("Company Name", "Applaudo Studio");
		extent.setSystemInfo("Project Name", "My Store");
		extent.setSystemInfo("Department Name", "QA");
		extent.setSystemInfo("SDET Name", "Jhalinson Acosta");
		extent.setSystemInfo("Company Name", "Applaudo Studio");

	}

	public static void flushReports() throws Exception {
		if (Objects.nonNull(extent)) {
			extent.flush();
		}
		try {
			Desktop.getDesktop().browse(new File(FrameworkConstants.getExtentreportpath()).toURI());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void createTest(String testCaseName) {

		ExtentManager.setExtentTest(extent.createTest(testCaseName));
	}

}
