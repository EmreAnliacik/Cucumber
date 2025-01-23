package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {


    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setup;

    @FindBy(xpath = "(//span[text()='Parameters'])[1]")
    public WebElement parameters;


    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    public WebElement country;

    @FindBy(xpath = "(//span[text()='Citizenships'])[1]")
    public WebElement citizenship;

    @FindBy(xpath = "(//span[text()='Nationalities'])[1]")
    public WebElement nationalities;


    public WebElement getWebElement(String strLink){
        switch (strLink){
            case "setup" : return this.setup;
            case "parameters" : return this.parameters;
            case "country" : return this.country;
            case "citizenship" : return this.citizenship;
            case "nationalities" : return this.nationalities;

        }
        return null;


    }






}
