package com.juaracoding.appium;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.juaracoding.appium.pages.Calculator;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TestCalculator {

	private AndroidDriver<MobileElement> driver;
	private Calculator calculator;
	
	@BeforeClass
	public void setUP() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "SM-A507FN");
		capabilities.setCapability("uuid", "RR8M901K1TY");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "9.0");
		capabilities.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		capabilities.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
		
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}
	@BeforeMethod
	public void pageObject() {
		calculator = new Calculator(driver);
	}
	@Test
	public void testAdd() {
		calculator.calcAdd();
		System.out.println("Hasil = " + calculator.getTxtResult());
		assertEquals(calculator.getTxtResult(), "3");
	}
	public void testMin() {
		calculator.calcMin();
		System.out.println("Hasil = " + calculator.getTxtResult());
		assertEquals(calculator.getTxtResult(), "1");
	}
	public void testMulti() {
		calculator.calcMulti();
		System.out.println("Hasil = " + calculator.getTxtResult());
		assertEquals(calculator.getTxtResult(), "2");
	}
	public void testDistri() {
		calculator.calcDistri();
		System.out.println("Hasil = " + calculator.getTxtResult());
		assertEquals(calculator.getTxtResult(), "2");
	}
	
	@AfterClass
	public void closeApp() {
		driver.quit();
	}
}
