package stepdefination;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import drivermanager.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.ArrayPage;
import pages.LoginPage;
import utilities.ConfigReader;

public class Array_stepDef {
	
	private LoginPage login = new LoginPage(DriverFactory.getDriver());
	private ArrayPage array = new ArrayPage(DriverFactory.getDriver());
	Properties prop;
	private ConfigReader configReader=new ConfigReader();
	

	//#####################################Background################################
	@Given("User is in landing Page")
	public void user_is_in_landing_page() {
		 login.getStartedbn();
		 login.signIn();
	}

	@When("User enters username and password followed by login button")
	public void user_enters_username_and_password_followed_by_login_button() throws IOException {
		configReader = new ConfigReader();
	    prop =configReader.initializeProp();

		String userName = prop.getProperty("username");
		   String PassWord = prop.getProperty("password");
		login.enterDataForLogin(userName, PassWord);
		array=login.clickLoginBtn3();
	}

	@Then("User should navigate to homepage")
	public void user_should_navigate_to_homepage() {
	   
	}

	@When("User clicks Get Started of Array in Home Page.")
	public void user_clicks_get_started_of_array_in_home_page() {
	    array.arrayGetStartedBtnClick();
	}
	
	@SuppressWarnings("deprecation")
	@Then("User should navigate to Array Page with title {string}")
	public void user_should_navigate_to_array_page_with_title(String title) {
	    Assert.assertEquals(DriverFactory.getDriver().getTitle(), title);
	  
	}

	@When("User clicks on Arrays in Python Page .")
	public void user_clicks_on_arrays_in_python_page() {
		array.arrayGetStartedBtnClick();
		array.arraysInPythonClick();
	}



	@SuppressWarnings("deprecation")
	@Then("User should navigate to Arrays in Python page with title {string}")
	public void user_should_navigate_to_arrays_in_python_page_with_title(String title) {
		  Assert.assertEquals(DriverFactory.getDriver().getTitle(), title);
	}



}
