package stepdefination;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.openqa.selenium.WebDriver;

import drivermanager.DriverFactory;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.exc.InvalidFormatException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DataStrucuturePage;
import pages.LoginPage;
import utilities.ExcelReader;

public class DataStructure_stepDef {
	private WebDriver driver;
	private LoginPage login = new LoginPage(DriverFactory.getDriver());
	private DataStrucuturePage datastructure = new DataStrucuturePage(driver);
	@Given("user navigates Home page")
	public void user_navigates_to_home_page() {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com"); 
	  
	}
	
	@When("user enters sheet {string} and {int} valid Python Code")
	public void user_enters_sheet_and_valid_python_code_(String Sheetname, Integer rownumber) throws InvalidFormatException, IOException, OpenXML4JException {
		 
		login.getStartedbn();
		login.signIn();
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>>testData=reader.getData("src\\test\\resources\\ExcelTestData\\LoginData.xlsx", Sheetname);
		 
	       String Urm =	testData.get(rownumber).get("username").trim();
	       System.out.println(Urm);
	       String Pwd =	testData.get(rownumber).get("password").trim();
	       System.out.println(Pwd);
	       login.enterDataForLogin(Urm, Pwd);
	       
	       
	}

	@Then("user navigates to Data Structures-Introduction page")
	public void user_navigates_to_data_structures_introduction_page() {
		datastructure=login.clickLoginBtn();
	       datastructure.getStartedbtn();
		
	}
	
	
	
	@When("user enters sheet {string} and {int}")
	public void user_enters_sheet_and(String Sheetname, Integer rownumber) throws InvalidFormatException, IOException, OpenXML4JException {
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
	}

	@Then("user navigates to Time Complexity link")
	public void user_navigates_to_time_complexity_link() {
		datastructure.timeComplexity();
	}
	
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
	}
	
	
	
}
