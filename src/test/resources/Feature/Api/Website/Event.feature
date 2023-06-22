Feature: As Admin, I want to manage the event feature

  @TCEVENT01
  Scenario: As admin, ensures that new event can be added correctly
    Given admin set up api endpoint login in event
    When admin send a HTTP request login in event
    And admin set the POST api endpoint event
    And admin sent HTTP POST request post event
    Then admin receive a valid login and event HTTP response code 200
#    And admin received valid data for event

  @TCEVENT02
  Scenario: As admin, I can get all event data
    Given admin set up api endpoint login in event
    When admin send a HTTP request login in event
    And admin set the GET api endpoint event
    And admin sent HTTP GET request get event
    Then admin receive a valid login and event HTTP response code 200
#    And admin receive valid data for all event

  @TCEVENT03
  Scenario: As admin, I can edit event data by ID
    Given admin set up api endpoint login
    When admin send a HTTP request login
    And admin set the PUT api endpoint event
    And admin sent HTTP PUT request get event by ID
    Then admin receive a valid login and event HTTP response code 200
#    And admin receive valid data for event by ID

  @TCEVENT04
  Scenario: As admin, I can delete event data by ID
    Given admin set up api endpoint login
    When admin send a HTTP request login
    And admin set the DEL api endpoint event
    And admin sent HTTP DEL request event by ID
    Then admin receive a valid login and event HTTP response code 200
#    And admin receive valid data for delete event
