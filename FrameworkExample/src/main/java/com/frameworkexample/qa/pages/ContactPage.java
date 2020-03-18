package com.frameworkexample.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {

	WebDriver driver;
	public static final String GENDER_MALE = "M";
	public static final String GENDER_FEMALE = "F";

	public ContactPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement firstname;

	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement lastname;

	@FindBy(xpath = "//input[@name='email']")
	private WebElement email;

	@FindBy(xpath = "//input[@name='phone']") // "//input[@class='form-control
												// ng-pristine ng-invalid
												// ng-invalid-required
												// ng-valid-pattern
												// ng-touched']")
	private WebElement phone;

	@FindBy(xpath = "//input[@name='address']")
	private WebElement address;

	@FindBy(xpath = "//input[@name='city']")
	private WebElement city;

	@FindBy(xpath = "//select[@name='state']")
	private WebElement state;

	@FindBy(xpath = "//input[@name='zip']")
	private WebElement zip;

	@FindBy(xpath = "//input[@name='website']")
	private WebElement website;

	@FindBy(xpath = "//div[@class='radio']/label/input[@value='yes']")
	private WebElement hostingyes;

	@FindBy(xpath = "//div[@class='radio']/label/input[@value='no']")
	private WebElement hostingno;

	@FindBy(xpath = "//textarea[@name='comment']")
	private WebElement projectdesc;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submit;

	public void setFirstName(String firstN) {
		firstname.sendKeys(firstN);
	}

	public void setLastName(String lastN) {
		lastname.sendKeys(lastN);
	}

	public void setAddress(String addre) {
		address.sendKeys(addre);
	}

	public void setEmail(String maillid) {
		email.sendKeys(maillid);
	}

	public void setPhone(String phoneno) {
		phone.sendKeys(phoneno);
	}

	public void setCity(String cityname) {
		city.sendKeys(cityname);
	}

	public WebElement elementState()
	{
		return state;
	}

	public void setZip(String zipcode) {
		zip.sendKeys(zipcode);
	}

	public void setWebsite(String websitename) {
		website.sendKeys(websitename);
	}
	public void setprojectDesc(String projectdetails) {
		projectdesc.sendKeys(projectdetails);
	}
	public void clickHostingYes() {
		hostingyes.click();
	}

	public void clickHostingNo() {
		hostingno.click();
	}

	public void clickSubmit() {
		submit.click();
	}

	/*public void setGender(String gender) {
		if (GENDER_MALE.equalsIgnoreCase(gender)) {
			radiomale.click();
		} else {
			radiofemale.click();
		}
	}*/
}
