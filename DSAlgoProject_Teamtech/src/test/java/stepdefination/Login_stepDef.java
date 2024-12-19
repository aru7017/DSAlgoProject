package stepdefination;

import java.io.IOException;
import java.util.Map;
import java.util.List;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.WebDriver;

import drivermanager.DriverFactory;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.exc.InvalidFormatException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CommonPage;
import pages.LoginPage;
import utilities.ExcelReader;


public class Login_stepDef {
	
	
	


LoginPage login;
private DriverFactory driverFactory = new DriverFactory();
private WebDriver driver;

@Given("user navigats to LoginPage")
public void user_navigats_to_login_page() {
	driver = driverFactory.getDriver();
	login = new LoginPage(driver);
	login.signIn();  
}

@When("user enters {string} and {int}")
public void user_enters_and(String Sheetname, Integer rownumber) throws InvalidFormatException, IOException, OpenXML4JException {
	
	login.enterExcelDataForLogin(Sheetname, rownumber);   
}


@Then("user enters valid Login credentials")
public void user_enters_valid_login_credentials() {
	login.clickLoginBtn();
}

@Then("user enters invalid credentials")
public void user_enters_invalid_credentials() {
	login.clickLoginBtn();
}

@Then("user enters only password field")
public void user_enters_only_password_field() {
	login.clickLoginBtn();
}


@Then("user enters only username field")
public void user_enters_only_username_field() {
	login.clickLoginBtn();
}

@Then("user checks all empty fields") 
public void user_checks_all_empty_fields() {
	login.clickLoginBtn();
}
@Then("user enters alphanumaric charecters for password")
public void user_enters_alphanumaric_charecters_for_password() {
	login.clickLoginBtn();
}
	

	
	
	
	
	
	
	
}
	

