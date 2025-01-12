package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class _02_CountrySteps {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @And("Navigate to country")
    public void navigateToCountry() {
        ln.myClick(ln.setup);
        ln.myClick(ln.parameters);
        ln.myClick(ln.country);

    }

    @When("Cretae a country")
    public void cretaeACountry() {

        String counrtyRandom = RandomStringUtils.randomAlphanumeric(8);
        String codeRandom = RandomStringUtils.randomNumeric(4);

        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput,counrtyRandom);
        dc.mySendKeys(dc.codeInput,codeRandom);
        dc.myClick(dc.saveButton);

    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {

        dc.verifyMessageContainsText("Success",dc.messageBox);



    }


    @When("Cretae a country name as {string} code as {string}")
    public void cretaeACountryNameAsCodeAs(String name, String code) {


        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput,name);
        dc.mySendKeys(dc.codeInput,code);
        dc.myClick(dc.saveButton);

    }
}
