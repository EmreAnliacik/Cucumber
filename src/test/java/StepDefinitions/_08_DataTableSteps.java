package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.Keys;

import java.util.List;

public class _08_DataTableSteps {
    DialogContent dc = new DialogContent();
    LeftNav ln  =new LeftNav();



    @And("Click on the element in LeftNav")
    public void clickOnTheElementInLeftNav(DataTable links) {
        List<String>  strLinkList = links.asList(String.class);

        for (int i = 0; i < strLinkList.size(); i++)
        {
            dc.myClick(ln.getWebElement(strLinkList.get(i)));
        }


    }

    @And("Click on the element in Dialog")
    public void clickOnTheElementInDialog(DataTable links) {
        List<String> stringList = links.asList(String.class);

        for (int i = 0; i < stringList.size(); i++) {

            dc.myClick(dc.getWebElemenet(stringList.get(i)));
        }





    }

    @And("User sending the keys in Dialog")
    public void userSendingTheKeysInDialog(DataTable links) {
        List<List<String>> strLinks = links.asLists(String.class);

        for (int i = 0; i < strLinks.size(); i++) {
            dc.mySendKeys(dc.getWebElemenet(strLinks.get(i).get(0)), strLinks.get(i).get(1) + Keys.ENTER);



        }


    }

    @And("User delete item from Dialog Content")
    public void userDeleteItemFromDialogContent(DataTable links) {
        List<String> stringList = links.asList(String.class);

        GWD.getDriver().navigate().refresh();

        for (int i = 0; i < stringList.size(); i++) {

            dc.deleteItem(stringList.get(i));
        }


    }
}
