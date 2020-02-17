import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class MonatTest {

	
	@Test
	public void login() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Inovar_Projects\\Microwave\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		driver.get("https://ten24:40Blue96@www.monatstaging.ten24dev.com/");
	 //C:\Program Files\Java\jre1.8.0_221
	}
	
	
	
}
