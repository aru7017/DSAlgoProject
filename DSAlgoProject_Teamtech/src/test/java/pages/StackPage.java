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
	
	
	public void stackgetStartedbtn() {
		System.out.println("CurrentURl"+driver.getCurrentUrl());
		driver.findElement(stackGetStartedBtn).click();
		
	}
	
	public void ClickoperationsInstack () {
		driver.findElement(operationsInstack).click();
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
}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	private WebDriver driver;
	public StackPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//a[@href='stack']")
	private WebElement stackGetstarted;
	
	@FindBy (xpath="//a[text()=\"Try here>>>\"]")
	private WebElement Tryhere;
	
	@FindBy (xpath="//a[text()='Operations in Stack']")
	private WebElement operationsInstack;
	
	@FindBy (xpath="//div[contains(@class,'CodeMirror')]/div/textarea")
	private WebElement editor;
	
	
	@FindBy (xpath="//button[text()='Run']")
	private WebElement runButton;
	
	@FindBy (id="output")
	private WebElement codeOutput;
	
	//To click getStaretd for Stack
	public void ClickGetStaretd () {
		stackGetstarted.click();
	}
	
	//To click operations in stack
	public void ClickoperationsInstack () {
		operationsInstack.click();
	}
		//To click TryHere button
	public void ClickTryhere() {
		Tryhere.click();
	}
	
	//To write the PythonCode
	public void enterPythonCode(String pythonCode) {
		editor.sendKeys(pythonCode);
	}
		//To click run button in the tryEditor page
		public void clickRunButton () {
			runButton.click();
		}
		
		//To get the output of the python code in tryEditor page
		public String getCodeOutput() {
			  return codeOutput.getText(); 
		  }

}
*/
