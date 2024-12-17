package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QueuePage {
	public WebDriver driver;
	public QueuePage(WebDriver driver ) {
		this.driver = driver;
		}
	
	
	public	By queueGetStartedBtn = By.xpath("//a[@href='queue']");
	public By implementationOfQueue =By.xpath("//a[@href='implementation-lists']");
	public	By tryHere = By.linkText("Try here>>>");
	public	By texteditor = By.xpath("//div[contains(@class,'CodeMirror')]/div/textarea");
	public By runbutton = By.xpath("//button[text()='Run']");
	public By output = By.id("output");
	public By implementationUsingCollectionDequeue=By.xpath("(//a[@class='list-group-item'])[2]");
	public By implementationUsingArray=By.xpath("(//a[@class='list-group-item'])[3]");
	public By queueOperations=By.xpath("(//a[@class='list-group-item'])[4]");
	public By practiceQuestions=By.xpath("//a[@href=\"/queue/practice\"]");
	
	public void queueGetStartedBtn() {
		
		driver.findElement(queueGetStartedBtn).click();
		
	}
	
	public void getOutputResult() {
		
		driver.findElement(output).getText();
		
	}
    public void implementationUsingArrayLink() {
		
		driver.findElement(implementationUsingArray).click();
		
	}
    
    public void queueOperationsLink() {
		
  		driver.findElement(queueOperations).click();
  		
  	}
    
 public void implementationOfQueueLink() {
		
		driver.findElement(implementationOfQueue).click();
		
	}

    
    public void implementationUsingCollectionDequeue() {
    	driver.findElement(implementationUsingCollectionDequeue).click();
    }
    
	public void ClickTryHereInQueue () {
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
