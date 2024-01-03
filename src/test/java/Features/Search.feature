@all
Feature: Search Functionality

Background:
  Given User Open the Application

@search @validproduct @smoke @regression
Scenario: Search for a valid Product
  When User Entered the Application
  And User click on Search button
  Then Valid product should get displayed in search results


@search @nonexistingproduct @regression
Scenario: Search for a non-existing product
  When User Enter non existing product into Search field
  And User click on Search button
  Then Proper text informing the User about no product is matching

@search @nonproduct @regression
Scenario: Search without providing any product
  When User do not enter any product into search field
  And User click on Search button
  Then Proper text informing the User about no product is matching




