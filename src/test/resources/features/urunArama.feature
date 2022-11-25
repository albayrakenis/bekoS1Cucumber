Feature: Urun arama islemleri


  @urunarama
  Scenario: Urun arama islemlerinin dogru calismasi
    Given Kullanici giris sayfasina gitmeli
    When Ana sayfada arama butonuna tikla
    And Arama bolumune aranacak urun adini yaz
    And Entere bas
    And Urun isimleri ve arama kelimesini karsilastir
    And Ana sayfada arama butonuna tikla
    And Arama bolumune aranacak urun adini yaz
    And Ara butonuna tikla
    And Gelen urunlerin isimlerini liste olarak al
    Then Urun isimleri ve arama kelimesini karsilastir