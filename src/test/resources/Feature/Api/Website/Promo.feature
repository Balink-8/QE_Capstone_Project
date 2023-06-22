Feature: As Admin, I want to manage the event feature

  @TCPROMO01
  Scenario: As admin, ensures that new promo can be added correctly
    Given admin set up api endpoint login in promo
    When admin send a HTTP request login in promo
    And admin set the POST api endpoint promo
    And admin sent HTTP POST request post promo
    Then admin receive a valid login and promo HTTP response code 200
#    And admin received valid data for promo

  @TCPROMO02
  Scenario: As admin, I can get all promo data
    Given admin set up api endpoint login in promo
    When admin send a HTTP request login in promo
    And admin set the GET api endpoint promo
    And admin sent HTTP GET request get promo
    Then admin receive a valid login and promo HTTP response code 200
#    And admin receive valid data for all promo

  @TCEVENT03
  Scenario: As admin, I can edit promo data by ID
    Given admin set up api endpoint login in promo
    When admin send a HTTP request login in promo
    And admin set the PUT api endpoint promo
    And admin sent HTTP PUT request get promo by ID
    Then admin receive a valid login and promo HTTP response code 200
#    And admin receive valid data for promo by ID

  @TCEVENT04
  Scenario: As admin, I can delete event data by ID
    Given admin set up api endpoint login in promo
    When admin send a HTTP request login in promo
    And admin set the DEL api endpoint promo
    And admin sent HTTP DEL request promo by ID
    Then admin receive a valid login and promo HTTP response code 200
#    And admin receive valid data for delete promo
