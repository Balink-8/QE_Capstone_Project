Feature: As admin, I want to view transaction event or product and view transaction by ID

  @TCTRANSACTION01
  Scenario: As admin I can see transaction product and see transaction by ID details
    Given admin has logged in dashboard page
    When admin click Transaction button menu
    Then admin see transaction product list displayed

  @TCTRANSACTION02
  Scenario: As an admin I can see the detailed list of transaction events
    Given admin has logged in dashboard page
    When admin click Transaction button menu
    And admin click Event button menu
    Then admin see the details list of transaction events displayed

  @TCTRANSACTION03
  Scenario: As an admin I can see the detailed transaction of transaction product
    Given admin has logged in dashboard page
    When admin click Transaction button menu
    And admin click detail icon button menu
    Then admin see the detail transaction of product displayed

  @TCTRANSACTION04
  Scenario: As an admin I can see the detailed of transaction event by ID
    Given admin has logged in dashboard page
    When admin click Transaction button menu
    And admin click Event button menu
    And admin click Search button to input valid transaction code search event by transaction code
    Then admin see the detailed transaction data and transaction status event that is displayed

  @TCTRANSACTION05
  Scenario: As an admin I can see the detailed of transaction event by ID
    Given admin has logged in dashboard page
    When admin click Transaction button menu
    And admin click Event button menu
    And admin click Search button to input invalid transaction code search event by transaction code
    Then admin see the detailed transaction data and transaction status event that is displayed
