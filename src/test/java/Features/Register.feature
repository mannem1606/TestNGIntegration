@all
Feature: User Registration

Background:
  Given User navigates to Registered account page

@register @regreesion @smoke @mandatoryfields
Scenario: Register with mandatory fields
  When User enters firstname "Amith" in to the First name field
  And Enters Lastname "Mannem" in to the Lastname field
  And Enters Email address "mannem.ankamma10@gmail.com" into the email field
  And Enters Teliphone "1234567890" in to teliphone field
  And Enters password "12345" into the password field
  And Enters password "12345" into the password confirm field
  And Selects Privacy policy field
  And Click on Continue button
  Then Account should get successfully created

@register @allfields @smoke @regression
Scenario: Register with all fields
  When User enters firstname "Amith" in to the First name field
  And Enters Lastname "Mannem" in to the Lastname field
  And Enters Email address "mannem.ankamma10@gmail.com" into the email field
  And Enters Teliphone "1234567890" in to teliphone field
  And Enters password "12345" into the password field
  And Enters password "12345" into the password confirm field
  And Selects Yes for Newsletter
  And Selects Privacy policy field
  And Click on Continue button
  Then Account should get successfully created

@register @nodetails @regression
Scenario: Register without providing any field
  When User do not enter details into fields
  And Click on Continue button
  Then Warning message should be displayed for the Mandatory fields

@register @duplicatemail @regression
Scenario:Registered with duplicate email address
  When User enters firstname "Amith" in to the First name field
  And Enters Lastname "Mannem" in to the Lastname field
  And Enters Email address "ankamma1606@gmail.com" into the email field
  And Enters Teliphone "1234567890" in to teliphone field
  And Enters password "12345" into the password field
  And Enters password "12345" into the password confirm field
  And Selects Privacy policy field
  And Click on Continue button
  Then Warning message inform about duplicate email value


