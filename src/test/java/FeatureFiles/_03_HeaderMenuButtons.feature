Feature: Home Functionality

  Background:
    Given  Navigate to Campus
    When  Enter username and password and click login button
    Then User should login successfully

  Scenario: Assert that the header menu buttons are working properly

   And Click on the Element in HeaderMenu
     | assignments |
     | grading     |
     | profile     |
     | courses     |
     | calendar    |
     | attendance  |
     | messages    |
     | hamburgerMenu |





