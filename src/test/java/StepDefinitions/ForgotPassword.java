package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ForgotPassword {

    @Given("^User opens the application$")
    public void user_opens_the_application() {
        System.out.println(">> Application URL got opened");


    }
    @When("^User clicks on MyAccount$")
    public void user_clicks_on_my_account() {
        System.out.println(">> User has clicked on MyAccount option");

    }
    @When("^Selects login option$")
    public void selects_login_option() {
        System.out.println(">> User has selected Login option");

    }
    @When("^Clicks on Forgot password option$")
    public void clicks_on_forgot_password_option() {
        System.out.println(">> User has clicked on Forgotten password option ");

    }
    @When("Enters valid email address$")
    public void enters_valid_email_address() {
        System.out.println(">> User Enters the valid email Address");

    }
    @When("^Clicks on Continue button$")
    public void clicks_on_continue_button() {
        System.out.println(">> User has clicked on Continue button");

    }
    @Then("^Proper confirmation message should be displayed$")
    public void proper_confirmation_message_should_be_displayed() {
        System.out.println(">> Proper confirmation message got display ");

    }


}
