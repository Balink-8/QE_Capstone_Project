Feature: As a user, I can successfully log in so I can log out the app

  @LOGOUT
  Scenario: As a user, I want to logout from the application
    Given user has logged in homepage
    When user click profile button menu
    And user click settings button menu
    And user click logout button menu
    And user click logout button menu2
    Then user success log out from the application