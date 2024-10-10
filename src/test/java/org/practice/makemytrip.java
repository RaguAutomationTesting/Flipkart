package org.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class makemytrip {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/?srsltid=AfmBOoor4pPim_JwuhWjKRHwJx-0mCCOQMTy5hXSlKyWdnccCfbCxboy");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		WebElement fromcity = driver.findElement(By.id("fromCity"));
		fromcity.click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("New Delhi");
		Thread.sleep(5000);
		List<WebElement> from = driver.findElements(By.xpath("//ul[@role='listbox']//li[@role='option']"));
		from.get(0).click();
		WebElement tocity = driver.findElement(By.id("toCity"));
		tocity.click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Bengaluru");
		Thread.sleep(5000);
		List<WebElement> to = driver.findElements(By.xpath("//ul[@role='listbox']//li[@role='option']"));
		to.get(0).click();
		driver.findElement(By.xpath("//div[@class='DayPicker-Week']//div[@aria-label='Sun Sep 22 2024']")).click();
		driver.findElement(By.xpath("//a[text()='Search']")).click();
	}

}
