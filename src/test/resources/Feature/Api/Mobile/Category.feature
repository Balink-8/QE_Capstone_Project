Feature: As user, I want to create, put, delete and get category and category by ID

  @TCCATEGORY05
  Scenario: As user I want to create new category
    Given user set up api endpoint login in category in website
    When user send a HTTP request login in category in website
    And user set the POST api endpoint category
    And user sent HTTP POST request post category
    Then user receive a valid login and category HTTP response code 200
#    And user receives valid data to add category data

  @TCCATEGORY06
  Scenario: As user I can get all category data
    Given user set up api endpoint login in category in website
    When user send a HTTP request login in category in website
    And user set the GET api endpoint category
    And user sent HTTP GET request get category by ID
    Then user receive a valid login and category HTTP response code 200
#    And user receive valid data for all category

  @TCCATEGORY07
  Scenario: As user I can edit category data by ID
    Given user set up api endpoint login in category in website
    When user send a HTTP request login in category in website
    And user set the PUT api endpoint category
    And user sent HTTP PUT request category by ID
    Then user receive a valid login and category HTTP response code 200
#    And user receive valid data for category by ID

  @TCCATEGORY08
  Scenario: As user I can delete category data by ID
    Given user set up api endpoint login in category in website
    When user send a HTTP request login in category in website
    And user set the DELETE api endpoint category
    And user sent HTTP DELETE request category by ID
    Then user receive a valid login and category HTTP response code 200
#    And user receive valid data for delete category by ID
