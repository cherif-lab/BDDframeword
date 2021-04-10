Feature: travel info feature check


  Scenario: check DELTA ONE® functionality
    Given I am on delta Home Page
    When I mouse hover on Travel Info feature
    Then I click on DELTA ONE® function
    And I should see title window displayed

  Scenario: check delta Premium select functionality
    Given I am on delta Home Page
    And I mouse hover on Travel Info feature
    When  I click on delta premium select function
    Then I should see title5 window displayed


  Scenario: check delta first class functionality
    Given I am on delta Home Page
    And I mouse hover on Travel Info feature
    When  I click on firstClass function
    Then I should see title2 window displayed


  Scenario: check deltaComfortPlus  functionality
    Given I am on delta Home Page
    And I mouse hover on Travel Info feature
    When  I click on deltaComfortPlus function
    Then I should see title3 window displayed

  Scenario: check main Cabin functionality
    Given I am on delta Home Page
    And I mouse hover on Travel Info feature
    When  I click on mainCabin function
    Then I should see title4 window displayed
