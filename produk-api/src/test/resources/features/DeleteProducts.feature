@DeleteProduct
Feature: As a user i want to delete product

  @DeleteProductWithValidEndpoint
  Scenario: as user i want to input valid endpoint for delete product
    Given user have endpoint auth for delete product
    When user send request endpoint auth for delete product
    When user has endpoint for delete product
    And user send request to endpoint for delete product
    And product success to delete product with status code 200
    Then user validate data delete product

  @DeleteProductWithInvalidEndpoint
  Scenario: as user i want to input invalid endpoint for delete product
    Given user have endpoint auth for delete product
    When user send request endpoint auth for delete product
    When user has invalid endpoint for delete product
    And user send request to invalid endpoint for delete product
    And product cannot to delete product with status code 404
    Then user validate data delete product with invalid endpoint