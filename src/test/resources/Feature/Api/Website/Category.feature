Feature: As admin, I want to create, put, delete and get category and category by ID

  @TCCATEGORY01
  Scenario: As admin, I want to create new category
    Given admin set up api endpoint login in category in website
    When admin send a HTTP request login in category in website
    And admin set the POST api endpoint category
    And admin sent HTTP POST request post category
    Then admin receive a valid login and category HTTP response code 200
#    And admin receives valid data to add category data

  @TCCATEGORY02
  Scenario: As admin, I can get all category data
    Given admin set up api endpoint login in category in website
    When admin send a HTTP request login in category in website
    And admin set the GET api endpoint category
    And admin sent HTTP GET request get category by ID
    Then admin receive a valid login and category HTTP response code 200
#    And admin receive valid data for all category

  @TCCATEGORY03
  Scenario: As admin, I can edit category data by ID
    Given admin set up api endpoint login in category in website
    When admin send a HTTP request login in category in website
    And admin set the PUT api endpoint category
    And admin sent HTTP PUT request category by ID
    Then admin receive a valid login and category HTTP response code 200
#    And admin receive valid data for category by ID

  @TCCATEGORY04
  Scenario: As admin, I can delete category data by ID
    Given admin set up api endpoint login in category in website
    When admin send a HTTP request login in category in website
    And admin set the DELETE api endpoint category
    And admin sent HTTP DELETE request category by ID
    Then admin receive a valid login and category HTTP response code 200
#    And admin receive valid data for delete category by ID
