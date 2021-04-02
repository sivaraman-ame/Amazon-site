package com.stepdef;

import java.awt.AWTException;

import com.pojo.productpojo;
import com.utils.BaseClass;

import cucumber.api.java.en.When;

public class Productsteps extends BaseClass {
	productpojo p;

	@When("^user rightclicks the link and clicks to open in new tab$")
	public void user_rightclicks_the_link_and_clicks_to_open_in_new_tab() throws AWTException {
		p = new productpojo();
		contextClick(p.getBtnlink());
		robotDown(1);
		windowHandle();
	}
}
