package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebook_login_page {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver","./softwres/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.facebook.com");
			Thread.sleep(2000);
driver.findElement(By.name("email")).sendKeys("jyotisdhge@gmail.com");
driver.findElement(By.name("pass")).sendKeys("jyoti007");
driver.findElement(By.name("login")).click();

	}
}

		
