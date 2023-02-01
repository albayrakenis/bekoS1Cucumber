Feature: PDP den sepete urun ekleme


  @PDPsepete @smoke
  Scenario Outline: PDP den sepete urun ekleme
    Given Kullanici giris sayfasina gitmeli
    #When Kullanici login olmali
    And Kullanici urun secmeli "<kategoriAdi>" "<baslikAdi>" "<urunAdi>"
    And Kullanici sepete eklemeli
    Then Kullanici ekledigi urunu sepette kontrol etmeli
    Then Kullanici sepeti bosalt tusuna basabilmeli
    Then Kullanici sepetin bos oldugunu kontrol etmeli


    Examples:
      | kategoriAdi | baslikAdi  | urunAdi                     |
      | Elektronik  | Televizyon | Crystal Pro B43 C 890 A/ 43 |