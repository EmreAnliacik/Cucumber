package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;

public class _04_CitizenshipSteps {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @And("Navigate to citizenship")
    public void navigateToCitizenship() {
        ln.myClick(ln.setup);
        ln.myClick(ln.parameters);
        ln.myClick(ln.citizenship);
    }

    @When("Create a citizenship")
    public void createACitizenship() {

        String nameRnd = RandomStringUtils.randomAlphanumeric(5);
        String nameRnd1 = RandomStringUtils.randomAlphanumeric(2);


        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput,nameRnd);
        dc.mySendKeys(dc.shortName,nameRnd1);
        dc.myClick(dc.saveButton);

    }

    @When("Create a citizensip name as {string} shortName as {string}")
    public void createACitizensipNameAsShortNameAs(String name, String shortName) {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput,name);
        dc.mySendKeys(dc.shortName,shortName);
        dc.myClick(dc.saveButton);



    }

    @Then("Already exist message should be displayed")
    public void alreadyExistMessageShouldBeDisplayed() {

        dc.verifyMessageContainsText("already",dc.messageBox);


    }
}
