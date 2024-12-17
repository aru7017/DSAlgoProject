package stepdefination;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import drivermanager.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ConfigReader;
import pages.LoginPage;
import pages.StackPage;

public class Stack_stepDef {
	
	private WebDriver driver;
	private LoginPage login = new LoginPage(DriverFactory.getDriver());
	private StackPage stack = new StackPage(driver);
	Properties prop;
	private ConfigReader configReader=new ConfigReader();
	
	//#####################################Background################################
	@Given("User navigates to login page from landing Page")
	public void user_navigates_to_login_page_from_landing_page() {
		 login.getStartedbn();
		 login.signIn();
	}

	@When("User enter username and password and clicks on login button")
	public void user_enter_username_and_password_and_clicks_on_login_button() throws IOException {
		configReader = new ConfigReader();
	    prop =configReader.initializeProp();

		String userName = prop.getProperty("username");
		   String PassWord = prop.getProperty("password");
		login.enterDataForLogin(userName, PassWord);
		stack=login.clickLoginBtn1();
	}

	@Then("User should navigate to  homepage")
	public void user_should_navigate_to_homepage() {
	    
	}

	@When("User clicks Get Started of Stack in Home Page.")
	public void user_clicks_get_started_of_stack_in_home_page() {
	    stack.stackgetStartedbtn();
	}

	@Then("User should navigate to Stack Page.")
	public void user_should_navigate_to_stack_page() {
	    
	}

	//######################## Operations in Stack Page #########################################
	@When("User clicks on Operations in Stack in Stack Page .")
	public void user_clicks_on_operations_in_stack_in_stack_page() {
		stack.stackgetStartedbtn();
		stack.ClickoperationsInstack();
	}

	@Then("User should navigate to Operations in Stack page")
	public void user_should_navigate_to_operations_in_stack_page() {
	   
	}

	@When("User clicks on TryHere link of Operations in Stack page .")
	public void user_clicks_on_try_here_link_of_operations_in_stack_page() {
		stack.stackgetStartedbtn();
		stack.ClickoperationsInstack();
		stack.ClickTryHereInstack();
	}

	@Then("User should navigate to TryEditor page from Operations in Stack Page")
	public void user_should_navigate_to_try_editor_page_from_operations_in_stack_page() {
	  
	}

	@Given("user is in stack page")
	public void user_is_in_stack_page() {
		
	}

	@When("user enters valid python code in TryEditorPage from Operations in Stack Page")
	public void user_enters_valid_python_code_in_try_editor_page_from_operations_in_stack_page() {
		stack.stackgetStartedbtn();
		stack.ClickoperationsInstack();
		stack.ClickTryHereInstack();
		stack.TextEditorOperations();
		stack.ClickRunButton();
	}

	@Then("user is able to see the output in result section of TryEditor Page for Operations in Stack Page")
	public void user_is_able_to_see_the_output_in_result_section_of_try_editor_page_for_operations_in_stack_page() {
	    
	}

	@When("user enters invalid python code in TryEditorPage for Operations in Stack Page")
	public void user_enters_invalid_python_code_in_try_editor_page_for_operations_in_stack_page() {
		stack.stackgetStartedbtn();
		stack.ClickoperationsInstack();
		stack.ClickTryHereInstack();
		stack.TextEditorInvalidOperations();
		stack.ClickRunButton();
	}

	@Then("user will see an error message in PopUp window of TryEditor Page for Operations in Stack Page")
	public void user_will_see_an_error_message_in_pop_up_window_of_try_editor_page_for_operations_in_stack_page() {
	    
	}
	
	//####################################### Implementation in Stack #################
	@When("User clicks on Implementation  in Stack Page .")
	public void user_clicks_on_implementation_in_stack_page() {
		stack.stackgetStartedbtn();
		stack.ClickImplementationInstack();
	}

	@Then("User should navigate to Implementation in Stack page")
	public void user_should_navigate_to_implementation_in_stack_page() {
	    
	}

	@When("User clicks on TryHere link of Implementation in Stack page .")
	public void user_clicks_on_try_here_link_of_implementation_in_stack_page() {
		stack.stackgetStartedbtn();
		stack.ClickImplementationInstack();
		stack.ClickTryHereInstack();
	}

	@Then("User should navigate to TryEditor page from Implementation in Stack Page")
	public void user_should_navigate_to_try_editor_page_from_implementation_in_stack_page() {
	   
	}

	@When("user enters valid python code in TryEditorPage from Implementation in Stack Page")
	public void user_enters_valid_python_code_in_try_editor_page_from_implementation_in_stack_page() {
		stack.stackgetStartedbtn();
		stack.ClickImplementationInstack();
		stack.ClickTryHereInstack();
		stack.TextEditorOperations();
		stack.ClickRunButton();
	}

	@Then("user is able to see the output in result section of TryEditor Page for Implementation in Stack Page")
	public void user_is_able_to_see_the_output_in_result_section_of_try_editor_page_for_implementation_in_stack_page() {
	    
	}

	@When("user enters invalid python code in TryEditorPage for Implementation in Stack Page")
	public void user_enters_invalid_python_code_in_try_editor_page_for_implementation_in_stack_page() {
		stack.stackgetStartedbtn();
		stack.ClickImplementationInstack();
		stack.ClickTryHereInstack();
		stack.TextEditorInvalidOperations();
		stack.ClickRunButton();
	}

	@Then("user will see an error message in PopUp window of TryEditor Page for Implementation in Stack Page")
	public void user_will_see_an_error_message_in_pop_up_window_of_try_editor_page_for_implementation_in_stack_page() {
	   
	}
//######################################## Applications in Stack ##################################

		@When("User clicks on Applications  in Stack Page .")
		public void user_clicks_on_applications_in_stack_page() {
		    stack.stackgetStartedbtn();
		    stack.ClickApplicationsInstack();
		}

		@Then("User should navigate to Applications in Stack page")
		public void user_should_navigate_to_applications_in_stack_page() {
		  
		}

		@When("User clicks on TryHere link of Applications in Stack page .")
		public void user_clicks_on_try_here_link_of_applications_in_stack_page() {
			 stack.stackgetStartedbtn();
			 stack.ClickApplicationsInstack();
			 stack.ClickTryHereInstack();
		}

		@Then("User should navigate to TryEditor page from Applications in Stack Page")
		public void user_should_navigate_to_try_editor_page_from_applications_in_stack_page() {
		    
		}

		@When("user enters valid python code in TryEditorPage from Applications in Stack Page")
		public void user_enters_valid_python_code_in_try_editor_page_from_applications_in_stack_page() {
			stack.stackgetStartedbtn();
			 stack.ClickApplicationsInstack();
			 stack.ClickTryHereInstack();
			 stack.TextEditorOperations();
			 stack.ClickRunButton();
		}

		@Then("user is able to see the output in result section of TryEditor Page for Applications in Stack Page")
		public void user_is_able_to_see_the_output_in_result_section_of_try_editor_page_for_applications_in_stack_page() {
		  
		}

		@When("user enters invalid python code in TryEditorPage for Applications in Stack Page")
		public void user_enters_invalid_python_code_in_try_editor_page_for_applications_in_stack_page() {
			stack.stackgetStartedbtn();
			 stack.ClickApplicationsInstack();
			 stack.ClickTryHereInstack();
			 stack.TextEditorInvalidOperations();
			 stack.ClickRunButton();
		}

		@Then("user will see an error message in PopUp window of TryEditor Page for Applications in Stack Page")
		public void user_will_see_an_error_message_in_pop_up_window_of_try_editor_page_for_applications_in_stack_page() {
		   
		}

//#################### Practice Questions ##############################
		@When("User clicks Operations in stack and  clicks on Practice Questions")
		public void user_clicks_operations_in_stack_and_clicks_on_practice_questions() {
			stack.stackgetStartedbtn();
			stack.ClickoperationsInstack();
			stack.PracticeQuestionsLink();
		}

		@Then("User should navigate to Practice Questions page of Stack")
		public void user_should_navigate_to_practice_questions_page_of_stack() {
		   
		}

}


