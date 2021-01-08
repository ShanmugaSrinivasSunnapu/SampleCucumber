Feature: Facebook login with multiple usernames and passwords

  Scenario Outline: Facebook Login Scenarios
    Given User is Launch browser and facebook application
    When User enters <Usernames> and <Passwords>
    And User click on login button to get home page
    Then User logged into Facebook homepage

    Examples: 
      | Usernames           | Passwords     |
      | dfjsdfjds@gmail.com | Honeyseenu@1  |
      | hgiemjjj@gmail.com  | Honeyafjvkj@1 |
      | djsf;jhdf@gmail.com | hakdjhf@1234  |
      | Harish@gmail.com    | 123@123       |
