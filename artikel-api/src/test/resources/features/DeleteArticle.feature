@DeleteArticle
Feature: As a user i want to delete Article

  @DeleteArticleWithValidEndpoint
  Scenario: as user i want to input valid endpoint for delete Article
    Given user have endpoint auth for delete Article
    When user send request endpoint auth for delete Article
    When user has endpoint for delete Article
    And user send request to endpoint for delete Article
    And Article success to delete Article with status code 200
    Then user validate data delete Article

  @DeleteArticleWithInvalidEndpoint
  Scenario: as user i want to input invalid endpoint for delete Article
    Given user have endpoint auth for delete Article
    When user send request endpoint auth for delete Article
    When user has invalid endpoint for delete Article
    And user send request to invalid endpoint for delete Article
    And product cannot to delete Article with status code 404
    Then user validate data delete Article with invalid endpoint