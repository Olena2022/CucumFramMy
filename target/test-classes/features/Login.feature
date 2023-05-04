Feature: Validation of login scenario

  Scenario: Admin login
    Given user is navigated to HRMS application
    When user enters valid admin credentials
    And user clicks on login button
    Then admin user is successfully logged in