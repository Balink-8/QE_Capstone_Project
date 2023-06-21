Feature: As an user, I want to see setting page

  @TCSETTING01
  Scenario: As a user, I want to know the privacy policy of the application used
    Given user has logged in home page
    When user click Profile button menu
    And user click Setting button menu
    And user click Privacy Policy menu
    Then user will see the privacy policy page

  @TCSETTING02
  Scenario: As a user, I want to know the terms of service of the application used
    Given user has logged in home page
    When user click Profile button menu
    And user click Setting button menu
    And user click About Us menu
    And user click Term of Service menu
    Then user will see the term of service page

  @TCSETTING03
  Scenario: As a user, I want to know the copyright policy of the application used
    Given user has logged in home page
    When user click Profile button menu
    And user click Setting button menu
    And user click About Us menu
    And user click Copyright Policy menu
    Then user will see the copyright policy page