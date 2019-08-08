package com.Seasame.base;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.WebElement.POM;


import io.github.bonigarcia.wdm.WebDriverManager;



public class Generic_methods {
	
	
	// login to app
	
	public void login_to_app(WebDriver driver) {
		POM.USERNAME(driver).sendKeys("test");
		
		POM.PASSWORD(driver).sendKeys("admin");
	}
	
	
	public void browser_launch(WebDriver driver) throws InterruptedException {	
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("http://devsesame.novatechset.com/Sesame2");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
        POM.USERNAME(driver).sendKeys("cup");
		
		POM.PASSWORD(driver).sendKeys("cup");
		
		POM.LOGIN_btn(driver).click();
		
		System.out.println("Application opned successfully");
		
		Thread.sleep(5000);
	}
	
	
	public void switchtab(WebDriver driver,int a){
		 
		  ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		 System.out.println(tabs.size());
		    driver.switchTo().window(tabs.get(a));
			  }
	
	
	
	public void users(WebDriver driver) throws InterruptedException{
		 Thread.sleep(2000);
	POM.OPEN(driver).click();
	Thread.sleep(3000);
		POM.USER_MANAGEMENT(driver).click();
		POM.USERS(driver).click();
		System.out.println("user opened successfully");
			  }
	
	
	public void browser_close(WebDriver driver) {	
		driver.quit();
		System.out.println("Application closed successfully");
	}
	
	
	public void explicitWait(WebDriver driver, WebElement ele) {	
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	
	public void selectbyindex(WebElement ele,int index) {	
		 
		Select sel = new Select(ele);
		sel.selectByIndex(index);
	}
	
	
	public void selectbyvalue(WebElement ele, String value) {	
		 
		Select sel = new Select(ele);
		sel.selectByValue(value);
	}
	
	
	public void selectbyvisibletext(WebElement ele,String text) {	
		 
		Select sel = new Select(ele);
		sel.selectByVisibleText(text);
	}
	

}
