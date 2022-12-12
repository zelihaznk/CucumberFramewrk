@datatable
Feature: US1009 Datatables sitesine 5 farkli giris yapalim


  Scenario Outline: TC14 kullanici 5 farkli kayit girisi yapabilmeli

    When kullanici "datatablesUrl" sayfasina gider
    Then new butonuna basar
    And isim bolumune "<firstname>" yazar
    And kullanici 1 sn bekler
    And soyisim bolumune "<lastName>" yazar
    And kullanici 1 sn bekler
    And position bolumune "<position>" yazar
    And kullanici 1 sn bekler
    And ofis bolumune "<office>" yazar
    And kullanici 1 sn bekler
    And extension bolumune "<extension>" yazar
    And kullanici 1 sn bekler
    And startDate bolumune "<startDate>" yazar
    And kullanici 1 sn bekler
    And salary bolumune "<salary>" yazar
    And kullanici 1 sn bekler
    And Create tusuna basar
    When kullanici "<firstname>" ile arama yapar
    And kullanici 1 sn bekler
    Then isim bolumunde "<firstname>" oldugunu test eder
    And kullanici 1 sn bekler


    Examples:
      | firstname | lastName | position | office | extension | startDate  | salary |
      | Berk      | Can      | tester   | ankara | api       | 2022-05-05 | 11000  |
      | Huseyin   | Kacmaz   | BA       | berlin | UI        | 2022-07-10 | 40000  |
      | Fatih     | Sahin    | PO       | berlin | Appium    | 2022-03-12 | 45000  |
      | Ahmet     | Kaya     | Tester   | ankara | database  | 2022-06-06 | 11000  |

  Scenario:kapat
    And sayfayi kapatir