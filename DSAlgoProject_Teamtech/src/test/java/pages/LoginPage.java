package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	
	

public	By userNM = By.xpath("//*[@id='id_username']");
public	By Pwd = By.xpath("//*[@id='id_password']");	
public	By Lgbutton = By.xpath("//*[@type='submit']");	
	
public LoginPage(WebDriver driver ) {
	this.driver = driver;
	}


public void enterUserName() {
	
	driver.findElement(userNM).sendKeys("techteam");
	
}

public void enterPassword() {
	
	driver.findElement(Pwd).sendKeys("Time4team$");
	
}

public void clickLgButton() {
	
	driver.findElement(Lgbutton).click();
	
}

public void emptyUserName() {
	
	driver.findElement(userNM);
	
}

public void emptyPassword() {
	
	driver.findElement(Pwd);
	
}

public void invalidUserName() {
	
	driver.findElement(Pwd).sendKeys("techteam123");;
	
}


public void invalidPassword() {
	
	driver.findElement(Pwd).sendKeys("Time4team$1234");;
	
}
















	
}
