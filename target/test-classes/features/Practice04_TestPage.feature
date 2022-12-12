@p04
Feature: Practice

  Scenario Outline: user file upload
    Given kullanici "https://testpages.herokuapp.com/styled/basic-html-form-test.html" sitesine gider
    And username "<kullaniciadi>" password "<sifre>" ve textarea "<metinalani>" kisimlarini doldurur
    Then user bir dosya yukler
    And checkbox bir secer
    And radio iki secer
    And selection item uc  secer
    And dropdown item dort secer
    And submite tiklar
    And dosyanin yuklendigini dogrular
    Examples:
      | kullaniciadi | sifre   | metinalani           |
      | Javacan      | 5423423 | Bugun hava cok guzel |
