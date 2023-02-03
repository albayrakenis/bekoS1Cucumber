Feature: Sepet işlemleri - Anasayfadan sepete ekleme


  @anasayfadanSepete @smoke @sepetislemleri
  Scenario: Anasayfadaki urunu sepete ekleyebilme
    Given Kullanici giris sayfasina gitmeli
    When Kullanici cok satanlar listesine gitmeli
    And Kullanici su siradaki urunu sepete eklemeli "2"
    Then Sepete gidip urunun eklendigini kontrol etmeli
    Then Kullanici sepeti bosalt tusuna basmali
    Then Kullanici sepetin bos oldugunu kontrol etmeli