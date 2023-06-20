Feature: As a user, I have successfully Register in so I can see the home screen.

  @TCSIGNUP01
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

  @TCSIGNUP02
  Scenario: As an user I cant sign up because I input invalid email
    Given User on log in page
    When User click register link button menu
    And User on register page
    And User input a invalid email in the email field
    And User input a valid number phone in the number phone field
    And User input a valid password in the password field
    And User input a valid confirm password in the confirm password field
    And User click register button
    Then User register failed and stay on register page

  @TCSIGNUP03
  Scenario: As an user I cant sign up because I input invalid number phone
    Given User on log in page
    When User click register link button menu
    And User on register page
    And User input a valid email in the email field
    And User input a invalid number phone in the number phone field
    And User input a valid password in the password field
    And User input a valid confirm password in the confirm password field
    And User click register button
    Then User register failed and stay on register page

  @TCSIGNUP04
  Scenario: As an user I cant sign up because I input invalid password
    Given User on log in page
    When User click register link button menu
    And User on register page
    And User input a valid email in the email field
    And User input a valid number phone in the number phone field
    And User input a invalid password in the password field
    And User input a valid confirm password in the confirm password field
    And User click register button
    Then User register failed and stay on register page

  @TCSIGNUP05
  Scenario: As an user I cant sign up because I input invalid confirm password
    Given User on log in page
    When User click register link button menu
    And User on register page
    And User input a valid email in the email field
    And User input a valid number phone in the number phone field
    And User input a valid password in the password field
    And User input a invalid confirm password in the confirm password field
    And User click register button
    Then User register failed and stay on register page
