Feature: As a Admin, i have successfully logout

  @Logout
  Scenario: as a admin i want lo logout
    Given admin on dashboard pages
    When admin click icon exit
    And admin click button confirm yes
    Then Admin gets a notification "Admin logged out successfully"
