package testMethods;

import java.io.IOException;
import java.sql.Driver;
import org.openqa.selenium.WebDriver;
import POM.Login_POM;
import baseClass.Base_Class;

public class TestMethodsLogin extends Base_Class {
	
	
	
	public static void browserLaunch() throws Exception{
		
		try {
			browser_Launch();
			maximize();
			properties();
			
			get_Url(url);
			
			//get_Url("https://www.facebook.com/");
			
			
			waitimp();
			
			System.out.println("Browser Launched Successfully");
			
		} catch (Exception e) {
			System.out.println("Browser Launched Fail");
		}
	}
	public static void loginFacebook() {
		Login_POM l = new Login_POM(driver);
	try {
		input_Value(l.getUsername(), userName);
		input_Value(l.getPassword(), password);
		System.out.println("User Entered Credentials Successfully");
		clicks(l.getLoginbutton());
		System.out.println("User Logedin Successfully");
	} catch (Exception e) {
		
	}
	
	
	}
}
