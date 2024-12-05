package drivermanager;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DriverFactory {
	public WebDriver driver;
	
	
	
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	
	
	 public WebDriver initializeDriver(String browser) {
		
		 System.out.println("browser value is " + browser );
		 
		 if(browser.equals("chrome")) {
			 
			WebDriverManager.chromedriver().setup();
			tlDriver.set( new ChromeDriver());
		 }else if (browser.equals("firefox")) {
			 WebDriverManager.firefoxdriver().setup();
				tlDriver.set( new FirefoxDriver());
			 
		 }else if (browser.equals("edge")) {
			 WebDriverManager.edgedriver().setup();
				tlDriver.set( new EdgeDriver());
		  } else {
			  System.out.println("pls pass the correct browser value " + browser);
		  }
		 return getDriver();
		 
	 }
	 
	 public static synchronized WebDriver getDriver() {
		 return tlDriver.get();
		 
	 }
	 
		
		}
		
		
	
	
	
	
	
	
			
	

