package com.frameworkexample.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class RegisterPage  {

	WebDriver driver;
	public static final String GENDER_MALE="M";
	public static final String GENDER_FEMALE="F";

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@placeholder='First Name']")
	private WebElement  firstname;

	@FindBy(xpath = "//input[@placeholder='Last Name']")
	private WebElement  lastname;

	@FindBy(xpath ="//div/textarea[@ng-model='Adress']")// "//textarea[@class='form-control ng-pristine ng-valid ng-touched']")
	private WebElement  address;

	@FindBy(xpath = "//input[@class='form-control ng-pristine ng-valid-email ng-invalid ng-invalid-required ng-touched']")
	private WebElement  email;

	@FindBy(xpath = "//div/input[@ng-model='Phone']") //"//input[@class='form-control ng-pristine ng-invalid ng-invalid-required ng-valid-pattern ng-touched']")
	private WebElement  phone;

	@FindBy(xpath = "//input[@id='firstpassword']")
	private WebElement  firstpassword;

	@FindBy(xpath = "//input[@id='secondpassword']")
	private WebElement  secondpassword;

	@FindBy(xpath = "//div[5]/div[1]/label/input[@value='Male']")
	private WebElement  radiomale;

	@FindBy(xpath = "//div[5]/div[1]/label/input[@value='FeMale']")
	private WebElement  radiofemale;

	@FindBy(xpath = "//input[@type='checkbox'][@id='checkbox1']")
	private WebElement  cricket;

	@FindBy(xpath = "//input[@type='checkbox'][@id='checkbox2']")
	private WebElement  movies;

	@FindBy(xpath = "//input[@type='checkbox'][@id='checkbox3']")
	private WebElement  hockey;

	@FindBy(xpath = "//div[@id='msdd']")
	private WebElement  language;

	@FindBy(xpath = "//select[@id='Skills']")
	private WebElement  skills;

	@FindBy(xpath = "//select[@id='countries']")
	private WebElement  country;
	
	@FindBy(xpath = "//button[@id='submitbtn']")
	private WebElement  submit;

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

	public void setFirstPassword(String password1) {
		firstpassword.sendKeys(password1);
	}

	public void setConfirmPassword(String password2) {
		secondpassword.sendKeys(password2);
	}

	public void clickRadioMale() {
		radiomale.click();
	}

	public void clickRadioFemale() {
		radiofemale.click();
	}
	public void clickCricket()
	{
		cricket.click();
	}
	public void clickMovies()
	{
		movies.click();
	}
	public void clickHockey() {
		hockey.click();
	}
    private WebElement  elementLanguage()
    {
    	return language;
    }
    private WebElement  elementskillss()
    {
    	return skills;
    }
    private WebElement  elementcountry()
    {
    	return country;
    }
    public void clickSubmit() {
		submit.click();
	}
    public void setGender(String gender)
    {
    	if(GENDER_MALE.equalsIgnoreCase(gender))
    	{
    		radiomale.click();
    	}else
    	{
    		radiofemale.click();
    	}
    }
}
