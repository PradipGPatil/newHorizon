package implimentation.elementControl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementControl {
	WebDriver driver;
	
	public ElementControl(WebDriver driver) {
		this.driver=driver;
	}
	
	public void sendText(WebElement element, String text) {
		element.sendKeys(text);
	}
	
	public void btn_click(WebElement element) {
		element.click();
	}
	
	public String pageTitle() {
		return(driver.getTitle());
	}
}
