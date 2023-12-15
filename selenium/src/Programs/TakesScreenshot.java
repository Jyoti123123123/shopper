package Programs;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakesScreenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver","./softwres/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.faacebook.com");
		Thread.sleep(2000);
		org.openqa.selenium.TakesScreenshot ts=(org.openqa.selenium.TakesScreenshot)driver;
		File src =ts.getScreenshotAs(OutputType.FILE); 
		File dst=new File("C:\\Users\\admin\\Documents\\TakesScreenshot\\act.jpg");
	org.openqa.selenium.io.FileHandler.copy(src,dst);
	}
}
	
