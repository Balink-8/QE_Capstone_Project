Feature: As admin, I want to create, put, delete and get artikel and artikel by ID

  @TCartikel01
  Scenario: As admin I want to create new artikel
    Given admin set up api endpoint login in artikel in website
    When admin send a HTTP request login in artikel in website
    And admin set the POST api endpoint artikel
    And admin sent HTTP POST request post artikel
    Then admin receive a valid login and artikel HTTP response code 200
#    And admin receives valid data to add artikel data

  @TCartikel02
  Scenario: As admin I can get all artikel data
    Given admin set up api endpoint login in artikel in website
    When admin send a HTTP request login in artikel in website
    And admin set the GET api endpoint artikel
    And admin sent HTTP GET request get artikel by ID
    Then admin receive a valid login and artikel HTTP response code 200
#    And admin receive valid data for all artikel

  @TCartikel03
  Scenario: As admin I can edit artikel data by ID
    Given admin set up api endpoint login in artikel in website
    When admin send a HTTP request login in artikel in website
    And admin set the PUT api endpoint artikel
    And admin sent HTTP PUT request artikel by ID
    Then admin receive a valid login and artikel HTTP response code 200
#    And admin receive valid data for artikel by ID

  @TCartikel04
  Scenario: As admin I can delete artikel data by ID
    Given admin set up api endpoint login in artikel in website
    When admin send a HTTP request login in artikel in website
    And admin set the DELETE api endpoint artikel
    And admin sent HTTP DELETE request artikel by ID
    Then admin receive a valid login and artikel HTTP response code 200
#    And admin receive valid data for delete artikel by ID
