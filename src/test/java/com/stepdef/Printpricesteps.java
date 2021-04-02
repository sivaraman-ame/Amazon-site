package com.stepdef;

import java.io.IOException;

import com.pojo.Printpricepojo;
import com.utils.BaseClass;

import cucumber.api.java.en.And;

public class Printpricesteps extends BaseClass {
	Printpricepojo pp;

	@And("^user prints the price and product name$")
	public void user_prints_the_price_and_product_name() throws IOException {
		pp = new Printpricepojo();
		windowHandle();
		getText(pp.getPrintpricetxt());
		getText(pp.getPrintproducttxt());

	}
}
