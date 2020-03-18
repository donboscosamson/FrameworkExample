package com.frameworkexample.qa.testcases;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.frameworkexample.qa.base.TestBase;
import com.frameworkexample.qa.pages.ContactPage;

public class ContactTest extends TestBase {
	ContactPage cp = null;

	public ContactTest() {
		super();
		cp = new ContactPage(driver);
	}
    
	@Test
	public void registrationFormTest() throws InterruptedException {
		System.out.println("Running Test");
//		System.out.println(cp.firstname.getAttribute("type"));
		Thread.sleep(1000);
		cp.setFirstName("Jose");
		cp.setLastName("nathan");
		cp.setEmail("jose@gmail.com");
		cp.setPhone("3223333");
		cp.setAddress("2323hjfhj");
		cp.setCity("nb");
		Select s=new Select(cp.elementState());
		s.selectByVisibleText("New Jersey");
		cp.setZip("08902");
		cp.setWebsite("ddddddd");
		cp.clickHostingYes();
		cp.setprojectDesc("sghfsghsg sdfhsdhfshd");
		//cp.clickSubmit();
		System.out.println("Entered FirstName");
	}

	@AfterTest
	public void tearDown() {
		//driver.quit();

	}

}
