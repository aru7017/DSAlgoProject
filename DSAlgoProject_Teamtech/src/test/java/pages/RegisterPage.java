package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	public WebDriver ldriver;
	
	
	public RegisterPage(WebDriver rdriver) {
		
		ldriver = rdriver	;
		 PageFactory.initElements(ldriver, this);
		 
		 }
	
	public	By userNM = By.xpath("//*[@id='id_username']");
	public	By Pwd = By.xpath("//*[@id=\"id_password1\"]");	
	public	By Pwdconfirm = By.xpath("//*[@id=\'id_password2\']");
	public	By Rigbutton = By.xpath("//*[@type='submit']");	
	
	
	
	
	public void clickOnUserName() {
		
		ldriver.findElement(userNM).sendKeys("techteam");
	}
	
	
public void clickOnpassword() {
		
		ldriver.findElement(Pwd).sendKeys("Time4team$");
	}
	
public void clickOnpasswordconfirmatin() {
	
	ldriver.findElement(Pwdconfirm).sendKeys("Time4team$");
}
	
public void clickOnRegisterbutton() {
	
	ldriver.findElement(Rigbutton).click();
}
	
public void userNamewithoutsendkeys() {
	
	ldriver.findElement(userNM);
}


public void passwordwithoutsendkeys() {
	
	ldriver.findElement(Pwd);
}

public void passwordconfirmatinwithoutsendkeys() {

ldriver.findElement(Pwdconfirm);
}


	
	
	
	
	
	
		
	}
	
	
	
	
	
	
	
	
	
	
	

