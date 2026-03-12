@smoke @regression
Feature: products page related scenarios

  Background:
    Given user goes to sign in page
    And user enters username "specialist@stockflow.com"
    And user enters password "password123"
    And user clicks on sign in button

  Scenario: verify product categories filter works
    And user navigates to Products page
    When user selects category in All Categories dropdown verify products of that category are displayed
      | Automotive  |
      | Cleaning    |
      | Electrical  |
      | Electronics |
      | Hardware    |
      | Office      |
      | Packaging   |
      | Plumbing    |
      | Safety      |
      | Tools       |

  Scenario: verify product statuses filter works
    And user navigates to Products page
    When user selects status in All Statuses dropdown verify products of that status are displayed
      | Active       |
      | Discontinued |


