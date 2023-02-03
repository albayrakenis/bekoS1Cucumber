Feature: Favorelere ekleyebilmeli

  @favori  @smoke
  Scenario Outline: Kullanici urunleri pdp sayfasında favorelere ekleyebilmeli
    Given Kullanici giris sayfasina gitmeli
    When Kullanici login olmali
    And Kullanici televizyonlardan rastgele bir urun secmeli "<kategori>" "<baslik>"
    And  Kullanici favorilerim sekmesine tiklamali
    And Kullanici favoririm sayfasinda listeyi bosalt tusuna basmali
    And Kullanici cikis yap sekmesine tiklamali




    Examples:
      | kategori          | baslik |
      | Küçük Ev Aletleri | Ütü    |

