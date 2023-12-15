package Programs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class to_clear_thedata {
		public static void main(String[] args) {
			System.setProperty("webdriver.gecko.driver","./softwres/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("file:///C:/Users/admin/Desktop/Javascriptexecutor.html");
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("document.getElementById('a1').value=''");
		}
	}

		