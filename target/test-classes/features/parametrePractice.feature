@p2
Feature: US002 Parametre kullanimi

  Background: amazon sayfasina gider
    Given kullanici "amazonUrl" sayfasina gider

  Scenario: TC01 kullanici amazonda parametreli arama yapar
    Then kullanici "apple" icin arama yapar
    Then sonuclarin "apple" icerdigini test eder
    #Then kullanici 3 saniye bekler

  Scenario: TC02 kullanici amazonda parametreli arama yapar
    Then kullanici "asus" icin arama yapar
    Then sonuclarin "asus" icerdigini test eder
    #Then kullanici 3 saniye bekler

  Scenario: TC03 kullanici amazonda parametreli arama yapar
    Then kullanici "msi" icin arama yapar
    Then sonuclarin "msi" icerdigini test eder
    #Then kullanici 3 saniye bekler
    And sayfayi kapatir
