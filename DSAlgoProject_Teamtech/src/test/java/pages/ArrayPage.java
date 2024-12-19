package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ArrayPage {
	
	public WebDriver driver;
	public ArrayPage(WebDriver driver ) {
		this.driver = driver;
		}

	public	By arrayGetStartedBtn = By.xpath("//a[@href='array']");
	public By arraysInPython = By.xpath("//a[@href=\"arrays-in-python\"]");
	public	By tryHere = By.linkText("Try here>>>");
	public	By texteditor = By.xpath("//div[contains(@class,'CodeMirror')]/div/textarea");
	public By runbutton = By.xpath("//button[text()='Run']");
	public By output = By.id("output");
	public By arraysUsingList = By.xpath("//a[@href=\"arrays-using-list\"]");
	public By basicOperationsInLists = By.xpath("//a[@href=\"basic-operations-in-lists\"]");
	public By applicationsOfArray = By.xpath("//a[@href=\"applications-of-array\"]");
	public By practiceQuestions=By.xpath("//a[@href=\"/array/practice\"]");
	public By searchthearray=By.xpath("//a[@href=\"/question/1\"]");
	public By maxConsecutiveOnes=By.xpath("//a[@href=\"/question/2\"]");
	public By findNumbersWithEven=By.xpath("//a[@href=\"/question/3\"]");
	public By squaresOfaSortedArray=By.xpath("//a[@href=\"/question/4\"]");
	
	public void arrayGetStartedBtnClick() {
		driver.findElement(arrayGetStartedBtn).click();
	}
	
	public void arraysUsingListClick () {
		driver.findElement(arraysUsingList).click();
	}
	
	public void basicOperationsInListsClick () {
		driver.findElement(basicOperationsInLists).click();
	}
	public void applicationsOfArrayClick () {
		driver.findElement(applicationsOfArray).click();
	}
	
	public void arraysInPythonClick () {
		driver.findElement(arraysInPython).click();
	}
	
	public void clickTryHereInArray () {
		driver.findElement(tryHere).click();
	}
	public void textEditorOperations () {
		driver.findElement(texteditor).sendKeys("print(\"Hello World\")");
	}
	
	public void clickRunButton () {
		driver.findElement(runbutton).click();
	}
	
	public void textEditorInvalidOperations () {
		driver.findElement(texteditor).sendKeys("Hello");
	}
	
	public void practiceQuestionsLink() {
			
			driver.findElement(practiceQuestions).click();
			
	}
	
   public void searchthearrayLink() {
		
		driver.findElement(searchthearray).click();
		
	}
   
   public void maxConsecutiveOnesLink() {
		
		driver.findElement(maxConsecutiveOnes).click();
		
	}
   public void findNumbersWithEvenLink() {
		
		driver.findElement(findNumbersWithEven).click();
		
	}
   public void squaresOfaSortedArrayLink() {
		
		driver.findElement(squaresOfaSortedArray).click();
		
	}

}
