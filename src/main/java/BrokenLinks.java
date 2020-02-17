import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinks {
	 
		public static void main(String[] args) 
		{
			
			System.setProperty("webdriver.chrome.driver", "C:\\Inovar_Projects\\Microwave\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://ten24:40Blue96@www.monat.ten24dev.com/");
		 
			
			List<WebElement> links=driver.findElements(By.tagName("a"));
			
			System.out.println("Total links are "+links.size());
			
			for(int i=0;i<links.size();i++)
			{
				
				WebElement ele= links.get(i);
				
				String url=ele.getAttribute("href");
				
				verifyLinkActive(url);
				
			}
			
		}
		
		public static void verifyLinkActive(String linkUrl)
		{
	        try 
	        {
	           URL url = new URL(linkUrl);
	           
	           HttpsURLConnection httpURLConnect=(HttpsURLConnection)url.openConnection();
	           
	           httpURLConnect.setConnectTimeout(1000);
	           
	           httpURLConnect.connect();
	           
	           if(httpURLConnect.getResponseCode()==200)
	           {
	               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
	            }
	          if(httpURLConnect.getResponseCode()==HttpsURLConnection.HTTP_NOT_FOUND)  
	           {
	               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpsURLConnection.HTTP_NOT_FOUND);
	            }
	        } catch (Exception e) {
	           
	        }
	    } 
		
		
}
