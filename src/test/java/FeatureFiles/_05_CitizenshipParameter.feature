#Senaryo
#CitizenShip sayfasına gidiniz.
#Create işlemini parameter yöntemi ile dogrulayiniz
#Daha sonra ayni bilgilerle tekrar crate yapilmadigini dogrulayiniz
Feature: Citizenship Parameter
  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to citizenship

    Scenario: Create citizenship 1
      When Create a citizensip name as "teknoka4" shortName as "kka4"
      Then Success message should be displayed

    Scenario: Create citizenship 2
      When Create a citizensip name as "teknoka4" shortName as "kka4"
      Then Already exist message should be displayed

