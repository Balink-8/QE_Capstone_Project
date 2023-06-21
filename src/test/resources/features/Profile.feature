Feature: As user, I want to edit profil

  @TCEDITPROFIL01
  Scenario: As a user, I want to edit profile
    Given user has logged in home page
    When user click Profile button menu
    And user click edit button
    And user input "naardha@gmail.com" on email field in edit
    And user input "085748682562" on telephone number field
    And user input "Nganjuk" on address field
    And user click save button
#    Then user successfully edit profile