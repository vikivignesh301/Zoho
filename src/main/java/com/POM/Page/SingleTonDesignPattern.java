package com.POM.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SingleTonDesignPattern {

	public static WebDriver driver;

	public SingleTonDesignPattern(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public Login_Page getlogin_Page() {
		Login_Page lp = new Login_Page(driver);
		return lp;
	}

	public SignUp_Page getSignUp_Page() {
		SignUp_Page sp = new SignUp_Page(driver);
		return sp;
	}

}
