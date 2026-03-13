@smoke @regression
Feature: Suppliers page related scenarios

  Background:
    Given user goes to sign in page
    And user enters username "specialist@stockflow.com"
    And user enters password "password123"
    And user clicks on sign in button

    Scenario Outline: verify supplier search works
      Given user navigates to Suppliers page
      When user searches supplier "<supplier>"
      Then verify supplier "<supplier>" is displayed
      Examples:
        | supplier             |
        | Acme Industrial      |
        | AutoParts Direct     |
        | BuildRight Materials |
        | CleanPro Supplies    |
        | Global Parts Co      |
