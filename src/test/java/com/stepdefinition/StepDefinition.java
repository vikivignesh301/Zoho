package com.stepdefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.POM.Page.Login_Page;
import com.POM.Page.SignUp_Page;
import com.POM.Page.SingleTonDesignPattern;
import com.Property_File.ConfigurationHelper;
import com.mav.practice.Advance_code.XLSX_Reader;
import com.runner.RunnerClassZoho;

import baseClassZoho.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

	public static WebDriver driver = RunnerClassZoho.driver;
	SingleTonDesignPattern st = new SingleTonDesignPattern(driver);

	@Given("user launch The Url")
	public void user_launch_the_url() throws IOException {
		launchUrl(ConfigurationHelper.getInstance().getUrl());
	}

	@When("user Click and Enter The Username")
	public void user_click_and_enter_the_username() throws IOException {
		clickonElement(st.getSignUp_Page().getSignUp());
		userInput(st.getlogin_Page().getUserName(), ConfigurationHelper.getInstance().getUserName());
	}

	@When("click The password To Enter The Password")
	public void click_the_password_to_enter_the_password() throws IOException {
		userInput(st.getlogin_Page().getPassword(),ConfigurationHelper.getInstance().getPassword());
	}

	@When("click The Radio button")
	public void click_the_radio_button() {
		clickonElement(st.getlogin_Page().getCheckButton());
	}

	@Then("click The Login button")
	public void click_the_login_button() throws InterruptedException {
		clickonElement(st.getlogin_Page().getSighUp());
		sleep();
	}

	@Then("validate With Screenshort")
	public void validate_with_screenshort() throws IOException {
		screenShot("zoho");
	}

}
