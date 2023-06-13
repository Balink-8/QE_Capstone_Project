Feature: As an Admin, I want to manage account features

  @account
  Scenario: As admin I can see account data
    Given Admin on detail dashboard page
    When Admin click account menu
    Then Admin can view all account data