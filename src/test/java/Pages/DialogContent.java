package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

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


    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;


    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    public WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    public WebElement codeInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']//input")
    public WebElement integrationCodeInput;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']//input")
    public WebElement priority;

    @FindBy(css = "ms-save-button button")
    public WebElement saveButton;

    @FindBy(xpath = "//ms-save-button[@caption='GENERAL.BUTTON.SAVE_AND_CLOSE']")
    public WebElement saveAndCloseButton;

    @FindBy(xpath = "//div[contains(text(),'succesfully')]")
    public WebElement successMessage;

    @FindBy(css = "[formcontrolname='shortName'] input")
    public WebElement shortName;

    @FindBy(tagName = "mat-panel-description")
    public WebElement messageBox;

    @FindBy(css = "button[aria-label='Close']")
    public WebElement messageBoxClose;

    @FindBy(xpath = "//ms-text-field/input[@placeholder='Name']")
    public WebElement searchInputName;

    @FindBy(xpath = "//ms-text-field/input[@placeholder='Code']")
    public WebElement searchInputCode;

    @FindBy(css = "ms-search-button button")
    public WebElement searchButton;

    @FindBy(xpath = "//ms-delete-button/button")
    public WebElement deleteButton;

    @FindBy(css = "button[type='submit']")
    public WebElement submitButton;

    @FindBy(css = "button[aria-label='Close dialog']")
    public WebElement closeDialog;


    public void verifyMessageContainsText(String value,WebElement  element){
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//hot-toast-container/div/div/div//*"),0));
        Assert.assertTrue( element.getAttribute("innerHTML").toLowerCase().contains(value.toLowerCase()));

        //sayfaya ESC tuşu gönderildi, açık mesaj kalmasın diye
//        new Actions(GWD.getDriver()).click(messageBoxClose).build().perform();
        wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.xpath("//hot-toast-container/div/div/div//*"),1));
    }

    public void deleteItem(String name){
        mySendKeys(searchInputName,name);
        myClick(searchButton);
        //Stale element hatasinin cozumu icin searhin yeniden clickable olmasini bekleriz bu sayede sayfa yenilenmis olur
//        wait.until(ExpectedConditions.elementToBeClickable(searchButton));

        //2. Yontem:sayfanin kendi waitini ,loading barini yakalayalim(en saglam yontem)
//        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//app/*"),1));
        wait.until(ExpectedConditions.elementToBeClickable(this.searchButton));


        myClick(deleteButton);
//        wait.until(ExpectedConditions.elementToBeClickable(submitButton));
        myClick(submitButton);


    }


//    public void deleteItemNew(String name,String code){
//        mySendKeys(searchInputName,name);
//        mySendKeys(searchInputCode,code);
//        myClick(searchButton);
//        //Stale element hatasinin cozumu icin searhin yeniden clickable olmasini bekleriz bu sayede sayfa yenilenmis olur
////        wait.until(ExpectedConditions.elementToBeClickable(searchButton));
//
//        //2. Yontem:sayfanin kendi waitini ,loading barini yakalayalim(en saglam yontem)
////        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//app/*"),1));
//        wait.until(ExpectedConditions.elementToBeClickable(this.searchButton));
//
//
//        myClick(deleteButton);
////        wait.until(ExpectedConditions.elementToBeClickable(submitButton));
//        myClick(submitButton);
//
//
//    }


    public WebElement getWebElemenet(String strLink){
        switch (strLink){
            case "addButton" : return this.addButton;
            case "nameInput" : return this.nameInput;
            case "codeInput" : return this.codeInput;
            case "saveButton" : return this.saveButton;
            case "integrationCode" : return this.integrationCodeInput;
            case "priority" : return this.priority;
            case "saveAdCloseButton" : return this.saveAndCloseButton;
        }
        return null;

    }



















}
