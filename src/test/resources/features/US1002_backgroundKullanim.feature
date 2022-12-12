@us1002
Feature: US1002 kullanici ortak adimlari Background ile calistirir

  Background: ortak adim
    Given Kullanici amazon sayfasina gider
    #Background ortak olan adimi yazip gerisi farkli senaryolar

  Scenario: TC04 amazon nutella arama
    And Kullanici Nutella aratir
    Then sonuclarin Nutella icerdigini test eder


  Scenario: TC05 amazon java arama
    And Kullanici Java icin arama yapar
    Then Sonuclarin Java icerdigini test eder


  Scenario: TC06 amazon msi arama
    Then Kullanici msi icin arama yapar
    And Sonuclarin msi icerdigini test eder
    And sayfayi kapatir