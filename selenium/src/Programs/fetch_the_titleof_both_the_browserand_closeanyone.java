package Programs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fetch_the_titleof_both_the_browserand_closeanyone {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver","./softwres/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://skpatro.github.io/demo/links");
			Thread.sleep(2000);
			driver.findElement(By.name("NewWindow")).click();
			Thread.sleep(2000);
			Set<String> allwh= driver.getWindowHandles();
			System.out.println(allwh.size());
			for (String wh : allwh) {
				driver.switchTo().window(wh);
				System.out.println(driver.getTitle());
				Thread.sleep(2000);
				driver.close();
				
			}

	}

}
