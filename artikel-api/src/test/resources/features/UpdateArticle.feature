@UpdateArticle
Feature: As a user i want to success update Article

  @updateArticleWithValidEndpoint
  Scenario: as user i want to input valid endpoint for update Article
    Given user have endpoint auth for update Article
    When user send request endpoint auth for update Article
    When user has endpoint for update Article
    And user send request to endpoint for update Article
    And Article success to updated with status code 200
    Then user validate data update Article

  @updateArticleWithInvalidEndpoint
  Scenario: as user i want to input invalid endpoint so that i cannot update Article
    Given user have endpoint auth for update Article
    When user send request endpoint auth for update Article
    When user has invalid endpoint for update Article
    And user send request to endpoint invalid for update Article
    And user validate response with code 404
    Then user validate message error response