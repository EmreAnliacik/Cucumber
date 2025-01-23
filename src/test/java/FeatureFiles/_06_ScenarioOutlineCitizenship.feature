#Senaryo
#CitizenShip sayfasına gidiniz.
#Create işlemini parameter yöntemi ile dogrulayiniz
#Daha sonra ayni bilgilerle tekrar crate yapilmadigini dogrulayiniz(negatif test)
#Olusturulan her citizenshipi siliniz
Feature: Citizenship Outline Scenario
  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to citizenship

  Scenario Outline: Create citizenship and check duplicate
    When Create a citizenship name as "<name>" shortName as "<shortName>"
    Then Success message should be displayed
    When Create a citizenship name as "<name>" shortName as "<shortName>"
    Then Already exist message should be displayed
    When Delete a citizenship name as "<name>" shortName as "<shortName>"
    Then Success message should be displayed

    Examples:
      | name     | shortName |
      | 1tekdszxxzndosAdadadddDSDSDBBkdczxdssadsa5 | 11fdfkddsdaSDDfFddrvreaCXVssska5      |
      | 2teksanxdaadvfsdAxZDSsdasdsfdasaddoddfsfsdka6 | 22kkfdacgdadadaxfdfsdfdasWEfa6      |
#      | 3tedcdadssddXZADasdkndsfoka7 | 33kffdgrsvdxzddcvaCXka7      |
  #    | 4teknsadfdadaerdxzagoxcbka8 | 44kfwedfd32cxQgka8      |
