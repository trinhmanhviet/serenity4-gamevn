Feature: Login to GameVN

  Scenario: Login
    Given user is on homepage
    When user open login form
    When user type username
    When user type password
    Then user can login
