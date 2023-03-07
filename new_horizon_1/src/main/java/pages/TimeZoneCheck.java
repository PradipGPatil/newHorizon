package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class TimeZoneCheck extends LoginPage {
	
	WebDriver driver;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div/div[2]/div/button")
	WebElement schedule;
	@FindBy(xpath="//input[@value='Australia/Sydney (UTC+11:00)']")
	WebElement sydney;
	
	//WebElement schedule=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/button"));
	
	public TimeZoneCheck( WebDriver driver) {
		super(driver);
		
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	public void timeZoneCheck() throws InterruptedException {
		Thread.sleep(10000);

		schedule.click();
		Thread.sleep(10000);
		//driver.switchTo().
		//sydney.click();
		//Thread.sleep(10000);
		
		
		
	}
}
