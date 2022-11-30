Feature: Adres ekleme

  Scenario: Kullanici adres bilgilerini tam doldurmali
    Given Kullanici giris sayfasina gitmeli
    When Kullanici login olmali
    And Kullanici hesabimi tiklamali
    And Kullanici bilgilerim sekmesine tiklamali
    And Kullanici yeni adres ekleye tiklamali
    And Kullanici adres bilgilerini doldurmalı
    Then Adres eklendigi kontrol edilmeli

  Scenario: Kullanici adres bilgilerini eksik doldurmali

