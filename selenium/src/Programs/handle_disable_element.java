package Programs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class handle_disable_element {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwres/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/admin/Desktop/Javascriptexecutor.html");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(1000);
		js.executeScript("document.getElementById('a1').value='selenium'");
	}
}
