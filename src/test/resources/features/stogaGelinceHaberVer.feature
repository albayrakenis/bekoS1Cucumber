Feature: Stoga gelince haber ver

  @stokTakip
  Scenario: Kullanici stogu biten urun icin alarm kurabilmeli
    Given Kullanici giris sayfasina gitmeli
    When Kullanici "Elektronik" "Masaüstü Bilgisayar" "Lenovo AIO3-22 I3 4G/128GBBilgisayar" gitmeli
    And Stoga gelince haber vere tiklamali
    And Mail adresini doldurmali ve gondere tiklamali
    And Kullanici talebiniz alindi yazisini gormeli
    And Kullanici Stok habercime gitmeli
    Then Stok habercimde urunun oldugunu gormeli



