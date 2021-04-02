package com.stepdef;

import com.utils.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {

	@Before
	public void beforeclass() {
		chromeDriver();
		waitImplicit(20);
	}

	@After
	public void Afterclass() {
		close();
		System.out.println("driver closed");
	}
}
