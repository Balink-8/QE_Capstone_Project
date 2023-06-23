Feature: As an user, I want to checkout a product and choose a payment method

  @CHECKOUT01
  Scenario: As a user I can see the product page checkout using an bank central asia transfer
    Given user has logged in homepage
    When user click shop button menu
    And user click clothing category button menu
    And user click cloth endek product button menu
    And user see at the page detail cloth endek product category is displayed
    And user click beli sekarang button menu
    And user click beli sekarang button menu again
    And user see at the checkout page
    And user select payment method transfer bank central asia
    Then user see at the payment code page

  @CHECKOUT02
  Scenario: As a user I can see the product page checkout using an bank mandiri transfer
    Given user has logged in homepage
    When user click shop button menu
    And user click clothing category button menu
    And user click cloth endek product button menu
    And user see at the page detail cloth endek product category is displayed
    And user click beli sekarang button menu
    And user click beli sekarang button menu again
    And user see at the checkout page
    And user select payment method transfer bank mandiri
    Then user see at the payment code page