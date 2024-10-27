Feature: Messaging Functionality

  Background:
    Given  Navigate to Campus
    When  Enter username and password and click login button
    Then User should login successfully

    Scenario: Hover over the messaging menu

      And Click on the Element in HeaderMenu
      |hamburgerMenu|

      And Hover over the messsaging menu