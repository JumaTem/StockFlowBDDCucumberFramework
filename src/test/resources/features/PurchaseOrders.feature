@smoke @regression
Feature: purchase order page related scenarios

  Background:
    Given user goes to sign in page
    And user enters username "specialist@stockflow.com"
    And user enters password "password123"
    And user clicks on sign in button

  Scenario: verify All statuses dropdown works
    Given user is on the Purchase orders page
    When user selects Sent from dropdown
    Then only purchase orders with status Sent should be displayed

#  Scenario: verify All suppliers dropdown works
#    Given user is on the Purchase orders page
#    When user selects supplier TechSource Ltd from dropdown
#    Then only purchase orders from TechSource Ltd should be displayed

#    Scenario: user creates a new purchase order
#      Given user is on the Purchase orders page
#      When user clicks on "Create PO"
#      And user selects supplier ""
#      And user selects expected date
#      And User selects product
#      And user enters quantity
#      And user clicks "Create PO"