@site
Feature: US004 parametre kullanimi

  Scenario: TC01
    Given kullanici "https://www.google.com" sitesine gider
    Then kullanici 2 sn bekler
    And url'in "google" icerdigini test eder
    And sayfayi kapatir
    #configreader dan almadan direk url