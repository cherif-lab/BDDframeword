Feature:login functionality check

  Background:
    Given I am on delta Home Page
  @SmokeTest
  Scenario: check functionality of login account with invalid username and password
    And I click on logIn button
    And I enter my user name
    And I enter my password
    And I click on box keep me login
    When I click on button login
   Then I shouldn't see me login successfully

#  @Test
#  Scenario Outline: search box check
#    And I click on search box button
#    And I enter "<topics>" in search box and i click enter
#    Then i should see "<expectedResult>" window displayed

#    Examples:
#    |topics         |  expectedResult |
#    |Need Help      |  SEARCH RESULTS |
#    |Coronavirus   |  SEARCH RESULTS|
#    |Cancel Flight | SEARCH RESULTS  |
  Scenario: check DELTA ONE® functionality
    When I mouse hover on Travel Info feature
    Then I click on DELTA ONE® function
    And I should see title window displayed