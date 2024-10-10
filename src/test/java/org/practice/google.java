package org.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class google {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement searchbox = driver.findElement(By.id("APjFqb"));
		searchbox.sendKeys("mobile");

		List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@role='listbox']//li[@role='presentation']"));

		for (WebElement webElement : suggestions) {
			System.out.println(webElement.getText());

		}
		driver.quit();

	}
}
