package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.yaml.snakeyaml.events.Event.ID;

public class Googlechrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:/DEVIBALA/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("http://www.google.co.in");

WebElement searchbox=driver.findElement(By.name("q"));
searchbox.sendKeys("hello");

}
}