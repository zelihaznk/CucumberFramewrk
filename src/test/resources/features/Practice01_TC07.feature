@p01
Feature: TC verify test cases

  Scenario: TC 07 test Cases

    Given kullanici "http://automationexercise.com" sitesine gider
    Then anasayfanin basariyla gorunur oldugunu dogrulayin
    Then test case butonuna tiklayin
    Then kullanicinin basariyla test case sayfasina yonlendirildigini dogrulayin
    Then ilgili ekranin ekran goruntusunu alir
    And kullanici 2 sn bekler
    And sayfayi kapatir