package Pages;

import StepDefinitions.Parent;
import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {


    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(css = "")
    public WebElement setup;

    @FindBy(css = "")
    public WebElement parameters;


    @FindBy(css = "")
    public WebElement country;







}
