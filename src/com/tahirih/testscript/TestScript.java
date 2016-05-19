package com.tahirih.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestScript {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO 

				// Create firefox driver to open the firefox browser
				
				WebDriver driver = new FirefoxDriver();
				
				// Open Indeed homepage
				
				driver.get("http://www.indeed.com");
				
				// Find what field and enter Selenium
				Thread.sleep(2000);
				driver.findElement(By.id("what")).sendKeys("Selenium");
				
				// Find where field and enter London
				
				driver.findElement(By.id("where")).clear();
				Thread.sleep(2000);
				driver.findElement(By.id("where")).sendKeys("London");
				
				// Find FindJobs button and click on it
				Thread.sleep(2000);
				driver.findElement(By.id("fj")).click();
				
				// From job search result page, get page title and jobs count message
				
				System.out.println(driver.getTitle());
				System.out.println(driver.findElement(By.id("searchCount")).getText());	


	}

}
