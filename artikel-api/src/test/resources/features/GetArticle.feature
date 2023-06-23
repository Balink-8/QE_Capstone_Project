@GetArticle
Feature: As a user i want to get data Article

  @GetAllArticleWithValidEndpoint
  Scenario: as user i want to input valid endpoint for get Article
    Given user have endpoint auth for get data Article
    When user send request endpoint auth for get data Article
    When user has endpoint for get data Article
    And user send request to endpoint for get data Article
    And Article success to get data Article with status code 200
    Then user validate data Article

  @GetArticleByID
  Scenario: as user i want to input valid endpoint for get Article by id
    Given user have endpoint auth for get data Article
    When user send request endpoint auth for get data Article
    When user has endpoint for get data Article by id
    And user send request to endpoint for get data Article by id
    And Article success to get data Article by id with status code 200
    Then user validate data Article by id

  @GetArticleInvalidID
  Scenario: as user i want to input valid but with invalid ID so that i cannot get Article
    Given user have endpoint auth for get data Article
    When user send request endpoint auth for get data Article
    When user has endpoint for get data Article invalid id
    And user send request to endpoint for get data Article invalid id
    And Article success to get data Article invalid id with status code 404
    Then user validate data Article invalid id

  @GetArticleInvalidEndpoint
  Scenario: as user i want to input invalid endpoint so that i cannot get Article
    Given user have endpoint auth for get data Article
    When user send request endpoint auth for get data Article
    When user has invalid endpoint for get data Article
    And user send request to invalid endpoint for get data Article
    And user validate with status code 404
    Then user validate message response