
//package stepdefination;
//
//import java.io.IOException;
//import java.util.Map;
//import java.util.List;
//import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
//
//import org.openqa.selenium.WebDriver;
//
//import drivermanager.DriverFactory;
//import io.cucumber.core.internal.com.fasterxml.jackson.databind.exc.InvalidFormatException;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pages.CommonPage;
//import pages.LoginPage;
//import utilities.ExcelReader;
//
//
//public class Login_stepDef {
//	
//	
//	

//private LoginPage login = new LoginPage(DriverFactory.getDriver());
//
//	
//	
//	private WebDriver driver;
//	
//	@Given("user navigates to Home page")
//	public void user_navigates_to_home_page() {
//		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com"); 
//	
//	}
//
//	@When("user navigates to Login page")
//	public void user_navigates_to_login_page() {
//	   
//	}
//	@Then("user enters sheet {string} and {int} with valid credentials")
//	public void user_enters_sheet_and_with_valid_credentials(String Sheetname, Integer rownumber) throws InvalidFormatException, IOException {
//		login.getStartedbn();
//		login.signIn();
//		ExcelReader reader = new ExcelReader();
//		List<Map<String,String>>testData=reader.getData("src\\\\test\\resources\\ExcelTestData\\\\LoginData.xlsx", Sheetname);
//		 
//	       String Urm =	testData.get(rownumber).get("username").trim();
//	       System.out.println(Urm);
//	       String Pwd =	testData.get(rownumber).get("password").trim();
//	       System.out.println(Pwd);
//	       login.enterDataForLogin(Urm, Pwd);
//	       login.clickLoginBtn();
//	}

//>>>>>>> branch 'master' of https://github.com/aru7017/DSAlgoProject.git
//
//
//@Given("user is on the LoginPage")
//public void user_is_on_the_login_page() {
//	DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/login");

//LoginPage login;
//private DriverFactory driverFactory = new DriverFactory();
//private WebDriver driver;
//>>>>>>> branch 'master' of https://github.com/aru7017/DSAlgoProject.git
//

//@When("user enters {string} and {int} all fields empty")
//public void user_enters_and_all_fields_empty(String string, Integer int1) {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}
//
//@Then("user navigate to homepage")
//public void user_navigate_to_homepage() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}
//
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	/*@Given("user is on the browser")
//	public void user_is_on_the_browser() {
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver = new EdgeDriver();
//		page = new LoginPage(driver);
//		 driver.get("https://dsportalapp.herokuapp.com/login");
//		    driver.manage().window().maximize();
//	}
//
//	@When("user enters {string} and {string}")
//	public void user_enters_and(String string, String string2) {
//	  page.enterUserName();
//	  page.enterPassword();
//		
//	}
//
//	@Then("user navigate to home page")
//	public void user_navigate_to_home_page() {
//	  
//		page.clickLgButton();
//		driver.close();
//		
//	}*/
//	
///*	@Given("user is on the LoginPage")
//	public void user_is_on_the_login_page() {
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver = new EdgeDriver();
//		page = new LoginPage(driver);
//		 driver.get("https://dsportalapp.herokuapp.com/login");
//		    driver.manage().window().maximize(); 
//	}
//
//	@When("user enters {string} and {string} all fields empty")
//	public void user_enters_and_all_fields_empty(String string, String string2) {
//	page.emptyUserName();
//	page.emptyPassword();
//	}
//
//	@Then("user navigate to homepage")
//	public void user_navigate_to_homepage() {
//	   page.clickLgButton();
//	}
//
//@Given("user navigate the Login Page")
//public void user_navigate_the_login_page() {
//	WebDriverManager.edgedriver().setup();
//	WebDriver driver = new EdgeDriver();
//	page = new LoginPage(driver);
//	 driver.get("https://dsportalapp.herokuapp.com/login");
//	    driver.manage().window().maximize(); 
//}*/
//
///*@When("user enters {string} and {string} password only")
//public void user_enters_and_password_only(String string, String string2) {
//   page.emptyUserName();
//   page.enterPassword();
//=======
//@Given("user navigats to LoginPage")
//public void user_navigats_to_login_page() {
//	driver = driverFactory.getDriver();
//	login = new LoginPage(driver);
//	login.signIn();  
//>>>>>>> branch 'master' of https://github.com/aru7017/DSAlgoProject.git
//}
//
//@When("user enters {string} and {int}")
//public void user_enters_and(String Sheetname, Integer rownumber) throws InvalidFormatException, IOException, OpenXML4JException {
//	
//	login.enterExcelDataForLogin(Sheetname, rownumber);   
//}
//
//
//@Then("user enters valid Login credentials")
//public void user_enters_valid_login_credentials() {
//	login.clickLoginBtn();
//}
//
//@Then("user enters invalid credentials")
//public void user_enters_invalid_credentials() {
//	login.clickLoginBtn();
//}
//
//@Then("user enters only password field")
//public void user_enters_only_password_field() {
//	login.clickLoginBtn();
//}
//
//
//@Then("user enters only username field")
//public void user_enters_only_username_field() {
//	login.clickLoginBtn();
//}
//
//@Then("user checks all empty fields") 
//public void user_checks_all_empty_fields() {
//	login.clickLoginBtn();
//}
//@Then("user enters alphanumaric charecters for password")
//public void user_enters_alphanumaric_charecters_for_password() {
//	login.clickLoginBtn();
//}
//	
//
//	
//	
//	
//	
//	
//	
//	
//}
//	
//
=======
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
	

