
//Selenium 3 Project For Firefox Using Geckodriver In Java

/*Next, you need to provide the Geckodriver path to the application. For this, you can adapt any of the following three approaches.

1. Use system property to specify the Geckodriver path
2. Add Geckodriver path via the browser’s desired capabilities
3.If you are using  selenium 3.11 version directly run (Firefox) without system property*/


package seleniumPrograms;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class GeckoSetup 
{
	
public static void main(String[] args) 
	{
	// ->1. Use system property to specify the Geckodriver path
		
		/*System.setProperty("webdriver.gecko.driver", "C:\\Users\\deshanr\\Downloads\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");*/
		
	//->2. Add Geckodriver path via the browser’s desired capabilities
		
		/*DesiredCapabilities dc=DesiredCapabilities.firefox();
		dc.setCapability("marionette",true);
		WebDriver driver=new FirefoxDriver(dc);
		driver.get("https://www.facebook.com/");*/
				
		
	//->3. If you are using  selenium 3.11 version directly run (Firefox) without system property
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		
	}
	
}
