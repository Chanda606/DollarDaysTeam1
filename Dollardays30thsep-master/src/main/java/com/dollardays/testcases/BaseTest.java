package com.dollardays.testcases;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.dollardays.listners.ExtentReport;

public class BaseTest {

	public WebDriver driver = null;
	public Properties props = null;
	public FileInputStream fileInputStream = null;
	
	public void readPropertyData() throws Exception {

		props = new Properties();

		try {

			fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/application.proerties");
			//User.dir is used to specify the path of the User directory which the user is currently using.
			props.load(fileInputStream);

		} catch (Exception e) {
			throw new Exception("Property file is not found");
		}

	}

	public void openBrowser() throws Exception {
		try {

			switch (props.getProperty("driver")) {

			case "firefox":
				FirefoxProfile customProfile = new FirefoxProfile();
				customProfile.setPreference("dom.disable_beforeunload", true);

				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//src//geckodriver.exe");
				driver = new FirefoxDriver(customProfile);
				Thread.sleep(1000);
				driver.manage().window().maximize();
				break;

			case "chromeDriver":
				
				System.setProperty("webdriver.chrome.driver",  "/Users/chandaverma/Downloads/Drivers/chromedriver");
				//We arae using options class for initiating the chrome and adding args to handle popups and passing the options class in the driver
				ChromeOptions options  = new ChromeOptions();
				  options.addArguments("enable-popup-blocking");
				driver = new ChromeDriver(options);
				driver.manage().window().maximize();
				break;

			case "IE":
				// IEDriver.ieDriver();
				break;

			default:
				// FirefoxDriver.firefox_launch();
				break;
			}

		} catch (Exception e) {
			throw new Exception("Exception occoured : "+e.getMessage());
		}

		Thread.sleep(1000);

	}

	public void getUrl() {
		try {

			driver.get(props.getProperty("env.baseUrl"));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@BeforeMethod
	public void setUpBrowser() throws Exception {
	
		readPropertyData();
		openBrowser();
		getUrl();
		
	}
	
	
	
	
	@AfterMethod
	public void quit() {
		driver.close();
		driver.quit();
	}
	
	

}