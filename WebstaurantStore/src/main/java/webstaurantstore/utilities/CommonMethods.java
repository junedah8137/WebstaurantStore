package webstaurantstore.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import webstaurantstore.base.Base;

public class CommonMethods extends Base {

	public static void setInputValue(By locator, String value) {
		driver.findElement(locator).sendKeys(value);
	}

	public static void click(By locator) {
		driver.findElement(locator).click();
	}
	
	public static void waitUntilDisplayed(By element, int waitTime) {
		WebDriverWait pause = new WebDriverWait(driver, waitTime);
		pause.until(ExpectedConditions.visibilityOfElementLocated(element));
	}
	
	public static void waitUntilClickable(By element, int waitTime) {
		WebDriverWait pause = new WebDriverWait(driver, waitTime);
		pause.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static boolean isElementDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		} catch (Exception NoSuchElementException) {
			return false;
		}
	}
}
