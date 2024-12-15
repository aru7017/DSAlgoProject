package stepdefination;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

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
	
	@Given("user is in queue page")
	public void user_is_in_queue_page() {
	    
	}

	@When("user enters valid python code in TryEditorPage")
	public void user_enters_valid_python_code_in_try_editor_page() {
		queue.queueGetStartedBtn();
		queue.implementationOfQueueLink();
		queue.ClickTryHereInQueue();
		queue.TextEditorOperations();
		queue.ClickRunButton();
	}

	@Then("user is able to see the output in result section of TryEditor Page")
	public void user_is_able_to_see_the_output_in_result_section_of_try_editor_page() {
	   
	}



	@When("user enters invalid python code in TryEditorPage")
	public void user_enters_invalid_python_code_in_try_editor_page() {
		queue.queueGetStartedBtn();
		queue.implementationOfQueueLink();
		queue.ClickTryHereInQueue();
		queue.TextEditorInvalidOperations();
		queue.ClickRunButton();
	}

	@Then("user will see an error message in PopUp window of TryEditor Page")
	public void user_will_see_an_error_message_in_pop_up_window_of_try_editor_page() {
	    
	}
//#######################################################################################################
	@When("User clicks Implementation using collections.deque")
	public void user_clicks_implementation_using_collections_deque(){
		queue.queueGetStartedBtn();
		queue.implementationUsingCollectionDequeue(); 
	}

	@Then("User should navigate to Implementation using collections.deque.")
	public void user_should_navigate_to_implementation_using_collections_deque() {
		 
	}
	@When("User clicks on TryHere link of Implementation using collections.deque.")
	public void user_clicks_on_try_here_link_of_implementation_using_collections_deque() {
		queue.queueGetStartedBtn();
		queue.implementationUsingCollectionDequeue();
		queue.ClickTryHereInQueue();
	}

	@Then("User should navigate to TryEditor page to write the python code of Implementation using collections.deque.")
	public void user_should_navigate_to_try_editor_page_to_write_the_python_code_of_implementation_using_collections_deque() {
	    
	}

	@When("user enters valid python code in TryEditorPage of Implementation using collections.deque.")
	public void user_enters_valid_python_code_in_try_editor_page_of_implementation_using_collections_deque() {
		queue.queueGetStartedBtn();
		queue.implementationUsingCollectionDequeue();
		queue.ClickTryHereInQueue();
		queue.TextEditorOperations();
		queue.ClickRunButton();
		
	}

	@Then("user is able to see the output in result section of TryEditor Page of Implementation using collections.deque.")
	public void user_is_able_to_see_the_output_in_result_section_of_try_editor_page_of_implementation_using_collections_deque() {
	    
	}

	@When("user enters invalid python code in TryEditorPage of Implementation using collections.deque.")
	public void user_enters_invalid_python_code_in_try_editor_page_of_implementation_using_collections_deque() {
		queue.queueGetStartedBtn();
		queue.implementationUsingCollectionDequeue();
		queue.ClickTryHereInQueue();
		queue.TextEditorInvalidOperations();
		queue.ClickRunButton();
	}

	@Then("user will see an error message in PopUp window of TryEditor Page of Implementation using collections.deque.")
	public void user_will_see_an_error_message_in_pop_up_window_of_try_editor_page_of_implementation_using_collections_deque() {
	    
	}
	
	//#######################################################################################################
	
	@When("User clicks implementation Using Array")
	public void user_clicks_implementation_using_array() {
		queue.queueGetStartedBtn();
		queue.implementationUsingArrayLink();
	}

	@Then("User should navigate to implementation Using Array Page")
	public void user_should_navigate_to_implementation_using_array_page() {
	    
	}

	@When("User clicks on TryHere link of implementation Using Array")
	public void user_clicks_on_try_here_link_of_implementation_using_array() {
		queue.queueGetStartedBtn();
		queue.implementationUsingArrayLink();
		queue.ClickTryHereInQueue(); 
	}

	@Then("User should navigate to TryEditor page to write the python code of implementation Using Array")
	public void user_should_navigate_to_try_editor_page_to_write_the_python_code_of_implementation_using_array() {
	   
	}

	@When("user enters valid python code in TryEditorPage of implementation Using Array")
	public void user_enters_valid_python_code_in_try_editor_page_of_implementation_using_array() {
		queue.queueGetStartedBtn();
		queue.implementationUsingArrayLink();
		queue.ClickTryHereInQueue(); 
	    queue.TextEditorOperations();
		queue.ClickRunButton();
	}

	@Then("user is able to see the output in result section of TryEditor Page of implementation Using Array")
	public void user_is_able_to_see_the_output_in_result_section_of_try_editor_page_of_implementation_using_array() {
	    
	}

	@When("user enters invalid python code in TryEditorPage of implementation Using Array")
	public void user_enters_invalid_python_code_in_try_editor_page_of_implementation_using_array() {
		queue.queueGetStartedBtn();
		queue.implementationUsingArrayLink();
		queue.ClickTryHereInQueue(); 
	    queue.TextEditorInvalidOperations();
	    queue.ClickRunButton();
	   
	}

	@Then("user will see an error message in PopUp window of implementation Using Array")
	public void user_will_see_an_error_message_in_pop_up_window_of_implementation_using_array() {
	    
	}

//#########################################################################################################//
	@When("User clicks Queue Operations")
	public void user_clicks_queue_operations() {
		queue.queueGetStartedBtn();
		queue.queueOperationsLink();
	}

	@Then("User should navigate to Queue Operations")
	public void user_should_navigate_to_queue_operations() {
	    
	}

	@When("User clicks on TryHere link of Queue Operations")
	public void user_clicks_on_try_here_link_of_queue_operations() {
	  queue.queueGetStartedBtn();
	  queue.queueOperationsLink();
	  queue.ClickTryHereInQueue();
	}

	@Then("User should navigate to TryEditor page to write the python code of Queue Operations")
	public void user_should_navigate_to_try_editor_page_to_write_the_python_code_of_queue_operations() {
		
	}

	@When("user enters valid python code in TryEditorPage of Queue Operations")
	public void user_enters_valid_python_code_in_try_editor_page_of_queue_operations() {
		  queue.queueGetStartedBtn();
		  queue.queueOperationsLink();
		  queue.ClickTryHereInQueue();
		  queue.TextEditorOperations();
		  queue.ClickRunButton();
	}

	@Then("user is able to see the output in result section of TryEditor Page of Queue Operations")
	public void user_is_able_to_see_the_output_in_result_section_of_try_editor_page_of_queue_operations() {
	 // Assert.assertEquals(queue.getOutputResult(), queue.TextEditorOperations()); 
	}

	@When("user enters invalid python code in TryEditorPage of Queue Operations")
	public void user_enters_invalid_python_code_in_try_editor_page_of_queue_operations() {
		  queue.queueGetStartedBtn();
		  queue.queueOperationsLink();
		  queue.ClickTryHereInQueue();
		  queue.TextEditorInvalidOperations();
		  queue.ClickRunButton();
	}   

	@Then("user will see an error message in PopUp window of Queue Operations")
	public void user_will_see_an_error_message_in_pop_up_window_of_queue_operations() {
	 //  driver.switchTo().alert().accept();
	}
	@When("User clicks Queue Operations and User clicks Practice Questions")
	public void user_clicks_queue_operations_and_user_clicks_practice_questions() {
		queue.queueGetStartedBtn();
		queue.queueOperationsLink();
		queue.PracticeQuestionsLink();
	}

	@Then("User should navigate to Practice Questions page")
	public void user_should_navigate_to_practice_questions_page() {
	  // String pageTitle ="Practice Questions";
	   //Assert.assertEquals(driver.getTitle(), pageTitle);
	}


}
