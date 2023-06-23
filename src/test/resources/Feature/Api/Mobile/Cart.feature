Feature: As user, I want to manage Shop features

  @TCCART01
  Scenario: As user, I want to create new cart
    Given user set up api endpoint login in cart in website
    When user send a HTTP request login in cart in website
    And user set the POST api endpoint cart
    And user sent HTTP POST request post cart
    Then user receive a valid login and cart HTTP response code 200
#    And user receives valid data to add cart data

  @TCCART02
  Scenario: As user, I can get all cart data
    Given user set up api endpoint login in cart in website
    When user send a HTTP request login in cart in website
    And user set the GET api endpoint cart
    And user sent HTTP GET request get cart by ID
    Then user receive a valid login and cart HTTP response code 200
#    And user receive valid data for all cart

  @TCCART03
  Scenario: As user, I can edit cart data by ID
    Given user set up api endpoint login in cart in website
    When user send a HTTP request login in cart in website
    And user set the PUT api endpoint cart
    And user sent HTTP PUT request cart by ID
    Then user receive a valid login and cart HTTP response code 200
#    And user receive valid data for cart by ID

  @TCCART04
  Scenario: As user, I can delete cart data by ID
    Given user set up api endpoint login in cart in website
    When user send a HTTP request login in cart in website
    And user set the DELETE api endpoint cart
    And user sent HTTP DELETE request cart by ID
    Then user receive a valid login and cart HTTP response code 200
#    And user receive valid data for delete cart by ID
