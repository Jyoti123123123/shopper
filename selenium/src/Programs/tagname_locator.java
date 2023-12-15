package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tagname_locator {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver","./softwres/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("file:///C:/Users/admin/Desktop/tagname%20locator.html");
			Thread.sleep(2000);
			driver.findElement(By.tagName("a")).click();
			
		}

	}

