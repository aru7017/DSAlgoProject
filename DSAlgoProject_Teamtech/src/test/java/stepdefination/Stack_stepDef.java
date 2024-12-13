package stepdefination;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import drivermanager.DriverFactory;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.exc.InvalidFormatException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utilities.ExcelReader;
import pages.DataStrucuturePage;
import pages.LoginPage;
import pages.StackPage;

public class Stack_stepDef {
	private WebDriver driver;
	private LoginPage login = new LoginPage(DriverFactory.getDriver());
	private StackPage stack = new StackPage(driver);
	@Given("user is in Home page")
	public void user_is_in_home_page() {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com"); 
	}

	@When("user enters sheet {string} and {int} for valid Python Code")
	public void user_enters_sheet_and_for_valid_python_code(String Sheetname, Integer rownumber) throws InvalidFormatException, IOException {
	   login.getStartedbn();
	   login.signIn();
	   ExcelReader reader = new ExcelReader();
	   List<Map<String,String>>testData=reader.getData("src\\\\test\\resources\\ExcelTestData\\\\LoginData.xlsx", Sheetname);
	   String Urm =	testData.get(rownumber).get("username").trim();
       System.out.println(Urm);
       String Pwd =	testData.get(rownumber).get("password").trim();
       System.out.println(Pwd);
       login.enterDataForLogin(Urm, Pwd);
	  
	}

	@Then("user navigates to Stack page")
	public void user_navigates_to_stack_page() {
		stack=login.clickLoginBtn1();
	     stack.stackgetStartedbtn();  
	}
	
	@When("user enters sheet {string} and {int} for Operations in StackPage")
	public void user_enters_sheet_and_for_operations_in_stack_page(String Sheetname, Integer rownumber) throws InvalidFormatException, IOException {
		login.getStartedbn();
		   login.signIn();
		   ExcelReader reader = new ExcelReader();
		   List<Map<String,String>>testData=reader.getData("src\\\\test\\resources\\ExcelTestData\\\\LoginData.xlsx", Sheetname);
		   String Urm =	testData.get(rownumber).get("username").trim();
	       System.out.println(Urm);
	       String Pwd =	testData.get(rownumber).get("password").trim();
	       System.out.println(Pwd);
	       login.enterDataForLogin(Urm, Pwd);
	       stack=login.clickLoginBtn1();
		     stack.stackgetStartedbtn();  
	}

	@Then("user navigates to Operations in Stack link")
	public void user_navigates_to_operations_in_stack_link() {
	    stack.ClickoperationsInstack();
	    
	}
	
	@When("user enters sheet {string} and {int} for Try hereButton")
	public void user_enters_sheet_and_for_try_here_button(String Sheetname, Integer rownumber) throws InvalidFormatException, IOException {
		login.getStartedbn();
		   login.signIn();
		   ExcelReader reader = new ExcelReader();
		   List<Map<String,String>>testData=reader.getData("src\\\\test\\resources\\ExcelTestData\\\\LoginData.xlsx", Sheetname);
		   String Urm =	testData.get(rownumber).get("username").trim();
	       System.out.println(Urm);
	       String Pwd =	testData.get(rownumber).get("password").trim();
	       System.out.println(Pwd);
	       login.enterDataForLogin(Urm, Pwd);
	       stack=login.clickLoginBtn1();
		   stack.stackgetStartedbtn(); 
		   stack.ClickoperationsInstack();
	    
	}

	@Then("user navigates to tryEditor page to run Python code")
	public void user_navigates_to_try_editor_page_to_run_python_code() {
	   stack.ClickTryHereInstack();
	}
	
	@When("user enters sheet {string} and {int} for TryEditorPage")
	public void user_enters_sheet_and_for_try_editor_page(String Sheetname, Integer rownumber) throws InvalidFormatException, IOException {
		login.getStartedbn();
		   login.signIn();
		   ExcelReader reader = new ExcelReader();
		   List<Map<String,String>>testData=reader.getData("src\\\\test\\resources\\ExcelTestData\\\\LoginData.xlsx", Sheetname);
		   String Urm =	testData.get(rownumber).get("username").trim();
	       System.out.println(Urm);
	       String Pwd =	testData.get(rownumber).get("password").trim();
	       System.out.println(Pwd);
	       login.enterDataForLogin(Urm, Pwd);
	       stack=login.clickLoginBtn1();
		   stack.stackgetStartedbtn(); 
		   stack.ClickoperationsInstack();  
		   stack.ClickTryHereInstack();
	}

	@Then("user is able to see the output in result section")
	public void user_is_able_to_see_the_output_in_result_section() {
	  stack.TextEditorOperations();
	  stack.ClickRunButton();
	}
	@When("user enters sheet {string} and {int} for TryEditorPage with invalid Python code")
	public void user_enters_sheet_and_for_try_editor_page_with_invalid_python_code(String Sheetname, Integer rownumber) throws InvalidFormatException, IOException {
		login.getStartedbn();
		   login.signIn();
		   ExcelReader reader = new ExcelReader();
		   List<Map<String,String>>testData=reader.getData("src\\\\test\\resources\\ExcelTestData\\\\LoginData.xlsx", Sheetname);
		   String Urm =	testData.get(rownumber).get("username").trim();
	       System.out.println(Urm);
	       String Pwd =	testData.get(rownumber).get("password").trim();
	       System.out.println(Pwd);
	       login.enterDataForLogin(Urm, Pwd);
	       stack=login.clickLoginBtn1();
		   stack.stackgetStartedbtn(); 
		   stack.ClickoperationsInstack();  
		   stack.ClickTryHereInstack();
	}

	@Then("user will see an error message in PopUp window.")
	public void user_will_see_an_error_message_in_pop_up_window() {
		stack.TextEditorInvalidOperations();
		  stack.ClickRunButton();
	}


}
