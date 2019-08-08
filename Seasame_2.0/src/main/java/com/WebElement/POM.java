package com.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POM {
	
	private static WebElement element = null;
	
	
	// Login Details
	
public static WebElement USERNAME(WebDriver driver) {
		
		element = driver.findElement(By.name("LoginID"));
		return element;
	}


public static WebElement PASSWORD(WebDriver driver) {
	
	element = driver.findElement(By.name("Password"));
	return element;
}

public static WebElement LOGIN_btn(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//button[@type='submit']"));
	return element;
}
	
	//CUP DASHBOARD WebElement list...
	
	
	//In_Production
	
	public static WebElement In_Production(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//div[@class='row divCenter']/div[1]"));
		return element;
	}
	
	
public static WebElement In_Production_Details(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@class='small-box-footer'][@href='javascript:Production();']"));
		return element;
	}
	
	
	
//Proof_sent_to_Author
public static WebElement Proof_sent_to_Author(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//div[@class='row divCenter']/div[2]"));
		return element;
	}
	

public static WebElement Proof_sent_to_Author_Details(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//*[@class='small-box-footer'][@href='javascript:ToAuthor()']"));
	return element;
}
	



//Corrections_Received
	
public static WebElement Corrections_Received(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//div[@class='row divCenter']/div[3]"));
	return element;
}


public static WebElement Corrections_Received_Details(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//*[@class='small-box-footer'][@href='javascript:Received()']"));
	return element;
}


	// Further_Corrections
public static WebElement Further_Corrections(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//div[@class='row divCenter']/div[4]"));
	return element;
}

public static WebElement Further_Corrections_Details(WebDriver driver) {
element = driver.findElement(By.xpath("//*[@class='small-box-footer'][@href='javascript:FcReceived()']"));
return element;
}
	
	

//Awaiting_PM_approvals
public static WebElement Awaiting_PM_approvals(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//div[@class='row divCenter']/div[5]"));
	return element;
}
		
	
public static WebElement Awaiting_PM_approvals_Details(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//*[@class='small-box-footer'][@href='javascript:Approval()']"));
	return element;
}


// Awaiting_PE_approvals
public static WebElement Awaiting_PE_approvals(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//div[@class='row divCenter']/div[6]"));
	return element;
}


public static WebElement Awaiting_PE_approvals_Details(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//*[@class='small-box-footer'][@href='javascript:PEApproval()']"));
	return element;
}


//Ready_to_Publish


public static WebElement Ready_to_Publish(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//div[@class='row divCenter']/div[7]"));
	return element;
}

public static WebElement Ready_to_Publish_Details(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//*[@class='small-box-footer'][@href='javascript:ReadytoPubl()']"));
	return element;
}


// Overall

public static WebElement Overall(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//div[@class='row divCenter']/div[8]"));
	return element;
}

	
public static WebElement Overall_Details(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//*[@class='small-box-footer'][@href='javascript:OverAll()']"));
	return element;
}
	
	//Show Dropdown

public static WebElement Show_Dropdown(WebDriver driver) {
	
	element = driver.findElement(By.name("example_length"));
	return element;
}
	
public static WebElement Example_table_row(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//table[@id='example']/tbody/tr[1]/td[2]"));
	return element;
}




// Article Details


//Article_Number

public static WebElement Article_Number(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//table[@class='tblMain']/tbody/tr[1]/td[1]"));
	return element;
}

public static WebElement Article_Number_value(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//table[@class='tblMain']/tbody/tr[1]/td[2]"));
	return element;
}



//Article Title

public static WebElement Article_Title(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//table[@class='tblMain']/tbody/tr[2]/td[1]"));
	return element;
}

public static WebElement Article_Title_value(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//table[@class='tblMain']/tbody/tr[2]/td[2]"));
	return element;
}



//Article Type

public static WebElement Article_Type(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//table[@class='tblMain']/tbody/tr[3]/td[1]"));
	return element;
}

public static WebElement Article_Type_value(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//table[@class='tblMain']/tbody/tr[3]/td[2]"));
	return element;
}



//Corr.Author

public static WebElement Corr_Author(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//table[@class='tblMain']/tbody/tr[4]/td[1]"));
	return element;
}

public static WebElement Corr_Author_value(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//table[@class='tblMain']/tbody/tr[4]/td[2]"));
	return element;
}



//Corr.Author email

public static WebElement Corr_Author_Email(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//table[@class='tblMain']/tbody/tr[5]/td[1]"));
	return element;
}

public static WebElement Corr_Author_Email_value(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//table[@class='tblMain']/tbody/tr[5]/td[2]"));
	return element;
}






//  Stage, Start date and Completed date table

// stage
public static WebElement Stage(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//table[@id='tblTaskList']/tbody/tr/th[1]"));
	return element;
}

public static WebElement Stage_value(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//table[@id='tblTaskList']/tbody/tr[2]/td[1]"));
	return element;
}


public static WebElement Stage_value1(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//table[@id='tblTaskList']/tbody/tr[3]/td[1]"));
	return element;
}


public static WebElement Stage_value2(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//table[@id='tblTaskList']/tbody/tr[4]/td[1]"));
	return element;
}


public static WebElement Stage_value3(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//table[@id='tblTaskList']/tbody/tr[5]/td[1]"));
	return element;
}


public static WebElement Stage_value4(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//table[@id='tblTaskList']/tbody/tr[6]/td[1]"));
	return element;
}








// start date

public static WebElement Start_Date(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//table[@id='tblTaskList']/tbody/tr/th[2]"));
	return element;
}


public static WebElement Start_Date_value(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//table[@id='tblTaskList']/tbody/tr[2]/td[2]"));
	return element;
}


public static WebElement Start_Date_value1(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//table[@id='tblTaskList']/tbody/tr[3]/td[2]"));
	return element;
}

public static WebElement Start_Date_value2(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//table[@id='tblTaskList']/tbody/tr[4]/td[2]"));
	return element;
}


public static WebElement Start_Date_value3(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//table[@id='tblTaskList']/tbody/tr[5]/td[2]"));
	return element;
}


public static WebElement Start_Date_value4(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//table[@id='tblTaskList']/tbody/tr[6]/td[2]"));
	return element;
}









//Completed_Date
public static WebElement Completed_Date(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//table[@id='tblTaskList']/tbody/tr/th[3]"));
	return element;
}

public static WebElement Completed_Date_value(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//table[@id='tblTaskList']/tbody/tr[2]/td[3]"));
	return element;
}


public static WebElement Completed_Date_value1(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//table[@id='tblTaskList']/tbody/tr[3]/td[3]"));
	return element;
}


public static WebElement Completed_Date_value2(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//table[@id='tblTaskList']/tbody/tr[4]/td[3]"));
	return element;
}


public static WebElement Completed_Date_value3(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//table[@id='tblTaskList']/tbody/tr[5]/td[3]"));
	return element;
}


public static WebElement Completed_Date_value4(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//table[@id='tblTaskList']/tbody/tr[6]/td[3]"));
	return element;
}



// close btn
public static WebElement Close_btn(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//button[text()='Close']"));
	return element;
}

// Article id... dropdown

public static WebElement Article_ID_Icon(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//*[@onclick='OpenToggle(1,this)']"));
	return element;
}

public static WebElement Article_ID_Dropdown(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//select[@id='ddlArticleFilter']"));
	return element;
}



////   Seasame 2.0   Webelementt

public static WebElement OPEN(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//i[@class='fas fa-bars']"));
	return element;
}

public static WebElement HOME(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//li[@class='sidebar-menu Li_Home']/a/table"));
	return element;
}


public static WebElement NEW_BOOK(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//*[text()='New Book']"));
	return element;
}


public static WebElement BOOK_MASTER(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//li[@class='sidebar-menu Li_BookMaster']/a/table"));
	return element;
}


public static WebElement WORKFLOW_MANAGER(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//li[@class='sidebar-menu Li_WorkflowManager']/a/table"));
	return element;
}


public static WebElement PROJECT_PLAN(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//li[@class='sidebar-menu Li_ProjectPlan']/a/table"));
	return element;
}


public static WebElement PROJECT_ANALYSIS(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//li[@class='sidebar-menu Li_ProjectAnalysis']/a/table"));
	return element;
}


public static WebElement USER_MANAGEMENT(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//li[@class='sidebar-dropdown Li_UsersManagement']/a/table"));
	return element;
}

// USER_MANAGEMENT data

public static WebElement USERS(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//li[@class='Li_Users']"));
	return element;
}


public static WebElement ROLES(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//li[@class='Li_Roles']"));
	return element;
}


//USER_MASTER WEBELEMENT LIST
public static WebElement Edit1_User_Master(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//table[@id='example']/tbody/tr[1]/td/center/i"));
	return element;
}


// USER Details LIST


public static WebElement Login_Name(WebDriver driver) {
	
	element = driver.findElement(By.id("txtLoginID"));
	return element;
}


public static WebElement Employee_Name(WebDriver driver) {
	
	element = driver.findElement(By.id("txtLoginName"));
	return element;
}


public static WebElement DOB(WebDriver driver) {
	
	element = driver.findElement(By.id("txtDOB"));
	return element;
}


public static WebElement Gender(WebDriver driver) {
	
	element = driver.findElement(By.id("select2-ddlGender-container"));
	return element;
}


public static WebElement Email_id(WebDriver driver) {
	
	element = driver.findElement(By.id("TxtEmailID"));
	return element;
}


public static WebElement Employee_Status(WebDriver driver) {
	
	element = driver.findElement(By.id("select2-ddlActiveStatus-container"));
	return element;
}


public static WebElement User_Type(WebDriver driver) {
	
	element = driver.findElement(By.id("select2-ddlUserTypeList-container"));
	return element;
}


public static WebElement Role(WebDriver driver) {
	
	element = driver.findElement(By.id("select2-ddlRoleID-container"));
	return element;
}


public static WebElement Phone_Number(WebDriver driver) {
	
	element = driver.findElement(By.id("txtPhone"));
	return element;
}


public static WebElement Work_Phone_Number(WebDriver driver) {
	
	element = driver.findElement(By.id("txtWrkPhone"));
	return element;
}


public static WebElement Address(WebDriver driver) {
	
	element = driver.findElement(By.id("txtAddress"));
	return element;
}


public static WebElement Update_btn(WebDriver driver) {
	
	element = driver.findElement(By.id("btnUpdate"));
	return element;
}


public static WebElement Cancel_btn(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//button[text()='Cancel']"));
	return element;
}




// alert message for alll


public static WebElement alert_message_for_fail(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//div[@class='bootstrap-growl alert alert-danger']"));
	return element;
}


public static WebElement alert_message_for_pass(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//div[@class='bootstrap-growl alert alert-info']"));
	return element;
}


public static WebElement alert_message_for_login_too_short(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//div[@class='bootstrap-growl alert alert-warning']"));
	return element;
}


public static WebElement User_info_first_row(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//table[@id='example']/tbody/tr[1]/td[2]"));
	return element;
}


public static WebElement Choose_file(WebDriver driver) {
	
	element = driver.findElement(By.id("imageUploadForm"));
	return element;
}



public static WebElement Logout_btn(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//a[@title='Logout']"));
	return element;
}


public static WebElement Profile_btn(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//a[@title='Profile']/img"));
	return element;
}


public static WebElement TaskCalender_btn(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//a[@title='Task Calendar']"));
	return element;
}


public static WebElement Notification_btn(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//a[@id='Nofify']"));
	return element;
}


public static WebElement Notification_tab(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//div[@class='side-navi-data']"));
	return element;
}


public static WebElement Add_btn(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//button[@class='btn btn-primary spAddIcon']"));
	return element;
}


public static WebElement User_table_1st_row(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//table[@id='example']/tbody/tr[1]"));
	return element;
}


public static WebElement Search(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//div[@id='example_filter']/label/input"));
	return element;
}


public static WebElement No_matching_records_found(WebDriver driver) {
	////table[@id='example']/tbody/tr/td
element = driver.findElement(By.xpath("//*[text()='No matching records found']"));
return element;
}


public static WebElement matching_records_found(WebDriver driver) {
	////table[@id='example']/tbody/tr/td
element = driver.findElement(By.xpath("//table[@id='example']/tbody/tr[1]"));
return element;
}


public static WebElement Previous_button(WebDriver driver) {
	
element = driver.findElement(By.id("example_previous"));
return element;
}


public static WebElement Next_button(WebDriver driver) {
	
element = driver.findElement(By.id("example_next"));
return element;
}








// Role Master webelements

public static WebElement Select_Role_for_Update_dropdown(WebDriver driver) {
	
element = driver.findElement(By.cssSelector("#select2-ddlRole_Info-container"));
return element;
}


public static WebElement Role_name_RM(WebDriver driver) {
	
element = driver.findElement(By.cssSelector("#txtRoleName"));
return element;
}


public static WebElement Description(WebDriver driver) {
	
element = driver.findElement(By.cssSelector("#txtDescription"));
return element;
}


public static WebElement Update_btn_RM(WebDriver driver) {
	
element = driver.findElement(By.id("BtnUpdate_RA"));
return element;
}


public static WebElement Cancel_btn_RM(WebDriver driver) {
	
element = driver.findElement(By.id("BtnCancel_RA"));
return element;
}





// Project Analysis


public static WebElement Book1(WebDriver driver) {
	
element = driver.findElement(By.cssSelector("#divBkList > div:nth-child(1) > div > div.front"));
return element;
}


public static WebElement Project_Manager(WebDriver driver) {
	
element = driver.findElement(By.id("btnTabPM"));
return element;
}



public static WebElement XML(WebDriver driver) {
	
element = driver.findElement(By.id("btnTabXML"));
return element;
}



public static WebElement Pagination(WebDriver driver) {
	
element = driver.findElement(By.id("btnTabPG"));
return element;
}


public static WebElement Quality_Check(WebDriver driver) {
	
element = driver.findElement(By.id("btnTabQC"));
return element;
}


public static WebElement Artwork(WebDriver driver) {
	
element = driver.findElement(By.id("btnTabArtwork"));
return element;
}


public static WebElement Book_Information(WebDriver driver) {
	
element = driver.findElement(By.xpath("//button[@id='btnTabBook']"));
return element;
}



//Project Manager


public static WebElement MSS(WebDriver driver) {
	
element = driver.findElement(By.id("txtmss"));
return element;
}


public static WebElement Estimate(WebDriver driver) {
	
element = driver.findElement(By.id("txtestimate"));
return element;
}


public static WebElement Castoff(WebDriver driver) {
	
element = driver.findElement(By.id("txtcastoff"));
return element;
}


public static WebElement CE_Complexity(WebDriver driver) {
	
element = driver.findElement(By.id("select2-ddlcecomplexicity-container"));
return element;
}


public static WebElement Book_Complexity(WebDriver driver) {
	
element = driver.findElement(By.id("select2-ddlbookcomp-container"));
return element;
}


public static WebElement Book_Type(WebDriver driver) {
	
element = driver.findElement(By.id("select2-ddlbooktype-container"));
return element;
}


public static WebElement Dual_Edition(WebDriver driver) {
	
element = driver.findElement(By.id("select2-ddldualedition-container"));
return element;
}


public static WebElement Previous_Edition(WebDriver driver) {
	
element = driver.findElement(By.id("select2-ddlpreviousedition-container"));
return element;
}


public static WebElement OSPM(WebDriver driver) {
	
element = driver.findElement(By.id("select2-ddlospm-container"));
return element;
}


public static WebElement ISBNS(WebDriver driver) {
	
element = driver.findElement(By.id("select2-ddlisbn-container"));
return element;
}


public static WebElement English(WebDriver driver) {
	
element = driver.findElement(By.id("select2-ddlenglish-container"));
return element;
}



public static WebElement Category(WebDriver driver) {
	
element = driver.findElement(By.id("select2-ddlcatagory-container"));
return element;
}



public static WebElement Index(WebDriver driver) {
	
element = driver.findElement(By.id("select2-ddlindex-container"));
return element;
}


public static WebElement Remark(WebDriver driver) {
	
element = driver.findElement(By.id("txtremarkPM"));
return element;
}


public static WebElement Queries(WebDriver driver) {
	
element = driver.findElement(By.id("txtqueryPM"));
return element;
}


public static WebElement Updatesbtn_PA(WebDriver driver) {
	
//element = driver.findElement(By.id("btnUpdate_PM"));
element = driver.findElement(By.id("btnUpdate_XML"));
return element;
}


public static WebElement Cancelbtn_PA(WebDriver driver) {
	
element = driver.findElement(By.id("btnCancel_PM"));
return element;
}

public static WebElement Attachements_PA(WebDriver driver) {
	
element = driver.findElement(By.id("BtnPM"));
return element;
}


public static WebElement Choose_file_PA(WebDriver driver) {
	
	element = driver.findElement(By.id("FileUpload"));
	return element;
}


public static WebElement Upload_file_PA(WebDriver driver) {
	
	element = driver.findElement(By.id("btnFileUpload"));
	return element;
}


public static WebElement Attached_file1_PA(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//table[@id='tbla1']/tbody/tr[1]/td[1]"));
	return element;
}





// XML WeBElement ;;; Project Analysis


public static WebElement Input_Type(WebDriver driver) {
	
	element = driver.findElement(By.id("select2-ddlinputtype-container"));
	return element;
}


public static WebElement Word_Input_Type(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//ul[@class='select2-results__options']/li[1]"));
	return element;
}


public static WebElement Word_Input_Type1(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//ul[@class='select2-results__options']/li[2]"));
	return element;
}



public static WebElement ORCID(WebDriver driver) {
	
	element = driver.findElement(By.id("select2-ddlorcid-container"));
	return element;
}


public static WebElement MetaSheet(WebDriver driver) {
	
	element = driver.findElement(By.id("select2-ddlmetasheet-container"));
	return element;
}


public static WebElement Abstract(WebDriver driver) {
	
	element = driver.findElement(By.id("select2-ddlabstract-container"));
	return element;
}


public static WebElement Reference_Format(WebDriver driver) {
	
	element = driver.findElement(By.id("select2-ddlrefformat-container"));
	return element;
}



public static WebElement Section_Format(WebDriver driver) {
	
	element = driver.findElement(By.id("select2-ddlsection-container"));
	return element;
}


public static WebElement Reference_Type(WebDriver driver) {
	
	element = driver.findElement(By.id("select2-ddlreftype-container"));
	return element;
}


public static WebElement Final_Deliverable(WebDriver driver) {
	
	element = driver.findElement(By.id("select2-ddlfinaldel-container"));
	return element;
}


public static WebElement Special_Keying(WebDriver driver) {
	
	element = driver.findElement(By.id("select2-ddlspkeying-container"));
	return element;
}


public static WebElement Table_Count(WebDriver driver) {
	
	element = driver.findElement(By.id("txttblcount"));
	return element;
}


public static WebElement Equations_Count(WebDriver driver) {
	
	element = driver.findElement(By.id("txtequations"));
	return element;
}


public static WebElement PAP_Deliverable(WebDriver driver) {
	
	element = driver.findElement(By.id("select2-ddlpap-container"));
	return element;
}



// Artwork


public static WebElement Color_Type(WebDriver driver) {
	
	element = driver.findElement(By.id("select2-ddlcolortype-container"));
	return element;
}


public static WebElement Artwork_PA(WebDriver driver) {
	
	element = driver.findElement(By.id("select2-ddlArtwork-container"));
	return element;
}


public static WebElement  Total_Figures(WebDriver driver) {
	
	element = driver.findElement(By.id("txttfig"));
	return element;
}


public static WebElement  Redraws(WebDriver driver) {
	
	element = driver.findElement(By.id("txtredraws"));
	return element;
}


public static WebElement  Page_Height(WebDriver driver) {
	
	element = driver.findElement(By.id("txtpheight"));
	return element;
}


public static WebElement  Page_Width(WebDriver driver) {
	
	element = driver.findElement(By.id("txtpagewidth"));
	return element;
}



// Pagination


public static WebElement Design(WebDriver driver) {
	
	element = driver.findElement(By.id("txtdesign"));
	return element;
}


public static WebElement Trim(WebDriver driver) {
	
	element = driver.findElement(By.id("txttrim"));
	return element;
}


public static WebElement Template(WebDriver driver) {
	
	element = driver.findElement(By.id("txttemplate"));
	return element;
}


public static WebElement Font_Available(WebDriver driver) {
	
	element = driver.findElement(By.id("select2-ddlfont-container"));
	return element;
}


public static WebElement Figure_Slide(WebDriver driver) {
	
	element = driver.findElement(By.id("select2-ddlfigureslide-container"));
	return element;
}



public static WebElement Print(WebDriver driver) {
	
	element = driver.findElement(By.id("select2-ddlprint-container"));
	return element;
}


public static WebElement EBook(WebDriver driver) {
	
	element = driver.findElement(By.id("select2-ddlebook-container"));
	return element;
}


public static WebElement Color(WebDriver driver) {
	
	element = driver.findElement(By.id("select2-ddlcolor-container"));
	return element;
}


public static WebElement Coloumn(WebDriver driver) {
	
	element = driver.findElement(By.id("select2-ddlcolumn-container"));
	return element;
}


public static WebElement Imprint(WebDriver driver) {
	
	element = driver.findElement(By.id("txtimprint"));
	return element;
}



// Quality Check


public static WebElement Greek_Characters(WebDriver driver) {
	
	element = driver.findElement(By.id("select2-ddlgreek-container"));
	return element;
}


public static WebElement Variables(WebDriver driver) {
	
	element = driver.findElement(By.id("select2-ddlvariable-container"));
	return element;
}


public static WebElement Special_Elements(WebDriver driver) {
	
	element = driver.findElement(By.id("select2-ddlspclelm-container"));
	return element;
}



public static WebElement Foot_Notes(WebDriver driver) {
	
	element = driver.findElement(By.id("select2-ddlfoot-container"));
	return element;
}


public static WebElement End_Notes(WebDriver driver) {
	
	element = driver.findElement(By.id("select2-ddlendnote-container"));
	return element;
}


public static WebElement Color_Insert(WebDriver driver) {
	
	element = driver.findElement(By.id("select2-ddlcolorin-container"));
	return element;
}


public static WebElement Section_Breaks(WebDriver driver) {
	
	element = driver.findElement(By.id("select2-ddlsectbrk-container"));
	return element;
}


public static WebElement front_Matter(WebDriver driver) {
	
	element = driver.findElement(By.id("select2-ddlfrontm-container"));
	return element;
}



public static WebElement Back_Matter(WebDriver driver) {
	
	element = driver.findElement(By.id("sselect2-ddlbackm-container"));
	return element;
}


public static WebElement Series_page(WebDriver driver) {
	
	element = driver.findElement(By.id("select2-ddlseries-container"));
	return element;
}


public static WebElement Index_PA(WebDriver driver) {
	
	element = driver.findElement(By.id("select2-ddlindexqc-container"));
	return element;
}


public static WebElement Tables_Count(WebDriver driver) {
	
	element = driver.findElement(By.id("txttblcount1"));
	return element;
}



//New Book



public static WebElement Edit1(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//div[@id='FormNewBook']/div[2]/div[2]/div/span[2]/i"));
	return element;
}


public static WebElement Withdraw1(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//div[@id='FormNewBook']/div[2]/div[2]/div/span[1]/i"));
	return element;
}


public static WebElement Catalog(WebDriver driver) {
	
	element = driver.findElement(By.id("txtCatalog"));
	return element;
}


public static WebElement ISBN(WebDriver driver) {
	
	element = driver.findElement(By.id("txtISBN"));
	return element;
}


public static WebElement Title(WebDriver driver) {
	
	element = driver.findElement(By.id("txtTitle"));
	return element;
}



public static WebElement Publisher(WebDriver driver) {
	
	element = driver.findElement(By.id("select2-ddlPublisherList-container"));
	return element;
}


public static WebElement Publisher_1stName(WebDriver driver) {
	
	element = driver.findElement(By.cssSelector("#select2-ddlPublisherList-result-64ar-2"));
	return element;
}


public static WebElement Platform(WebDriver driver) {
	
	element = driver.findElement(By.id("select2-ddlPlatform-container"));
	return element;
}


public static WebElement Received_Date(WebDriver driver) {
	
	element = driver.findElement(By.id("txtReceivedDt"));
	return element;
}



public static WebElement Due_Date(WebDriver driver) {
	
	element = driver.findElement(By.id("txtDueDt"));
	return element;
}


public static WebElement PE_Name(WebDriver driver) {
	
	element = driver.findElement(By.id("select2-ddlPEList-container"));
	return element;
}


public static WebElement PM_Name(WebDriver driver) {
	
	element = driver.findElement(By.id("select2-ddlPMList-container"));
	return element;
}



public static WebElement TSPM_Name(WebDriver driver) {
	
	element = driver.findElement(By.id("select2-ddlTSPMList-container"));
	return element;
}


public static WebElement Subject(WebDriver driver) {
	
	element = driver.findElement(By.id("select2-ddlSubject-container"));
	return element;
}



public static WebElement Edition(WebDriver driver) {
	
	element = driver.findElement(By.id("select2-ddlEdition-container"));
	return element;
}


public static WebElement Add_Update_btn_NewBook(WebDriver driver) {
	
	element = driver.findElement(By.id("btnUpdate"));
	return element;
}


public static WebElement Cancel_btn_NewBook(WebDriver driver) {
	
	element = driver.findElement(By.id("btnCancel"));
	return element;
}



public static WebElement ChooseFile_NewBook(WebDriver driver) {
	
	element = driver.findElement(By.id("imageUploadForm"));
	return element;
}


public static WebElement First_date(WebDriver driver) {
	
	element = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/table/tbody/tr[1]/td[2]"));
	return element;
}


public static WebElement First_Book(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//div[@id='FormNewBook']/div[2]"));
	return element;
}


public static WebElement AddNewBook(WebDriver driver) {
	
	element = driver.findElement(By.id("btnNewBook"));
	return element;
}


public static WebElement BookInfo_heading(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//*[text()='Book Info']"));
	return element;
}


public static WebElement NewBook_heading(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//*[text()='New Books']"));
	return element;
}


}













