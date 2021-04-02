package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.BaseClass;

public class productpojo extends BaseClass {
	public productpojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[contains(text(),'Zinq 20000mAh Li-Polymer Power Bank')])[1]")
	private WebElement btnlink;

	public WebElement getBtnlink() {
		return btnlink;
	}

}
