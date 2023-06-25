Feature: As Admin, I want to manage Product features

  @Product
  Scenario: As admin, I can get all Product data
    Given admin set up api auth login
    When admin send a HTTP Request login
    And admin set the GET api endpoint Product
    And admin send HTTP GET request get Product
    Then admin receive a valid login and Product HTTP response code 200

  @GetProductByID
  Scenario: As admin, I can get product data by ID
    Given admin set up api auth login
    When admin send a HTTP Request login
    And admin set the GET api endpoint product by ID
    And admin send HTTP GET request get product by ID
    Then admin receive a valid login and Get product HTTP response code 200

  @addNewProduct
  Scenario: As admin, I can add new product data
    Given admin set up api auth login
    When admin send a HTTP Request login
    And admin set the POST api endpoint Product
    And admin send HTTP POST request post Product
    Then admin receive a valid login and Add New Product HTTP response code 200

  @updateProduct
  Scenario: As admin, I can update product data
    Given admin set up api auth login
    When admin send a HTTP Request login
    And admin set the PUT api endpoint Product
    And admin send HTTP PUT request post Product
    Then admin receive a valid login and Update Product HTTP response code 200

  @deleteProduct
  Scenario: As admin, I can delete product data
    Given admin set up api auth login
    When admin send a HTTP Request login
    And admin set the DEL api endpoint Product
    And admin send HTTP DEL request delete Product
    Then admin receive a valid login and delete Product HTTP response code 200