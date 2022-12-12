@aa
Feature: parametre kullanimi

  Scenario: TC01 parametre kullaniminda ConfigReader
    Given kullanici "amazonUrl" sayfasina gider
    Then url'in "amazon" icerdigini test eder
    Then kullanici 1 sn bekler

  Scenario:TC02 parametre kullaniminda ConfigReader
    Given kullanici "brcUrl" sayfasina gider
    Then url'in "blue" icerdigini test eder
    Then kullanici 1 sn bekler

  Scenario:TC03 parametre kullaniminda ConfigReader
    Given kullanici "googleUrl" sayfasina gider
    Then url'in "google" icerdigini test eder
    Then kullanici 1 sn bekler

  Scenario:TC04 parametre kullaniminda ConfigReader
    Given kullanici "hepsiburadaUrl" sayfasina gider
    Then url'in "hepsi" icerdigini test eder
    Then kullanici 1 sn bekler
    And sayfayi kapatir


      # feature dosyasinda parametreli arama yaptigimizda "" icine aldigimiz String degeri stepDefinition'da
      # Bir defa parametreli method olusturur ve yeni arama yapmak istedigimizde tekrar method olusturmadan feature
      # dosyasinda "" icindeki ifadeyi degistirmek yeterlidir.