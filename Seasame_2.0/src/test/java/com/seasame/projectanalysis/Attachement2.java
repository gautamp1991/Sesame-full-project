package com.seasame.projectanalysis;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.Seasame.base.Excel_data_print;
import com.Seasame.base.Generic_methods;
import com.Seasame.base.MyScreenRecorder;
import com.Seasame.base.URL_Launch;
import com.Seasame.base.Video_Record;
import com.WebElement.POM;

public class Attachement2 extends URL_Launch{

	String Result;
	String remark;
	String className;
	String category;
	String area;
	String description;
	
	@Test
	
	public void login() throws Exception {
	 
		Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
		String browserName = cap.getBrowserName().toLowerCase();
		System.out.println(browserName);
		
		
		 
        // declaring details
		    description = "Attachement - click on close button & check attachement section is closed or not";
	        className = "Attachement2";
	        category = "Project Analysis";
	        area = "Poject Manager";
	        
	       
	    	Excel_data_print Ex = new Excel_data_print();
	    	 Generic_methods GM = new Generic_methods();
	    	 WebDriverWait wait = new WebDriverWait(driver, 10);
			 Actions act = new Actions(driver);
			
			 
			
		try {
			 //for video recording
			MyScreenRecorder.startRecording(browserName, className);
			
			System.out.println(driver.getTitle());
				
            POM.OPEN(driver).click();
			
			wait.until(ExpectedConditions.visibilityOf(POM.PROJECT_ANALYSIS(driver)));
			
			
			POM.PROJECT_ANALYSIS(driver).click();
			
			wait.until(ExpectedConditions.visibilityOf(POM.Book1(driver)));
			
			act.moveToElement(POM.Book1(driver)).click(POM.Book1(driver)).build().perform();
			
			
			
			wait.until(ExpectedConditions.visibilityOf(POM.Project_Manager(driver)));
			
			act.moveToElement(POM.Project_Manager(driver)).click(POM.Project_Manager(driver)).build().perform();
			
			
			
			/// clicking on update
			Thread.sleep(3000);
			act.moveToElement(POM.Attachements_PA(driver)).click(POM.Attachements_PA(driver)).build().perform();
			
			
			boolean closebtn_present = POM.Close_btn(driver).isEnabled();
			System.out.println("Presence of close button is:" + closebtn_present);
		
			System.out.println(driver.getTitle());
			
			   //clicking on close btn
			POM.Close_btn(driver).click();
			 
			// after clicking close button will not present
			
		
		
		
			String A = driver.getTitle();
			System.out.println(A);
			   
			// Valiadtion
			
	   if(A.contains("Project Analysis - Sesame")) {
		   Result = "Pass";
		   Video_Record.pass_script_video_record();
	   }else {
		   Result = "Fail";
		   remark = "file not attached properly";
		   Video_Record.fail_script_video_record();
	   }
		
	  // driver.
	   
	   
    
		}catch (Exception x) {
			 System.out.println("exception occurs" + x.getMessage());
			 
			 Result = "Fail";
			  Video_Record.fail_script_video_record();
				
				if(x.getMessage().contains("no such element")){
					remark = "webelement changed";
				}
				else{
					remark = "Unhandled Exception";
				}
				
		  } finally {
				System.out.println(description);
		     	System.out.println(className);
		     	System.out.println(remark);
		     	System.out.println(area);
		     	System.out.println(Result);
		     	
		     	
		     	  Ex.testdata(description, className, remark, category, area, Result, browserName);
		     		  
		     		 System.out.println("excel write successfully");
		     		 
		   GM.browser_close(driver);
		           
	}}

	
	
}

