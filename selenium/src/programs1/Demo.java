package programs1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void test1()
	{
		Reporter.log("hello",true);
	}
	@Test
	public void test2()
	{
		Reporter.log("india",true);
	}
}

