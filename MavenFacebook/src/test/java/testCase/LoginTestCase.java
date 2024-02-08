package testCase;
//


import org.testng.annotations.Test;

import testMethods.TestMethodsLogin;
import testMethods.TestMethodsLogin;

public class LoginTestCase extends TestMethodsLogin {
	
	@Test
	public void login() throws Exception {
		browserLaunch();
		loginFacebook();
		
	}

}
