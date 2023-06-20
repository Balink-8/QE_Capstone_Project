Feature: As Admin, I want to manage promo feature

  @Promo
  Scenario: As Admin, I want to see all promo data
    Given admin on dashboard page
    When admin click promo menu
    Then admin can see all promo data

  @addPromo
  Scenario: As an admin, I would like to add a promo code to the product
    Given admin on promo page
    When Admin clicks the add promo button
    And Admin on the add promo page
    And Admin input the promo name in the promo name field
    And Admin input the promo description in the promo description field
    And Admin input the promo code in the promo code field
    And Admin input the discount in the discount field
    And Admin clicks the save button
    Then the Admin gets a notification "the data you entered was successfully saved"


  @PromoDetail
  Scenario: As an admin, I would like to see promo details on products
    Given admin on promo page
    When Admin clicks the detail promo icon on one of the available promo data
    Then Admin on the detail promo page

  @editPromo
  Scenario: as an admin, I would like to edit the promo
    Given admin on promo page
    When Admin clicks icon edit promo
    And Admin edit the promo name in the promo name field
    And Admin edit the promo code in the promo code field
    And Admin clicks the save button
    Then the Admin gets a notification "the data you entered was successfully saved"

  @deletePromo
  Scenario: As an admin I want to delete the promo on the product
    Given admin on promo page
    When Admin clicks the delete promo icon on one of the available promo data
    And  Admin gets a notification "do you want to delete this data"
    And Admin click the yes button
    Then Admin gets a notification "promo successfully deleted"