Feature: Central Warehouse - Locations functionality


  Background:
    Given user goes to sign in page
    And user enters username "specialist@stockflow.com"
    And user enters password "password123"
    And user clicks on sign in button
    And user navigates to Central Warehouse page

  Scenario: Verify location status can be changed
    When user blocks an active location
    Then verify location becomes Blocked
    And verify blocked count updates

  Scenario: Verify search by location code works
    When user searches for "A04"
    Then verify only locations with code "A04" are displayed

  Scenario: Verify filtering by Active status works
    When user selects Active in status filter
    Then verify all displayed locations are Active