package webstaurantstore.pages;

import org.openqa.selenium.By;

import webstaurantstore.base.Base;
import webstaurantstore.utilities.CommonMethods;

public class SearchResultPage extends Base{
	
	static By item = By.xpath("//h1[text()='Valor 25 oz. Pre-Seasoned Mini Cast Iron Round Casserole Dish - 12/Case']");
	static By addToCartButton = By.xpath("//input[@id='buyButton']");
	static By cartButton = By.xpath("//div[@class='success-container']//button[text()=' View Cart']");
	
	public static boolean isItemDisplayedFromSerachResult(int wait) {
		CommonMethods.waitUntilDisplayed(item, wait);
		return CommonMethods.isElementDisplayed(item);
	}
	
	public static void clickAddCartButtonFromSerachResult() {
		CommonMethods.click(addToCartButton);
	}
	
	public static void clickCartButtonFromNavBar() {
		CommonMethods.click(cartButton);
	}

}
