package org.utilities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseClass {
	public static WebDriver driver;

	public static void launchUrl(String url) {
		driver.navigate().to(url);
	}

	public static void entertext(WebElement element, String value) {
		element.sendKeys(value);

	}

	public static void clickElement(WebElement element) {
		element.click();

	}

	public static void clickListofWebelement(List<WebElement> list, int index) {
		list.get(index).click();
	}

	public static void impliciltywait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
