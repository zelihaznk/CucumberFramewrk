@us1004
Feature: US1004 kullanici parametre ile configuration file'i kullanabilmeli

  Scenario: TC07 configuration properties dosyasindan parametre kullanimi
    Given kullanici "brcUrl" sayfasina gider
    Then kullanici 5 sn bekler
    And url'in "blue" icerdigini test eder
    Then sayfayi kapatir


