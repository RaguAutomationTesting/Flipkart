package org.practice;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class makemytrip1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://www.makemytrip.com/flight/search?itinerary=DEL-BLR-22/09/2024&tripType=O&paxType=A-1_C-0_I-0&intl=false&cabinClass=E&ccde=IN&lang=eng");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		List<WebElement> fliname = driver.findElements(By.xpath("//p[@class='boldFont blackText airlineName']"));

		List<WebElement> fliprice = driver.findElements(By.xpath("//span[@class=' fontSize18 blackFont']"));

		Map<String, String> mp = new HashMap<String, String>();
		
		for (int i = 0; i < fliname.size(); i++) {
			mp.put(fliname.get(i).getText(), fliprice.get(i).getText());
			
		}
		
		Set<Entry<String, String>> entrySet = mp.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey()+"  :  "+entry.getValue());
			
		}
		
		driver.quit();

	}

}
