Feature: Kullanici coklu kredi kartı ile odeme yapabilmeli

  @cokluKart @smoke
  Scenario: Kullanici coklu kredi kartı ile odeme yapabilmeli
    Given Kullanici giris sayfasina gitmeli
    When Kullanici login olmali
    And Kullanici urun secmeli "Beyaz Eşya" "Çamaşır Makinesi" "CM 10120Çamaşır Makinesi"
    And Kullanici sepete eklemeli
    And Kullanici odeme adimina gitmeli
    And Kullanici "Çoklu" odeme yontemini secmeli
    And Kullanici kredi karti bilgilerini doldurmali "5163103002982563"
    And Kullanici ilk kredi karti ile "1000" lira odemeli ve karti onaylamali

