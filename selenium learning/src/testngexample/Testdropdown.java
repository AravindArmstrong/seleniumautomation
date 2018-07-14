package testngexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Testdropdown {
	@Test
	public void testdrop(){
		System.setProperty("webdriver.chrome.driver", "D://DEVIBALA//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		WebElement dropdown1=driver.findElement(By.id("dropdown1"));
		Select firstdropdown=new Select(dropdown1);
		firstdropdown.selectByValue("4");
		firstdropdown.selectByVisibleText("Selenium");
		firstdropdown.selectByIndex(0);	
	}

}
