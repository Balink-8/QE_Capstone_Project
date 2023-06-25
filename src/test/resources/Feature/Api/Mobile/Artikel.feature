Feature: As user, I want to create, put, delete and get artikel and artikel by ID

  @TCartikel01
  Scenario: As user I want to create new artikel
    Given user set up api endpoint login in artikel in website
    When user send a HTTP request login in artikel in website
    And user set the POST api endpoint artikel
    And user sent HTTP POST request post artikel
    Then user receive a valid login and artikel HTTP response code 200
#    And user receives valid data to add artikel data

  @TCartikel02
  Scenario: As user I can get all artikel data
    Given user set up api endpoint login in artikel in website
    When user send a HTTP request login in artikel in website
    And user set the GET api endpoint artikel
    And user sent HTTP GET request get artikel by ID
    Then user receive a valid login and artikel HTTP response code 200
#    And user receive valid data for all artikel

  @TCartikel03
  Scenario: As user I can edit artikel data by ID
    Given user set up api endpoint login in artikel in website
    When user send a HTTP request login in artikel in website
    And user set the PUT api endpoint artikel
    And user sent HTTP PUT request artikel by ID
    Then user receive a valid login and artikel HTTP response code 200
#    And user receive valid data for artikel by ID

  @TCartikel04
  Scenario: As user I can delete artikel data by ID
    Given user set up api endpoint login in artikel in website
    When user send a HTTP request login in artikel in website
    And user set the DELETE api endpoint artikel
    And user sent HTTP DELETE request artikel by ID
    Then user receive a valid login and artikel HTTP response code 200
#    And user receive valid data for delete artikel by ID
