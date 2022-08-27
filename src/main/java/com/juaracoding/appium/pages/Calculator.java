package com.juaracoding.appium.pages;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Calculator {
		
		private AndroidDriver<MobileElement> driver;
		
		public Calculator(AndroidDriver<MobileElement> driver) {
			this.driver = driver;
		}
		
		//Locator
		By btnSatu = By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_01");
		By btnDua = By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_02");
		By btnTambah = By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_add");
		By btnSamaDng = By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal");
		By hasil = By.id("com.sec.android.app.popupcalculator:id/calc_edt_formula");
		By btnKurang = By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_sub");
		By btnKali = By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_mul");
		By btnBagi = By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_div");
		/*web: xpath = //taghtml[contains(@attr, value)] */
		
		//Method
		public void calcAdd() {
			driver.findElement(btnSatu).click();
			driver.findElement(btnTambah).click();
			driver.findElement(btnDua).click();
			driver.findElement(btnSamaDng).click();
		}
		
		public void calcMin() {
			driver.findElement(btnDua).click();
			driver.findElement(btnKurang).click();
			driver.findElement(btnSatu).click();
			driver.findElement(btnSamaDng).click();
		}
		public void calcMulti() {
			driver.findElement(btnSatu).click();
			driver.findElement(btnKali).click();
			driver.findElement(btnDua).click();
			driver.findElement(btnSamaDng).click();
		}
		public void calcDistri() {
			driver.findElement(btnDua).click();
			driver.findElement(btnBagi).click();
			driver.findElement(btnSatu).click();
			driver.findElement(btnSamaDng).click();
		}
		
		//
		public String getTxtResult() {
			return driver.findElement(hasil).getText();
		}
}
