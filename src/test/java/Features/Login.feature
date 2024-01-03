@all
Feature: User Login
  Registered user should be able to access the Account details

Background:
  Given User navigates to Login Page

@login @validcredentials @smoke @regression
Scenario Outline: Login with valid credentials
  When User enters valid email address <Email>
  And Enter valid password <Password>
  And Click on login button
  Then User should be able Login successfully
Examples:
  |Email|Password|
  |amotooricap9@gmail.com|12345|

@Login @invalidcredentials @smoke @regression
Scenario: Login with invalid credentials
  When User enters invalid email address "ankamma1606@gailll.com"
  And Enter invalid password "Anku@14309"
  And Click on login button
  Then User get a proper warning message

  @Login @invalidcredentials @smoke @regression @validmailandinavlidpassword
Scenario: Login with valid email address and invalid password
  Given User enters valid email address "ankamma1606@gail.com"
  And Enter invalid password "Anku@143040"
  And Click on login button
  Then User get a proper warning message

  @Login @invalidcredentials @smoke @regression
Scenario: Login with invalid email and valid password
  Given  User enters invalid email address "ankamma1606@gailllas.com"
  And Enter valid password "Anku@143"
  And Click on login button
  Then User get a proper warning message

  @Login @nocredentials @regression
Scenario: Login with out providing any credentials
  When User do not enter any credentials
  And Click on login button
  Then User get a proper warning message




