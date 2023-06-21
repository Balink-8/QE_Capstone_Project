Feature: As an user, I want to see transactions that have been made

  @TCTRANSAKSI01
  Scenario: As user can see transaction event or product and see transaction that have been made
    Given user has logged in home page
    When user click Profile button menu
    And user click Transaction button menu
    Then user on the transaction page

  @TCTRANSAKSI02
  Scenario: As an user can see the detailed list of transaction events
    Given user has logged in home page
    When user click Profile button menu
    And user click Transaction button menu
    And user click Event button menu
    Then user see the details list of transaction events displayed

  @TCTRANSAKSI03
  Scenario: As an user can see the detailed of transaction event by ID
    Given user has logged in home page
    When user click Profile button menu
    And user click Transaction button menu
    And user click Event button menu
    And user click on the selected event
#    Then user see the details transaction events by ID

  @TCTRANSAKSI04
  Scenario: As an user can see the detailed list of transaction shopping
    Given user has logged in home page
    When user click Profile button menu
    And user click Transaction button menu
    And user click Shopping button menu
    Then user see the details list of transaction shopping displayed

  @TCTRANSAKSI05
  Scenario: As an user can see the detailed of transaction shopping by ID
    Given user has logged in home page
    When user click Profile button menu
    And user click Transaction button menu
    And user click Shopping button menu
    And user click on the selected shopping
    Then user see the detailed transaction shopping data that is displayed



