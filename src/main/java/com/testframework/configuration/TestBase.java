package com.testframework.configuration;



import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import com.testframework.pages.SignUpPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.qameta.allure.Attachment;

public class TestBase{
	public static AndroidDriver<MobileElement> driver;
	public static SignUpPage signupPage;

	@BeforeClass
	public void startUp() throws Exception {
		driver= launchAndroidApplication(driver,"appium");
	    signupPage = new SignUpPage(driver);
	}
	public AndroidDriver getDriver() {
        return driver;
    }
	
	public AndroidDriver<MobileElement> launchAndroidApplication(AndroidDriver<MobileElement> driver,String automationName) throws Exception {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, ConfigurationLibrary.deviceName);
		//capabilities.setCapability("automationName",ConfigurationLibrary.automationName);
		capabilities.setCapability("platformName", ConfigurationLibrary.platform_name);
		capabilities.setCapability("platformVersion", ConfigurationLibrary.platform_version);
		capabilities.setCapability("newCommandTimeout", 400);
		capabilities.setCapability("appPackage", ConfigurationLibrary.packageName);
		capabilities.setCapability("appActivity", ConfigurationLibrary.activityName);
//		capabilities.setCapability("setWebContentsDebuggingEnabled", "true");
//	    capabilities.setCapability("noReset","true");
	   
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		return driver;
	}	
}
