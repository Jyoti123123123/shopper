package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./softwres/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.name("username")).sendKeys("jy.oti7027");
		driver.findElement(By.name("password")).sendKeys("jyoti007");
		driver.findElement(By.name("login")).click();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Instagram"));
	}
}  
