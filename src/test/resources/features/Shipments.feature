@smoke @regression
Feature: shipments page related scenarios

  Background:
    Given user goes to sign in page
    And user enters username "specialist@stockflow.com"
    And user enters password "password123"
    And user clicks on sign in button

  Scenario: verify All Statuses dropdown works correctly
    And user navigates to Shipments page
    When user selects Pending in All Statuses dropdown
    Then verify "Pending" shipments list is displayed

