package Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class empty_chromebrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwres/chromedriver.exe");

		WebDriver driver=new ChromeDriver();

	}

}
