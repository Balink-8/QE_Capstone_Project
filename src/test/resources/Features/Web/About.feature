Feature: as a user I can successfully view the about us page

  @AboutUs
  Scenario: as a user, i want to see about us page
    Given User on home page
    When User click navbar aboutUs
    Then User successfully view the about us page

