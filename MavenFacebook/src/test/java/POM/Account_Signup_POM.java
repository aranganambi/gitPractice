package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Account_Signup_POM {
	public WebDriver driver;
	
	@FindBy(xpath = "(//a[@role='button'])[2]")
	private WebElement createNewAccountButton;
	
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getCreateNewAccountButton() {
		return createNewAccountButton;
	}

	public void setCreateNewAccountButton(WebElement createNewAccountButton) {
		this.createNewAccountButton = createNewAccountButton;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(WebElement phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public WebElement getDay() {
		return day;
	}

	public void setDay(WebElement day) {
		this.day = day;
	}

	public WebElement getMonth() {
		return month;
	}

	public void setMonth(WebElement month) {
		this.month = month;
	}

	public WebElement getYear() {
		return year;
	}

	public void setYear(WebElement year) {
		this.year = year;
	}

	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}

	public void setMaleRadioButton(WebElement maleRadioButton) {
		this.maleRadioButton = maleRadioButton;
	}

	public WebElement getSignUpButton() {
		return signUpButton;
	}

	public void setSignUpButton(WebElement signUpButton) {
		this.signUpButton = signUpButton;
	}

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement firstName;
	
	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement lastName;
	
	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement email;
	
	@FindBy(xpath = "(//input[@type='text'])[5]")
	private WebElement renteremail;
	
	public WebElement getRenteremail() {
		return renteremail;
	}

	public void setRenter_email(WebElement renteremail) {
		this.renteremail = renteremail;
	}

	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement phoneNumber;
	
	@FindBy(id = "password_step_input")
	private WebElement password;
	
	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	@FindBy(id = "day")
	private WebElement day;
	
	@FindBy(xpath = "//select[@aria-label='Month']")
	private WebElement month;
	
	@FindBy(id = "year")
	private WebElement year;
	
	@FindBy(xpath = "(//input[@type='radio'])[2]")
	private WebElement maleRadioButton;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement signUpButton;
	
	@FindBy(xpath = "(//a[text()='No, Create New Account'])[1]")
	private WebElement Dont_Create_New_Account;
	
	public WebElement getDont_Create_New_Account() {
		return Dont_Create_New_Account;
	}

	public void setDont_Create_New_Account(WebElement dont_Create_New_Account) {
		Dont_Create_New_Account = dont_Create_New_Account;
	}

	public Account_Signup_POM(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
}
