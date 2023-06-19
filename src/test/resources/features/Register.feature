Feature: As a user, I have successfully Register in so I can see the home screen.

  @REGISTER01
  Scenario: As a user, I want to input a valid data so that I can see a successful sign up
    Given User on log in page
    When User click register link button menu
    And User on register page
    And User input a valid email in the email field
    And User input a valid number phone in the number phone field
    And User input a valid password in the password field
    And User input a valid confirm password in the confirm password field
    And User click register button
    Then User on log in page