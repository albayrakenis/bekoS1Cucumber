Feature: Adres ekleme

  Background:
    Given Kullanici giris sayfasina gitmeli
    When Kullanici login olmali
  @adres
  Scenario Outline: Kullanici basarili bir sekilde adres ekleyebilmeli
    And Kullanici adres bilgilerini tam olarak girmeli "<il>" "<ilce>" "<mahalle>"

    Examples:
      | il    | ilce    | mahalle |
      | KONYA | DERBENT | MERKEZ  |





