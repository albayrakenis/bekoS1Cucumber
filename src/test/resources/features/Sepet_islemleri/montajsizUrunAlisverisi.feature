Feature: Montajsiz urun alisverisi


  @montajsizUrun @smoke
  Scenario: Sepet islemleri - montajli urun alisverisi
    Given Kullanici giris sayfasina gitmeli
    When Kullanici login olmali
    And Ana sayfada arama butonuna tikla
    And Arama bolumune aranacak urun adini yaz "BKK 2220 IC"
    And Entere bas
    And Sonuclardan ilgili urune tiklanir
    And Kullanici sepete eklemeli
    And Kullanici odeme adimina gitmeli
    And Kullanici kart bilgilerini girmeli
    And Kullanici odemeyi onaylamali
    And Kullanici siparis onaylandigini gormeli