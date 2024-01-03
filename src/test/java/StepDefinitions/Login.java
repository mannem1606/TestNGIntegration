package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
    @Given("User navigates to Login Page")
    public void user_navigates_to_login_page() {
        System.out.println(">> User got navigated to Login page");

    }

    @When("Click on login button")
    public void click_on_login_button() {
        System.out.println(">> User clicked on the Login button");

    }
    @Then("User should be able Login successfully")
    public void user_should_be_able_login_successfully() {
        System.out.println(">> User got logged in successfully");

    }

    @When("User enters invalid email address {string}")
    public void userEntersInvalidEmailAddress(String InvalidEmail) {
        System.out.println(">> User enters invalid email address :"+InvalidEmail);
    }

    @And("Enter invalid password {string}")
    public void enterInvalidPassword(String InvalidPassword) {
        System.out.println(">> User enters invalid Password :"+InvalidPassword);
    }

    @Then("User get a proper warning message")
    public void userGetAProperWarningMessage() {
        System.out.println(">> User get a proper warning message");

    }

    @When("User do not enter any credentials")
    public void userDoNotEnterAnyCredentials() {
        System.out.println(">> User Do not enter any credentials");

    }

    @When("^User enters valid email address (.+)$")
    public void userEntersValidEmailAddressEmail(String Email) {
        System.out.println(">> User enters valid email address:"+Email);

    }

    @And("^Enter valid password(.+)$")
    public void enterValidPasswordPassword(String Password) {
        System.out.println(">> Enter valid password:"+Password);

    }
}
