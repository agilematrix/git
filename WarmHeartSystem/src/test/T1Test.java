package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class T1Test {

	String url="http://www.oficedepot.com";
	

	
	//WebDriver driver =new FirefoxDriver();

	//@BeforeTest
	@Test(invocationCount = 4, threadPoolSize = 2)
	public void startBrowser()
	{	
		System.setProperty("webdriver.chrome.driver","C:\\Development\\Selenium\\Drivers\\chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get(url);
		System.out.printf("Thread Id : %s%n", Thread.currentThread().getId());
		System.out.println("PageTitle: " + driver.getTitle());
{
		driver.quit();
}}}



