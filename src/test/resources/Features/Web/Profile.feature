Feature: As admin, I want to update profile and view profile

  @TCPROFILE01
  Scenario: As admin I can see Profile details
    Given admin has logged in Dashboard page
    When admin click Profile button menu
    Then admin see profile details displayed
