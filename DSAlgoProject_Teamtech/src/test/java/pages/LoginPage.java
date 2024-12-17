package pages;


import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.exc.InvalidFormatException;
import utilities.ExcelReader;

public class LoginPage {
	
	public WebDriver driver;
	
	
	

	public	By userNM = By.id("id_username");
	public	By Pwd = By.id("id_password");	
	public	By loginBN = By.xpath("//*[@type='submit']");
	public	By getStartedBn = By.xpath("//*//*[@class='btn']");
	public	By signInLink = By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]");
	
public LoginPage(WebDriver driver ) {
	this.driver = driver;
	}


public void enterDataForLogin(String username, String password) {
	driver.findElement(userNM).sendKeys(username);
	driver.findElement(Pwd).sendKeys(password);
	
}

public DataStrucuturePage clickLoginBtn() {
	driver.findElement(loginBN).click();
	return new DataStrucuturePage(driver);
}

public StackPage clickLoginBtn1() {
	driver.findElement(loginBN).click();
	return new StackPage(driver);
}

public QueuePage clickLoginBtn2() {
	driver.findElement(loginBN).click();
	return new QueuePage(driver);
}


public void getStartedbn() {
	
	driver.findElement(getStartedBn).click();
	
}

public void signIn() {
	
	driver.findElement(signInLink).click();
	
}





















	
}
