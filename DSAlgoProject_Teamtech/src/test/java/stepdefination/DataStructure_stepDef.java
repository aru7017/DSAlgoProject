package stepdefination;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.openqa.selenium.WebDriver;

import drivermanager.DriverFactory;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.exc.InvalidFormatException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DataStrucuturePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.ExcelReader;

public class DataStructure_stepDef {
	private WebDriver driver;
	private LoginPage login = new LoginPage(DriverFactory.getDriver());
	private DataStrucuturePage datastructure = new DataStrucuturePage(driver);
	Properties prop;
	private ConfigReader configReader=new ConfigReader();
	
	
	@Given("User navigates login page successfully")
	public void user_navigates_login_page_successfully() {
		 login.getStartedbn();
		 login.signIn();
	}

	@When("User enter username and password")
	public void user_enter_username_and_password() throws IOException {
		configReader = new ConfigReader();
	    prop =configReader.initializeProp();

		String userName = prop.getProperty("username");
		   String PassWord = prop.getProperty("password");
		login.enterDataForLogin(userName, PassWord);
		datastructure=login.clickLoginBtn();
	}

	@Then("User is able to navigate homepage")
	public void user_is_able_to_navigate_homepage() {
	  
	}
	
	@When("user is able to click on get started button in the homepage")
	public void user_is_able_to_click_on_get_started_button_in_the_homepage() {
	datastructure.getStartedbtn();  
	}
	
	@Then("user navigates to Data Structures-Introduction page")
	public void user_navigates_to_data_structures_introduction_page() {
		
		
	}
	
	@Then("user navigates to Time Complexity link")
	public void user_navigates_to_time_complexity_link() {
		datastructure.timeComplexity();
		
	}
	
	@Then("user is able to clicks on tryhere button")
	public void user_is_able_to_clicks_on_tryhere_button() {
		datastructure.timeComplexity();
		datastructure.tryHereBtn();
	}
	
	

	
	
	
	
	
	


	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	
    @When("user enters sheet {string} and {int} Tryhere button")
	 public void user_enters_sheet_and_tryhere_button(String Sheetname, Integer rownumber) throws InvalidFormatException, IOException, OpenXML4JException {
		login.getStartedbn();
		login.signIn();
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>>testData=reader.getData("src\\\\test\\resources\\ExcelTestData\\\\LoginData.xlsx", Sheetname);
		 
	       String Urm =	testData.get(rownumber).get("username").trim();
	       System.out.println(Urm);
	       String Pwd =	testData.get(rownumber).get("password").trim();
	       System.out.println(Pwd);
	       login.enterDataForLogin(Urm, Pwd);
	       datastructure=login.clickLoginBtn();
	       datastructure.getStartedbtn();
	       datastructure.timeComplexity();
	}

	@Then("user navigates to Try Here button")
	public void user_navigates_to_try_here_button() {
		datastructure.tryHereBtn();
	}
	
	@When("user enters sheet {string} and {int} Try Editor field")
	public void user_enters_sheet_and_try_editor_field(String Sheetname, Integer rownumber) throws InvalidFormatException, IOException, OpenXML4JException {
		login.getStartedbn();
		login.signIn();
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>>testData=reader.getData("src\\\\test\\resources\\ExcelTestData\\\\LoginData.xlsx", Sheetname);
		 
	       String Urm =	testData.get(rownumber).get("username").trim();
	       System.out.println(Urm);
	       String Pwd =	testData.get(rownumber).get("password").trim();
	       System.out.println(Pwd);
	       login.enterDataForLogin(Urm, Pwd);
	       datastructure=login.clickLoginBtn();
	       datastructure.getStartedbtn();
	       datastructure.timeComplexity();
	       datastructure.tryHereBtn();
	}

	@Then("user navigates to Try Editor field")
	public void user_navigates_to_try_editor_field() {
		datastructure.testEditor();
	}*/
	
	
	
}
