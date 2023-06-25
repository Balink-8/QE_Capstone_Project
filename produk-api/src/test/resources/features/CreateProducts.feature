Feature: As a user i want to success create a new product

  @TCPRODUCT05
  Scenario: as user i want to input valid endpoint for create a new product
    Given user have endpoint auth for create a new product
    When user send request endpoint auth for create a new product
    When user has endpoint to get user create a new product
    And user send request to endpoint for create a new product
    And product success to created with status code 200
    Then user validate data new product

  @TCPRODUCT06
  Scenario: as user i want to input invalid endpoint for create a new product
    Given user have endpoint auth for create a new product
    When user send request endpoint auth for create a new product
    When user has invalid endpoint to get user create a new product
    And user send request to invalid endpoint for create a new product
    And product cannot success to created with status code 404
    Then user validate data pesan error

  @TCPRODUCT07
  Scenario: as user i want to input invalid endpoint for create a new product
    Given user have endpoint auth for create a new product
    When user send request endpoint auth for create a new product
    When user has invalid endpoint to get user create a new product
    And user send request to invalid endpoint for create a new product
    And product cannot success to created with status code 404
    Then user validate data pesan error

