package test;

import java.awt.AWTException;

import javax.lang.model.element.Element;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import implimentation.elementControl.ElementControl;
import pages.SignUp;

public class SignUpTest extends BaseTest{
	
//	@Parameters({"enterEmail"})
	@Test
	public void enterEmail() throws InterruptedException, AWTException{
		
		signUp.enterEmail();
	}

}
