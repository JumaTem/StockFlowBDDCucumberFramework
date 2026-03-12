Feature: Warehouses page functionality

  Background:
    Given user goes to sign in page
    And user enters username "specialist@stockflow.com"
    And user enters password "password123"
    And user clicks on sign in button

  Scenario: Verify warehouse links open correct warehouse pages
    Given user navigates to Warehouses page
    When user clicks each warehouse name
    Then verify warehouse URL contains correct warehouse ID

  Scenario: Verify warehouse preview opens correctly
    Given user navigates to Warehouses page
    When user clicks each warehouse preview box
    Then verify preview shows correct warehouse information

