@all @forgotpassword
Feature: Forgot Password Functionality

Scenario: Reset Password on forgetting it
  Given User opens the application
  When User clicks on MyAccount
  And Selects login option
  And Clicks on Forgot password option
  And Enters valid email address
  And Clicks on Continue button
  Then Proper confirmation message should be displayed