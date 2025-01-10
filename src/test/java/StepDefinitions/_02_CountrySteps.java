package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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

        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput,"emreUlke4");
        dc.mySendKeys(dc.codeInput,"ER");
        dc.myClick(dc.saveButton);

    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {

        dc.verifyContainsText(dc.successMessage,"success");

    }


}
