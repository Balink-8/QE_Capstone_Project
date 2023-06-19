Feature: As an user, I want to checkout a product and choose a payment method

  Scenario: As user I can see checkout a product page
    Given user has logged in cart page
    When user click "Checkout" button menu
    Then user see at the page detail checkout is displayed