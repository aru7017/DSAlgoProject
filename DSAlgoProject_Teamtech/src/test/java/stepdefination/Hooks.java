package stepdefination;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import drivermanager.DriverFactory;
//import drivermanager.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.messages.types.Duration;
import utilities.ConfigReader;

public class Hooks {

	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;
	
	@Before(order = 0)
	public void setupbrowser() throws IOException {
		
		configReader = new ConfigReader();
	    prop =configReader.initializeProp();
		
		
	}
	
	@Before(order = 1)
	public void launchBrowser() {
   String browserName	= prop.getProperty("browser");
   String portalUrl = prop.getProperty("url");
  // String userName = prop.getProperty("username");
   //String PassWord = prop.getProperty("password");
   driverFactory = new DriverFactory();
   driver = driverFactory.initializeDriver(browserName);
   driver.get(portalUrl);
   //To load the page
  // DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com"); 
   DriverFactory.getDriver().manage().window().maximize();
	}
	
	@After(order = 0)
	public void quitBroweser() {
		if (driver != null) {
			
			//driver.quit();
		}
		
		}
		//System.out.println("Closing browser for -" + Thread.currentThread().theadID());
		@After(order = 1)
		public void tearDown(Scenario sc) {
			if(sc.isFailed()) {
				
				
			}
			
		

	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	

