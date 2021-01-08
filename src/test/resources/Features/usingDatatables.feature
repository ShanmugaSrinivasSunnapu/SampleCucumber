Feature: Login test with gmail

  Scenario: Gmail Login with valid username and password
    Given User launch browser and open facebook website
    When User enter the valid username and password
      | Sunnapu Shanmuga Srinivas | Honeyseenu@1facebook |
    And User clicks on the signin button
    Then Close the browser
