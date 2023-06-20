Feature: As a user, I want to see landing page balink

  @Home
  Scenario: As a user, I want to see home page
    Given User on Balink page
    When User click navbar home
    Then user successfully enters the home page

  @Download
  Scenario: As a user, I want to see download page
    Given User on Balink page
    When User click navbar download
    Then user successfully enters the download page

  @contactUs
  Scenario: As a user I want to contact the admin
    Given User on Balink page
    When User click navbar contactUs
    And User input first name in the first name field
    And User input last name in the last name field
    And User input email in the email field
    And User inputs a message in the message field
    And User click button send
    Then user successfully sends message