@w1
Feature: Gecersiz giris bilgileri ile siteye girilmemeli

  Scenario Outline: TC11 kullanici gecersiz bilgilerle giris yapar

    Given kullanici "brcUrl" sayfasina gider
    Then login butonuna tiklar
    And gecersiz email "<email>" girer
    And gecersiz password "<password>" girer
    And kullanici 3 sn bekler
    And login butonuna basar
    Then sayfaya giris yapilamadigini test eder
    And sayfayi kapatir

    Examples:
      | email              | password |
      | Manager5@gmail.com | manager1 |
      | Manager6@gmail.com | manager4 |
      | Manager7@gmail.com | manager5 |

