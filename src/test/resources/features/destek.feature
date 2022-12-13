Feature: Destek sayfası kontrolu

  @destek @smoke
  Scenario: Kullanici destek sayfasindan servis bulabilmeli
    Given Kullanici giris sayfasina gitmeli
    And Kullanici destek sayfasina gitmeli
    And Kullanici destek sayfasina gitmeli ve asagidaki listeyi gormeli
      | Sıkça Sorulan Sorular |
      | Beyaz Eşya            |
      | Ankastre              |
      | Elektronik            |
      | Isıtma-Soğutma        |
      | Küçük Ev Aletleri     |
    And Kullanici servis bul sayfasina gitmeli
    And Kullanici "KONYA" ve "SELÇUKLU" secip yetkili servis aramali
    And Kullanici yetkili servis listesini kontrol etmeli
