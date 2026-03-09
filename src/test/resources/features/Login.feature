Feature: all login related test scenarios

  Background:
    Given user goes to sign in page

#  Scenario: verify admin can login successfully
#    When user enters username "admin@stockflow.com"
#    And user enters password "password123"
#    And user clicks on sign in button
#    Then verify user signed in successfully
#
#  Scenario: verify specialist can login successfully
#    When user enters username "specialist@stockflow.com"
#    And user enters password "password123"
#    And user clicks on sign in button
#    Then verify user signed in successfully
#
#  Scenario: verify associate can login successfully
#    When user enters username "associate@stockflow.com"
#    And user enters password "password123"
#    And user clicks on sign in button
#    Then verify user signed in successfully

  Scenario Outline: verify all types of users can login
    When user enters username "<username>"
    And user enters password "<password>"
    And user clicks on sign in button
    Then verify user signed in successfully
    Examples:
      | username                 | password    |
      | admin@stockflow.com      | password123 |
      | specialist@stockflow.com | password123 |
      | associate@stockflow.com  | password123 |


  Scenario Outline: verify all types of users fail to login with invalid credentials
    When user enters username "<username>"
    And user enters password "<password>"
    And user clicks on sign in button
    Then verify user failed to sign in
    Examples:
      | username                 | password    |
      | admin@stockflow.com      | password345 |
      | specialist@stockflow.com | password678 |
      | associate@stockflow.com  | password912 |
      | adin@stockflow.com       | password123 |
      | specilist@stockflow.com  | password123 |
      | asociate@stockflow.com   | password123 |
      |                          | password123 |
      | associate@stockflow.com  |             |
      |                          |             |

    


