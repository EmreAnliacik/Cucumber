package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DialogContent {


    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(css ="input[formcontrolname='username']")
    public WebElement username;


    @FindBy(css ="input[formcontrolname='password']")
    public WebElement password;


    @FindBy(css ="[class='mdc-button__label']")
    public WebElement loginButton;

    @FindBy(xpath = "//span[text()=' I. Student']")
    public WebElement assertLogin;



    public void myClick(WebElement element){

        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(element));

        //scroll yap
        scrollToElement(element);

        element.click();

    }


    public void mySendKeys(WebElement element,String text){

        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(element));

        //scroll yap
        scrollToElement(element);
        element.clear();
        element.sendKeys(text);

    }

    public void scrollToElement(WebElement element){

        JavascriptExecutor js = (JavascriptExecutor)GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);


    }









}
