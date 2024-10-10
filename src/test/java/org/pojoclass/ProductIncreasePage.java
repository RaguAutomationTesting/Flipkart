package org.pojoclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass;

public class ProductIncreasePage extends BaseClass {

	public ProductIncreasePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "//button[text()='+']")
	private WebElement addProductbtn;

	@FindBy(xpath = "//input[@type='text' and @class='p6sArZ']")
	private WebElement productquantity;

	public WebElement getAddProductbtn() {
		return addProductbtn;
	}

	public WebElement getProductquantity() {
		return productquantity;
	}

}
