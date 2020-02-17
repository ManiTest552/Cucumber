package com.StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.BaseComponents.Base_Class;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

public class Dtat_Driven_Login extends Base_Class {
	
	 

	//WebDriver driver;
	@Test(priority=1)
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Verify login page title test on Login Page")
	@Story("Story Name: To check login page title")
	public void login() {
		
		System.out.println();
	}
	@Given("^When user is at loginpage$")
	@Step("user us at login page")
	public void when_user_is_at_loginpage() throws Throwable {
		
		/*  System.setProperty("webdriver.chrome.driver", "C:\\Inovar_Projects\\Microwave\\chromedriver.exe");
	//	System.setProperty("webdriver.edge.driver","C:\\Softs\\IEDriverServer_x64_3.150.1\\MicrosoftWebDriver (2).exe");
		//log.info(System.getProperty("webdriver.chrome.driver"));
		//driver= new EdgeDriver();
		 driver=new ChromeDriver();
 		driver.manage().window().maximize();
 		driver.get("https://microwaveapp.azurewebsites.net");
 	*/
		Base_Class.openChrome_URL("https://microwaveapp.azurewebsites.net");
 		 Reporter.log("user is already on Login Page");
	     
 		
	}

	
	
	
	
	@When("^user entered \"(.*)\" and \"(.*)\"$")
	@Step("login with username: {0} and password: {1} step...")
	public void user_entered_username_and_password(String username , String password) throws InterruptedException    {

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(username);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Next']")).click();
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		
		Reporter.log("User name entered");
	}

	@Then("^Verify title$")
	@Step("page title verifed")
	public String verify_title() throws InterruptedException {
	     
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='No']")).click();
		
	 
		//Reporter.log("Password entered");
		return driver.getTitle();
		
	}

	@And("^close the driver$")
	@Step("closing the drive")
	public void close_the_driver() throws InterruptedException   {
		
		Thread.sleep(3000);
		String title= driver.findElement(By.xpath("//img[@class='logo']")).getText();
		System.out.println(title);
 		 
		Reporter.log("title verified");
		Reporter.log("Close  browser method execued");
		
		 
		//Base_Class.email_report();
		driver.close();
	}
}
