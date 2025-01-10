package StepDefinitions;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Parent {

    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));

    public void myClick(WebElement element) {

        wait.until(ExpectedConditions.elementToBeClickable(element));
        //scroll yap
        scrollToElement(element);
        element.click();

    }


    public void mySendKeys(WebElement element, String text) {

        wait.until(ExpectedConditions.visibilityOf(element));
        //scroll yap
        scrollToElement(element);
        element.clear();
        element.sendKeys(text);

    }

    public void scrollToElement(WebElement element) {

        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);


    }


    public void verifyContainsText(WebElement elementm, String text) {

        wait.until(ExpectedConditions.textToBePresentInElement(elementm, text));
        Assert.assertTrue(elementm.getText().contains(text));
    }


}
