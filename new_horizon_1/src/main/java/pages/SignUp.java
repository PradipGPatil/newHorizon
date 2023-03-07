package pages;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import implimentation.commonDriver.CommonDriver;

import org.openqa.selenium.JavascriptExecutor;

public class SignUp extends BasePage {
	 WebDriver driver;
	 
	 @FindBy(linkText="Sign Up")
	 WebElement signUp;
	 
	 @FindBy(tagName="input")
	 WebElement email;
	 
	 @FindBy(tagName="button")
	 WebElement button;
	 
	 @FindBy(id="copbtn")
	 WebElement copy;
	 
	 @FindBy(id="code")
	 WebElement code;
	 
	 @FindBy(xpath="//input[@class='MuiInputBase-input MuiOutlinedInput-input css-1sxenmq']")
	 WebElement signUpEmail;
	 

	 
	 @FindBy(xpath="//button")
	 WebElement next;
	 

	 
	 
	 
	 public SignUp ( WebDriver driver) 
	 {
		 super(driver);
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 

	 
//	 public void signUpClick( WebElement signUp) {
//		 signUp.click();
//		 }

	 public void enterEmail() throws InterruptedException, AWTException {
		 
		 driver.switchTo().newWindow(WindowType.TAB);
			driver.get("https://generator.email/");
			
			//copying element form fake mail genetator
	      Actions action=new Actions(driver);
	      action.moveToElement(copy).click().build().perform();
	       Thread.sleep(5000);
	       ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
	       Thread.sleep(5000);
	       //switch to new horizon
	       driver.switchTo().window(newTb.get(0));
	       System.out.println(driver.getTitle());
	       Thread.sleep(5000);
	       // to copy paste emial in otp filled
	       signUp.click();
	     
	      Robot r=new Robot();
	      r.keyPress(KeyEvent.VK_CONTROL);
	      r.keyPress(KeyEvent.VK_V);
	      r.keyRelease(KeyEvent.VK_CONTROL);
	      r.keyRelease(KeyEvent.VK_V);
	      Thread.sleep(10000);
	      next.click();
//		button.click();
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("https://temp-mail.org/en/");
	//	driver.findElement(By.id("code")).sendKeys(Keys.CONTROL +"t");
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("window.open();");
		

			

			 
			 // need to close javascript popup- manually
//			Alert alert= driver.switchTo().alert();
//			Thread.sleep(4000);
//			alert.dismiss();
			 

			 
			 
	       
	       }
}
	