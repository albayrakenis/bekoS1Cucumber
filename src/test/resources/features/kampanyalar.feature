Feature: Kampanyalar ekranini kontrol etme

  @kamp @smoke
  Scenario: Kampanyalar ekrani tab'lari kontrol etme
    Given Kullanici giris sayfasina gitmeli
    When Kullanici kampanyalari tiklamali
    And Kullanici tum kampanyalari tiklamali
    And Kullanici kampanyalar beyaz esyayi tiklamali
    And Kullanici kucuk ev aletlerini tiklamali
    And Kullanici size ozeli tiklamali
    And Kullanici tum kampanyalari tiklamali
    Then Kullanici kampanyalar yazisini gormeli