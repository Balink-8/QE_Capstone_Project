Feature: As admin, I want to update profile and view profile

  @TCPROFILE01
  Scenario: As admin I can see Profile details
    Given admin has logged in Dashboard page
    When admin click Profile button menu
    Then admin see profile details displayed

  @TCPROFILE02
  Scenario: As an admin, I want to update company information profile details
    Given admin has logged in dashboard page
    When admin click Profile button menu
    And admin click Edit Profile button
    And admin input email valid on the email field
    And admin input phone number valid on the phone number field
    And admin input whatsapp number valid on the whatsapp number field
    And admin input instagram username valid on the instagram username field
    And admin input facebook username valid on the facebook username field
    And admin click Simpan button
    Then admin see notification Berhasil Disimpan displayed

  @TCPROFILE03
  Scenario: As an admin, I want to update company address profile details
    Given admin has logged in dashboard page
    When admin click Profile button menu
    And admin click Edit Profile button
    And admin input country valid on the country field
    And admin input zip code valid on the zip code field
    And admin input address valid on the address field
    And admin click Simpan button
    Then admin see notification Berhasil Disimpan displayed
