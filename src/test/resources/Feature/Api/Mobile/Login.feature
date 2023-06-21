Feature: As a user, I logged in successfully

  @LoginMobile
  Scenario: As user I want to input valid data to then i can see success login
    Given User has set endpoint login
    When User send POST HTTP request login
    Then User see response code login 200