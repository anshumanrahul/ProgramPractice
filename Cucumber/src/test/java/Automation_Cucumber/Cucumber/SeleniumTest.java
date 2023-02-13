package Automation_Cucumber.Cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class SeleniumTest {
	
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Launch the Online Store Website

        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
        
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        
        WebElement Actual=driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[1]/h1"));
        System.out.println(Actual.getText());
        
        driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
        System.out.println("Successfully Logged out");
        
        
        driver.quit();
       
        
        
		
		

	}

}
