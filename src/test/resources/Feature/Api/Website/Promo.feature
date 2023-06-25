Feature: As Admin, I want to manage promo features

  @GetAllPromo
  Scenario: As admin, I can get all promo data
    Given Admin set up api endpoint login
    When Admin send a HTTP request login
    And admin set the GET api endpoint promo
    And admin sent HTTP GET request get all promo
    Then admin receive a valid login and promo HTTP response code 200

  @GetPromoByID
  Scenario: As admin, I can get promo data by ID
    Given Admin set up api endpoint login
    When Admin send a HTTP request login
    And admin set the GET api endpoint promo by ID
    And admin sent HTTP GET request get promo by ID
    Then admin receive a valid login and Get promo HTTP response code 200

    @addNewPromo
  Scenario: As admin, I can add new promo data
    Given Admin set up api endpoint login
    When Admin send a HTTP request login
    And admin set the POST api endpoint promo
    And admin sent HTTP POST request post promo
    Then admin receive a valid login and Add New promo HTTP response code 200