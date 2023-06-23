@CreateAticle
Feature: As a user i want to success create a new article

  @CreateANewArticleWithValidEndpoint
  Scenario: as user i want to input valid endpoint for create a new article
    Given user have endpoint auth for create a new article
    When user send request endpoint auth for create a new article
    When user has endpoint to get user create a new article
    And user send request to endpoint for create a new article
    And article success to created with status code 200
    Then user validate data new article

  @CreateANewArticleWithInvalidEndpoint
  Scenario: as user i want to input invalid endpoint for create a new article
    Given user have endpoint auth for create a new article
    When user send request endpoint auth for create a new article
    When user has invalid endpoint to get user create a new article
    And user send request to invalid endpoint for create a new article
    And article cannot success to created with status code 404
    Then user validate data pesan error

