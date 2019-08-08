package com.Seasame.base;

	import java.util.ArrayList;
	import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;

	
    public class TestNGXmlTesting {
	 
		@Test
	public static void main() {
	 
 
	try {
		TestNG runner=new TestNG();
		 
	List<String> suitefiles=new ArrayList<String>();
	
	
	// Chrome
	suitefiles.add("C:\\Users\\srnp755\\eclipse-workspace\\Seasame\\Chrome.xml");
	
	// Firefox
	suitefiles.add("C:\\Users\\srnp755\\eclipse-workspace\\Seasame\\Firefox.xml");
	
	
	
	 
		             /**now set xml file for execution**/
		              runner.setTestSuites(suitefiles);
		 
		/** finally execute the runner using run method**/
		runner.run();
	} catch (Exception e) {
		
		e.printStackTrace();
	             }
	       }
	 
	}

