Feature: PDP den sepete urun ekleme


  @PDPsepete @smoke @sepetislemleri
  Scenario Outline: PDP den sepete urun ekleme
    Given Kullanici giris sayfasina gitmeli
    And Kullanici urun secmeli "<kategoriAdi>" "<baslikAdi>" "<urunAdi>"
    And Kullanici sepete eklemeli
    Then Kullanici ekledigi urunu sepette kontrol etmeli
    Then Kullanici sepeti bosalt tusuna basmali
    Then Kullanici sepetin bos oldugunu kontrol etmeli


    Examples:
      | kategoriAdi | baslikAdi  | urunAdi                     |
      | Elektronik  | Televizyon | Crystal Pro B43 C 890 A/ 43 |