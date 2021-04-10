Feature: Home page features functionality check

  Scenario Outline: check deals  functionality
    Given I am on Hotels home page
    And i click on Deals feature
    And i enter my destination "<destination>"
    And i choose my checkIn "<checkIn>" date
    And i choose my checkOut "<checkout>" date
    And i choose rooms "<rooms>"
    And i choose adults "<adults>"
    And i choose  children "<children>"
    When i click on show deals button
    Then  verify title "<title>"

    Examples:
      | destination                                  | checkIn    | checkout   | rooms | adults | children | title                                                               |
      | New York, New York, United States of America | 04/10/2021 | 04/13/2021 | 1     | 2      | 2        | Hotels.com - hotels in New York, New York, United States of America |


  Scenario Outline: check deals feature functionality
    Given I am on Hotels home page
    When i click on Deals feature
    Then page with  "<url>" should displayed
    Examples:
      | url                                                                        |
      | https://www.hotels.com/hotel-deals/?intlid=HOME+%3A%3A+header_main_section |

  Scenario Outline: check Things To Do functionality
    Given I am on Hotels home page
    When I click on Things To Do feature
    Then  verify url  "<url>"
    Examples:
      | url                                                                         |
      | https://travel.hotels.com/Activities?intlid=HOME+%3A%3A+header_main_section |

  Scenario: check signIn feature functionality
    Given I am on Hotels home page
    When  I click on signIn button
    Then I verify text "Hotels.com - Deals & Discounts for Hotel Reservations from Luxury Hotels to Budget Accommodations" is displayed

  Scenario: check signIn functionality
    Given I am on Hotels home page
    And  I click on signIn button
    And I enter my email address
    And I enter my password
    When  I click on signIn2 button
    Then I should see "ameur" mesage at the top right of the window


  Scenario: check help feature functionality
    Given I am on Hotels home page
    And I click on help feature
    And I click on change my booking
    And I enter my email address
    And I enter my password
    When  I click on signIn2 button

  Scenario Outline: check FaQs feature functionality
    Given I am on Hotels home page
    And I click on help feature
    When I click on FAQs
    Then verify title "<title>"
    Examples:
      | title                   |
      | Customer Service Portal |


  Scenario: check USD feature functionality
    Given I am on Hotels home page
    And i click on USD feature
    When i click on US Dollar feature
    Then verify TiTle "Hotels.com - Deals & Discounts for Hotel Reservations from Luxury Hotels to Budget Accommodations" of page displayed


  Scenario: check navigation of help feature functionality
    Given I am on Hotels home page
    And I click on help feature
    When I click on change my booking
    Then  I get url
    And i navigate back to help page
    And I verify titLe "Hotels.com - Deals & Discounts for Hotel Reservations from Luxury Hotels to Budget Accommodations"