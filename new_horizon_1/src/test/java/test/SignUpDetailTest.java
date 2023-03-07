package test;

import org.testng.annotations.Test;

import pages.SignUpDetail;

public class SignUpDetailTest extends BaseTest {
	@Test
	public void verifySignUpDetail( String pass, String firsName, String lastName) throws InterruptedException {	
		signUpDetail.signUpDetailEnter(pass, lastName, lastName);
		
	}
	
}
