 Feature: Hediye ceklerini kontrol

  @cek  @smoke
  Scenario: Hediye cekleri kontrol etme
    Given Kullanici giris sayfasina gitmeli
    When Kullanici login olmali
    And Kullanici hediye cekine tiklamali
    And Kullanici hediye ceki listesi gormeli
    |Hediye Çeki 1000|
    |Hediye Çeki 5000|
    |Hediye Çeki 10000|
    And Kullanicii hediye cekini sepete eklemeli
    And Kullanici ceki kullanacak kisi bilgilerini doldurmali
    And Kullanici hediye cekini silmeli
    Then Kullanici sepetin bos oldugunu kontrol etmeli