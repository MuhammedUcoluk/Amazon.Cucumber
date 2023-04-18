Feature: 1002_PozitiveLoginTesti

  Scenario: TC01_Amazon Negative Login Testi
    Given kullanici amazon sayfasina gider
    And kullanici cerezleri kabul et butonuna tiklar
    Then giris yapin sekmesine tiklar
    And  dogru kullanici adi girer
    And dogru sifre girer
    Then giris yap butonuna tiklar
    And basarili giris yapildigini test eder
    And sayfayi kapatir