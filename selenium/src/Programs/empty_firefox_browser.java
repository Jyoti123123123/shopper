package Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class empty_firefox_browser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./softwres/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	}

}
