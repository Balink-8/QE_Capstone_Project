Feature: As admin, I want to view category and view category by ID

  @TCCATEGORY01
  Scenario: As admin I can see transaction event or product and see transaction by ID details
    Given admin has logged in dashboard Page
    When admin click Kategori button menu
    Then admin see kategori details displayed
