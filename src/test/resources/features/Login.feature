Feature: all login related test scenarios
  Scenario: verify admin can login successfully
    Given user goes to sign in page
    When user enters username "admin@stockflow.com"
    And user enters password "password123"
    And user clicks on sign in button
    Then verify user signed in successfully

  Scenario: verify specialist can login successfully
    Given user goes to sign in page
    When user enters username "specialist@stockflow.com"
    And user enters password "password123"
    And user clicks on sign in button
    Then verify user signed in successfully

  Scenario: verify associate can login successfully
    Given user goes to sign in page
    When user enters username "associate@stockflow.com"
    And user enters password "password123"
    And user clicks on sign in button
    Then verify user signed in successfully

