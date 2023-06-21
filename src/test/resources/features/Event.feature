Feature: As an user, I want to using the events feature

  @TCEVENT01
  Scenario: As user can see list of available events
    Given user has logged in home page
    When user click Events button menu
    Then user on the event page

  @TCEVENT02
  Scenario: As an user can see event detail by ID
    Given user has logged in home page
    When user click Event button menu
    And user on the event page
    And user click on the selected events
    Then user see the detailed events

  @TCEVENT03
  Scenario: As an user can checkout the selected event
    Given user has logged in home page
    When user click Event button menu
    And user on the event page
    And user click on the selected event
    And user see the detailed events
    And user click order now button
    And user enter the number of tickets
#    And user click buy now button
#    And user to checkout page
#    And user click payment method
#    And user choose a payment method
#    And user click next button
#    And user click make an order button
#    And user on the payment code page
#    And user click upload proof of payment button
#    Then user successfully performs a checkout event