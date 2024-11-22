package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver ldriver;
	
	
	public LoginPage(WebDriver rdriver ) {
		
		ldriver = rdriver	;
		 PageFactory.initElements(ldriver, this);
		
	}

public	By userNM = By.xpath("//*[@id='id_username']");
public	By Pwd = By.xpath("//*[@id='id_password']");	
public	By Lgbutton = By.xpath("//*[@type='submit']");	
	
	


public void enterUserName() {
	
	ldriver.findElement(userNM).sendKeys("techteam");
	ldriver.findElement(userNM).click();
}

public void enterPassword() {
	
	ldriver.findElement(Pwd).sendKeys("Time4team$");
	
}

public void clickLgButton() {
	
	ldriver.findElement(Lgbutton).click();
	
}

public void emptyUserName() {
	
	ldriver.findElement(userNM);
	
}

public void emptyPassword() {
	
	ldriver.findElement(Pwd);
	
}

public void invalidUserName() {
	
	ldriver.findElement(Pwd).sendKeys("techteam123");;
	
}


public void invalidPassword() {
	
	ldriver.findElement(Pwd).sendKeys("Time4team$1234");;
	
}
















	
}
