package testCase;

import org.testng.annotations.Test;

import testMethods.TestMethods_SignUp;

public class SignUp_TestCase extends TestMethods_SignUp {

	@Test
	public void sign_Up() throws Throwable {
		browserLaunch();
		signUp();
	}
}
