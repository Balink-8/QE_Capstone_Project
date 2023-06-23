Feature: As an user, I want to choose a category and choose a product

  @CATEGORY01
  Scenario: As a user I can select clothing category product page
    Given user has logged in homepage
    When user click shop button menu
    And user click clothing category button menu
    And user click shirt endek product button menu
    Then user see at the page detail shit endek product category is displayed

  @CATEGORY02
  Scenario: As a user I can select handycrafts category product page
    Given user has logged in homepage
    When user click shop button menu
    And user click handycrafts category button menu
    And user click wall decoration product button menu
    Then user see at the page detail wall decoration product category is displayed

  @CATEGORY03
  Scenario: As a user I can select bag category product page
    Given user has logged in homepage
    When user click shop button menu
    And user click bag category button menu
    And user click Premium quality bag product button menu
    Then user see at the page detail Premium quality bag product category is displayed

  @CATEGORY04
  Scenario: As a user I can select balinese mask category product page
    Given user has logged in homepage
    When user click shop button menu
    And user click balinese mask category button menu
    And user click balinese mask product button menu
    Then user see at the page detail balinese mask product category is displayed