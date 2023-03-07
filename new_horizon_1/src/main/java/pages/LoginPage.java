package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import implimentation.elementControl.ElementControl;

public class LoginPage extends BasePage{
 
	WebDriver driver;
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="outlined-adornment-password")
	WebElement password;
	
	@FindBy(xpath="//button[contains(@class,'submit-button css-f7pup7')]")
	WebElement buttonClick;
	
	
	public LoginPage (WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	public void loginToApplication(String name, String pass) {
		elementControl.sendText( username,name);
		elementControl.sendText(password, pass);
		elementControl.btn_click(buttonClick);
		
	}

}
