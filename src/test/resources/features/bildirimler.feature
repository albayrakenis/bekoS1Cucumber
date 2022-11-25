Feature: Bildirimleri kontrol etme

  @wip1219
  Scenario: Bildirimleri tek tek kontrol etme
    Given Kullanici giris sayfasina gitmeli
    Given Kullanici login olmali
    When Kullanici bildirimleri tiklamali
    And Kullanici urunlerim sekmesine tiklamali
    And Kullanici siparislerim sekmesine tiklamali
    And Kullanici bildirimlerim sekmesine tiklamali
    And Kullanici taleplerim sekmesine tiklamali
    And Kullanici favorilerim sekmesine tiklamali
    And Kullanici stok habercim sekmesine tiklamali
    And Kullanici kuponlarim sekmesine tiklamali
    And Kullanici hediye ceklerim sekmesine tiklamali
    And Kullanici bilgilerim sekmesine tiklamali
    Then Kullanici cikis yap sekmesine tiklamali