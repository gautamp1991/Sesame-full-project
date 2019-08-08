package com.EG2.mainscript;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import com.editgenie.testcases.Exceldata3;
import com.editgenie.testcases.Linkopen8;
import com.editgenie.testcases.POM;
import com.editgenie.testcases.Save_button;
import com.editgenie.testcases.takeScreenshot;

public class Attachement extends Linkopen8{

	String Result;
	String remark;
	String className;
	String category;
	String area;
	String description;

	@Test
	public void copyright() throws InterruptedException, IOException {
		Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
        String browserName = cap.getBrowserName().toLowerCase();
        System.out.println(browserName);
        Exceldata3 Ex =  new Exceldata3();
        
        // declaring details
		 description = "Attach a file in the menu bar & validate it";
	        className = "Attachement";
	        category = "Menu_Bar";
	        area = "Attach_File";
	     
	    	Actions act = new Actions(driver);
	       	Save_button Save = new Save_button();
		try{
			
		boolean Attachment_Present = POM.Attachment(driver).isEnabled();
		System.out.println(Attachment_Present);
		
		
		POM.Attachment(driver).click();
		System.out.println("attachement clicked successfully");
		
		driver.switchTo().frame("attachment_iframe");
		act.moveToElement(POM.Browse_file_Attachment(driver)).click(POM.Browse_file_Attachment(driver)).build().perform();
		
		
		
		// uploading file using Robot class
		   Thread.sleep(2000);
		  
		   StringSelection ss = new StringSelection("E:\\Attachfile.png");
		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		   
		 //native key strokes for CTRL, V and ENTER keys
		   Robot robot = new Robot();

		   robot.keyPress(KeyEvent.VK_CONTROL);
		   robot.keyPress(KeyEvent.VK_V);
		   robot.keyRelease(KeyEvent.VK_V);
		   robot.keyRelease(KeyEvent.VK_CONTROL);
		   robot.keyPress(KeyEvent.VK_ENTER);
		   robot.keyRelease(KeyEvent.VK_ENTER);

		   Thread.sleep(1000);
		   POM.Save_Attachment(driver).click();
		   
		   driver.switchTo().defaultContent();
		   Thread.sleep(5000);
		   act.moveToElement( POM.close_Attachment(driver)).doubleClick(POM.close_Attachment(driver)).build().perform();
		   Thread.sleep(2000);
	     POM.Save_Author(driver).click();
	     
	   
	     driver.navigate().refresh();
	     Thread.sleep(4000);
	     
	     String Attached_file_count = POM.Attached_file_count(driver).getText();
	  System.out.println( Attached_file_count);
	  
	  
	    // validation
	     if(Attached_file_count.contains("1")){
	    	 Result = "Pass";
	     } else {
	    	 Result = "Fail";
	    	  remark = "comment not added";
			
	    	  takeScreenshot scrshot = new takeScreenshot();
		     	scrshot.Screenshot(className, driver,browserName);
		     	
		 		System.out.println("screenshot taken succesfully");
	     }
		

	} catch(Exception x) {
		   System.out.println("exception occurs" + x.getMessage());
		 
		
		   Result = "Fail";
			
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
       	System.out.println(browserName);
       	
       	  Ex.testdata(description, className, remark, category, area, Result, browserName);
       		  
       		 System.out.println("excel write successfully");
       		 
                System.out.println("Application closed successfully");
        
        Save.browser_close(driver);
	       
		    
			}}}
			


