package Com.AdeptoSmokeTestEU;

import org.junit.Assert;
import org.openqa.selenium.By;

public class Utils extends BasePage {

    //Reusable method for click on elements
    public static void clickOnElements(By by) {
        driver.findElement(by).click();
    }

    //Reusable method for sendkey to type text in input field
    public static void sendKeysToEnterText(By by, String type) {
        driver.findElement(by).sendKeys(type);
    }

    //Reusable method for getText
    public static String getText(By by) {
        return driver.findElement(by).getText();
    }

    //Reusable method for Assert Equal
    public static void assertEqual(String message, String Expected, String actualResult) {
        Assert.assertEquals(message, Expected, actualResult);
    }

    //Reusable method for assertTrue
    public static void assertTrueMethod(String message, Boolean booleanCondition) {
        Assert.assertTrue(message, booleanCondition);
    }
}
