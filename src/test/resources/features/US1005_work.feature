@us005
Feature: US005

  Scenario: TC11 kullanici gecersiz bilgilerle giris saglayamamali
    Given kullanici "brcUrl" sayfasina gider
    Then login butonuna tiklar
    Then gecersiz email girer
    Then gecersiz password girer
    And login butonuna basar
    And sayfaya giris yapilamadigini test eder
    And sayfayi kapatir