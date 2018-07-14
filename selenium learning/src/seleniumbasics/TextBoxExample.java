package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextBoxExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D://DEVIBALA//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("a.armstrong143@gmail.com");	
		Thread.sleep(3000);
		
		WebElement apend=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input"));
		apend.sendKeys("123");
		
		WebElement clear=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div/div/input"));
		clear.clear();
		
		
		
		
		
		
		
		
	

	}

}
