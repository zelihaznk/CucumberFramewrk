@click
Feature: cucumber java manipulation

  Scenario: practice click and keys

    Given kullanici "https://testpages.herokuapp.com/styled/key-click-display-test.html" sitesine gider
    Then 50 defa click me botonuna tikla
    And 50 defa space dugmesine tikla
    Then Down yazisindaki iki basamakli sayilarin hepsini toplayin
    And tum click metinlerinin uzunlugunun toplamini onceki toplamdan cikarin
    And sonucun 1100 oldugunu dogrulayin