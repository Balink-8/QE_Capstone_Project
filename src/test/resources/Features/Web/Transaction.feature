Feature: As admin, I want to view transaction event or product and view transaction by ID

  @TCTRANSACTION01
  Scenario: As admin I can see transaction event or product and see transaction by ID details
    Given admin has logged in dashboard page
    When admin click Transaction button menu
    Then admin see transaction details displayed