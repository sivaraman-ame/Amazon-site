package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.BaseClass;

public class Printpricepojo extends BaseClass {
	public Printpricepojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@class='a-size-large product-title-word-break']")
	private WebElement printproducttxt;
	@FindBy(xpath = "//span[@class='a-size-medium a-color-price priceBlockDealPriceString']")
	private WebElement printpricetxt;

	public WebElement getPrintproducttxt() {
		return printproducttxt;
	}

	public WebElement getPrintpricetxt() {
		return printpricetxt;
	}
}
