Feature: As admin, I want to view category and view category by ID

  @TCCATEGORY01
  Scenario: As admin I can see transaction event or product and see transaction by ID details
    Given admin has logged in dashboard Page
    When admin click Kategori button menu
    Then admin see kategori details displayed

  @TCCATEGORY02
  Scenario:  As admin I can add new categories
    Given admin has logged in dashboard page
    When admin click Kategori button menu
    And admin click Tambah Kategori button menu
    And admin input category name valid on the category name field
    And admin input category description valid on the category description field
    And admin click simpan button
    Then admin see notification Berhasil Disimpan displayed

  @TCCATEGORY03
  Scenario: As admin I can edit categories
    Given admin has logged in dashboard page
    When admin click Kategori button menu
    And admin click Edit Kategori button menu
    And admin input category name valid on the category name field
    And admin input category description valid on the category description field
    And admin click Simpan button
    Then admin see notification Berhasil Disimpan displayed

  @TCCATEGORY04
  Scenario: As admin I can delete categories
    Given admin has logged in dashboard page
    When admin click Kategori button menu
    And admin click Delete Kategori button menu
    Then admin success delete category product