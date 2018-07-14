package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:/DEVIBALA/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
			driver.get("http://google.co.in");
			
			WebElement images=driver.findElement(By.linkText("Images"));
			images.click();
			
			Thread.sleep(3000);
			
		WebElement searchbox=driver.findElement(By.name("q"));
			searchbox.sendKeys("armstrong");
			
			Thread.sleep(3000);
			
			driver.quit();
			
			
			

	}

}
