package test;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends BaseTest{
	@Parameters({"userid","userpassword"})

	@Test
	public void verifyLogin(String username,String password)
	{
	loginPage.loginToApplication(username, password);
		String expectedTitle="New Horizon";
		String actualTitle=cmndriver.pageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		

}}
