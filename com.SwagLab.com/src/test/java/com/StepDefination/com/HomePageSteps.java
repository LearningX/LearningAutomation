package com.StepDefination.com;

import com.BaseClass.com.BaseClass;
import com.pageObjects.com.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageSteps extends BaseClass {

	public HomePageSteps() {
	 super();
	}
	
	HomePage homepage = new HomePage(); // create object of HomePage

	@Given("User Launch the site URL")
	public void userLaunchTheSiteUrl() {
		launchBrowser();
	}

	@Given("Allow cookies popup and age confirmation")
	public void allowCookiesPopupAndAgeConfirmation() {
		homepage.selectAllCookiesAndAcceptAge(); // from HomePage method use'
	
	}

	@Given("User Search the Product")
	public void searchTheProduct() {
		homepage.searchTheProduct();
	}
	
	@Given ("User click on Shop Devices Link")
	public void clickShopDevicesLink() {
		homepage.clickShopDevicesLink();
		
	}
	 @Then ("User click on Explore Vuse Go")
	 public void clickExploreVuseGo() {
		 
	 }
	
	
}