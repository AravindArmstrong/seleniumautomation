package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D://DEVIBALA//chromedriver_win32//chromedriver.exe");
WebDriver driver=new  ChromeDriver();
driver.get("http://www.leafground.com/pages/Dropdown.html");

Thread.sleep(4000);

WebElement dropdown1=driver.findElement(By.id("dropdown1"));

Select firstdropdown=new Select(dropdown1);
firstdropdown.selectByValue("4");
Thread.sleep(2000);
firstdropdown.selectByVisibleText("Selenium");
Thread.sleep(2000);
firstdropdown.selectByIndex(0);






	}

}
