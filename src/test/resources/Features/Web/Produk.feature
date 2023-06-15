Feature: As a admin, I can manage product features

  @TCProduct01
  Scenario: As admin, I want to see all produk data list
    Given admin on the dashboard page
    When admin clicks on the produk menu
    Then admin can see all produk data

  @TCProduct02
  Scenario: As a admin, I want to add Product
    Given admin on Dashabord Product
    When admin click Product menu
    And admin on the Product page
    And admin click the add Product button
    And admin on the add Product page
    And admin click the Product photo button
    And admin Successfully add Product photo
    And admin fill in the product name
    And admin fill in then Product description
    And admin fill in the Product catagory
    And admin fill in then Product price
    And admin replenish product stock
    And admin click save button
    Then Then admin successfully add a new Product

  @TCProduct03
  Scenario: As a admin, I want to edit Product
    Given admin on Dashabord Product
    When admin click Product menu
    And admin on the Product page
    And admin click edit on one of the product
    And admin to the Product page to be
    And admin click the edit button
    And admin change Product category
    And admin click to save button
    Then admin successfully add a new Product

  @TCProduct04
  Scenario: As an admin, I want to delete Product
    Given admin on Dashabord Product
    When admin click Product menu
    And admin on the Product page
    And admin click delete the product want to delete
    Then admin successfully delete the Product

