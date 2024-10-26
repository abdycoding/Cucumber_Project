Feature: Home Functionality

  Background:
    Given  Navigate to Campus
    When  Enter username and password and click login button
    Then User should login successfully

  Scenario: Assert that the Company logo will direct to the Website

    Given Click on the Company logo
    Then Assert that logo directs to the Website

