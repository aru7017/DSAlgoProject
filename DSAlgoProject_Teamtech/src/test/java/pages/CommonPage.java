package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonPage {
	
public	By getStartedBn = By.xpath("//*//*[@class='btn']");
public WebDriver driver;
	
public CommonPage(WebDriver driver ) {
	this.driver = driver;
	}

	
	
	public void getStartedbn() {
		
		driver.findElement(getStartedBn).click();
		
	}
}
