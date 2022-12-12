@p02
Feature: Amazon practice

  Scenario: Amazon sign in test
    Given kullanici "amazonUrl" sayfasina gider
    Then sign in butonuna tiklar
    And faker kullanarak e-posta gonderir
    Then gonderdigi e-postanın ekran goruntusunu alir
    And continiue'a tiklar
    Then There was a problem mesajini dogrular
    Then Need help e tiklar
    Then forgot your password e tiklar
    Then Password assistance metnini dogrular
    Then Geri gider
    Then Create your account butonuna tiklar
    Then Create account metnini dogrular
    And kullanici 2 sn bekler
    And sayfayi kapatir