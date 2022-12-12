@us1001
Feature: Amazon Search

  @nutella
  Scenario: TC01 Kullanici amazonda nutella aratir
    Given Kullanici amazon sayfasina gider
    Then Kullanici Nutella aratir
    And sonuclarin Nutella icerdigini test eder
    And sayfayi kapatir


  @java
  Scenario: TC02 Kullanici amazonda Java aratir
    Given Kullanici amazon sayfasina gider
    Then Kullanici Java icin arama yapar
    And Sonuclarin Java icerdigini test eder
    And sayfayi kapatir


  @iphone
  Scenario: TC03 Kullanici amazonda iphone aratir
    When Kullanici amazon sayfasina gider
    And kullanici iphone icin arama yapar
    Then sonuclarin iphone icerdigini test eder
    And sayfayi kapatir