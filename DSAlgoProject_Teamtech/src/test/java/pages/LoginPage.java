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
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(driver, this);
	}
	

public void enterDataForLogin(String username, String password) {
	driver.findElement(userNM).sendKeys(username);
	driver.findElement(Pwd).sendKeys(password);
	
}



public void clickLoginBtn() {
	driver.findElement(loginBN).click();
	
}

public DataStrucuturePage signIn() {
	driver.findElement(signInLink).click();
	return new DataStrucuturePage(driver);
}



public void getStartedbn() {
	
	driver.findElement(getStartedBn).click();
	
}





public void enterExcelDataForLogin(String sheetname, Integer rownumber) throws InvalidFormatException, IOException, OpenXML4JException {

	ExcelReader reader = new ExcelReader();

	List<Map<String, String>> testdata = reader.getData("src\\test\\resources\\ExcelTestData\\LoginData.xlsx", sheetname);


	String username = testdata.get(rownumber).get("username");
	String password = testdata.get(rownumber).get("password");
	enterDataForLogin(username, password);



}















	
}
