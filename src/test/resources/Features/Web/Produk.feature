Feature: As a admin, I can manage product features

  @TCProduct01
  Scenario: As admin, i can success to see data product so that i can manage product on app
    Given admin on login page
    When admin input valid username in the username field
    And admin input a valid password in the password field
    And admin click Login button
    Then Admin on dashboard page
    And admin click Produk menu
    Then admin can see data produk on app

  @TCProduct02
  Scenario: As admin, i can success to add data product so that i can manage product on app
    Given admin on login page
    When admin input valid username in the username field
    And admin input a valid password in the password field
    And admin click Login button
    Then Admin on dashboard page
    And admin click Produk menu
    And admin click tambah produk button
    And admin on tambah produk page
    And admin input foto produk
    And admin input nama produk
    And admin input kategori produk
    And admin input harga produk
    And admin input stok produk
    Then data produk success to created

  @TCProduct03
  Scenario: As admin, i can success to edit data product so that i can manage product on app
    Given admin on login page
    When admin input valid username in the username field
    And admin input a valid password in the password field
    And admin click Login button
    Then Admin on dashboard page
    And admin click Produk menu
    And admin click edit produk button
    And admin on edit produk page
    And admin input foto produk
    And admin input nama produk
    And admin input kategori produk
    And admin input harga produk
    And admin input stok produk
    Then data produk success to edited

  @TCProduct04
  Scenario: As admin, i can success to delete data product so that i can manage product on app
    Given admin on login page
    When admin input valid username in the username field
    And admin input a valid password in the password field
    And admin click Login button
    Then Admin on dashboard page
    And admin click Produk menu
    And admin click delete produk button
    Then admin successfully delete data produk


