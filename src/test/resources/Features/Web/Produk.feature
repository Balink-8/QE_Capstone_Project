Feature: As a admin, I can manage product features

  @TCProduk01
  Scenario: As a admin, I want to see the details of all Products
    Given admin on the dashboard page
    When the admin click on the Product menu
    Then admin can see all product

  @TCProduk02
  Scenario: As a admin, I want to add Product
    Given admin on the dashboard page
    When the admin click on the Product menu
    And admin on the Product page
    And admin click the add Product button
    And admin click the Product photo button
    And admin fill in the product name
    And admin fill in then Product description
    And admin fill in the Product catagory
    And admin fill in then Product price
    And admin replenish product stock
    And admin click save button
    Then admin successfully add a new Product

  @TCProduk03
  Scenario: As admin, I want to edit produk data
    Given admin on the dashboard page
    When the admin click on the Product menu
    And admin on the Product page
    And admin click edit on one of the produk data
    And admin change the produk title
    And admin click save button

  @TCProduk04
  Scenario: As an admin, I want to delete produk data
    Given admin on the dashboard page
    When the admin click on the Product menu
    And admin on the Product page
    And admin click delete on the produk data that you want to delete
    Then click yes in the warning
#    Then admin successfully deletes the produk data