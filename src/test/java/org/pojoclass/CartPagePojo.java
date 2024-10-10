package org.pojoclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass;

public class CartPagePojo extends BaseClass {
	public CartPagePojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Add to cart']")
	private WebElement addtocartBtn;

	@FindBy(css = ".LcLcvv:nth-child(3)")
	private WebElement addProductbtn;
	//// button[text()='+']

	@FindBy(xpath = "//input[@type='text' and @class='p6sArZ']")
	private WebElement productquantity;

	public WebElement getAddProductbtn() {
		return addProductbtn;
	}

	public WebElement getProductquantity() {
		return productquantity;
	}

	public WebElement getAddtocartBtn() {
		return addtocartBtn;
	}

}
