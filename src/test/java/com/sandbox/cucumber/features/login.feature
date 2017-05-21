Feature: Login Action
  Scenario: Sucessfull Login with valid credentials
    Given User is on the Login page
    When  User enters a valid email address
    And User enters a valid password
    And User clicks the Sign in Button
    Then User Home page is opened
