package com.test.main;

import com.test.main.Belly;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {


    @Given("^I have (\\d+) cukes in my belly$")
    public void I_have_cukes_in_my_belly(int arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        Belly belly = new Belly();
        belly.eat(arg1);
    }

}
