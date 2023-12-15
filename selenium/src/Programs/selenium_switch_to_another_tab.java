package Programs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class selenium_switch_to_another_tab {
		public static void main(String[] args) throws InterruptedException, AWTException {
			System.setProperty("webdriver.gecko.driver","./softwres/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.selenium.dev/downloads/");
			Thread.sleep(2000);
			 List<WebElement> l1 = driver.findElements(By.xpath("//li[.='Downloads']|//li[.='Documentation']|//li[.='Projects']"));
			 System.out.println(l1.size());
			 Actions a = new Actions(driver);
			
			 Robot r = new Robot();
			 for(WebElement w:l1)
			 {
				 a.contextClick(w).perform();
				 r.keyPress(KeyEvent.VK_T);
				 r.keyRelease(KeyEvent.VK_T);
			 }
			 Set<String> win = driver.getWindowHandles();
			 ArrayList<String> f = new ArrayList<String>(win);
			 driver.switchTo().window(f.get(2));
			 
			 
		}
		   
			
}
