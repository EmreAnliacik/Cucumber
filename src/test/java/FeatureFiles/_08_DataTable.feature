Feature: DataTable Functionality

  Background: # before senaryo gibi calisir
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create Country
    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | country    |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | birikiiDi |
      | codeInput | 143255    |

    And Click on the element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete item from Dialog Content
      | birikiiDi |




    Then Success message should be displayed

  Scenario: Create Nationality
    And Click on the element in LeftNav
      | setup         |
      | parameters    |
      | nationalities |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | SaweeeGdish |

    And Click on the element in Dialog
      | saveButton |

    And Success message should be displayed

  Scenario: Fee Functionality
    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | fee        |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput       | dasqdas |
      | codeInput       | fredwt       |
      | integrationCode | 1238945       |
      | priority        | 17289           |

    And Click on the element in Dialog
      |saveAdCloseButton  |

    And Success message should be displayed

    And User delete item from Dialog Content
    |dasdas|




