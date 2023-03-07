package test;

import java.io.IOException;
import java.util.Properties;
import java.util.TimeZone;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import implimentation.commonDriver.CommonDriver;
import pages.FakeMail;
import pages.LoginPage;
import pages.SignUp;
import pages.SignUpDetail;
import pages.TimeZoneCheck;
import utils.ConfigUtils;


public class BaseTest {
	
	String currentWorkingDirectory;
	String configFilePath;
	Properties property;
	String url;
	String browser;
	 CommonDriver cmndriver;
	 WebDriver driver;
	 
	 LoginPage loginPage;
	 SignUp signUp;
	 String mailurl;
	 FakeMail fakemail;
	 String rePass;
	 String pass;
	 SignUpDetail signUpDetail;
	 TimeZoneCheck timezoneCheck;
	
	@BeforeSuite
	public void presetup() throws IOException {
		currentWorkingDirectory=System.getProperty("user.dir");
		configFilePath=currentWorkingDirectory + "\\Test\\test.properties";
		property=ConfigUtils.readProperty(configFilePath);
	}
	
	@BeforeClass
	public void setup() throws Exception {
		 url=property.getProperty("baseUrl");
		 browser=property.getProperty("browserType");
		 mailurl=property.getProperty("mailurl");
		 rePass=property.getProperty("retypepassword");
		 pass=property.getProperty("password");
		 property.getProperty("password");
		 property.getProperty("password");
		 
		 cmndriver= new CommonDriver(browser);
		 driver=cmndriver.getDriver();
		 
		 loginPage=new LoginPage(driver);
		 cmndriver.navigateToUrl(url);
		 signUp=new SignUp(driver);
		 fakemail=new FakeMail(driver);
		 signUpDetail=new SignUpDetail(driver);
		  timezoneCheck=new TimeZoneCheck(driver);
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
