package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.util.List;

public class _07_DataTableSteps {
    @When("write username {string}")
    public void writeUsername(String userName) {
        System.out.println(userName);
    }

    @And("Write username and password {string} and {string}")
    public void writeUsernameAndPasswordAnd(String userName, String password) {

        System.out.println(userName+" : "+password);
    }


    @And("Write username as DataTable")
    public void writeUsernameAsDataTable(DataTable users) {
        List<String> listUsers = users.asList(String.class);

        for (String user : listUsers){
            System.out.println(user);
        }


    }

    @And("Write username and password as DataTable")
    public void writeUsernameAndPasswordAsDataTable(DataTable usernameandpasswords) {
        List<List<String>> listusernameandpasswords = usernameandpasswords.asLists(String.class);

        for (int i = 0; i < listusernameandpasswords.size(); i++) {

            System.out.println("listItems: " + listusernameandpasswords.get(i).get(0) + "  " + listusernameandpasswords.get(i).get(1));

        }




    }
}

// Dataprovider(testng),Scenario Outline (Cucumber) ------> Her deger icin tum senayoyu bastan calistirir
// Datatable  ----->  Bir step icin birden cok parametre verilmesni saglar
