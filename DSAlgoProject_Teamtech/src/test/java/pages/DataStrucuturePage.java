package pages;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DataStrucuturePage {

	public WebDriver driver;
	
	public	By getStartedBtn = By.xpath("//a[@href='data-structures-introduction']");
	public	By timeComplexity = By.xpath("//a[@href='time-complexity']");
	public	By tryHere = By.xpath("//a[@href='/tryEditor']");
	public	By testeditor1 = By.xpath("//div[contains(@class,'CodeMirror')]/div/textarea");
	public	By testeditor2 = By.xpath("//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div/div/div/div[5]/div[2]/pre");
	public DataStrucuturePage(WebDriver driver ) {
		this.driver = driver;
		}
	
	
	public void getStartedbtn() {
		System.out.println("CurrentURl"+driver.getCurrentUrl());
		driver.findElement(getStartedBtn).click();
		
	}
	
	public void timeComplexity() {
		
		driver.findElement(timeComplexity).click();
		
	}
	
	public void tryHereBtn() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN);
		driver.findElement(tryHere).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
	}
	
	public void testEditor(String validpython ,String invalidpython) {
		
/*Actions action = new Actions(driver);
		 action.sendKeys(driver.findElement(testeditor),Keys.ENTER)
		 .build()
		 .perform();
		 action.sendKeys("print('Hello, world!') ");
	
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
		 * 
		 * 
		 * 
	}*/
		driver.findElement(testeditor1).sendKeys(validpython);
		driver.findElement(testeditor2).sendKeys(validpython);
	}
}
