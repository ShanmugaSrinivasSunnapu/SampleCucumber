Feature: facebook registration page testing

  Scenario: Fill the registration form of facebook
    Given Launch browser and facebook registration page
    When Fill the valid information
     
    And Click on Sign Up button
    Then User registration should be successful
