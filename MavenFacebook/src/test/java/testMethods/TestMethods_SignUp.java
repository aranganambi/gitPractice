package testMethods;

import POM.Account_Signup_POM;
import baseClass.Base_Class;

public class TestMethods_SignUp extends Base_Class{

	public static void browserLaunch() throws Throwable {
		try {
			browser_Launch();
			maximize();
			
			properties();
			get_Url(url);
			waitimp();
			//get_Url("https://www.facebook.com/");
			screenshot();
			System.out.println("Chrome Launched Successfully");			
		} catch (Exception e) {
			System.out.println("Chrome Launch Failed");
		}
   	}
	public static void signUp() {
		Account_Signup_POM sign_Up = new Account_Signup_POM(driver);
		try {
			clicks(sign_Up.getCreateNewAccountButton());
			input_Value(sign_Up.getFirstName(), "vinoth");
			input_Value(sign_Up.getLastName(), lastName);
			input_Value(sign_Up.getEmail(), email);
			input_Value(sign_Up.getRenteremail(), email);
			input_Value(sign_Up.getPassword(), password);
			drop(sign_Up.getDay(), "20");
			drop1(sign_Up.getMonth(), 4);
			drop(sign_Up.getYear(), "1996");
			clicks(sign_Up.getMaleRadioButton());
			clicks(sign_Up.getSignUpButton());
			System.out.println("Sign Up Completed ");
			clicks(sign_Up.getDont_Create_New_Account());
		
		} catch (Exception e) {
			System.out.println("Sign Up Failed");
		}
	}
}
