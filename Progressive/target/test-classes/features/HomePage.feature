Feature: LogIn , Register and explore Products functionality check

  Background:
    Given I am on progressive home page

#  Scenario: check logIn button feature functionality
#    When I click on logIn button
#    Then I should get title "Progressive Online Servicing"

#  Scenario: check login functionality with invalid userId and password
#    And I click on logIn button function
#    And I enter my userId in field Zip Code
#    And i enter my password
#    And i check  save userid box
#    When i click on log in button2
#    Then i should see "The login information you entered does not match our records. Please try again." massage

#  Scenario: check Register feature functionality
#    And I click on logIn button
#    And I click on Register button
#    And i enter my policy Policy number
#    And i enter my Last name
#    And i enter my Date of birth
#    And i enter my Mailing ZIP code
#    When i click on continue button
#    Then I should see " We couldn't find that account. Please try again" massage2

#    Scenario: check explore Products feature functionality
#    When i click on explore Products feature
#    Then i should get title1


#    Scenario: check explore Products feature functionality
#    And i click on explore Products feature
#      When i check  on AtvUtv feature

#
#    Scenario: check explore Products feature functionality
#    And i click on explore Products feature
#      When i click  on Auto feature


#    Scenario: check explore Products feature functionality
#     And i click on explore Products feature
#      When i check  on Boat feature
#      Then i should get titleBoat

#    Scenario: check Classic Car feature functionality
#    And i click on explore Products feature
#      When i check  on classicCar feature
#      Then i should get title Class Car

#    Scenario: check Golf Car feature functionality
#     And i click on explore Products feature
#      When i check  on Golf Car feature
#      Then i should get title Golf Car

#
#     Scenario: check Motor Cycle feature functionality
#     And i click on explore Products feature
#       When i check  on MotorCycle feature
#       Then i should get Motor Cycle Car

#  Scenario: check Mexico Auto feature functionality
#    And i click on explore Products feature
#    When i check  on Mexico Auto feature
#    Then i should get Mexico Auto Car

  Scenario: check Mexico Auto feature functionality
    And i click on explore Products feature
    When i check  on Mexico Auto feature
    Then i should get Mexico Auto Car

#  Scenario: check PWC feature functionality
#    And i click on explore Products feature
#    When i check  on PWC feature
#    Then i should title get PWC