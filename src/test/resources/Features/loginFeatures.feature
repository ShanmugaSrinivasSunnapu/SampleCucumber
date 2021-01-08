Feature: Smoke Test for facebook login

  Scenario: Facebook login with valid credentials
    Given launch browser and facebook website
    When i enter valid "7984651323" and "djfjfkasdj@123"
    And click on login button
    Then verify facebook title and close