Feature: Urun satin alma


  @satinal @smoke
  Scenario Outline: Kredi karti ile urun satin alma
    Given Kullanici giris sayfasina gitmeli
    When Kullanici login olmali
    And Kullanici urun secmeli "<kategoriAdi>" "<baslikAdi>" "<urunAdi>"
    And Kullanici sepete eklemeli
    And Kullanici odeme adimina gitmeli
    Then Kullanici kart bilgilerini girmeli


    Examples:
      | kategoriAdi    | baslikAdi | urunAdi                                        |
      | Isıtma Soğutma | Klima     | 40965 HP Aktif Hijyen Plus InverterSplit Klima |
#      | Elektronik |  Masaüstü Bilgisayar    | Lenovo DT IC 3 07ADA05 A3050U 256GB 4G Masaüstü Bilgisayar|

  @eft @smoke
  Scenario Outline: Havale ile urun satin alma
    Given Kullanici giris sayfasina gitmeli
    When Kullanici login olmali
    And Kullanici urun secmeli "<kategoriAdi>" "<baslikAdi>" "<urunAdi>"
    And Kullanici sepete eklemeli
    And Kullanici odeme adimina gitmeli
    Then Kullanici eft havale ile odemeyi tamamlamali

    Examples:
      | kategoriAdi | baslikAdi        | urunAdi                        |
      | Beyaz Eşya  | Çamaşır Makinesi | BK 9122 PR MGÇamaşır Makinesi |
