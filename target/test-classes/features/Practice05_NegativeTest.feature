@p5
Feature: Practice 05 negative test

  Scenario Outline: Gecersiz giris bilgileri ile login olamama
    Given kullanici "medunnaUrl" sayfasina gider
    When login olmak icin signin'e tiklar
    And username icin "<username>" gonderir
    And password icin "<password>" gonderir
    And signine tiklar
    Then Authentication information not correct uyarisini dogrular
    And sayfayi kapatir

    Examples:
      | username    | password  |
      | Murtaza Can | Qa124414! |