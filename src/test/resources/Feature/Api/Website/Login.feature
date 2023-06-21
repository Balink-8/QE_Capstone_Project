Feature: As a admin, I logged in successfully

  @Login
  Scenario: As Admin I want to input valid data to then i can see success login
    Given Admin has set endpoint login
    When Admin send POST HTTP request login
    Then Admin see response code login 200