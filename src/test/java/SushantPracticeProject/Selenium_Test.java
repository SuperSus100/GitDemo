package SushantPracticeProject;

import org.testng.annotations.Test;

public class Selenium_Test {
	
	@Test
	public void BrowserAutomation()
	{
		System.out.println("BrowserAutomation");
	}
	
	@Test(groups={"Smoke"})
	public void elementsUI()
	{
		System.out.println("elementsUI");
	}

}
