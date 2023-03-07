package pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpDetail extends BasePage{
	WebDriver driver;
	
	@FindBy(id="outlined-adornment-password")
	WebElement password;
	
	@FindBy(id="firstname")
	WebElement firstname;
	
	@FindBy(id="lastname")
	WebElement lastname;
	
	 @FindBy(xpath="//button[@style='padding: 5px 12px;']//following-sibling::*")
	 WebElement refresh;
	 
	 @FindBy(xpath="//div[@class='box']")
	 WebElement otp;

	
	public SignUpDetail(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		this.driver =driver;
	}
	
	public void signUpDetailEnter(String pass,String firstName,String lastName) throws InterruptedException {
		// to switch again to mail generator
	       ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		 driver.switchTo().window(newTb.get(1));
		 System.out.println(driver.getTitle());
		 Thread.sleep(5000);
		 refresh.click();
		 Thread.sleep(20000);
		 
		 // to copy paste otp from email template
	      Actions action=new Actions(driver);
		 action.moveToElement(otp).doubleClick().build().perform();
		 Thread.sleep(5000);
		 driver.switchTo().window(newTb.get(0));
		 Thread.sleep(5000);
		password.sendKeys(pass);
		firstname.sendKeys(firstName);
		lastname.sendKeys(lastName);
	}

}
