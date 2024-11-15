package org.stepDefenition;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.resuable.Reusable;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Reusable {

	@Before
	public void lanuch() throws InterruptedException {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		wait= new WebDriverWait(driver, Duration.ofSeconds(60));
		driver.get("https://www.fitpeo.com/");
		

	}
    
	
	@After
	public void close() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
