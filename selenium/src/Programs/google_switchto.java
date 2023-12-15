package Programs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class google_switchto {
		public static void main(String[] args) throws InterruptedException, AWTException {
			System.setProperty("webdriver.gecko.driver","./softwres/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://google.com");
			Thread.sleep(2000);
			 WebElement ele = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
			Actions act=new Actions(driver);
			act.contextClick(ele).perform();
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
			Set<String> allwh = driver.getWindowHandles();
			ArrayList<String> l = new ArrayList<String>(allwh);
			String wh = l.get(1);
			driver.switchTo().window(wh);
			
			

	}       

}
