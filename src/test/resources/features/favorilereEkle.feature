Feature: Favorelere ekleyebilmeli

  @favori  @smoke
  Scenario Outline: Kullanici urunleri pdp sayfasında favorelere ekleyebilmeli
    Given Kullanici giris sayfasina gitmeli
    When Kullanici login olmali
    And Kullanici once kategori  sonra baslik tiklamali "<kategori>" "<baslik>" "<urunAdi>"
    And  Kullanici favorilerim sekmesine tiklamali
    And Kullanici favorile gidip favorileri kontrol etmeli "<urunAdi>"
    And Kullanici cikis yap sekmesine tiklamali




    Examples:
      | kategori          | baslik |urunAdi|
      | Küçük Ev Aletleri | Ütü    |BKK 2199|

