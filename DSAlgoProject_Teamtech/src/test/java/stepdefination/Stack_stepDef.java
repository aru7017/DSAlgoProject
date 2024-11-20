package stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import pages.StackPage;

public class Stack_stepDef {
	   public WebDriver driver;
	   public StackPage sp;
	   StackPage page = new StackPage(driver);
	@Given("User is in Stack Page")
	public void user_is_in_stack_page1() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    driver.get("https://dsportalapp.herokuapp.com/home"); 
	    page.ClickGetStaretd();
	    Thread.sleep(1000);
	}

	@When("User clicks in Operations in Stack Page")
	public void user_clicks_in_operations_in_stack_page1() {
	    page.ClickoperationsInstack();
	   
	}

	@Then("User should be navigated to Operations in Stack page with title {string}")
	public void user_should_be_navigated_to_operations_in_stack_page_with_title1(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	

@Given("User is in Stack Page")
public void user_is_in_stack_page() {
    // Write code here that turns the phrase above into concrete actions
    
}

@When("User clicks in Operations in Stack Page")
public void user_clicks_in_operations_in_stack_page() {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("User should be navigated to Operations in Stack page with title {string}")
public void user_should_be_navigated_to_operations_in_stack_page_with_title(String string) {
    // Write code here that turns the phrase above into concrete actions
   
}

}
