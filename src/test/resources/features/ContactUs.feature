@contactUs @regression

Feature: WebDriver Contact Us Page

  Scenario: Validate Successful Submission - Unique Data
    Given I access the webdriver contact us page
    When I enter a unique first name
    And I enter a unique last name
    And I enter a unique email address
    And I add comment
    And I click on the submit button
    Then I should be presented with successful message

  @smoke
  Scenario: Validate Successful Submission - Specific Data
    Given I access the webdriver contact us page
    When I enter a specific first name Baja
    And I enter a specific last name Bajic
    And I enter a specific email address bajabajic@bajislav.net
    And I enter specific comment "Komentar!"
    And I click on the submit button
    Then I should be presented with successful message
