Feature: As Admin, I want to manage the event feature

  @TCEVENT01
  Scenario: As admin, ensures that new event can be added correctly
    Given admin set up api endpoint login
    When admin send a HTTP request login
    And admin set the POST api endpoint event
    And admin sent HTTP POST request post event
    Then admin receive a valid login and event HTTP response code 200
