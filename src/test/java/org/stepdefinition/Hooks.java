package org.stepdefinition;

import org.openqa.selenium.chrome.ChromeDriver;
import org.utilities.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends BaseClass {
	@Before
	public void beforeScenario() {
		WebDriverManager.chromiumdriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@After
	public void afterScenario() {
		driver.quit();
	}

}
