
package com.dollardays.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class MyProfilePage 

{ 
	WebDriver driver;

	public MyProfilePage (WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	
	}	
	
	//Home Page Locators and methods
	
	
    @FindBy(xpath = "//a[@href='myaccount/account.aspx'] | //i[@class='fa fa-home']")
	private WebElement AccountOverViewLink;
	
	public WebElement getAccountOverviewLink() {
		return AccountOverViewLink;
	}
	
   @FindBy(xpath="//a[@class='dropdown-toggle']//img[@class='header-user']")
   private WebElement User_Dropdown_Toggle;
   public void click_User_Dropdown_Toggle() 
   {
	User_Dropdown_Toggle.click();
    }	

 @FindBy(xpath="//a[@href='/logout.aspx'][@class='dropdown-item padditem margn-top']")
private WebElement user_Dropdown_Toggle_Signout;
public void click_user_Dropdown_Toggle_Signout() {
	user_Dropdown_Toggle_Signout.click();
	}

@FindBy(xpath="//a[@class='dropdown-item'][@href='/myaccount/account.aspx']")
private WebElement user_Dropdown_Toggle_Accounts;
public void click_user_Dropdown_Toggle_Accounts() {
	user_Dropdown_Toggle_Accounts.click();
	}

//cookie popup
@FindBy(xpath = "//input[@class='iagree btn']")
private WebElement cookiePopup;

public WebElement getCookiePopup() {
	return cookiePopup;
}
     
//My Profile Link in side menu Locators and methods

@FindBy(xpath = "//span[text()='My Profile']")
private WebElement MyProfileLink;
public void click_MyProfileLink() {
	MyProfileLink.click();
	}



//LoginInfo block locators and methods

@FindBy(xpath="//h4[text()='Email Address:']/span")
public WebElement LogininfoEmail_Username;
public WebElement getLogininfoEmail_Username(){
	return LogininfoEmail_Username;
}

@FindBy(xpath="//input[@class='form-control curr-pass']")
public WebElement CurrPassword_Textbox;
public WebElement getCurrPassword() {
	return CurrPassword_Textbox;
}

@FindBy(xpath="//input[@class='form-control new-pass']")
public WebElement NewPassword_Textbox;
public WebElement getNewPassword() {
	return NewPassword_Textbox;
}

@FindBy(xpath="//input[@class='form-control re-pass']")
public WebElement ReTypeNewPassword_Textbox;
public WebElement getReTypeNewPassword() {
	return ReTypeNewPassword_Textbox;
}

@FindBy(xpath="//input[@id='ctl00_cphContent_btnUpdatePassword']")
public WebElement Loginfo_SaveChangesBtn;
public WebElement getLoginfo_SaveChangesBtn(){
	return Loginfo_SaveChangesBtn;
}



//Personal info block locators and methods

@FindBy(xpath="//input[@class='form-control bg-white firstname']")
public WebElement FirstName_Textbox;
public WebElement getFirstName_Textbox() {
	return FirstName_Textbox;
}

@FindBy(xpath="//input[@class='form-control bg-white lastname']")
public WebElement LastName_Textbox;
public WebElement getLastName_Textbox() {
	return LastName_Textbox;
}


@FindBy(xpath="//input[@class='form-control phone numerictxtbx']")
public WebElement PrimaryPhNo_Textbox;
public WebElement getPrimaryPhNo_Textbox() {
	return PrimaryPhNo_Textbox;
}

@FindBy(xpath="//input[@class='form-control numerictxtbx']")
public WebElement Extn_Textbox;
public WebElement getExtn_Textbox()
 {
	return Extn_Textbox;
}


@FindBy(xpath="//input[@name='ctl00$cphContent$txtPhoneBill']")
public WebElement SecPhNo_Textbox;
public WebElement getSecPhNo_Textbox(){
	return SecPhNo_Textbox;

}

@FindBy(xpath="//input[@id='ctl00_cphContent_btnUpdatePersonalInfo']")
public WebElement PersonalInfo_SaveChangesBtn;
public WebElement getPersonalInfo_SaveChangesBtn(){
	return PersonalInfo_SaveChangesBtn;
}


//Email Preferences Block Locators and methods and 
//Email Preferences Block Click Methods

@FindBy(xpath="//h5[text()='Manage the types of emails sent to ']/span")
public WebElement Email_Username;
public WebElement getEmail_Username(){
	return Email_Username;
}
public boolean Verify_Email_Username(){
	return Email_Username.isDisplayed();
}


	
//@FindBy(xpath="//input[@id='ctl00_cphContent_chkOptinBox1']")
@FindBy(xpath="//i[@class='helper']")
public WebElement NewsLetter_CheckBox;
public WebElement getNewsLetter_CheckBox(){
	return NewsLetter_CheckBox;
}
public void click_NewsLetter_CheckBox() {
	   NewsLetter_CheckBox.click();
	}



@FindBy(xpath="//a[text()='My Account Terms & Conditions']")
private WebElement MyAccountTermsandConditions_Link;
public WebElement getMyAccountTermsandConditions_Link(){
	return MyAccountTermsandConditions_Link;
}
public void click_MyAccountTermsandConditions() {
	MyAccountTermsandConditions_Link.click();
}


@FindBy(xpath="//a[text()='Privacy & Security Statement']")
private WebElement PrivacyandSecurityStatement_Link;
public WebElement getPrivacyandSecurityStatement_Link(){
	return PrivacyandSecurityStatement_Link;
}
public void click_PrivacyandSecurityStatement() {
	PrivacyandSecurityStatement_Link.click();
}

@FindBy(xpath="//input[@id='ctl00_cphContent_btnUpdateNewsletter']")
private WebElement EmailPreferences_SaveChanges_Btn;
public WebElement getEmailPreferences_SaveChanges_Btn(){
	return EmailPreferences_SaveChanges_Btn;
}
public void click_EmailPreferences_SaveChanges() {
	EmailPreferences_SaveChanges_Btn.click();
}

	


//for TC1
public void LoginInformation(String Cpword, String NewPWord, String Re_NewPWord) {
	
	getCurrPassword();
	getNewPassword();
	getReTypeNewPassword();
	getLoginfo_SaveChangesBtn();
	
	
}



 
public void PersonalInformation(String FName ,String LName , String PhoneNo , String ExtNo ,String SecPhnNo ) {
	getFirstName_Textbox().clear();
	getLastName_Textbox().clear();
	getPrimaryPhNo_Textbox().clear();
	getExtn_Textbox().clear();
	getSecPhNo_Textbox().clear();
	getPersonalInfo_SaveChangesBtn();
}


}



