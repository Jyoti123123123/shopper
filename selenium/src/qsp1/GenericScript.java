package qsp1;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	public class GenericScript {
    public WebDriver driver;
		@BeforeMethod
		public void openAppln()
		{
			System.setProperty("webdriver.gecko.driver","./softwres/geckodriver.exe");
					driver=new FirefoxDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
		}
		@AfterMethod
		public void closeAppln()
		{
			driver.close();
			
		}
		
		
	}


