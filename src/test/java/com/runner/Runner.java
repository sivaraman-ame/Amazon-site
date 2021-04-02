package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\feature", glue = "com.stepdef", monochrome = true, plugin = {
		"json:target\\JsonReports\\data.json" })

public class Runner {

	@AfterClass
	public static void afterclass() {
		JvmReport.generateJvmReport(System.getProperty("user.dir") + "\\target\\JsonReports\\data.json");

	}
}
