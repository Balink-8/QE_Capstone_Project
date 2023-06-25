Feature: As Admin, I want to manage Shop features

  @TCCART01
  Scenario: As admin, I want to create new cart
    Given admin set up api endpoint login in cart in website
    When admin send a HTTP request login in cart in website
    And admin set the POST api endpoint cart
    And admin sent HTTP POST request post cart
    Then admin receive a valid login and cart HTTP response code 200
#    And admin receives valid data to add cart data

  @TCCART02
  Scenario: As admin, I can get all cart data
    Given admin set up api endpoint login in cart in website
    When admin send a HTTP request login in cart in website
    And admin set the GET api endpoint cart
    And admin sent HTTP GET request get cart by ID
    Then admin receive a valid login and cart HTTP response code 200
#    And admin receive valid data for all cart

  @TCCART03
  Scenario: As admin, I can edit cart data by ID
    Given admin set up api endpoint login in cart in website
    When admin send a HTTP request login in cart in website
    And admin set the PUT api endpoint cart
    And admin sent HTTP PUT request cart by ID
    Then admin receive a valid login and cart HTTP response code 200
#    And admin receive valid data for cart by ID

  @TCCART04
  Scenario: As admin, I can delete cart data by ID
    Given admin set up api endpoint login in cart in website
    When admin send a HTTP request login in cart in website
    And admin set the DELETE api endpoint cart
    And admin sent HTTP DELETE request cart by ID
    Then admin receive a valid login and cart HTTP response code 200
#    And admin receive valid data for delete cart by ID
