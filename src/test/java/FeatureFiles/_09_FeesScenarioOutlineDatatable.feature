#Bu senaryayyo 5 faarkli kombinasyon icin calistiriniz.


Feature: Fees Multiple values functionality
  Background: # before senaryo gibi calisir
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: Fee Functionality
    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | fee        |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput       | <name> |
      | codeInput       | <code>  |
      | integrationCode | <intCode> |
      | priority        | <priority>   |

    And Click on the element in Dialog
      | saveAdCloseButton |

    And Success message should be displayed

    And User delete item from Dialog Content
      | nbhbvgjl |
    Examples:
      | name       | code   | intCode | priority |
      | dasqdadas    | frscedwt | 1238562945 | 17282319   |
      | dasqdsddasdas | freawrdwt | 1238215945 | 1317289   |
      | newtestcc  | frevbgdwt | 1238944125 | 1753289   |


