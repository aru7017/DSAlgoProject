package stepdefination;


import java.util.Properties;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.IOException;
import drivermanager.DriverFactory;
//import drivermanager.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.messages.types.Duration;
import utilities.ConfigReader;

public class Hooks {

	private WebDriver driver;
	public Properties configProp;
	private DriverFactory driverFactory = new DriverFactory();
	private static final Lock lock = new ReentrantLock();
	
	@Before(order = 0)  
	public void setUp() throws IOException {
		// to ensure that WebDriver initialization is thread-safe.
		lock.lock();

		configProp = ConfigReader.initializeProp();
		driver = driverFactory.getDriver();  
		lock.unlock();
		driver.manage().window().maximize();
		driver.get(configProp.getProperty("url"));
		System.out.println("URL :>>>"+configProp.getProperty("url"));
		driver.findElement(By.xpath("//button[text()='Get Started']")).click();
	//	driver.get(configProp.getProperty("username"));
	//	driver.get(configProp.getProperty("password"));
	}

//	@After(order = 1)
//	public void takeScreenshotOnFailure(Scenario scenario) {

	//	if (scenario.isFailed()) {

		//	TakesScreenshot ts = (TakesScreenshot) driver;

	//		byte[] src = ts.getScreenshotAs(OutputType.BYTES);
		//	scenario.attach(src, "image/png", "screenshot");
	//	}

//	}

	@After(order = 0)
	public void tearDown() {
		if (driver != null) {
			driverFactory.removeDriver();
			//driver.quit();
		}
		

	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	

