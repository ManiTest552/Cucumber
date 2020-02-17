package com.BaseComponents;

import java.awt.Window;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;



import org.apache.log4j.Logger;
  import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Namrata
 * 
 *         This page provides generic definition of frequently used methods
 *
 */

public class Base_Class {

	 
	 final static Logger logger = Logger.getLogger(Base_Class.class);
	 public static WebDriver driver = null;


	 
	public static void openChrome_URL(String URL)
	{

	    try{

	    System.setProperty("webdriver.chrome.driver", "C:\\Inovar_Projects\\Microwave\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(URL);
	    }catch(Exception E)

	    {
	        E.printStackTrace();


	    }
	}
	public    void chromedriver(String url) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Inovar_Projects\\Microwave\\chromedriver.exe");
	 	 driver=new ChromeDriver();
	 		driver.manage().window().maximize();
	 		driver.get(url);
	 		
	 		 
	}

	public void click(By locator) {
		WebElement element = driver.findElement(locator);
		element.click();
	}

	public void enterText(By locator, String text) {
		WebElement element = driver.findElement(locator);
		element.sendKeys(text);
	}

	public WebElement explicitWait(By locator) {
		return new WebDriverWait(driver, 70).until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public void explicitWaitClickable(By locator) {
		new WebDriverWait(driver, 70).until(ExpectedConditions.elementToBeClickable(locator)).click();
	}

	public void explicitWaitVisibility(By locator) {
		new WebDriverWait(driver, 70).until(ExpectedConditions.visibilityOfElementLocated(locator)).click();
	}
	
	public void explicitWaitForHiddenElements(By locator) {
		new WebDriverWait(driver, 70).until(ExpectedConditions.invisibilityOfElementLocated(locator));
	}

	public Timeouts implicitWait() {
		return driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public Timeouts implicitWait(int sec) {
		return driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}

	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}

	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	}
	
	public void scrollDownBy() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500);");
	}
	
	public void scrollUpBy() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(500, 0);");
	}
	
	public void scrollUp() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
	}

	public void sleep(long sec) {
		try {
			Thread.sleep(sec);
		} catch (InterruptedException e) {
			 logger.error(e.getMessage());
		}
	}
	
	public void select(String Value, By locator)
	{
		WebElement element= driver.findElement(locator);
		Select s= new Select(element);
		element.click();
		s.selectByValue(Value);
		sleep(5000l);
	}
	
	public void select(By locator, String VisibleText)
	{
		WebElement element= driver.findElement(locator);
		Select s= new Select(element);
		element.click();
		s.selectByVisibleText(VisibleText);
		sleep(50000);
	}
	
	public void selectOnWait(By locator, String VisibleText)
	{
		WebElement element= driver.findElement(locator);
		Select s= new Select(element);
		explicitWaitVisibility(locator);
		element.click();	
		s.selectByVisibleText(VisibleText);
		sleep(20000);
	}
	
	public void selectExecutor(By locator, String VisibleText)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('taxons-list').click();");
		WebElement element= driver.findElement(locator);
		Select s= new Select(element);
		element.click();
		s.selectByVisibleText(VisibleText);
		sleep(50000);
	}
	
	public void select(By locator, int Index)
	{
		WebElement element= driver.findElement(locator);
		Select s= new Select(element);
		element.click();
		s.selectByIndex(Index);
	}

	public void datepicker(By locator1, By locator2) {
		WebElement element= driver.findElement(locator1);
		element.click();
		List <WebElement> allDates = driver.findElements(locator2);
		for(WebElement wb : allDates) {
			String date= wb.getText();
			if(date.equalsIgnoreCase(date)) {
				wb.click();
				break;
			}
		}
	}
	
	public boolean exists(By locator)
	{
		try { 
			return driver.findElement(locator).isDisplayed();
			
		}catch(Exception e) {
			 logger.error("Locator not found "+e.getMessage());
		}
		
		return false;
	}
	
	public static void email_report() {
		Properties props = new Properties();
		 
		// this will set host of server- you can change based on your requirement 
		props.put("mail.smtp.host", "smtp.gmail.com");
 
		// set the port of socket factory 
		props.put("mail.smtp.socketFactory.port", "465");
 
		// set socket factory
		props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
 
		// set the authentication to true
		props.put("mail.smtp.auth", "true");
 
		// set the port of SMTP server
		props.put("mail.smtp.port", "465");
 
		// This will handle the complete authentication
		Session session = Session.getDefaultInstance(props,
 
				new javax.mail.Authenticator() {
 
					protected PasswordAuthentication getPasswordAuthentication() {
 
					return new PasswordAuthentication("add your email", "add your password");
 
					}
 
				});
 
		try {
 
			// Create object of MimeMessage class
			Message message = new MimeMessage(session);
 
			// Set the from address
			message.setFrom(new InternetAddress("suryatalabathula7@gmail.com"));
 
			// Set the recipient address
			message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("suryatalabathula7@gmail.com"));
            
                        // Add the subject link
			message.setSubject("Auto generateed Mail ");
 
			// Create object to add multimedia type content
			BodyPart messageBodyPart1 = new MimeBodyPart();
 
			// Set the body of email
			messageBodyPart1.setText("Microwave Automgenrated email html reports");
 
			// Create another object to add another content
			MimeBodyPart messageBodyPart2 = new MimeBodyPart();
 
			// Mention the file which you want to send
			String filename = "C:\\Inovar_Projects\\Cucumber_Automatin\\target\\cucumber-reports\\cucumber-html-reports\\feature-overview.html";
 
			// Create data source and pass the filename
			DataSource source = new FileDataSource(filename);
 
			// set the handler
			messageBodyPart2.setDataHandler(new DataHandler(source));
 
			// set the file
			messageBodyPart2.setFileName(filename);
 
			// Create object of MimeMultipart class
			Multipart multipart = new MimeMultipart();
 
			// add body part 1
			multipart.addBodyPart(messageBodyPart2);
 
			// add body part 2
			multipart.addBodyPart(messageBodyPart1);
 
			// set the content
			message.setContent(multipart);
 
			// finally send the email
			Transport.send(message);
 
			System.out.println("=====Email Sent=====");
 
		} catch (MessagingException e) {
 
			throw new RuntimeException(e);
 
		}
 
	}
 
}
