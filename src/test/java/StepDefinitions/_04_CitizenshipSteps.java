package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

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
}
