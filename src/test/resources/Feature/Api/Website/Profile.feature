Feature: As Admin, I want to manage the event feature

  @TCPROFILE01
  Scenario: As admin, ensures that get admin data
    Given admin set up api endpoint login in profile admin
    When admin send a HTTP request login in profile admin
    And admin set the GET api endpoint profile admin
    And admin sent HTTP GET request post profile admin
    Then admin receive a valid login and profile admin HTTP response code 200
#    And admin received valid data for profile admin

  @TCPROFILE02
  Scenario: As admin, ensures that new event can be added correctly
    Given admin set up api endpoint login in profile admin
    When admin send a HTTP request login in profile admin
    And admin set the PUT api endpoint profile admin
    And admin sent HTTP PUT request post profile admin
    Then admin receive a valid login and profile admin HTTP response code 200
#    And admin received valid data for profile admin edit
