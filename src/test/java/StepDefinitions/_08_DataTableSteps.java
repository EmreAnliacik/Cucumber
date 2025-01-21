package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class _08_DataTableSteps {
    DialogContent dc = new DialogContent();
    LeftNav ln  =new LeftNav();



    @And("Click on the element in LeftNav")
    public void clickOnTheElementInLeftNav(DataTable links) {
        List<String>  strLinkList = links.asList(String.class);

        for (String strLink : strLinkList){
            dc.myClick(ln.getWebElement(strLink));
        }


    }
}
