package com.Seasame.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import com.Seasame.base.BrowserName;
import com.WebElement.POM;

import io.github.bonigarcia.wdm.WebDriverManager;

public class URL_Launch {

	
	public WebDriver driver;
	

	@Parameters({ "browser" })	 
	
	@BeforeMethod
	
	public void browser_launch(String browser) throws InterruptedException {
		
		String browser_name = BrowserName.brows(browser);
		
		
		if(browser_name.equalsIgnoreCase("chrome")) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
		}
		else if(browser_name.equalsIgnoreCase("firefox")) {
	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();
		}
		else if(browser_name.equalsIgnoreCase("internet explorer")) {
			WebDriverManager.iedriver().setup();
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		
			capabilities.setCapability("requireWindowFocus", true);
		 driver = new InternetExplorerDriver(capabilities);
			
		}
		
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://devsesame.novatechset.com/WMS/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
        POM.USERNAME(driver).sendKeys("Gautam");
		
		POM.PASSWORD(driver).sendKeys("7053356735");
		
		POM.LOGIN_btn(driver).click();
		
		System.out.println("Application opned successfully");
		
		
	
		}
}
