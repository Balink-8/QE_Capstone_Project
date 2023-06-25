Feature: As a user i want to success update product

  @TCPRODUCT09
  Scenario: as user i want to input valid endpoint for update product
    Given user have endpoint auth for update product
    When user send request endpoint auth for update product
    When user has endpoint for update product
    And user send request to endpoint for update product
    And product success to update product with status code 200
    Then user validate data update product

  @TCPRODUCT10
  Scenario: as user i want to input invalid endpoint so that i cannot update product
    Given user have endpoint auth for update product
    When user send request endpoint auth for update product
    When user has invalid endpoint for update product
    And user send request to endpoint invalid for update product
    And user validate response with code 404
    Then user validate message error response