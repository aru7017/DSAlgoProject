package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_stepDef {
WebDriver driver;
	
	@Given("^User is on the Login Page$")
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
		
	}
	
}
