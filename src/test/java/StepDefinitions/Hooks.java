package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before//Cucumberin Annotation u
    public void before(){

//        System.out.println("Senaryo basladi?");


    }

    @After//Cucumberin Annotation u
    public void after(){
//        System.out.println("Senaryo bitti?");

        GWD.quitDriver();



    }


}
