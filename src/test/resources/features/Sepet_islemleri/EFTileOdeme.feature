Feature: Kullanici login olmadan eft ile odeme yapabilmeli

  @GuestEFT @smoke
  Scenario: Kullanici login olmadan eft ile odeme yapabilmeli
    Given Kullanici giris sayfasina gitmeli
    And Kullanici urun secmeli "Beyaz Eşya" "Kurutma Makinesi" "KM 91 BMG Kurutma Makinesi"
    And Kullanici sepete eklemeli
    And Kullanici odeme adimina gitmeli
    And Kullanici uye olmadan devam etmeli
    And Kullanici teslimat adresi secmeli
    And Kullanici adres bilgilerini girmeli
    And Kullanici tc kimlik numarası girmeli
    And Kullanici "EFT" odeme yontemini secmeli
    And Kullanici mesafeli satis sozlesmesini onaylamali
    And Kullanici alisverisi tamamlayi tiklamali
    And Kullanici siparis numarasini gormeli
    And Kullanici siparis onaylandigini gormeli
#    And Kullanici hybris ekranına gider ve login olmali