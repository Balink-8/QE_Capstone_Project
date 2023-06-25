Feature: As User, I register in successfully

  @Register
  Scenario: As user I want to input valid data to then i can see success register
    Given user has set endpoint register
    When user send POST HTTP request register
    Then user see response code register 200