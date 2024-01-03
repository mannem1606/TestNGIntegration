package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class MyHooks {
    @Before
    public void setup(Scenario scenario){
        System.out.println("** Execution started for scenario - "+scenario.getName());
        System.out.println("++ Browser got Launched and maximized ++");
        System.out.println(" ++ Application URL got opened in the Browser ++");
    }
    @After
    public void tearDown(Scenario scenario){

        System.out.println("++ Logged out from the Application ++ ");
        System.out.println(" ++ Browser got closed ++");
        System.out.println("** Execution Ended for scenario - "+scenario.getName());
    }
}
