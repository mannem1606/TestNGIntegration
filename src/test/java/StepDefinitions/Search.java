package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
    @Given("User Open the Application")
    public void user_open_the_application() {
        System.out.println(">> User should successfully Opened the Application");

    }
    @When("User Entered the Application")
    public void user_entered_the_application() {
        System.out.println(">> User successfully entred the Application");

    }
    @When("User click on Search button")
    public void user_click_on_search_button() {
        System.out.println(">> User should be able to click Search button");

    }
    @Then("Valid product should get displayed in search results")
    public void valid_product_should_get_displayed_in_search_results() {
        System.out.println(">> Valid product details should be displayed");
    }

    @When("User Enter non existing product into Search field")
    public void userEnterNonExistingProductIntoSearchField() {
        System.out.println(">> User should search the Non existing product in search field");
    }

    @Then("Proper text informing the User about no product is matching")
    public void properTextInformingTheUserAboutNoProductIsMatching() {
        System.out.println(">> User should get the message of Product is matching");
    }

    @When("User do not enter any product into search field")
    public void userDoNotEnterAnyProductIntoSearchField() {
        System.out.println(">> User can not enter ant product details in search field");
    }
}
