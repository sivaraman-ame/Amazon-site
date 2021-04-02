package com.stepdef;

import com.pojo.Homepagepojo;
import com.utils.BaseClass;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Homepagesteps extends BaseClass {
	Homepagepojo h;

	@Given("^user launch the browser and implements implicit wait$")
	public void user_launch_the_browser_and_implements_implicit_wait() {
		launchPage("https://www.amazon.in/");

	}

	@When("^user clicks mobiles and user moves the mouse to mobiles and accessories$")
	public void user_clicks_mobiles_and_user_moves_the_mouse_to_mobiles_and_accessories() {
		h = new Homepagepojo();
		click(h.getBtnmobiles());
		moveToElement(h.getBtnmobileaccessories());
	}

	@And("^user moves to powerbank and clicks$")
	public void user_moves_to_powerbank_and_clicks() {
		h = new Homepagepojo();
		click(h.getBtnpowerbank());

	}
}
