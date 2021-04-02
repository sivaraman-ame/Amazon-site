package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.stepdef.Hooks;
import com.utils.BaseClass;

public class Homepagepojo extends BaseClass {
	public Homepagepojo() {
		PageFactory.initElements(Hooks.driver, this);
	}

	@FindBy(xpath = "//a[text()='Mobiles']")
	private WebElement btnmobiles;
	@FindBy(xpath = "(//span[@class='nav-a-content'])[2]")
	private WebElement btnmobileaccessories;
	@FindBy(xpath = "//a[text()='Power Banks']")
	private WebElement btnpowerbank;

	public WebElement getBtnmobiles() {
		return btnmobiles;
	}

	public WebElement getBtnmobileaccessories() {
		return btnmobileaccessories;
	}

	public WebElement getBtnpowerbank() {
		return btnpowerbank;
	}
}
