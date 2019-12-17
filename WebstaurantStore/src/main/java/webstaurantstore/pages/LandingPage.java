package webstaurantstore.pages;

import org.openqa.selenium.By;

import webstaurantstore.base.Base;
import webstaurantstore.utilities.CommonMethods;

public class LandingPage extends Base{
	
	static By searchInputField= By.xpath("//input[@id='searchval']");
	static By searchButton= By.xpath("//button[text()='Search']");
	
	public static void setValueInSearchInput(String value) {
		CommonMethods.setInputValue(searchInputField, value);
	}
	
	public static void clickSearchButton() {
		CommonMethods.click(searchButton);
	}

}
