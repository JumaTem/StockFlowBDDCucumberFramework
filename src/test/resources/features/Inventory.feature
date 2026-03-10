Feature: inventory page related scenarios

  Background:
    Given user goes to sign in page
    And user enters username "specialist@stockflow.com"
    And user enters password "password123"
    And user clicks on sign in button

  Scenario: verify inventory categories filter east distribution center
    Given user navigates to Inventory page
    And verify inventory filters east distribution center

 Scenario: verify inventory categories filter west fulfillment center
    Given user navigates to Inventory page
    And verify inventory filters west fulfillment center
