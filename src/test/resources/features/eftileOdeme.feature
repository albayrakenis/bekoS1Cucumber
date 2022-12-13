Feature: Kullanici eft ile odeme yapabilmeli

  @EFT @smoke
  Scenario: Kullanici eft ile odeme yapabilmeli
    Given Kullanici giris sayfasina gitmeli
    When Kullanici login olmali
    And Kullanici urun secmeli "Beyaz Eşya" "Bulaşık Makinesi" "BM 4044 IBulaşık Makinesi"
    And Kullanici sepete eklemeli
    And Kullanici odeme adimina gitmeli
    And Kullanici "EFT" odeme yontemini secmeli
    And Kullanici mesafeli satis sozlesmesini onaylamali
    And Kullanici alisverisi tamamlayi tiklamali
    And Kullanici siparis numarasini gormeli
    And Kullanici hybris ekranına gider ve login olmali