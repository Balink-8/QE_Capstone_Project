Feature: As a Admin, I have successfully logged in so I can see the home screen

  @Login
  Scenario: As a admin, I want to input a valid username and a valid password
    Given Admin on login page
    When Admin input valid email in the email field
    And Admin input a valid password in the password field
    And Admin click Login button
    Then Admin on dashboard page

  @FailLogin
  Scenario: As an admin I cant login because I input invalid username
    Given Admin on login page
    When Admin input invalid email
    And Admin input valid password
    And Admin click Login button
    Then Admin see error message "Wrong Email or Password"