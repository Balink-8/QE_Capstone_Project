Feature: As a user i want to get data product

  @TCPRODUCT01
  Scenario: as user i want to input valid endpoint for get product
    Given user have endpoint auth for get data product
    When user send request endpoint auth for get data product
    When user has endpoint for get data product
    And user send request to endpoint for get data product
    And product success to get data product with status code 200
    Then user validate data product

  @TCPRODUCT02
  Scenario: as user i want to input valid endpoint for get product by id
    Given user have endpoint auth for get data product
    When user send request endpoint auth for get data product
    When user has endpoint for get data product by id
    And user send request to endpoint for get data product by id
    And product success to get data product by id with status code 200
    Then user validate data product by id

  @TCPRODUCT03
  Scenario: as user i want to input valid but with invalid ID so that i cannot get product
    Given user have endpoint auth for get data product
    When user send request endpoint auth for get data product
    When user has endpoint for get data product invalid id
    And user send request to endpoint for get data product invalid id
    And product success to get data product invalid id with status code 404
    Then user validate data product invalid id

  @TCPRODUCT04
  Scenario: as user i want to input invalid endpoint so that i cannot get product
    Given user have endpoint auth for get data product
    When user send request endpoint auth for get data product
    When user has invalid endpoint for get data product
    And user send request to invalid endpoint for get data product
    And user validate with status code 404
    Then user validate message response