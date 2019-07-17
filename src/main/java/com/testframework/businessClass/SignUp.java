package com.testframework.businessClass;


import com.testframework.configuration.TestBase;
import com.testframework.pages.SignUpPage;

import io.qameta.allure.Attachment;


public class SignUp extends TestBase {
	

	public static boolean ValidateSignUpScreen()
	{
		signupPage.TapOnLaunhSignUpButton();
		signupPage.EnterValidFirstName();
		signupPage.EnterValidLastName();
		//signupPage.EnterValidPhoneNumber();
		signupPage.EnterValidEmail();
		signupPage.EnterValidCreatePassword();
		signupPage.EnterValidConfirmPassword();
		boolean value = signupPage.VerifycontinueButton();
		signupPage.TapOnBackButton();
		return value;
	}
		
	
	public static boolean ValidateSignInScreen()
	{
//		signupPage.TapOnLaunchSignInButton();
//		signupPage.EnterValidEmailAddressForSignIn();
//		signupPage.EnterValidPasswordForSignIn();
//		signupPage.TapOnSignInButtonFromSignInScreen();	
//		boolean value = signupPage.ValidateHomeScreen();
//		return value;
		boolean value = SignUpPage.ValidateViewScreen();
		//System.out.println("Test is PASS");
		return value;
	}
	
	public static boolean ValidateHomeScreen()
	{
//		signupPage.TapOnLaunchSignInButton();
//		signupPage.EnterValidEmailAddressForSignIn();
//		signupPage.EnterValidPasswordForSignIn();
//		signupPage.TapOnSignInButtonFromSignInScreen();	
//		boolean value = signupPage.ValidateHomeScreen();
//		return value;
		boolean value = SignUpPage.ValidateViewScreen();
		//System.out.println("Test is PASS");
		return value;
	}
	
	@Attachment
	public static boolean ValidateLocationScreen()
	{
//		signupPage.TapOnLaunchSignInButton();
//		signupPage.EnterValidEmailAddressForSignIn();
//		signupPage.EnterValidPasswordForSignIn();
//		signupPage.TapOnSignInButtonFromSignInScreen();	
//		boolean value = signupPage.ValidateHomeScreen();
//		return value;
		System.out.println("Test is Fail");
		return false;
	}
		
}
