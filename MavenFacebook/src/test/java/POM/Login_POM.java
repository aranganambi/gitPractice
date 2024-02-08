package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_POM {
	
	public WebDriver driver;
	
	@FindBy(id = "email")
	private WebElement username;
	
	public WebElement getUsername() {
		return username;
	}

	public void setUsername(WebElement username) {
		this.username = username;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	public void setLoginbutton(WebElement loginbutton) {
		this.loginbutton = loginbutton;
	}

	@FindBy (id = "pass")
	private WebElement password;
	
	@FindBy (xpath = "//button[@name='login']")
	private WebElement loginbutton;
	
	public Login_POM(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver1, this);
	}

}
