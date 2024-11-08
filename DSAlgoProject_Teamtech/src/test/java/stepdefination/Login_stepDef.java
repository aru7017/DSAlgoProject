package stepdefination;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class Login_stepDef {
public WebDriver driver ;

LoginPage page = new LoginPage();
/*	@Given("^User is on the Login Page$")
    public void user_is_on_the_login_page() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://dsportalapp.herokuapp.com/login");
		//driver.manage().window().minimize();
		driver.findElement(By.xpath("//*[@id='id_username']")).sendKeys("techteam");
		driver.findElement(By.xpath("//*[@id='id_password']")).sendKeys("Time4team$");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}
	@Given("^User enters username and password$")
    public void user_enters_username_and_password() {
	//	driver.findElement(By.xpath("//*[@id='id_username']")).sendKeys("techteam");
		//driver.findElement(By.xpath("//*[@id='id_password']")).sendKeys("Time4team$");
	}
	@Given("^User clicks on login button$")
    public void user_clicks_on_login_button() {
	//	driver.findElement(By.xpath("//*[@type='submit']")).click();
		
	}*/
/*@Given("user is on the browser")
public void user_is_on_the_browser() {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
driver.get("https://dsportalapp.herokuapp.com/login");

}

@And("user is on the login page")
public void user_is_on_the_login_page() {
   
}

@When("^user enters (.*) and (.*)$")
public void user_enters_username_and_password(String username,String password) {
driver.findElement(By.xpath("//*[@id='id_username']")).sendKeys(username);
driver.findElement(By.xpath("//*[@id='id_password']")).sendKeys(password);
}
@And("user is able to click on login button")
public void user_is_able_to_click_on_login_button() {
driver.findElement(By.xpath("//*[@type='submit']")).click();
	
	
}

@Then("user navigate to home page")
public void user_navigate_to_home_page() {
   
}*/
@Given("user is on the browser")
public void user_is_on_the_browser() {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
driver.get("https://dsportalapp.herokuapp.com/login"); 
driver.close();
}

@And("user is on the login page")
public void user_is_on_the_login_page() {
   
}

@When("^user enters \"(.*)\" and \"(.*)\"$")
public void user_enters_and(String username, String password) {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
driver.get("https://dsportalapp.herokuapp.com/login"); 
	driver.findElement(page.userNM).sendKeys(username);
	driver.findElement(page.Pwd).sendKeys(password); 
	driver.findElement(page.Lgbutton).click();
	driver.close();
}

@And("user is able to click on login button")
public void user_is_able_to_click_on_login_button() {
	//driver.findElement(By.xpath("//*[@type='submit']")).click();
}

@Then("user navigate to home page")
public void user_navigate_to_home_page() {
   
}


	
}
