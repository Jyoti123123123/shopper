package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class data_inside_textfield {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver","./softwres/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("file:///C:/Users/admin/Desktop/textfield.html");
			Thread.sleep(2000);
			driver.findElement(By.tagName("input")).sendKeys("Hi");
		}

	}


