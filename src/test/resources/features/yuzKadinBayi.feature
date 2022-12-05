Feature: Kullanici 100 kadi bayi formunu görmeli ve doldurabilmeli

  @bayi
  Scenario: Kullanici 100 kadi bayi formunu görmeli ve doldurabilmeli

    Given Kullanici giris sayfasina gitmeli
    When Kullanici yuz bayi sayfasina tiklamali
    And Bayi formu ekrana gelmeli
    Then Gonder tusuna basip sonuclar kontrol edilmeli
