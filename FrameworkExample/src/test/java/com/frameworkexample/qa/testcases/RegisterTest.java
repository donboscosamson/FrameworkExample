package com.frameworkexample.qa.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.frameworkexample.qa.base.TestBase;
import com.frameworkexample.qa.pages.RegisterPage;

public class RegisterTest extends TestBase {
	RegisterPage rp = null;

	public RegisterTest() {
		super();
		rp = new RegisterPage(driver);
	}
    
	@Test
	public void registrationFormTest() throws InterruptedException {
		System.out.println("Running Test");
//		System.out.println(rp.firstname.getAttribute("type"));
		Thread.sleep(1000);
		rp.setFirstName("Jose");
		rp.setLastName("Nathan");
		rp.setAddress("2323 berkhire");
		rp.setPhone("76746374");
		rp.clickRadioFemale();
		rp.clickMovies();
		rp.setFirstPassword("aaaa");
		rp.setConfirmPassword("aaaa");
		rp.setEmail("test@gmail.com");
		rp.clickSubmit();
		System.out.println("Entered FirstName");
	}

	@AfterTest
	public void tearDown() {
		//driver.quit();

	}

}
