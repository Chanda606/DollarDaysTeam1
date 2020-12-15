package com.dollardays.testcases;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Hashtable;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.dollardays.commons.Base64;
import com.dollardays.listners.ExtentTestManager;
import com.dollardays.pages.AccountOverviewTaxExemptPage;
import com.dollardays.pages.LoginPage;
import com.dollardays.utilities.DDDataProvider;
import com.dollardays.utilities.TestUtil;

public class AccOverviewTaxExemTestcase extends BaseTest 

 {
	 private JavascriptExecutor js = null;
	//getting credentials from xlxs file for accountoverview page
	@DDDataProvider(datafile = "/Users/chandaverma/Downloads/Dollardays30thsep-master/testdata/DDtestdataTeam1.xlsx", sheetName = "Login",  testcaseID = "TC1", runmode = "Yes")
	@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
	
    public void AccountOverviewPageEditLinkVerify(Hashtable<String, String> datatable) throws InterruptedException, UnsupportedEncodingException, GeneralSecurityException
	{
		
		LoginPage loginPage = new LoginPage(driver);
		ExtentTestManager.getTest().log(Status.PASS, " Login with Valid credentials in application ");
		loginPage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
		Thread.sleep(1000);
		Thread.sleep(1000);
	
        AccountOverviewTaxExemptPage acctaxExemptpage = new AccountOverviewTaxExemptPage(driver);
        
		acctaxExemptpage.getSignInButton().click();
		ExtentTestManager.getTest().log(Status.PASS, "  Clicked Sigin Toggle after signing in.");
		
		acctaxExemptpage.getSignIn_AccountsBtn().click();
		ExtentTestManager.getTest().log(Status.PASS, " Clicked on Accounts link.");
		Thread.sleep(2000);
		
		acctaxExemptpage.getAccountOverviewLink().click();
		ExtentTestManager.getTest().log(Status.PASS, "  Clicked on AccountOverviewLink ");
		Thread.sleep(1000);
		
		acctaxExemptpage.getCookiepopup().click();
		ExtentTestManager.getTest().log(Status.PASS, " Clicked Okay on CookiePopup");
		
		acctaxExemptpage.Verify_LoginInfoEditLink();
		acctaxExemptpage.LoginInfoEditLink();
		ExtentTestManager.getTest().log(Status.PASS, "  Clicked on LoginInformation Edit Link, Edit link is clickable and Navigating to  MyProfile page  ");
		Thread.sleep(1000);
		
		acctaxExemptpage.getAccountOverviewLink().click();
		ExtentTestManager.getTest().log(Status.PASS, "  Clicked on AccountOverviewLink ");
		Thread.sleep(1000);
		
		acctaxExemptpage.Verify_PersonalInfoEditLink();
		acctaxExemptpage.PersonalInfoEditLink();
		ExtentTestManager.getTest().log(Status.PASS, "  Clicked on PersonalInformation Edit Link , Edit link is clickable and Navigating to MyProfile page  ");
		Thread.sleep(1000);
		
		acctaxExemptpage.getAccountOverviewLink().click();
		ExtentTestManager.getTest().log(Status.PASS, " Clicked on AccountOverviewLink ");
		Thread.sleep(1000);
		
		acctaxExemptpage.Verify_DefaultToShipEditLink();
		acctaxExemptpage.DefaultToShipEditLink();
	    ExtentTestManager.getTest().log(Status.PASS, "  Clicked on DefaultToShipEdit Link,Edit link is clickable and Navigating to My Address Book Page ");
	    Thread.sleep(1000);
	    
		acctaxExemptpage.getAccountOverviewLink().click();
		ExtentTestManager.getTest().log(Status.PASS, "  Clicked on AccountOverviewLink ");
		Thread.sleep(1000);
		
		acctaxExemptpage.Verify_DefaultPaymentMethodEditLink();
		acctaxExemptpage.DefaultPaymentMethodEditLink();
		ExtentTestManager.getTest().log(Status.PASS, " Clicked on DefaultPaymentMethod Edit Link,Edit link is clickable and Navigating to My Wallet Page ");
		Thread.sleep(1000);
		
	    acctaxExemptpage.getAccountOverviewLink().click();
	    ExtentTestManager.getTest().log(Status.PASS, "  Clicked on AccountOverviewLink ");
	    Thread.sleep(1000);
	    
	    
	    js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
	    acctaxExemptpage.Verify_TaxExemptEditLink();
	    acctaxExemptpage.TaxExemptEditLink();
	    ExtentTestManager.getTest().log(Status.PASS, "  Clicked on TaxExempt CusomerType Edit Link ,Edit link is clickable and Navigates to MyProfile Page ");
	    Thread.sleep(2000);
	    
	    acctaxExemptpage.getAccountOverviewLink().click();
	    ExtentTestManager.getTest().log(Status.PASS, "  Clicked on AccountOverviewLink again ");
	    Thread.sleep(1000);
	    js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
	    acctaxExemptpage.Verify_TaxExemptUploadLink();
	    acctaxExemptpage.TaxExemptUploadLink();
	    ExtentTestManager.getTest().log(Status.PASS, "  Clicked on TaxExemptUploadLink ,link is clickable and Navigating to tax exempt form page  ");
	    Thread.sleep(1000);
	    
	    acctaxExemptpage.getAccount_TaxExemptCloseBtn().click();
	    ExtentTestManager.getTest().log(Status.PASS, "  Close the form  ");
	    Thread.sleep(1000);
	    
	    /*acctaxExemptpage.getAccountOverviewLink().click();
	    ExtentTestManager.getTest().log(Status.PASS, "  Clicked on AccountOverviewLink again ");
	    Thread.sleep(1000);
	    js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
	    acctaxExemptpage.Verify_TaxExemptComplianceLink();
	    acctaxExemptpage.TaxExemptComplianceLink();
	    ExtentTestManager.getTest().log(Status.PASS, "Step 13:  Clicked on TaxExemptComplianceLink ,opening a window to choose amail acc provider   ");
	    Thread.sleep(1000);*/
	   
	    acctaxExemptpage.getMyFavoritesLink().click();
	    ExtentTestManager.getTest().log(Status.PASS, "  clicked on My Favs link navigating to the page showing favs products list ");
	    Thread.sleep(1000);
	    
	    acctaxExemptpage.getOrderHistoryLink().click();
	    ExtentTestManager.getTest().log(Status.PASS, "  clicked on Order History link navigating to the page showing Order History ");
	    Thread.sleep(1000);
	    
	    acctaxExemptpage.Verify_LogOutLink();
	    acctaxExemptpage.LogOutLink();
	    ExtentTestManager.getTest().log(Status.PASS, "Step 12:  Clicked on LogOut Link , logged out from application");
	    
	
	}
	
 }