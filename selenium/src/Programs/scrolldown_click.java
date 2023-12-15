package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scrolldown_click{
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver","./softwres/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.amazon.in/");
			Thread.sleep(2000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebElement help = driver.findElement(By.xpath("//a[text()='Brazil']"));
			Point loc=help.getLocation();
			int x=loc.getX();
			int y=loc.getY();
			js.executeScript("window.scrollBy("+x+","+y+")");
			
			

	}

}
