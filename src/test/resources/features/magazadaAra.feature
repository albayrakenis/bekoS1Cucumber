Feature: Magazada ara fonksiyonu kontrol

  @magazdaAra @smoke
  Scenario: Magazada ara fonksiyonunu calismali
    Given Kullanici giris sayfasina gitmeli
    When Kullanici "Beyaz Eşya" "Çamaşır Makinesi" "BK 9102 EYÇamaşır Makinesi" gitmeli
    And Kullanici magazada ara secegini tiklamali
    And Kullanici "KONYA" ve "SELÇUKLU" secip magaza ara tiklamali sonuclari kontrol etmeli
#    And Kullanici "KONYA" ve "MERAM" secip magaza ara tiklamali sonuclari kontrol etmeli
#    And Kullanici sonuclari kontrol edebilmeli
