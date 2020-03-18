package com.frameworkexample.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.frameworkexample.qa.base.TestBase;
import com.frameworkexample.qa.pages.ContactPage;
import com.frameworkexample.qa.util.ExcelUtility;

public class ContactTest extends TestBase {
	ContactPage cp = null;

	public ContactTest() {
		super();
		cp = new ContactPage(driver);
	}
	@Test(dataProvider = "ContactData")
	public void registrationFormTest(String firstname,String lastname,String email,String phone,
			String address,String city,String state,String zip,String website,String hosting,
			String projectdesc) throws InterruptedException {
		
//		Thread.sleep(1000);
		cp.setFirstName(firstname);
		cp.setLastName(lastname);
		cp.setEmail(email);
		cp.setPhone(phone);
		cp.setAddress(address);
		cp.setCity(city);
		Select s=new Select(cp.elementState());
		s.selectByVisibleText(state);
		cp.setZip(zip);
		cp.setWebsite(website);
		cp.setHosting(hosting);
		cp.setprojectDesc(projectdesc);
		cp.clickSubmit();
	
	}
	
	@DataProvider(name = "ContactData")
	public Object[][] dataProvider() {
		Object[][] testData = null;
		try {
			testData = ExcelUtility.getData(System.getProperty("user.dir")+"/src/main/java/com/frameworkexample/qa/testdata/ContactTestData.xlsx");
		} catch (IOException e) {

			e.printStackTrace();
		}
		return testData;
	}

	@AfterTest
	public void tearDown() {
		//driver.quit();

	}

}
