package com.dollardays.pages;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountOverviewTaxExemptPage 
{
	WebDriver driver;

	public AccountOverviewTaxExemptPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//li[@class='dropdown']//a[@class='dropdown-toggle']")
	private WebElement SignInButton;
	
	public WebElement getSignInButton() {
		return SignInButton;
	}
	
	@FindBy(xpath = "//a[contains(text(),'Accounts')]")
	private WebElement SignIn_AccountsBtn;
	
	public WebElement getSignIn_AccountsBtn() {
		return SignIn_AccountsBtn;
	}
	
	@FindBy(xpath = "//input[@class='iagree btn']")
	private WebElement cookiepopup;
	
	public WebElement getCookiepopup() {
		return cookiepopup;
	}
	@FindBy(xpath = "//a[@href='myaccount/account.aspx'] | //i[@class='fa fa-home']")
	private WebElement AccountOverViewLink;
	
	public WebElement getAccountOverviewLink() {
		return AccountOverViewLink;
	}
	
	@FindBy(xpath = "//a[@href='myaccount/profile.aspx'] | //i[@class='fa fa-pencil']")
	private WebElement MyProfileLink;
	
	public WebElement getMyProfileLink() {
		return MyProfileLink;
	}
	
	@FindBy(xpath = "//a[@href='myaccount/addressbook.aspx'] | //i[@class='fa fa-book']")
	private WebElement MyAddressBookLink;
	
	public WebElement getMyAddressBookLink() {
		return MyAddressBookLink;
	}
	
	
	@FindBy(xpath = "//a[@href='myaccount/wallet.aspx'] | //i[@class='fa fa-credit-card-alt']")
	private WebElement MyWalletLink;
	
	public WebElement getMyWalletLink() {
		return MyWalletLink;
	}
	
	
	@FindBy(xpath = "//span[text()='Tax Exempt '] | //i[@class='fa fa-certificate']")
	private WebElement TaxExemptLink;
	
	public WebElement getTaxExemptLink() {
		return TaxExemptLink;
	}
	
	@FindBy(xpath = "//li[@class=' boder-bot mar-top ']//a[@href='/myaccount/favorites.aspx']")
	private WebElement MyFavoritesLink;
	
	public WebElement getMyFavoritesLink() {
		return MyFavoritesLink;
	}
	
	@FindBy(xpath = "//li[@class=' boder-bot ']//a[@href='/myaccount/order-history.aspx']")
	private WebElement OrderHistoryLink;
	
	public WebElement getOrderHistoryLink() {
		return OrderHistoryLink;
	}
	
	@FindBy(xpath = "//span[text()='Log Out '] | //i[@class='fa fa-sign-out']")
	private WebElement LogOutLink;
	
	public WebElement getLogOutLink() {
		return LogOutLink;
	}
	
	@FindBy(xpath = "//a[text()='Edit'][@href='profile.aspx']")
	private WebElement account_LoginInfoEditLink;
	
	public WebElement getAccount_LoginInfoEditLink() {
		return account_LoginInfoEditLink;
	}
	
	@FindBy(xpath = "//a[@href='profile.aspx#anchor-personal']")
	private WebElement account_PersonalInfoEditLink;
	
	public WebElement getAccount_PersonalInfoEditLink() {
		return account_PersonalInfoEditLink;
	}
	
	@FindBy(xpath = "//a[@href='addressbook.aspx']")
	private WebElement account_DefaultToShipEditLink;
	
	public WebElement getAccount_DefaultToShipEditLink() {
		return account_DefaultToShipEditLink;
	}
	
	@FindBy(xpath = "//a[@href='wallet.aspx']")
	private WebElement account_DefaultPaymentMethodEditLink;
	
	public WebElement getAccount_DefaultPaymentMethodEditLink() {
		return account_DefaultPaymentMethodEditLink;
	}
	
	@FindBy(xpath = "//a[@href='profile.aspx#anchor-organization']")
	private WebElement account_TaxExemptEditLink;
	
	public WebElement getAccount_TaxExemptEditLink() {
		return account_TaxExemptEditLink;
	}

	//@FindBy(xpath = "//a[contains(text(),'Upload')]")
	@FindBy(xpath = "//a[@class='tax_te']")
	private WebElement account_TaxExemptUploadLink;
	
	public WebElement getAccount_TaxExemptUploadLink() {
		return account_TaxExemptUploadLink;
	}
	
	//taxexempt form close button 
	@FindBy(xpath = "//button[@class ='close']")
	private WebElement account_TaxExemptCloseBtn;
	public WebElement getAccount_TaxExemptCloseBtn() {
		return account_TaxExemptCloseBtn;
	}
	
	//@FindBy(xpath = "//a[contains(text(),' compliance@dollardays.com')] [@href='mailto:?subject=Tax exempt certificate!']") 
	  @FindBy(xpath = "//a[@class='tax-exempt-a']")
	private WebElement account_TaxExemptComplianceLink;
	public WebElement getAccount_TaxExemptComplianceLink() {
		return account_TaxExemptComplianceLink;
	}
	
	/*@FindBy(xpath = "//input[@id='ctl00_cphContent_txtdocument']")
	private WebElement account_TaxExemptdocumentName;
	public WebElement getAccount_TaxExemptdocumentName() {
		return account_TaxExemptdocumentName;
	}
	
	@FindBy(xpath = "//input[@name='txttaxid']")
	private WebElement account_TaxExemptTaxid;
	public WebElement getAccount_TaxExemptTaxid() {
		return account_TaxExemptTaxid;
	}
	
	@FindBy(xpath ="//input[@name='ctl00$cphContent$txtEndDate']")
	private WebElement account_ExpiryDate;
	
	public WebElement getAccount_ExpiryDate() {
		return account_ExpiryDate;
	}
	
	@FindBy(xpath = "//select[@id='ddlstate']")
	private WebElement account_TaxExemptStatedropdown;
	public WebElement getAccount_TaxExemptStatedropdown() {
		return account_TaxExemptStatedropdown;
	}
	
	@FindBy(xpath = "//input[@id='ctl00_cphContent_fUpLoad']")
	private WebElement account_TaxExemptfileUploadBtn;
	public WebElement getAccount_TaxExemptfileUploadBtn() {
		return account_TaxExemptfileUploadBtn;
	}
	
	@FindBy(xpath ="//input[@value='Upload']")
	private WebElement account_TaxExemptUploadBtn;
	public WebElement getAccount_TaxExemptUploadBtn() {
		return account_TaxExemptUploadBtn;
	}
	
	@FindBy(xpath = "//button[@class ='close']")
	private WebElement account_TaxExemptCloseBtn;
	public WebElement getAccount_TaxExemptCloseBtn() {
		return account_TaxExemptCloseBtn;
	}
	
	/*@FindBy(xpath="//label[text()='Choose file']")
	private WebElement chooseFileLabel;

	public WebElement getchooseFileLabel() {
		return chooseFileLabel;
	}
	
	@FindBy(xpath = "//label[text()='Choose file']")
	private WebElement account_ChooseFileBtn;
	public WebElement getaccount_ChooseFileBtn() {
		return account_ChooseFileBtn;
	}
	
	public WebElement tax_ExemptSuccessMsg()
	{
		WebElement tax_ExemptSuccessMsg = driver.findElement(By.cssSelector("p.success-msg"));
		return tax_ExemptSuccessMsg;
	}
	
	
	public WebElement returnErrormsg() {
	 WebElement errormsg = driver.findElement(By.cssSelector("p.notify_error"));
	 return errormsg;
	}
	
	@FindBy(xpath="//*[@id=\"tax_te_modal\"]/div/div/div[1]/button")
	private WebElement homePopup_Close;
	public WebElement gethomePopup_Close() {
		return homePopup_Close;
	}*/
	
	
	public void LoginInfoEditLink() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable((account_LoginInfoEditLink)));
		getAccount_LoginInfoEditLink().click();
	}
	public boolean Verify_LoginInfoEditLink()
       {
		return account_LoginInfoEditLink.isDisplayed();
       }
	
	
	public void PersonalInfoEditLink() {
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.elementToBeClickable(( account_PersonalInfoEditLink)));
			getAccount_PersonalInfoEditLink().click();
		}
	public boolean Verify_PersonalInfoEditLink(){
			return account_PersonalInfoEditLink.isDisplayed();
	}
	
	public void DefaultToShipEditLink() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable((account_DefaultToShipEditLink)));
		getAccount_DefaultToShipEditLink().click();
	}
    public boolean Verify_DefaultToShipEditLink(){
		return account_PersonalInfoEditLink.isDisplayed();
}
	
    
    public void DefaultPaymentMethodEditLink() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable((account_DefaultPaymentMethodEditLink)));
		getAccount_DefaultPaymentMethodEditLink().click();
	}
    public boolean Verify_DefaultPaymentMethodEditLink(){
		return account_DefaultPaymentMethodEditLink.isDisplayed();
}
	
    public void TaxExemptEditLink() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable((account_TaxExemptEditLink)));
		 getAccount_TaxExemptEditLink().click();
	}
    public boolean Verify_TaxExemptEditLink(){
		return account_TaxExemptEditLink.isDisplayed();
    }
		

	public void TaxExemptUploadLink() {
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.elementToBeClickable((account_TaxExemptUploadLink)));
			getAccount_TaxExemptUploadLink().click();
		}
	    public boolean Verify_TaxExemptUploadLink(){
			return account_TaxExemptUploadLink.isDisplayed();
	    }
	    
	    public void TaxExemptComplianceLink() {
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.elementToBeClickable((account_TaxExemptComplianceLink)));
			 getAccount_TaxExemptComplianceLink().click();
		}
	    public boolean Verify_TaxExemptComplianceLink(){
			return account_TaxExemptComplianceLink.isDisplayed();
	    }
	    
	    public void LogOutLink() {
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.elementToBeClickable((LogOutLink)));
			getLogOutLink().click();
		}
	    public boolean Verify_LogOutLink(){
			return LogOutLink.isDisplayed();
	    }

		
  }
