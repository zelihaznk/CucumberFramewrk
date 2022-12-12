@google
Feature: US002 google ile Trendyol'a ve morhipo'da makas aratilabilmeli


  Scenario: Trendyol ve Morhipoda makas aratir

    Given kullanici "googleUrl" sayfasina gider
    Then trendyolu aratir
    And trendyol linkini bulup siteye gider
    Then trendyolda makas aratir
    Then trendyoldaki arama sonucundan toplam urun sayisini alir
    Then yeni sekme morhipo anasayfasina gider
    Then morhipoda makas aratir
    Then morhipodaki arama sonucundan toplam urun sayisini alir
    Then iki sitede bulunan toplam makas sayisini karsilastirir
    Then Once Urun sayisi fazla olan siteyi kapatir
    And sonra diger sayfayida kapatiniz
