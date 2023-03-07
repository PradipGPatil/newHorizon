package pages;

import org.openqa.selenium.WebDriver;

import implimentation.elementControl.ElementControl;

public class BasePage {
	WebDriver driver;
	ElementControl elementControl;
	
	public BasePage(WebDriver driver) {
		this.driver=driver;
		elementControl=new ElementControl(driver);
	}
	
	

}
