package testngexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestAll {
	
	
	
	@Test
	public void  testyoutube(){
		System.setProperty("webdriver.chrome.driver", "D://DEVIBALA//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/search?rlz=1C1CHBD_enIN746IN746&ei=rK9BW8X3FovTvwSMkrWABA&q=youtube&oq=youtube&gs_l=psy-ab.12...0.0.0.686869.0.0.0.0.0.0.0.0..0.0....0...1c..64.psy-ab..0.0.0....0.xN7mjT0hiDo");
		driver.findElement(By.className("w7Nvcd ktf std YbqTTb ipG0pPUkhU_s-YQV3zrMHrCg")).click();

	}


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
	@Test
	public void opengoogle(){
		System.setProperty("webdriver.gecko.driver", "D:/DEVIBALA/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.co.in");
	}



}
