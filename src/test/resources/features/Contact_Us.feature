Feature: Waikiki - Contact Us Page

  Scenario: Validate successful page
    Given I access page
    When I select first dropdown
    And I select second dropdown
    And I select third dropdown
    And I enter name
    And I enter lastname
    And I enter email
    And I enter phone
    And I enter comment
    And I click on send
    Then I should get successful message


