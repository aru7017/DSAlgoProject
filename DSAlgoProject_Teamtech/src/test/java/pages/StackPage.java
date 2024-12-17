package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StackPage {
	
	public WebDriver driver;
	public StackPage(WebDriver driver ) {
		this.driver = driver;
		}
	
	
	public	By stackGetStartedBtn = By.xpath("//a[@href='stack']");
	public By operationsInstack = By.xpath("//a[text()='Operations in Stack']");
	public	By tryHere = By.linkText("Try here>>>");
	public	By texteditor = By.xpath("//div[contains(@class,'CodeMirror')]/div/textarea");
	public By runbutton = By.xpath("//button[text()='Run']");
	public By output = By.id("output");
	public By implementationInStack = By.xpath("//a[@href=\"implementation\"]");
	public By applicationsInStack = By.xpath("//a[@href=\"stack-applications\"]");
	public By practiceQuestions=By.xpath("//a[@href=\"/stack/practice\"]");
	
	public void stackgetStartedbtn() {
		System.out.println("CurrentURl"+driver.getCurrentUrl());
		driver.findElement(stackGetStartedBtn).click();
		
	}
	
	public void ClickoperationsInstack () {
		driver.findElement(operationsInstack).click();
	}
	
	public void ClickImplementationInstack () {
		driver.findElement(implementationInStack).click();
	}
	
	public void ClickApplicationsInstack () {
		driver.findElement(applicationsInStack).click();
	}
	
	public void ClickTryHereInstack () {
		driver.findElement(tryHere).click();
	}
	public void TextEditorOperations () {
		driver.findElement(texteditor).sendKeys("print(\"Hello World\")");
	}
	
	public void ClickRunButton () {
		driver.findElement(runbutton).click();
	}
	
	public void TextEditorInvalidOperations () {
		driver.findElement(texteditor).sendKeys("Hello");
	}
	
   public void PracticeQuestionsLink() {
		
		driver.findElement(practiceQuestions).click();
		
	}
}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
