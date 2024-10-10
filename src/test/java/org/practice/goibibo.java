package org.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class goibibo {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();

		WebElement from = driver.findElement(
				By.cssSelector("div[class='sc-12foipm-22 kGtxGm'] div[class='sc-12foipm-2 eTBlJr fswFld ']"));
		from.click();
		from.sendKeys("chennai");

		List<WebElement> listoffli = driver.findElements(By.xpath("//ul[@id='autoSuggest-list']"));
		listoffli.get(0).click();

		WebElement to = driver.findElement(
				By.cssSelector("div[class='sc-12foipm-22 OmQvV'] div[class='sc-12foipm-2 eTBlJr fswFld ']"));
		to.click();
		to.sendKeys("bengaluru");

		List<WebElement> listoffl = driver.findElements(By.xpath("//ul[@id='autoSuggest-list']"));
		listoffl.get(0).click();

		driver.findElement(By.xpath("//span[text()='Departure']")).click();

		driver.findElement(By.xpath(
				"//div[@class='DayPicker-Week']//div[@class='DayPicker-Day DayPicker-Day--start DayPicker-Day--selected']"))
				.click();
		
		driver.findElement(By.xpath("//span[text()='SEARCH FLIGHTS']")).click();

	}

}
