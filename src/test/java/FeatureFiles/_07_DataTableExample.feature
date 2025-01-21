# Dataprovider(testng),Scenario Outline (Cucumber) ------> Her deger icin tum senayoyu bastan calistirir
# Datatable  ----->  Bir step icin birden cok parametre verilmesni saglar


Feature: DataTable Example
  Scenario: User List
    When write username "Emre"
    And  Write username and password "Emre" and "12345"

    And Write username as DataTable
      | Ali  |
      | Ayse |
      | Mert |

    And Write username and password as DataTable
      | Ali  | 1234 |
      | Ayse | 2464  |
      | Mert | 4567 |


