package com.testframework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testframework.configuration.TestBase;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Step;



public class SignUpPage extends TestBase {
	
	
	WebDriverWait wait;
	SignUpPage signupPage;
	AndroidDriver<MobileElement> driver;
	
	public SignUpPage(AndroidDriver<MobileElement> driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver = (AndroidDriver<MobileElement>) driver;
		wait = new WebDriverWait(driver, 90);
	}

	List<String> list;
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/input_layout_firstName")
	public WebElement FirstNameField;
	
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/lastNameEditText")
	public WebElement LaststNameField;
	
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/phoneNumberEditText")
	public WebElement PhoneNumberField;
	
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/emailEditText")
	public WebElement EmailField;
	
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/passwordEditText")
	public WebElement CreatPasswordField;
	
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/confirmPasswordEditText")
	public WebElement ConfirmPasswordField;
	
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/continueEmailSignUpButton")
	public WebElement continueButton;
	
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/LaunchSignUpButton")
	public WebElement SignUpButtonLaunch;
	
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/LaunchSignInButton")
	public WebElement signInButtonLaunch;
	
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/EmailEditText")
	public WebElement signInEmailField;
	
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/PasswordEditText")
	public WebElement signInPasswordField;
	
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/SignInButton")
	public WebElement signInToAppButton;
	
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/DashboardText")
	public WebElement dashBoardText;
	
	@Step("Tap on Signup Button")
	public void TapOnLaunhSignUpButton()
	{
		wait.until(ExpectedConditions.visibilityOf(SignUpButtonLaunch));
		SignUpButtonLaunch.click();	
	}
	@Step("Tap on Signup Button")
	public void EnterValidFirstName()
	{
		wait.until(ExpectedConditions.visibilityOf(FirstNameField));
		FirstNameField.sendKeys("TestBurger");
		driver.hideKeyboard();
	}
	@Step("Tap on Signup Button")
	public void EnterValidLastName()
	{
		wait.until(ExpectedConditions.visibilityOf(LaststNameField));
		LaststNameField.sendKeys("TestWhata");
		driver.hideKeyboard();
	}
	@Step("Tap on Signup Button")
	public void EnterValidPhoneNumber()
	{
		wait.until(ExpectedConditions.visibilityOf(PhoneNumberField));
		PhoneNumberField.sendKeys("2567636483");
		driver.hideKeyboard();
	}
	@Step("Tap on Signup Button")
	public void EnterValidEmail()
	{
		wait.until(ExpectedConditions.visibilityOf(EmailField));
		EmailField.sendKeys("housewater@gmail.com");
		driver.hideKeyboard();
	}
	@Step("Tap on Signup Button")
	public void EnterValidCreatePassword()
	{
		wait.until(ExpectedConditions.visibilityOf(CreatPasswordField));
		CreatPasswordField.sendKeys("burger01");
		driver.hideKeyboard();
	}
	@Step("Tap on Signup Button")
	public void EnterValidConfirmPassword()
	{
		wait.until(ExpectedConditions.visibilityOf(ConfirmPasswordField));
		ConfirmPasswordField.sendKeys("burger01");	
		driver.hideKeyboard();
	}
	@Step("Tap on Signup Button")
	public boolean VerifycontinueButton()
	{
		wait.until(ExpectedConditions.visibilityOf(continueButton));
		return continueButton.isDisplayed();	
	}
	@Step("Tap on Signup Button")
	public void TapOnLaunchSignInButton()
	{
		wait.until(ExpectedConditions.visibilityOf(signInButtonLaunch));
		continueButton.click();	
	}
	@Step("Tap on Signup Button")
	public void TapOnBackButton()
	{
         driver.navigate().back();
	}
	@Step("Tap on Signup Button")
	public void EnterValidEmailAddressForSignIn()
	{
		wait.until(ExpectedConditions.visibilityOf(signInEmailField));
		signInEmailField.sendKeys("sudhir01pandit@gmail.com");		
	}
	@Step("Tap on Signup Button")
	public void EnterValidPasswordForSignIn()
	{
		wait.until(ExpectedConditions.visibilityOf(signInPasswordField));
		signInPasswordField.sendKeys("Sudhir01");		
	}
	@Step("Tap on Signup Button")
	public void TapOnSignInButtonFromSignInScreen()
	{
		wait.until(ExpectedConditions.visibilityOf(signInToAppButton));
		signInToAppButton.click();	
	}
	@Step("Tap on Signup Button")
	public boolean ValidateHomeScreen()
	{
		wait.until(ExpectedConditions.visibilityOf(dashBoardText));
		return dashBoardText.isDisplayed();	
	}
	@Step("Tap on Signup Button")
	public static boolean ValidateViewScreen()
	{
		System.out.println("True");
		return true;
	}
}
