@wip
Feature: kullanici Tutorialsninja sayfasinda urun sepete ekleyebilmeli

  Scenario: kullanici sepete urun ekler

    Given kullanici "tutorialUrl" sayfasina gider
    Then Phones & PDAS'a tiklar
    Then Telefonlarin markalarini alir
    Then Tum ogeleri sepete ekler
    Then Sepete tiklar
    Then Sepetteki urun isimlerini alir
    And Sepetteki ve sayfadaki urunlerin dogru oldugunu karsilastiriniz.
    And sayfayi kapatir

  