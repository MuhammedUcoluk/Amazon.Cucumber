
Feature: 1001_NegativeLoginTesti
  @Amazon1
  Scenario: TC01_Amazon Negative Login Testi
    Given kullanici amazon sayfasina gider
    And kullanici cerezleri kabul et butonuna tiklar
    Then giris yapin sekmesine tiklar
    And  dogru kullanici adi girer
    And yanlis sifre girer
    Then giris yap butonun tiklar
    And giris yapamadigini test eder
    And sayfayi kapatir

  Scenario: TC02_Amazon Negative Login Testi
    Given kullanici amazon sayfasina gider
    And kullanici cerezleri kabul et butonuna tiklar
    Then giris yapin sekmesine tiklar
    And yanlis kullanici adi girer
    And devam et butonuna tiklar
    And giris yapamadigini test eder
    And sayfayi kapatir


