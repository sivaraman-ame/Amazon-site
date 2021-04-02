package com.runner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	public static void generateJvmReport(String jsonloc) {
		File JvmReport = new File(System.getProperty("user.dir") + "\\src\\Reports");
		List<String> emp = new ArrayList<String>();
		emp.add(jsonloc);
		Configuration con = new Configuration(JvmReport, "Amazon ecom site Product price print");
		con.addClassifications("Tester", "Sivaraman");
		con.addClassifications("Browser", "Chrome");
		con.addClassifications("version", "89 or latest");

		ReportBuilder builder = new ReportBuilder(emp, con);
		builder.generateReports();

	}

}
