package com.framework.testframework;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import com.testframework.businessClass.SignUp;
import com.testframework.configuration.TestBase;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import junit.framework.Assert;

@Listeners(TestListener.class)
public class AppTest1 extends TestBase {

	AndroidDriver<MobileElement> driver  = null;
	
@Test (priority = 0, description="Invalid Login Scenario with wrong username and password.")
@Severity(SeverityLevel.BLOCKER)
public void Test01_ValidateSignUpScreen()
{	
	Assert.assertTrue(SignUp.ValidateSignInScreen());
	
}

@Test(description="Invalid Login Scenario with wrong username and password")
public void Test02_ValidateSignInScreen()
{	
	Assert.assertTrue(SignUp.ValidateSignInScreen());
				
}

@Test(description="Invalid Login Scenario with wrong username and password")
public void Test03_ValidateHomeScreen()
{	
	Assert.assertTrue(SignUp.ValidateHomeScreen());
				
}

@Test(description="Invalid Login Scenario with wrong username and password")
public void Test02_ValidateLocationScreen()
{	
	Assert.assertTrue(SignUp.ValidateLocationScreen());
				
}

}


