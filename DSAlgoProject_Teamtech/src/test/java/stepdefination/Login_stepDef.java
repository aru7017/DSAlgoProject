package stepdefination;

import drivermanager.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;


public class Login_stepDef {
	
	private LoginPage loginpage = new LoginPage(DriverFactory.getDriver()) ;
	

	@Given("user is on the LoginPage")
	public void user_is_on_the_login_page() {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/login");
		loginpage.enterUserName();
		loginpage.enterPassword();
		loginpage.clickLgButton();
	}

	@When("user enters {string} and {string} valid credentials")
	public void user_enters_and_valid_credentials(String string, String string2) {
	   
	}

	@Then("user navigate to homepage")
	public void user_navigate_to_homepage() {
		
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*@Given("user is on the browser")
	public void user_is_on_the_browser() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		page = new LoginPage(driver);
		 driver.get("https://dsportalapp.herokuapp.com/login");
		    driver.manage().window().maximize();
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
	  page.enterUserName();
	  page.enterPassword();
		
	}

	@Then("user navigate to home page")
	public void user_navigate_to_home_page() {
	  
		page.clickLgButton();
		driver.close();
		
	}*/
	
/*	@Given("user is on the LoginPage")
	public void user_is_on_the_login_page() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		page = new LoginPage(driver);
		 driver.get("https://dsportalapp.herokuapp.com/login");
		    driver.manage().window().maximize(); 
	}

	@When("user enters {string} and {string} all fields empty")
	public void user_enters_and_all_fields_empty(String string, String string2) {
	page.emptyUserName();
	page.emptyPassword();
	}

	@Then("user navigate to homepage")
	public void user_navigate_to_homepage() {
	   page.clickLgButton();
	}

@Given("user navigate the Login Page")
public void user_navigate_the_login_page() {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	page = new LoginPage(driver);
	 driver.get("https://dsportalapp.herokuapp.com/login");
	    driver.manage().window().maximize(); 
}*/

/*@When("user enters {string} and {string} password only")
public void user_enters_and_password_only(String string, String string2) {
   page.emptyUserName();
   page.enterPassword();
}

@Then("user navigates to homepage")
public void user_navigates_to_homepage() {
  page.clickLgButton();
}

@Given("user navigates the Login Page")
public void user_navigates_the_login_page() {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	page = new LoginPage(driver);
	 driver.get("https://dsportalapp.herokuapp.com/login");
	    driver.manage().window().maximize();
}

@When("user enters {string} and {string} username only")
public void user_enters_and_username_only(String string, String string2) {
  page.enterUserName();
  page.emptyPassword();
}

@Then("user navigates to homepage successfully")
public void user_navigates_to_homepage_successfully() {
   page.clickLgButton();
   
   
}
@Given("user is able to navigate Login Page")
public void user_is_able_to_navigate_login_page() {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	page = new LoginPage(driver);
	 driver.get("https://dsportalapp.herokuapp.com/login");
	    driver.manage().window().maximize();
}

@When("user enters {string} and \"Time4team$\"invalid username")
public void user_enters_and_time4team$_invalid_username(String string) {
   page.invalidUserName();
   page.enterPassword();
}

@Then("user is able navigate to homepage")
public void user_is_able_navigate_to_homepage() {
   page.clickLgButton();
}


@Given("user is able to navigates LoginPage")
public void user_is_able_to_navigates_login_page() {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	page = new LoginPage(driver);
	 driver.get("https://dsportalapp.herokuapp.com/login");
	    driver.manage().window().maximize();
}

@When("user enters {string} and {string} invalid password")
public void user_enters_and_invalid_password(String string, String string2) {
	  page.enterUserName();
	  page.invalidPassword();
}

@Then("user is able navigates to homepage successfull")
public void user_is_able_navigates_to_homepage_successfull() {
	  page.clickLgButton();
}*/
	
	
	
	
	
	
	
	
}
	

