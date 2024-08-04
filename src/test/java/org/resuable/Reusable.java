package org.resuable;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Reusable {

    public static WebDriver driver;
    public static WebDriverWait wait ;

   

    public static void click(WebElement element) {
        element.click();
    }

    public static void elementclic(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();

	}
    
    public static void backSpace() {
        Actions ac = new Actions(driver);
        ac.keyDown(Keys.BACK_SPACE).perform();
        ac.keyUp(Keys.BACK_SPACE).perform();
    }

    public static void enterText(WebElement element, String value) {
        Actions ac = new Actions(driver);
        ac.click(element).sendKeys(value).perform();
    }

    public static void entTexDrop(WebElement element, int value1, int value2) {
        Actions ac = new Actions(driver);
        ac.clickAndHold(element)
          .moveByOffset(value1, value2)
          .release()
          .perform();
    }

    public static void scrollEle(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }
    
    public static void clickEle(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }

    public static String getAttribute(WebElement element, String attribute) {
        return element.getAttribute(attribute);
    }

    public static String getText(WebElement element) {
        return element.getText();
    }
}
