Feature: Messaging Functionality

  Background:
    Given  Navigate to Campus
    When  Enter username and password and click login button
    Then User should login successfully

  Scenario: Sending new message

    And Click on the Element in HeaderMenu
      | hamburgerMenu |

    And Hover over the Element in HeaderMenu
      | messaging |

    And Click on the Element in HeaderMenu
      | sendMessage |

    And Click on the Element in DialogContent
      | addReceiver       |
      | checkbox1st       |
      | addClose          |
      | selectMessagetype |
      | email             |

    And Click on the Escape Button

    And User sending the keys in Dialog
      | subject | Coding teaches Algorithm |

    And Enter into different window

    And User sending the keys in Dialog
      | textArea | Hello World |

    And Return into main window

    And Click on the Element in DialogContent
      | sendButton |
    And Success message should be displayed