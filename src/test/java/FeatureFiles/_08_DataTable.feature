Feature: DataTable Functionality

  Background: # before senaryo gibi calisir
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    Scenario: Create Country
      And Click on the element in LeftNav
      | setup      |
      | parameters |
      | country  |

#      And Click on the element in Dialog
#       | addButton |
#
#      And User sending the keys in Dialog
#       | nameInput  | newreeee |
#       | codeInput  | ew346      |
#
#      And Click on the element in Dialog
#       | saveButton |
#
#      Then Success message should be displayed
#
#      And User delete item from Dialog Content
#       | newreeee |