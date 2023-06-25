Feature: As an admin, I can manage event features

  @TCEVENT01
  Scenario: As admin, I want to see all event data list
    Given admin on the dashboard page in event
    When admin clicks on the event menu
    Then admin can see all event data

  @TCEVENT02
  Scenario: As an admin, I want to add a new event data
    Given admin on the dashboard page in event
    When admin clicks on the event menu
    And admin on the event page
    And admin click the add event button
    And admin click the select photo button
    And admin fills in the event title
    And admin fills in the event description
#    And admin click add article
#    And admin click on the selected article
#    And admin successfully added the article
    And admin fills in the location address
    And admin fills in the google maps link
    And admin fills in the start date
    And admin fills in the finish date
    And admin fills time start
    And admin fills time finish
    And admin click paid ticket mode
    And admin fills in the price
    And admin fills in the amount
    And admin click the save button event
    Then admin managed to add new event data

  @TCEVENT03
  Scenario: As admin, I want to see detail event data
    Given admin on the dashboard page in event
    When admin clicks on the event menu
    And admin click one data event
    Then admin on detail page

  @TCEVENT04
  Scenario: As admin, I want to edit event data
    Given admin on the dashboard page in event
    When admin clicks on the event menu
    And admin on the event page
    And admin click edit on one of the event data
    And admin change the event title
    And admin click the save button event

  @TCEVENT05
  Scenario: As an admin, I want to delete event data
    Given admin on the dashboard page in event
    When admin clicks on the event menu
    And admin click delete on the event data that you want to delete
    Then click yes in the warning
#    Then admin successfully deletes the event data

  @TCEVENT07
  Scenario: As an admin, I cannot add a new event data because blank the photo data
    Given admin on the dashboard page in event
    When admin clicks on the event menu
    And admin on the event page
    And admin click the add event button
    And admin fills in the event title
    And admin fills in the event description
#    And admin click add article
#    And admin click on the selected article
#    And admin successfully added the article
    And admin fills in the location address
    And admin fills in the google maps link
    And admin fills in the start date
    And admin fills in the finish date
    And admin fills time start
    And admin fills time finish
    And admin click paid ticket mode
    And admin fills in the price
    And admin fills in the amount
    And admin click the save button event
    Then admin stays on the add event page

  @TCEVENT08
  Scenario: As an admin, I cannot add a new event data because blank title and description
    Given admin on the dashboard page in event
    When admin clicks on the event menu
    And admin on the event page
    And admin click the add event button
    And admin click the select photo button
#    And admin click add article
#    And admin click on the selected article
#    And admin successfully added the article
    And admin fills in the location address
    And admin fills in the google maps link
    And admin fills in the start date
    And admin fills in the finish date
    And admin fills time start
    And admin fills time finish
    And admin click paid ticket mode
    And admin fills in the price
    And admin fills in the amount
    And admin click the save button event
    Then admin stays on the add event page

  @TCEVENT09
  Scenario: As an admin, I cannot add a new event data because blank address, maps, and time
    Given admin on the dashboard page in event
    When admin clicks on the event menu
    And admin on the event page
    And admin click the add event button
    And admin click the select photo button
    And admin fills in the event title
    And admin fills in the event description
#    And admin click add article
#    And admin click on the selected article
#    And admin successfully added the article
    And admin click paid ticket mode
    And admin fills in the price
    And admin fills in the amount
    And admin click the save button event
    Then admin stays on the add event page

  @TCEVENT10
  Scenario: As an admin, I cannot add a new event data because blank price and amount
    Given admin on the dashboard page in event
    When admin clicks on the event menu
    And admin on the event page
    And admin click the add event button
    And admin click the select photo button
    And admin fills in the event title
    And admin fills in the event description
#    And admin click add article
#    And admin click on the selected article
#    And admin successfully added the article
    And admin fills in the location address
    And admin fills in the google maps link
    And admin fills in the start date
    And admin fills in the finish date
    And admin fills time start
    And admin fills time finish
    And admin click paid ticket mode
    And admin click the save button event
    Then admin stays on the add event page