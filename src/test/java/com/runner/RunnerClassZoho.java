package com.runner;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Property_File.ConfigurationHelper;

import baseClassZoho.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\VIGNESH S\\eclipse-workspace\\ZOHO_PROJECT\\src\\test\\java\\com\\feature\\Zoho.feature", glue = "com.stepdefinition", monochrome = true, plugin = {
		"pretty", "html:Reports/HtmlReport.html", "json:Reports/JsonReport.json", "junit:Reports/XmlReport.xml" })

public class RunnerClassZoho {

	public static WebDriver driver;

	@BeforeClass
	public static void setUp() throws IOException {
		String browser = ConfigurationHelper.getInstance().getBrowser();
		driver = BaseClass.browserLaunch(browser);
		BaseClass.implicitWait();
	}

	@AfterClass
	public static void tearDown() {
		BaseClass.windowClose();
	}

}
