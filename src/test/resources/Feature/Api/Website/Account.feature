Feature: As Admin, I want to manage promo features

  @Account
  Scenario: As admin, I can get all account data
    Given admin set up api endpoint login
    When admin send a HTTP request login
    And admin set the GET api endpoint account
    And admin send HTTP GET request get all account
    Then admin receive a valid login and account HTTP response code 200
#    And admin receive valid data for all account