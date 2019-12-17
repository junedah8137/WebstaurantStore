package webstaurantstore.pages;

import org.openqa.selenium.By;

import webstaurantstore.base.Base;
import webstaurantstore.utilities.CommonMethods;

public class AddCartPage extends Base{

	static By item = By.xpath("//a[@title='Valor 25 oz. Pre-Seasoned Mini Cast Iron Round Casserole Dish - 12/Case']");
	static By emptyCartFromCartButton = By.xpath("//a[text()='Empty Cart']");
	static By emptyCartButtonFromConfirmation = By.xpath("//button[text()='Empty Cart']");
	
	public static boolean isItemDisplayedInCart(int wait) {
		CommonMethods.waitUntilDisplayed(item, wait);
		return CommonMethods.isElementDisplayed(item);
	}
	
	public static void clickEmptyCartButtonFromCart() {
		CommonMethods.click(emptyCartFromCartButton);
	}
	
	public static boolean isEmptyCartConfirmationDisplayed(int wait) {
		CommonMethods.waitUntilClickable(emptyCartButtonFromConfirmation, wait);
		return CommonMethods.isElementDisplayed(emptyCartButtonFromConfirmation);
	}
	
	public static void clickEmptyCartButtonFromConfirmation() {
		CommonMethods.click(emptyCartButtonFromConfirmation);
	}

}
