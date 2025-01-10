Feature: Counrty Multi Scenario

  Background: # before senaryo gibi calisir
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to country

    Scenario: Create Country
      When Cretae a country
      Then Success message should be displayed

    Scenario: Create country 2
      When Cretae a country name as "emr345" code as "k33"
      Then Success message should be displayed
