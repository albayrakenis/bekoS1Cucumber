 Feature: Hediye ceklerini kontrol

  @cek
  Scenario: Hediye cekleri kontrol etme
    Given Kullanici giris sayfasina gitmeli
    When Kullanici login olmali
    And Kullanici hediye cekine tiklamali
    And Kullanici 3 tane hediye ceki gormeli
    And Kullanicii hediye cekini sepete eklemeli
    And Kullanici ceki kullanacak kisi bilgilerini doldurmali
    And Kullanici hediye cekini silmeli
    Then Kullanici sepetin bos oldugunu kontrol etmeli