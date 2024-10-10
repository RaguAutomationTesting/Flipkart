package org.stepdefinition;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pojoclass.CartPagePojo;
import org.pojoclass.LoginPagePojo;
import org.utilities.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlipkartAddToCartFunctionality extends BaseClass {
	@Given("user launch flipkart application")
	public void user_launch_flipkart_application() {
		impliciltywait();
		launchUrl("https://www.flipkart.com");
		LoginPagePojo l = new LoginPagePojo();

	}

	@When("user search product and add to cart")
	public void user_search_product_and_add_to_cart() {
		LoginPagePojo l = new LoginPagePojo();
		entertext(l.getSearchBar(), "mobile");
		l.getSearchBar().submit();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(25));
		w.until(ExpectedConditions.visibilityOfAllElements(l.getProducts()));
		clickElement(l.getProducts().get(8));

		Set<String> allWindowId = driver.getWindowHandles();
		List<String> li = new ArrayList();
		li.addAll(allWindowId);
		driver.switchTo().window(li.get(1));

		CartPagePojo c = new CartPagePojo();
		Actions a = new Actions(driver);
		WebElement delivery = driver.findElement(By.xpath("//div[text()='Delivery']"));
		a.moveToElement(delivery);

		WebDriverWait w2 = new WebDriverWait(driver, Duration.ofSeconds(25));
		w2.until(ExpectedConditions.visibilityOf(c.getAddtocartBtn()));
		clickElement(c.getAddtocartBtn());
	}

	@When("navigates to homepge and again goes to cart increase product quantity")
	public void navigates_to_homepge_and_again_goes_to_cart_increase_product_quantity() {
		Set<String> allWindowId = driver.getWindowHandles();
		List<String> li = new ArrayList();
		li.addAll(allWindowId);
		driver.switchTo().window(li.get(0));
		driver.switchTo().window(li.get(1));

	}

	@Then("product quantity should be increased")
	public void product_quantity_should_be_increased() throws InterruptedException {
		CartPagePojo c1 = new CartPagePojo();

		WebDriverWait w3 = new WebDriverWait(driver, Duration.ofSeconds(25));

		w3.until(ExpectedConditions.visibilityOf(c1.getProductquantity()));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", c1.getAddProductbtn());
		clickElement(c1.getAddProductbtn());

		Thread.sleep(3000);

		Assert.assertEquals("2", c1.getProductquantity().getAttribute("value"));

	}

}
