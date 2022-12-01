Feature: Magazalar dogru sekilde ekrana gelmeli

  Background:
    Given Kullanici giris sayfasina gitmeli

  @magazalar
  Scenario Outline:Kullanici login olup il secip magazaları dogru sekilde görmeli
    When Kullanici login olmali
    And Kullanici magazalar sayfasina gitmeli
    And Kullanici "<il>" secip magaza aramali sonuclari kontrol etmeli
    And Kullanici cikis yap sekmesine tiklamali

    Examples:
      | il      |
      | ANKARA  |
      | KOCAELİ |
      | ERZURUM |

  @magazalar
  Scenario Outline:Kullanici login olup il ve ilce secip magazaları dogru sekilde görmeli
    And Kullanici magazalar sayfasina gitmeli
    And Kullanici "<il>" ve "<ilce>" secip magaza aramali sonuclari kontrol etmeli

    Examples:
      | il       | ilce    |
      | BURSA    | MUDANYA |
      | EDİRNE   | HAVSA   |
      | İSTANBUL | ESENLER |

