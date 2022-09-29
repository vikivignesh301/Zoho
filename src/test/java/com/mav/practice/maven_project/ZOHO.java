package com.mav.practice.maven_project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mav.practice.Advance_code.XLSX_Reader;

public class ZOHO {
	public static String value;
	public static String value1;

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VIGNESH S\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.zoho.com/login.html");
		driver.manage().window().maximize();
		WebElement signup = driver.findElement(By.xpath("//a[text()='Sign Up Now']"));
		signup.click();
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		value = XLSX_Reader.particlarData("zoho", 1, 0);
		email.sendKeys(value);
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		value1 = XLSX_Reader.particlarData("zoho", 1, 1);
		pass.sendKeys(value1);
		WebElement check_button = driver.findElement(By.xpath("//span[@class='unchecked']"));
		check_button.click();
//		WebElement submit = driver.findElement(By.xpath("//input[@onclick='return zSignupPrevent();']"));
//		submit.click();
//		
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		File destination = new File("C:\\Users\\VIGNESH S\\eclipse-workspace\\ZOHO_PROJECT\\ScreenShot\\zoho.png");
//		FileUtils.copyFile(source, destination);

	}
}
