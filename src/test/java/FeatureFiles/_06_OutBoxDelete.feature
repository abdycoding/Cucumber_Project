Feature: Messaging Functionality

  Background:
    Given  Navigate to Campus
    When  Enter username and password and click login button
    Then User should login successfully

  Scenario: Deleting Message from Outbox

    And Click on the Element in HeaderMenu
      | hamburgerMenu |

    And Hover over the Element in HeaderMenu
      | messaging |

    And Click on the Element in HeaderMenu
      | outbox |

    And Click on the Element in DialogContent
      | delete    |
      | yesButton |

    And Success message should be displayed

