Feature: Sepette urun miktarini artirma


  @sepetteArtirma @smoke  @sepetislemleri
  Scenario Outline: sepet islemleri- sepette urun miktarini artirma
    Given Kullanici giris sayfasina gitmeli
    And Kullanici urun secmeli "<kategoriAdi>" "<baslikAdi>" "<urunAdi>"
    And Kullanici sepete eklemeli
    Then Kullanici ekledigi urunu sepette kontrol etmeli
    Then Kullanici urun sayisini artirmali
    Then Kullanici urun sayisini dusurmeli
    Then Kullanici sepeti bosalt tusuna basmali
    Then Kullanici sepetin bos oldugunu kontrol etmeli




    Examples:
      | kategoriAdi | baslikAdi  | urunAdi                     |
      | Elektronik  | Televizyon | Crystal Pro B55 C 890 A/ 55 |