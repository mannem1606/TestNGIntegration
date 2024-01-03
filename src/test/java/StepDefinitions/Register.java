
package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
    @Given("User navigates to Registered account page")
    public void user_navigates_to_registered_account_page() {
        System.out.println(">> User got navigated to Registered Account page");

    }
    @When("User enters firstname {string} in to the First name field")
    public void user_enters_firstname_in_to_the_first_name_field(String FirstnameText) {
        System.out.println(">> User enters firstname:"+FirstnameText+" in to the First name field ");

    }
    @When("Enters Lastname {string} in to the Lastname field")
    public void enters_lastname_in_to_the_lastname_field(String LasttnameText) {
        System.out.println(">> User enters firstname:"+LasttnameText+" in to the First name field ");


    }
    @When("Enters Email address {string} into the email field")
    public void enters_email_address_into_the_email_field(String EmailText) {
        System.out.println(">> User has enters Email text:"+EmailText+" into Email field");


    }
    @When("Enters Teliphone {string} in to teliphone field")
    public void enters_teliphone_in_to_teliphone_field(String Telephone_Text) {
        System.out.println(">> User enters Teliphone:"+Telephone_Text+" into telephone field");

    }
    @When("Enters password {string} into the password field")
    public void enters_password_into_the_password_field(String Password_Text) {
        System.out.println(">> User enters Password:"+ Password_Text +" into password field");

    }
    @When("Enters password {string} into the password confirm field")
    public void enters_password_into_the_password_confirm_field(String Password_confirm) {
        System.out.println(">> User enters the Password confirm:"+Password_confirm+" into password confirm field");

    }
    @When("Selects Privacy policy field")
    public void selects_privacy_policy_field() {
        System.out.println(">> User selects the Privacy policy field");

    }
    @When("Click on Continue button")
    public void click_on_continue_button() {
        System.out.println(">> User clicked on the Continue button");

    }
    @Then("Account should get successfully created")
    public void account_should_get_successfully_created() {

        System.out.println(">> Successfully crated the Account");
    }


    @When("User do not enter details into fields")
    public void userDoNotEnterDetailsIntoFields() {

        System.out.println(">> User not entered the any details");
    }

    @And("Selects Yes for Newsletter")
    public void selectsYesForNewsletter() {
        System.out.println(">> User select the Newsletter filed");
        
    }

    @Then("Warning message should be displayed for the Mandatory fields")
    public void warningMessageShouldBeDisplayedForTheMandatoryFields() {
        System.out.println(">> User get the warning message for Mandatory fields");
        
    }

    @Then("Warning message inform about duplicate email value")
    public void warningMessageInformAboutDuplicateEmailValue() {
        System.out.println(">> User gets warning message for duplicate values");
    }
}
