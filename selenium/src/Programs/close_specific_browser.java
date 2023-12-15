package Programs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class close_specific_browser {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver","./softwres/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://skpatro.github.io/demo/links");
			Thread.sleep(2000);
			driver.findElement(By.name("NewWindow")).click();
			Thread.sleep(2000);
			String p_id = driver.getWindowHandle();
			Set<String> allwh = driver.getWindowHandles();
			System.out.println(allwh.size());
			allwh.remove(p_id);
			System.out.println(allwh.size());
			for (String wh : allwh) {
				driver.switchTo().window(wh);
				String title = driver.getTitle();
				Thread.sleep(2000);
				if(title.equals("About me_qavalidation"));
				{
				driver.close();
				
			}

	}
		}
}
