#amazon sayfasina gidip sirasiyla nutella, java, elma, armut aratip
#sonuclarin arama yaptigimiz kelimeyi icerdigini test edelim

Feature: US1007 kullanici amazonda istedigi kelimeleri aratir

  Scenario Outline: TC12 amazonda listedeki elementleri aratma

    Given kullanici "amazonUrl" sayfasina gider
    Then kullanici "<istenenKelime>" icin arama yapar
    And sonuclarin "<istenenKelime>" icerdigini test eder
    And sayfayi kapatir

   #yeni step olusturmuyoruz
    # eger < > icindeki kelimler ayni ise tek  | | icinde yazmak yeterlidir
      # Eger isimleri farkli ise her biri icin ayri | | olusturulmalidir

    #  Examples:
        #    | istenenKelime | istenenKelimeKontrol |
        #    | nutella       | nutella              |
        #    | java          | java                 |
        #    | iphone        | iphone               |
        #    | msi           | msi                  |

    Examples:
      | istenenKelime |
      | nutella       |
      | java          |
      | iphone        |
      | msi           |







