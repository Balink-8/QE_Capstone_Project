Feature: As Admin, I want to manage promo feature

  @Promo
  Scenario: As Admin, I want to see all promo data
    Given admin on dashboard page
    When admin click promo menu
    Then admin can see all promo data