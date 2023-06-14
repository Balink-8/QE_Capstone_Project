Feature: As an Admin, I want to manage account features

  @account
  Scenario: As admin I can see account data
    Given Admin on detail dashboard page
    When Admin click account menu
    Then Admin can view all account data

  @detailAccount
  Scenario: As an admin, I would like to view account data details
    Given Admin on detail dashboard page
    When Admin click account menu
    And Admin on account page
    And Admin clicks the account details icon
    Then Admin successfully view user account details
