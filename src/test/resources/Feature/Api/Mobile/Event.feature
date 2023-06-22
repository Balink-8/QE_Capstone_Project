Feature: As Admin, I want to manage the event feature

  @TCEVENT05
  Scenario: As admin, ensures that new event can be added correctly
    Given admin set up api endpoint login in event in mobile
    When admin send a HTTP request login in event in mobile
    And admin set the POST api endpoint event in mobile
    And admin sent HTTP POST request post event in mobile
    Then admin receive a valid login and event HTTP response code 200 in mobile
#    And admin received valid data for event in mobile

  @TCEVENT06
  Scenario: As admin, I can get all event data
    Given admin set up api endpoint login in event in mobile
    When admin send a HTTP request login in event in mobile
    And admin set the GET api endpoint event in mobile
    And admin sent HTTP GET request get event in mobile
    Then admin receive a valid login and event HTTP response code 200 in mobile
#    And admin receive valid data for all event in mobile

  @TCEVENT07
  Scenario: As admin, I can edit event data by ID
    Given admin set up api endpoint login in event in mobile
    When admin send a HTTP request login in event in mobile
    And admin set the PUT api endpoint event in mobile
    And admin sent HTTP PUT request get event by ID in mobile
    Then admin receive a valid login and event HTTP response code 200 in mobile
#    And admin receive valid data for event by ID in mobile

  @TCEVENT08
  Scenario: As admin, I can delete event data by ID
    Given admin set up api endpoint login in event in mobile
    When admin send a HTTP request login in event in mobile
    And admin set the DEL api endpoint event in mobile
    And admin sent HTTP DEL request event by ID in mobile
    Then admin receive a valid login and event HTTP response code 200 in mobile
#    And admin receive valid data for delete event in mobile
