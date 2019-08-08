package com.Seasame.base;

import org.testng.annotations.Parameters;

public class BrowserName {
	

   @Parameters({ "browser" })
   public static String brows(String browser) {
		
	return browser;
     }  

}
