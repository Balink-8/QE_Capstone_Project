Feature: As an user, I want to using the article feature

  @TCARTIKEL01
  Scenario: As user can see article list
    Given user has logged in home page
    When user click Profile button menu
    And user click Article button menu
    Then users on the article page

  @TCARTIKEL02
  Scenario: As an user can see detail the article  by ID
    Given user has logged in home page
    When user click Profile button menu
    And user click Article button menu
    And user click on the selected article
    Then user see the details article by ID