package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream;

public class ButtonExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "D://DEVIBALA//geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("http://www.leafground.com/pages/Button.html");

Thread.sleep(2000);

WebElement button=driver.findElement(By.id("home"));
button.click();
Thread.sleep(4000);
WebElement button1=driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[1]/a"));
button1.click();


Thread.sleep(2000);

driver.quit();

	}

}
