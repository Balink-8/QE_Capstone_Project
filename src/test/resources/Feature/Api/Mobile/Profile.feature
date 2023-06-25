Feature: As Admin, I want to manage the event feature

  @TCPROFILE03
  Scenario: As admin, ensures that get user data
    Given admin set up api endpoint login in profile user
    When admin send a HTTP request login in profile user
    And admin set the GET api endpoint profile user
    And admin sent HTTP GET request post profile user
    Then admin receive a valid login and profile user HTTP response code 200
#    And admin received valid data for profile user

  @TCPROFILE04
  Scenario: As admin, ensures that new event can be added correctly
    Given admin set up api endpoint login in profile user
    When admin send a HTTP request login in profile user
    And admin set the PUT api endpoint profile user
    And admin sent HTTP PUT request post profile user
    Then admin receive a valid login and profile user HTTP response code 200
#    And admin received valid data for profile user edit

  @TCPROFILE05
  Scenario: As admin, ensures that new event can be added correctly
    Given admin set up api endpoint login in profile user
    When admin send a HTTP request login in profile user
    And admin set the DEL api endpoint profile user
    And admin sent HTTP DEL request post profile user
    Then admin receive a valid login and profile user HTTP response code 200
#    And admin received valid data for profile user delete
