Feature: sky miles functionality check

  Scenario: check functionality of join Sky Miles For Free
       Given I am on delta Home Page
        And I mouse hover on sky miles
        When I click on join Sky Miles For Free feature
        Then I should see JOIN SKYMILES text

  Scenario: check functionality of my Sky Miles
       Given I am on delta Home Page
        And I mouse hover on sky miles
        When I click on my Sky Miles  feature
        Then I should see Log In To Delta text1

  Scenario: check functionality of get To Know Sky Miles
       Given I am on delta Home Page
        And I mouse hover on sky miles
        When I click on get To Know Sky Miles feature
        Then I should see SkyMiles Program text2

  Scenario: check functionality of how To Use Miles
       Given I am on delta Home Page
        And I mouse hover on sky miles
        When I click on  how To Use Miles feature
        Then I should see How to Earn Miles text3

  Scenario: check functionality of howTo Earn Miles
       Given I am on delta Home Page
        And I mouse hover on sky miles
        When I click how To Earn Miles feature
        Then I should see JOIN SKY MILES text4