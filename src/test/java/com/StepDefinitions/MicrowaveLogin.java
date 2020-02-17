package com.StepDefinitions;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MicrowaveLogin {

	WebDriver driver;
	@Given("^user is already on Login Page$")
	public void openurl() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Inovar_Projects\\Microwave\\chromedriver.exe");
		driver=new ChromeDriver();
 		driver.manage().window().maximize();
 		driver.get("https://microwaveapp.azurewebsites.net");
 		
 		 Reporter.log("user is already on Login Page");
	}
	
	@When("^title of login page is Microwave$")
	public void loginpage() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("demomu@TMobMicrowave.onmicrosoft.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Next']")).click();
		
		 
		Reporter.log("User name entered");
	}
	
	@Then("^user enters  username and password$")
	public String enterdata() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("4u2change!");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='No']")).click();
		
	 
		//Reporter.log("Password entered");
		return driver.getTitle();
	}
	
	@Then("^user clicks on login button$")
	public void login() throws InterruptedException {
		
		Thread.sleep(3000);
		String title= driver.findElement(By.xpath("//img[@class='logo']")).getText();
		System.out.println(title);
		
		 
		Reporter.log("title verified");
	}
	
	
	@Then("^user is on home page$")
	public void homepage() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),' + CREATE NEW ')]")).click();
		
		 
		Reporter.log("user is on home page");
	}
	
	@Then("^Close the browser$")
	public void closebrowser() {
		
		
		Reporter.log("Close  browser method execued");
		
		 
		 
		 driver.close();
	}
	
	
	
}
