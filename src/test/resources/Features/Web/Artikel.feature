Feature: As an Admin, I want to manage article features

  @articles
  Scenario: As an admin I can view Article data
    Given admin on the dashboard page
    When admin clicks article menu
    Then admin can see all articles

  @articlesDetails
  Scenario: As an admin, I would like to see article details
    Given admin on article page
    When Admin clicks the detail article icon
    Then Admin on the detail article page

    @addNewArticle
  Scenario: As an admin, I want to add a new Article
    Given admin on article page
    When admin click the add article button
    And admin on the add article page
    And admin click the add new article button to add a photos
    And admin fills in the title of the article
    And admin fills in the article description
    And admin click the save button
    Then admin managed to add new article data

  @editArticle
  Scenario: as an admin, I would like to edit the article
    Given admin on article page
    When Admin clicks icon edit article
    And Admin edit the title article
    And Admin edit the description article
    And Admin click save button
    Then Admin gets a notification "the data you entered was successfully saved"

  @deleteArticle
  Scenario: As an admin I want to delete the article
    Given admin on article page
    When Admin clicks the delete article icon on one of the available article data
    And  Admin gets a notification "do you want to delete this data"
    And Admin click yes button
    Then Admin gets a notification "promo successfully deleted"