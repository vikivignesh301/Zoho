package com.POM.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public static WebDriver driver;

	@FindBy(xpath = "//input[@type='email']")
	private WebElement userName;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;

	@FindBy(xpath = "//span[@class='unchecked']")
	private WebElement checkButton;

	@FindBy(xpath = "//input[@onclick='return zSignupPrevent();']")
	private WebElement sighUp;

	public Login_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getCheckButton() {
		return checkButton;
	}

	public WebElement getSighUp() {
		return sighUp;
	}

}
