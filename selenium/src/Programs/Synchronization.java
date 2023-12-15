package Programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Synchronization {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./softwres/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.in");
        driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("jyoti");
		driver.findElement(By.name("login")).click();
		
	//	driver.findElement(By.name("password")).click();
		//driver.findElement(By.xpath("//div[text()='Tasks']")).click();
	//	driver.findElement(By.xpath("//div[text()='Reports']")).click();
	//	driver.findElement(By.xpath("//div[text()='Users']")).click();
	}
}

		
