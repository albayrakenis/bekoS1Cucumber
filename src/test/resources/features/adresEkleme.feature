Feature: Adres ekleme

  Background:
    Given Kullanici giris sayfasina gitmeli
    When Kullanici login olmali

  @adres2
  Scenario Outline: Kullanici basarili bir sekilde adres ekleyebilmeli
    And Kullanici adres bilgilerini tam olarak girmeli "<il>" "<ilce>" "<mahalle>"
    And Kullanici cikis yap sekmesine tiklamali

    Examples:
      | il      | ilce    | mahalle |
      | KONYA   | DERBENT | MERKEZ  |
      | ERZURUM | İSPİR   | BOZAN   |


  @adres
  Scenario Outline: Kullanici adres bilgilerini eksik girmeli
    And Kulanici adres bilgilerini eksik girmeli "<adSoyad>" "<telefonNumarasi>"
    And Kullanici adres ekleme popup kapatmali
    And Kullanici cikis yap sekmesine tiklamali

    Examples:
      | adSoyad | telefonNumarasi |
      | 1234    | 12345           |
      |         | abc             |
      | */-     |                 |
      | enis    | /*-             |


  @adresSil
  Scenario: Kullanici adresleri silebilmeli
    And Kullanici hesabim sayfasina gitmeli
    And Kullanici bilgilerim sekmesine tiklamali
    And Son adres haric butun adresleri silebilmeli
