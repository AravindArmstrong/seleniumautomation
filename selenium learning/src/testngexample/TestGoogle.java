package testngexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestGoogle {
	@Test
	public void testgoogle(){
		System.setProperty("webdriver.chrome.driver", "D://DEVIBALA//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.get("http://www.google.co.in");

		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys("hello");

		
	}

}
