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

	@When("user enters {string} and {string} and \"\"page")
	public void user_enters_and_and_page(String string, String string2) {
	  page.clickOnUserName1();
	  page.clickOnpassword1();
	  
	}

	@Then("user navigate to login page successfull")
	public void user_navigate_to_login_page_successfull() {
	  page.clickOnpasswordconfirmatin1();
	  page.clickOnRegisterbutton1();
	  driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*@Given("user is on the register")
	public void user_is_on_the_register_empty_fields() {
	  
	}

	
	@When("^user enters \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void user_enters_and_empty_fields(String username, String password, String passwordconfirmation) {
		
		
		}
	
	@Then("user navigate to login page")
	public void user_navigate_to_login_page_empty_fields() {
	  
	}
	
	@Given("user is on the register")
	public void user_is_on_the_register_only_username() {
	  
	}

	
	@When("^user enters \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void user_enters_and_only_username(String username, String password, String passwordconfirmation) {
		
		
		}
	
	@Then("user navigate to login page")
	public void user_navigate_to_login_page_only_username() {
	  
	}
	
	
	@Given("user is on the register")
	public void user_is_on_the_register_only_password() {
	  
	}

	
	@When("^user enters \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void user_enters_and_only_password(String username, String password, String passwordconfirmation) {
		
		
		}
	
	@Then("user navigate to login page")
	public void user_navigate_to_login_page_only_password() {
	  
	}

	@Given("user is on the register")
	public void user_is_on_the_register_only_passwordconfirmation() {
	  
	}

	
	@When("^user enters \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void user_enters_and_only_passwordconfirmation(String username, String password, String passwordconfirmation) {
		
		
		}
	
	@Then("user navigate to login page")
	public void user_navigate_to_login_page_only_passwordconfirmation() {
	  
	}
	
	@Given("user is on the register")
	public void user_is_on_the_register_invalid_username() {
	  
	}

	
	@When("^user enters \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void user_enters_and_invalid_username(String username, String password, String passwordconfirmation) {
		
		
		}
	
	@Then("user navigate to login page")
	public void user_navigate_to_login_page_invalid_username() {
	  
	}
	
	
	@Given("user is on the register")
	public void user_is_on_the_register_invalid_password() {
	  
	}

	
	@When("^user enters \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void user_enters_and_invalid_password(String username, String password, String passwordconfirmation) {
		
		
		}
	
	@Then("user navigate to login page")
	public void user_navigate_to_login_page_invalid_password() {
	  
	}
	
	
	@Given("user is on the register")
	public void user_is_on_the_register_invalid_passwordconfirmation() {
	  
	}

	
	@When("^user enters \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void user_enters_and_invalid_passwordconfirmation(String username, String password, String passwordconfirmation) {
		
		
		}
	
	@Then("user navigate to login page")
	public void user_navigate_to_login_page_invalid_passwordconfirmation() {
	  
	}
	
	
	@Given("user is on the register")
	public void user_is_on_the_register_lessthan_eightcharecters() {
	  
	}

	
	@When("^user enters \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void user_enters_and_lessthan_eightcharecters(String username, String password, String passwordconfirmation) {
		
		
		}
	
	@Then("user navigate to login page")
	public void user_navigate_to_login_page_lessthan_eightcharecters() {
	  
	}
	
	@Given("user is on the register")
	public void user_is_on_the_register_morethan_eightcharecters() {
	  
	}

	
	@When("^user enters \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void user_enters_and_morethan_eightcharecters(String username, String password, String passwordconfirmation) {
		
		
		}
	
	@Then("user navigate to login page")
	public void user_navigate_to_login_page_morethan_eightcharecters() {
	  
	
	
	
	
	
	
	}*/
	
	
	
	
	
	
}
