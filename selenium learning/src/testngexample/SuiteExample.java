package testngexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {
	WebDriver driver;
	
	@BeforeSuite
	public void setup(){
		System.setProperty("webdriver.chrome.driver","D://DEVIBALA//chromedriver_win32//chromedriver.exe");
		 driver=new  ChromeDriver();
		
	}
	@AfterSuite
	 public void teardown(){
		 driver.quit();
		 
	 }
	
	@Test
	public void bing(){
		
		driver.get("https://www.bing.com/");
		
	}
	
	@Test
	public void google(){
		
		driver.get("http://www.google.co.in");
		
	}
	@Test
	public void yahoo(){
		
		driver.get("https://in.yahoo.com/?p=us");	
		
	}
}
