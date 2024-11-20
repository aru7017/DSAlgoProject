package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StackPage {
	private WebDriver driver;
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
