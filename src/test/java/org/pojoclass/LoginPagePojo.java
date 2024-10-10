package org.pojoclass;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass;

public class LoginPagePojo extends BaseClass {
	public LoginPagePojo() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(name = "q")
	private WebElement searchBar;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement searchbtn;

	@FindBy(xpath = "//div[@class='KzDlHZ']")
	private List<WebElement> products;
	
	@FindBy(xpath="//span[@role='button']")
	private WebElement closepopup;

	public WebElement getSearchBar() {
		return searchBar;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public List<WebElement> getProducts() {
		return products;
	}

	public WebElement getClosepopup() {
		return closepopup;
	}
	
	

}
