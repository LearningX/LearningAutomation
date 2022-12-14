package com.StepDefination.com;

import org.junit.Assert;

import com.BaseClass.com.BaseClass;
import com.pageObjects.com.HomePage;
import com.pageObjects.com.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginPageSteps extends BaseClass {

	HomePage homepage = new HomePage(); 
	LoginPage loginpage = new LoginPage();

	@Given("User Enter Username and Password")
	public void userEnterUsernameAndPassword() throws InterruptedException {

		homepage.userClickOnSignInLink();
		loginpage.enterSignInDetails();
	}

	@And("User Enter invalid data {string} and {string}")

	public void userEnterInvalidData(String user_name, String pass_word) throws Throwable {

		homepage.userClickOnSignInLink();
		loginpage.enterUsernameAndPassword(user_name,pass_word);
	}
	
	@And ("User Enter incorrect data of {string} and {string}")
	
	public void userEnterIncorrectDataOfUsernameAndPassword(String uname, String pswd) throws Throwable {
		
		homepage.userClickOnSignInLink();
		loginpage.enterSignInDetailsToAssertErrorMessage(uname, pswd);
		
	}
	
	@Then ("User verify the invalid message {string}")
	public void assertLoginPageErrorMessage(String loginPageExpectedText) {
		boolean expectedText= driver.getPageSource().toLowerCase().contains(prop.getProperty(loginPageExpectedText).toLowerCase());
		Assert.assertEquals(expectedText, true);
			
	}
}

