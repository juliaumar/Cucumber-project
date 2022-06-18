@IN-5
Feature: Login Page Scenarios

  Scenario: Verify user sees  sign in inputs
    When User will enters credentials:
      | Enter Username | test@yahoo.com |
      | Enter Password | test123     |
    And User clicks on "Login" button
    And Verify Title "Interview App" is displayed





