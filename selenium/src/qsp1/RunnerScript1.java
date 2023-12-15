package qsp1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RunnerScript1 extends GenericScript 
{
	@Test
	public void validLogin()
	{
		driver.get("https://www.instagram.com");
		driver.findElement(By.name("username")).sendKeys("admin");
	}
	
	@Test
	public void Login()
	{
		driver.get("https://amazon.com");
		
		  
	}
	}
	
