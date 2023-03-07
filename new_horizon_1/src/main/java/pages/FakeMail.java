package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FakeMail extends BasePage {
	
	WebDriver driver;
	@FindBy(id="click-to-refresh")
	WebElement refresh;
	
	@FindBy(xpath="//span[@title='pratititech.smtp@gmail.com']")
	WebElement otp;
	
	public FakeMail(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void getMail( WebElement otp) {
		refresh.click();
		otp.click();
	}
	
}
