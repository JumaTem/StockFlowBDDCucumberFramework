  Feature: products page related scenarios

    Background:
      Given user goes to sign in page
      And user enters username "specialist@stockflow.com"
      And user enters password "password123"
      And user clicks on sign in button

    Scenario: verify product categories filter works
      And user navigates to Products page
#      When user selects Cleaning in All Categories dropdown
#      Then verify "Cleaning" products are displayed
