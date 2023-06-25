Feature: As user, I want to manage the event feature

  @TCEVENT05
  Scenario: As user, ensures that new event can be added correctly
    Given user set up api endpoint login in event in mobile
    When user send a HTTP request login in event in mobile
    And user set the POST api endpoint event in mobile
    And user sent HTTP POST request post event in mobile
    Then user receive a valid login and event HTTP response code 200 in mobile
#    And user received valid data for event in mobile

  @TCEVENT06
  Scenario: As user, I can get all event data
    Given user set up api endpoint login in event in mobile
    When user send a HTTP request login in event in mobile
    And user set the GET api endpoint event in mobile
    And user sent HTTP GET request get event in mobile
    Then user receive a valid login and event HTTP response code 200 in mobile
#    And user receive valid data for all event in mobile

  @TCEVENT07
  Scenario: As user, I can edit event data by ID
    Given user set up api endpoint login in event in mobile
    When user send a HTTP request login in event in mobile
    And user set the PUT api endpoint event in mobile
    And user sent HTTP PUT request get event by ID in mobile
    Then user receive a valid login and event HTTP response code 200 in mobile
#    And user receive valid data for event by ID in mobile

  @TCEVENT08
  Scenario: As user, I can delete event data by ID
    Given user set up api endpoint login in event in mobile
    When user send a HTTP request login in event in mobile
    And user set the DEL api endpoint event in mobile
    And user sent HTTP DEL request event by ID in mobile
    Then user receive a valid login and event HTTP response code 200 in mobile
#    And user receive valid data for delete event in mobile
