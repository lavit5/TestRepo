@login @regression

Feature: LogIn Page

  Background:
    Given I access the webdriver login page


  Scenario Outline: Successful and Failed login
    When I enter a unique username <username>
    And I enter a unique password <password>
    And I click on Login button
    Then I should be presented with proper <loginMessage>

    Examples:
      | username  | password      | loginMessage         |
      | webdriver | webdriver123  | validation succeeded |
      | webdriver | webdriver1234 | validation failed    |