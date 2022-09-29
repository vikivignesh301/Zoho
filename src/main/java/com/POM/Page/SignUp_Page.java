package com.POM.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp_Page {
	public static WebDriver driver;

	public SignUp_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Sign Up Now']")
	private WebElement signUp;

	public WebElement getSignUp() {
		return signUp;
	}

}
