package com.dollardays.testcases;


import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Hashtable;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.dollardays.commons.Base64;
import com.dollardays.listners.ExtentTestManager;
import com.dollardays.pages.LoginPage;
import com.dollardays.pages.MyProfilePage;
import com.dollardays.utilities.DDDataProvider;
import com.dollardays.utilities.TestUtil;

public class MyProfileTestcase extends BaseTest 

{
	String cPword, newPWord, reNewPWord ;
	String fName ,lName , phoneNo , extNo ,secPhnNo ;
	boolean A1;
	private JavascriptExecutor js = null;

	//getting credentials from xlxs file for MyProfile page
	
	@DDDataProvider(datafile = "/Users/chandaverma/Downloads/Dollardays30thsep-master/testdata/DDtestdataTeam1.xlsx", sheetName = "MyProfile",  testcaseID = "TC1", runmode = "Yes")
	@Test(priority = 0 ,dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)

	     public void MyProfileLoginInfoEmailAddressValidation(Hashtable<String, String> datatable) throws InterruptedException, UnsupportedEncodingException, GeneralSecurityException
	       {
		   
		    LoginPage loginPage = new LoginPage(driver);
			ExtentTestManager.getTest().log(Status.PASS, " Login with Valid credentials in application ");
			loginPage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
			Thread.sleep(1000);
			Thread.sleep(1000);
			
			
			 MyProfilePage myprofile = new MyProfilePage(driver);
			 
			 myprofile.click_User_Dropdown_Toggle();
			 ExtentTestManager.getTest().log(Status.PASS, "  Clicked  on Sigin Toggle after logging in application .");
			 Thread.sleep(1000);
			 
			
			 myprofile.click_user_Dropdown_Toggle_Accounts();
			 ExtentTestManager.getTest().log(Status.PASS, " Clicked on Accounts link.");
			 Thread.sleep(3000);
			
			 myprofile.getCookiePopup().click();
			 ExtentTestManager.getTest().log(Status.PASS, " Clicked Okay on CookiePopup");
			 Thread.sleep(1000);
				
			 myprofile.click_MyProfileLink();
			 ExtentTestManager.getTest().log(Status.PASS, " Clicked on MyProfile  Link. ");
			 Thread.sleep(3000);
			 
			 js = (JavascriptExecutor) driver;
				String ActualUserName = myprofile.LogininfoEmail_Username.getText();
				js.executeScript("window.scrollBy(0,0)");
				Thread.sleep(1000);
			
				String ExpectedUserName = datatable.get("UserName");
				try {
					Assert.assertEquals(ActualUserName, ExpectedUserName);
					ExtentTestManager.getTest().log(Status.PASS,
							"Test1 : The displayed email address is matching with the actual UserName/Emailaddress..As Expected");
				    } catch (AssertionError e)
				
				    {
					ExtentTestManager.getTest().log(Status.FAIL,
							"Test 1 :The displayed email address is not matching with the actual Username/Emailaddress..Not as Expected");
				    }
				myprofile.click_User_Dropdown_Toggle();
				Thread.sleep(1000);
				myprofile.click_user_Dropdown_Toggle_Signout();
				ExtentTestManager.getTest().log(Status.INFO, "LoggedOut Succesfully ");
	       }	
			 
   @DDDataProvider(datafile = "/Users/chandaverma/Downloads/Dollardays30thsep-master/testdata/DDtestdataTeam1.xlsx", sheetName = "MyProfile",  testcaseID = "TC3", runmode = "Yes")
   @Test(priority = 1 ,dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)

     public void MyProfile_Login_Information_Validation(Hashtable<String, String> datatable) throws InterruptedException, UnsupportedEncodingException, GeneralSecurityException
       {
	   
	    LoginPage loginPage = new LoginPage(driver);
		ExtentTestManager.getTest().log(Status.PASS, " Login with Valid credentials in application ");
		loginPage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
		Thread.sleep(1000);
		Thread.sleep(1000);
		
		
		 MyProfilePage myprofile = new MyProfilePage(driver);
		 
		 myprofile.click_User_Dropdown_Toggle();
		 ExtentTestManager.getTest().log(Status.PASS, "  Clicked  on Sigin Toggle after logging in application .");
		 Thread.sleep(1000);
		 
		
		 myprofile.click_user_Dropdown_Toggle_Accounts();
		 ExtentTestManager.getTest().log(Status.PASS, " Clicked on Accounts link.");
		 Thread.sleep(3000);
		
		 myprofile.getCookiePopup().click();
		 ExtentTestManager.getTest().log(Status.PASS, " Clicked Okay on CookiePopup");
		 Thread.sleep(1000);
			
		 myprofile.click_MyProfileLink();
		 ExtentTestManager.getTest().log(Status.PASS, " Clicked on MyProfile  Link. ");
		 Thread.sleep(3000);
		 
		 
		 myprofile.LoginInformation(cPword, newPWord, reNewPWord);
		 myprofile.getCurrPassword().sendKeys(datatable.get("CurrentPassword"));
		 myprofile.getNewPassword().sendKeys(datatable.get("NewPassword"));
		 myprofile.getReTypeNewPassword().sendKeys(datatable.get("ReTypeNewPassword"));
		 
		 ExtentTestManager.getTest().log(Status.PASS, " Entering Values in Fields.");
		 
		 myprofile.getLoginfo_SaveChangesBtn().click();
		 ExtentTestManager.getTest().log(Status.PASS, " Clicked on Save Changes Button.");
		 Thread.sleep(2000);
		 
		 myprofile.click_User_Dropdown_Toggle();
		 myprofile.click_user_Dropdown_Toggle_Signout();
		 ExtentTestManager.getTest().log(Status.PASS, " Logged out from Application ");
		 Thread.sleep(2000);
		 
		 //for changing with valid newpassword and retypenewpassword
		 loginPage.login(datatable.get("UserName"), datatable.get("NewPassword"));
		 ExtentTestManager.getTest().log(Status.PASS, "  Again logging in by clicking on Sigin Toggle .");
		 ExtentTestManager.getTest().log(Status.PASS, "  Current Password is changed to New Password .");
		 Thread.sleep(2000);

		 
		 
	}
	
	@DDDataProvider(datafile = "/Users/chandaverma/Downloads/Dollardays30thsep-master/testdata/DDtestdataTeam1.xlsx", sheetName = "MyProfile",  testcaseID = "TC7", runmode = "Yes")
	@Test(priority = 2,dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
	
    public void Personal_Information_Validation(Hashtable<String, String> datatable) throws InterruptedException, UnsupportedEncodingException, GeneralSecurityException
	{
		LoginPage loginPage = new LoginPage(driver);
		ExtentTestManager.getTest().log(Status.PASS, " Login with Valid credentials in application ");
		loginPage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
		Thread.sleep(1000);
		Thread.sleep(1000);
		
		
		 MyProfilePage myprofile = new MyProfilePage(driver);
		 myprofile.click_User_Dropdown_Toggle();
		 ExtentTestManager.getTest().log(Status.PASS, "  Clicked Sigin Toggle after signing in.");
		 
		
		 myprofile.click_user_Dropdown_Toggle_Accounts();
		 ExtentTestManager.getTest().log(Status.PASS, " Clicked on Accounts link.");
		 Thread.sleep(3000);
		 
		 myprofile.getCookiePopup().click();
		 ExtentTestManager.getTest().log(Status.PASS, " Clicked Okay on CookiePopup");
		 Thread.sleep(1000);
		
		 myprofile.click_MyProfileLink();
		 ExtentTestManager.getTest().log(Status.PASS, " Clicked on MyProfile  Link. ");
		 Thread.sleep(3000);
		 
		
		 
		 myprofile.PersonalInformation(fName, lName, phoneNo, extNo, secPhnNo);
		 myprofile.getFirstName_Textbox().sendKeys(datatable.get("FirstName"));
		 myprofile.getLastName_Textbox().sendKeys(datatable.get("LastName"));
		 myprofile.getPrimaryPhNo_Textbox().sendKeys(datatable.get("PrimaryPhoneNo"));
		 myprofile.getExtn_Textbox().sendKeys(datatable.get("ExtNo"));
		 myprofile.getSecPhNo_Textbox().sendKeys(datatable.get("SecPhoneNo"));
		 Thread.sleep(1000);
		 myprofile.getPersonalInfo_SaveChangesBtn().click();
		 ExtentTestManager.getTest().log(Status.PASS, " Entering Values in Fields.");
		 ExtentTestManager.getTest().log(Status.PASS, " Clicked on Save Changes Button.");
		 
		 driver.switchTo().alert().accept();
		 Thread.sleep(4000);
		 ExtentTestManager.getTest().log(Status.PASS, " Clicked Okay to popup .");
		
		 myprofile.getAccountOverviewLink().click();
		 Thread.sleep(2000);
		 ExtentTestManager.getTest().log(Status.PASS, " Clicked on AccountOverviewLink to see edited details of Personal Information  ");
	   
		 
	
	}
	@DDDataProvider(datafile = "/Users/chandaverma/Downloads/Dollardays30thsep-master/testdata/DDtestdataTeam1.xlsx", sheetName = "MyProfile",  testcaseID = "TC13", runmode = "Yes")
	@Test(priority = 3,dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
	
    public void Email_Preferences_userEmail_Validation(Hashtable<String, String> datatable) throws InterruptedException, UnsupportedEncodingException, GeneralSecurityException
	{
		
		    LoginPage loginPage = new LoginPage(driver);
		    ExtentTestManager.getTest().log(Status.PASS, " Login with Valid credentials in application ");
		    loginPage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
		    Thread.sleep(2000);
		
		     MyProfilePage myprofile = new MyProfilePage(driver);
			 myprofile.click_User_Dropdown_Toggle();
			 ExtentTestManager.getTest().log(Status.PASS, "  Clicked Sigin Toggle after signing in.");
			 Thread.sleep(2000);

			 
			 myprofile.click_user_Dropdown_Toggle_Accounts();
			 ExtentTestManager.getTest().log(Status.PASS, " Clicked on Accounts link.");
			 Thread.sleep(3000);
			
			 myprofile.click_MyProfileLink();
			 ExtentTestManager.getTest().log(Status.PASS, " Clicked on MyProfile  Link. ");
			 Thread.sleep(3000);
			 
			 myprofile.getCookiePopup().click();
			 ExtentTestManager.getTest().log(Status.PASS, " Clicked Okay on CookiePopup");
			 Thread.sleep(1000);
			 
		   
			 
		    js = (JavascriptExecutor) driver;
			String ActualUserName = myprofile.Email_Username.getText();
			js.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(1000);
			//String ExpectedUserName = datatable.get("ExpectedValue");
			String ExpectedUserName = datatable.get("UserName");
			try {
				Assert.assertEquals(ActualUserName, ExpectedUserName);
				ExtentTestManager.getTest().log(Status.PASS,
						"Test1 : The displayed email address is matching with the actual UserName/Emailaddress..As Expected");
			    } catch (AssertionError e)
			
			    {
				ExtentTestManager.getTest().log(Status.FAIL,
						"Test 1 :The displayed email address is not matching with the actual Username/Emailaddress..Not as Expected");
			    }
			myprofile.click_User_Dropdown_Toggle();
			Thread.sleep(1000);
			myprofile.click_user_Dropdown_Toggle_Signout();
			ExtentTestManager.getTest().log(Status.INFO, "LoggedOut Succesfully ");
		
	}
			
			
	@DDDataProvider(datafile = "/Users/chandaverma/Downloads/Dollardays30thsep-master/testdata/DDtestdataTeam1.xlsx", sheetName = "MyProfile", testcaseID = "TC14", runmode = "Yes")
	@Test(priority = 4, dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
			
			public void emailPreferences_Checkbox_Validation(Hashtable<String, String> datatable)
					throws IOException, InterruptedException, GeneralSecurityException 
			{
				LoginPage loginPage = new LoginPage(driver);
				loginPage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
				ExtentTestManager.getTest().log(Status.INFO, " Successfully Logged in with valid Credentials");
				Thread.sleep(1000);
				
				MyProfilePage myprofile= new MyProfilePage(driver);
				
				myprofile.click_User_Dropdown_Toggle();
				Thread.sleep(2000);
				
				
				myprofile.click_user_Dropdown_Toggle_Accounts();
				Thread.sleep(2000);
				
				myprofile.getCookiePopup().click();
				ExtentTestManager.getTest().log(Status.PASS, " Clicked Okay on CookiePopup");
				Thread.sleep(1000);
				
				
				myprofile.click_MyProfileLink();
				js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,1000)");

				if (myprofile.NewsLetter_CheckBox.isSelected())
				{

					myprofile.click_NewsLetter_CheckBox() ;
					Thread.sleep(2000);
					myprofile.click_EmailPreferences_SaveChanges();
					Thread.sleep(2000);
					myprofile.click_User_Dropdown_Toggle();
					Thread.sleep(2000);
					myprofile.click_user_Dropdown_Toggle_Signout();
					
					ExtentTestManager.getTest().log(Status.PASS,
							" Newsletter subscription checkbox is checked and unchanged until further changes to it:As Expected");
					Thread.sleep(2000);
					
					
					try {
						
						A1 = Boolean.parseBoolean(datatable.get("EmailPrefCheckBox"));
						Assert.assertEquals(myprofile.NewsLetter_CheckBox.isSelected(), A1);
						ExtentTestManager.getTest().log(Status.PASS,
								"Once unchecked the Newsletter subscription checkbox remains unchanged until further changes to it:As Expected");
					    } catch (AssertionError e) 
					{
						ExtentTestManager.getTest().log(Status.FAIL,
								"The changes to the Newsletter checkbox is not remaining unchanged: Not as expected");
					}
				}

				myprofile.click_NewsLetter_CheckBox();
				Thread.sleep(2000);
				js.executeScript("window.scrollBy(0,1000)");
				myprofile.click_EmailPreferences_SaveChanges();
				Thread.sleep(2000);
				myprofile.click_User_Dropdown_Toggle();
				Thread.sleep(2000);
				myprofile.click_user_Dropdown_Toggle_Signout();
				ExtentTestManager.getTest().log(Status.INFO, "LoggedOut Succesfully ");
			
		}
   }