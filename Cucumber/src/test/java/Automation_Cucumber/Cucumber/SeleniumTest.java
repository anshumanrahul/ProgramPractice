package Automation_Cucumber.Cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	
	public static WebDriver driver=null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAHUL\\Downloads\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		//Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Launch the Online Store Website

        driver.get("https://www.store.demoqa.com");
        
        
		
		

	}

}
