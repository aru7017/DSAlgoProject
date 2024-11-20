package stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.RegisterPage;

public class Register_stepDef {
	public WebDriver driver;
	public RegisterPage page;
	
	@Given("user is on the register")
	public void user_is_on_the_register_valid_credentials() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
	    page = new RegisterPage(driver);
	    driver.get("https://dsportalapp.herokuapp.com/register");
	    driver.manage().window().maximize();
	}

	
	@When("^user enters \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void user_enters_and_valid_credentials(String username, String password, String passwordconfirmation) {
		page.clickOnUserName();
		page.clickOnpassword();
		
		
		}
	
	@Then("user navigate to login page")
	public void user_navigate_to_login_page_valid_credentials() {
		page.clickOnpasswordconfirmatin();
		page.clickOnRegisterbutton();
		driver.close();
	}
	
	@Given("user is on the register page")
	public void user_is_on_the_register_page() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
	    page = new RegisterPage(driver);
	    driver.get("https://dsportalapp.herokuapp.com/register");
	    driver.manage().window().maximize();
	}

	@When("user enters {string} and {string} and {string} all fields empty")
	public void user_enters_and_and_all_fields_empty(String string, String string2, String string3) {
		  page.userNamewithoutsendkeys();
		  page.passwordwithoutsendkeys();
	}

	@Then("user navigate to loginpage")
	public void user_navigate_to_loginpage() {
		  page.passwordconfirmatinwithoutsendkeys();
		  page.clickOnRegisterbutton();
		  driver.close();
	}
	
	
	@Given("user is on the registerpage")
	public void user_is_on_the_registerpage() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
	    page = new RegisterPage(driver);
	    driver.get("https://dsportalapp.herokuapp.com/register");
	    driver.manage().window().maximize();
	}

	@When("user enters {string} and {string} and {string} only username")
	public void user_enters_and_and_only_username(String string, String string2, String string3) {
		   page.clickOnUserName();
		   page.passwordwithoutsendkeys();
		   page.clickOnRegisterbutton();
	}

	@Then("user navigate to login page succesfully")
	public void user_navigate_to_login_page_succesfully() {
		   page.clickOnRegisterbutton();
	}	
	
	@Given("user is navigate to register")
	public void user_is_navigate_to_register() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
	    page = new RegisterPage(driver);
	    driver.get("https://dsportalapp.herokuapp.com/register");
	    driver.manage().window().maximize();
	}

	@When("user enters {string} and {string} and {string} only password field")
	public void user_enters_and_and_only_password_field(String string, String string2, String string3) {
	  page.userNamewithoutsendkeys();
	  page.clickOnpassword();
	  page.passwordconfirmatinwithoutsendkeys();
	}

	@Then("user is on the login page")
	public void user_is_on_the_login_page() {
	 page.clickOnRegisterbutton();
		
	}
	
	@Given("user navigate to register page")
	public void user_navigate_to_register_page() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
	    page = new RegisterPage(driver);
	    driver.get("https://dsportalapp.herokuapp.com/register");
	    driver.manage().window().maximize();
	}

	@When("user enters {string} and {string} and {string} only passwordconfirmation field")
	public void user_enters_and_and_only_passwordconfirmation_field(String string, String string2, String string3) {
		page.userNamewithoutsendkeys();
	  page.passwordwithoutsendkeys();
	  page.clickOnpasswordconfirmatin();
	}

	@Then("user navigates to login page")
	public void user_navigates_to_login_page() {
	   page.clickOnRegisterbutton();
	}

	@Given("user is navigating to the register")
	public void user_is_navigating_to_the_register() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
	    page = new RegisterPage(driver);
	    driver.get("https://dsportalapp.herokuapp.com/register");
	    driver.manage().window().maximize();
		
	}

	@When("user enters {string} and {string} and {string} invalid username")
	public void user_enters_and_and_invalid_username(String string, String string2, String string3) {
	    page.clickOnUserName();
	    page.clickOnpassword();
	    page.clickOnpasswordconfirmatin();
		
	}

	@Then("user navigats to loginpage")
	public void user_navigats_to_loginpage() {
	 
		page.clickOnRegisterbutton();
	}
	
	
	@Given("user is navigating to the register page")
	public void user_is_navigating_to_the_register_page() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
	    page = new RegisterPage(driver);
	    driver.get("https://dsportalapp.herokuapp.com/register");
	    driver.manage().window().maximize();
	}

	@When("user enters {string} and {string} and {string} invalid password")
	public void user_enters_and_and_invalid_password(String string, String string2, String string3) {
	    page.clickOnUserName();
	    page.clickOnpassword();
	    page.clickOnpasswordconfirmatin();
		
	}

	@Then("user navigating to the loginpage")
	public void user_navigating_to_the_loginpage() {
		page.clickOnRegisterbutton();
	}
	
	
	
	
	
	
	
	
	
	
	

	

	
	
	
}
