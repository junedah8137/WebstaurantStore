package webstaurantstore.test;


import org.testng.Assert;
import org.testng.annotations.Test;

import webstaurantstore.base.Base;
import webstaurantstore.pages.AddCartPage;
import webstaurantstore.pages.LandingPage;
import webstaurantstore.pages.SearchResultPage;

public class AutomationAssignmentTest {
	
	static String url="https://www.webstaurantstore.com/";
	static String barCode="825CI25MS";
	static int delayUntilLoaded = 5;
	
	@Test
	public static void testCases() {
		Base.initialization(url);
		LandingPage.setValueInSearchInput(barCode);
		LandingPage.clickSearchButton();
		Assert.assertTrue(SearchResultPage.isItemDisplayedFromSerachResult(delayUntilLoaded));
		SearchResultPage.clickAddCartButtonFromSerachResult();
		SearchResultPage.clickCartButtonFromNavBar();
		Assert.assertTrue(AddCartPage.isItemDisplayedInCart(delayUntilLoaded));
		AddCartPage.clickEmptyCartButtonFromCart();
		Assert.assertTrue(AddCartPage.isEmptyCartConfirmationDisplayed(delayUntilLoaded));
		AddCartPage.clickEmptyCartButtonFromConfirmation();
		Base.quitBrowser();
	}

}
