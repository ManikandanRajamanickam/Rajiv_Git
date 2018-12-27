package git;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Git_Testing {

	WebDriver d;

	@Test
	public void f() throws InterruptedException {

		WebElement search = d.findElement(By.name("q"));
		search.click();

		search.sendKeys("Software testing tutorial");

		Thread.sleep(2000);

		search.sendKeys(Keys.ENTER);

	}

	@BeforeTest
	
	public void beforeTest() {

		try {

			System.setProperty("webdriver.chrome.driver",
					"D:\\1.Server_Backup_files\\Selenium_Drivers\\Latest_Driver\\chromedriver.exe");

			d = new ChromeDriver();

			Thread.sleep(1000);

			d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			Thread.sleep(500);

			d.manage().window().maximize();

			String ip = "http://google.com";

			d.get(ip);

			System.out.println("is working");

		}

		catch (Exception e) {

			System.out.println("isn't working");

		}

	}

	@AfterTest
	public void afterTest() {
	}

}
