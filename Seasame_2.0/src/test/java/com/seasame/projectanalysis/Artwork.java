package com.seasame.projectanalysis;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import com.Seasame.base.Excel_data_print;
import com.Seasame.base.Generic_methods;
import com.Seasame.base.MyScreenRecorder;
import com.Seasame.base.URL_Launch;
import com.Seasame.base.Video_Record;
import com.WebElement.POM;

public class Artwork extends URL_Launch{

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
		    description = "Validate that Artwork  dropdown is working fine & Selecting exact text or not.";
	        className = "Artwork ";
	        category = "Project Analysis";
	        area = "Artwork";
	        
	       
	    	Excel_data_print Ex = new Excel_data_print();
	    	 Generic_methods GM = new Generic_methods();
	    	
			 Actions act = new Actions(driver);
			
			 
			
		try {
			 //for video recording
			MyScreenRecorder.startRecording(browserName, className);
			
			System.out.println(driver.getTitle());
				
            POM.OPEN(driver).click();
			
            GM.explicitWait(driver, POM.PROJECT_ANALYSIS(driver));
			
			
			POM.PROJECT_ANALYSIS(driver).click();
			
		
			
			GM.explicitWait(driver, POM.Book1(driver));
			act.moveToElement(POM.Book1(driver)).click(POM.Book1(driver)).build().perform();
			
			
			GM.explicitWait(driver, POM.Artwork(driver));
			
			act.moveToElement(POM.Artwork(driver)).click(POM.Artwork(driver)).build().perform();
		
			
			GM.explicitWait(driver, POM.Artwork_PA(driver));
			
			act.moveToElement(POM.Artwork_PA(driver)).click(POM.Artwork_PA(driver)).build().perform();
		
		
			GM.explicitWait(driver, POM.Word_Input_Type(driver));
			
			POM.Word_Input_Type(driver).click();
		
			Thread.sleep(1000);
			String selected_text = POM.Artwork_PA(driver).getText();
			System.out.println("Selected text:"+ selected_text);
		
		
	   
			// Valiadtion
			
	   if(selected_text.equals("Redraw")) {
		   Result = "Pass";
		   Video_Record.pass_script_video_record();
	   }else {
		   Result = "Fail";
		   remark = "text not selected properly";
		   Video_Record.fail_script_video_record();
	   }
		
	   
    
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


