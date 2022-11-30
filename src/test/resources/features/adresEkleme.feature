Feature: Adres ekleme

  Background:
    Given Kullanici giris sayfasina gitmeli
    When Kullanici login olmali
    And Kullanici hesabimi tiklamali
    And Kullanici bilgilerim sekmesine tiklamali


  @adres
  Scenario Outline: Kullanici adres bilgilerini tam doldurmali
    And Kullanici yeni adres ekleye tiklamali
    And Kullanici adres bilgilerini doldurmali "<il>" "<ilce>" "<mahalle>"
    Then Adres eklendigi kontrol edilmeli

    Examples:
      | il      | ilce    | mahalle |
      | KONYA   | DERBENT | KARALAR |
      | ERZURUM | İSPİR   | BOZAN   |

  @adres
  Scenario Outline: Kullanici adres bilgilerini eksik doldurmali
    And Kullanici yeni adres ekleye tiklamali
    And Kullanici adres bilgilerini eksik doldurmali "<fullName>" "<phoneNumber>"
    Then Adres eklenmedigi kontrol edilmeli

    Examples:
      | fullName | phoneNumber |
      | fullName | phoneNumbers |
      |          |              |
      | 15265    | avbd         |

