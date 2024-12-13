package stepdefination;

import org.openqa.selenium.WebDriver;

import drivermanager.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.QueuePage;


public class Queue_stepDef {
	
	private WebDriver driver;
	private LoginPage login = new LoginPage(DriverFactory.getDriver());
	private QueuePage queue = new QueuePage(driver);
	
	@Given("User navigates to login page")
	public void user_navigates_to_login_page() {
		 login.getStartedbn();
		 login.signIn();
	}

	@When("User enters username and password and clicks on login button")
	public void user_enters_username_and_password_and_clicks_on_login_button() {
		login.enterDataForLogin("techteam", "Time4team$"); 
		queue=login.clickLoginBtn2();
	}

	@Then("User is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
	  
	}
	

	@When("User clicks Get Started of Queue in Home Page.")
	public void user_clicks_get_started_of_queue_in_home_page(){
		//Thread.sleep(5000);
		queue.queueGetStartedBtn();
	}

	@Then("User should navigate to Queue Page.")
	public void user_should_navigate_to_queue_page() {
		
	}
	@When("User clicks on Implementation of Queue in Python  in Queue Page .")
	public void user_clicks_on_implementation_of_queue_in_python_in_queue_page() {
		
		queue.queueGetStartedBtn();
		queue.implementationOfQueueLink();
	}

	@Then("User should navigate to Implementation of Queue in Python Page.")
	public void user_should_navigate_to_implementation_of_queue_in_python_page() {
		
	}

	@When("User clicks on TryHere link of Implementation of queue page .")
	public void user_clicks_on_try_here_link_of_implementation_of_queue_page() {
		queue.queueGetStartedBtn();
		queue.implementationOfQueueLink();
		queue.ClickTryHereInQueue();
	}

	@Then("User should navigate to TryEditor page to write the python code")
	public void user_should_navigate_to_try_editor_page_to_write_the_python_code() {
	    
	}



}
