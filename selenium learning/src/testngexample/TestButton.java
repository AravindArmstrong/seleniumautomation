package testngexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestButton {
	@Test
	public void testbutton(){
		System.setProperty("webdriver.chrome.driver", "D://DEVIBALA//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		WebElement button=driver.findElement(By.id("home"));
		button.click();
		WebElement button1=driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[1]/a"));
		button1.click();
		driver.quit();

	}

}
