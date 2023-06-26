Feature: As a user, I have successfully logged in so I can see the home screen.

  @TCLOGIN01
  Scenario: As a user, I want to input a valid username and a valid password so that I can see a successful login.
    Given User on login screen
    When user input "dinybrilianti@gmail.com" on email field
    When user input "diny1234" on password field
    And User click Login button
    Then User on home screen

  @TCLOGIN02
  Scenario: As an user I cant login because I input invalid username
    Given User on login screen
    When User input invalid email "salahemail" on email field
    And User input valid password"diny1234" on password field
    And User click Login button
    Then User see the error message

  @TCLOGIN03
  Scenario: As an user I cant login because I input invalid password
    Given User on login screen
    When User input invalid email "salahemail" on email field
    And User input invalid password"salahpassword" on password field
    And User click Login button
    Then User see the error message