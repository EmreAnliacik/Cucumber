package Pages;

import StepDefinitions.Parent;
import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class DialogContent extends Parent {


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


    @FindBy(css = "")
    public WebElement addButton;


    @FindBy(css = "")
    public WebElement nameInput;

    @FindBy(css = "")
    public WebElement codeInput;

    @FindBy(css = "")
    public WebElement saveButton;

    @FindBy(css = "")
    public WebElement successMessage.



















}
