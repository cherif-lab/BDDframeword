Feature: answers functionality check

  Scenario: check  answers  feature functionality

    Given I am on progressive home page
    When I click on answers function
    Then I should see should see Progressive Answers text1

  Scenario: check  exploreProducts  feature functionality
    Given I am on progressive home page
    And I click on answers function
    When I click exploreProducts
    Then I should see should see Way to Save text2

  Scenario: check  claims  feature functionality
    Given I am on progressive home page
    And I click on answers function
    When I click on claims function
    Then I should see should see report Or Track A Claim text3

  Scenario: check  aboutUs  feature functionality
    Given I am on progressive home page
    And I click on answers function
    When I click on aboutUs function
    Then I should see should see about Progressive  text4