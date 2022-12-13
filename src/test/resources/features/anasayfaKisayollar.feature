Feature: Anasayfada ki kısayolları kontrol

  @kisayol @smoke
  Scenario: Kullanici anasayfadaki kısayolları kullanarak hızlı bir sekilde menulere gidebilmeli
    Given Kullanici giris sayfasina gitmeli
    When Kullanici anasayfadaki "beyaz-esya" basligina gitmeli
    And Kullanici asagidaki beyaz esya kisayol listesini gormeli
      | Bulaşık Makinesi           |
      | Buzdolabı                  |
      | Derin Dondurucu            |
      | Fırın                      |
      | Kurutma Makinesi           |
      | Kurutmalı Çamaşır Makinesi |
      | Mikrodalga Fırın           |
      | Set Üstü Ocak              |
      | Su Sebili                  |
      | Çamaşır Makinesi           |
    And Kullanici anasayfadaki "ankastre" basligina gitmeli
    And Kullanici asagidaki ankastre kisayol listesini gormeli
      | Ankastre Aspiratörler               |
      | Ankastre Bulaşık Makineleri         |
      | Ankastre Buzdolabı                  |
      | Ankastre Davlumbazlar               |
      | Ankastre Domino Ocaklar             |
      | Ankastre Fırınlar                   |
      | Ankastre Kurutmalı Çamaşır Makinesi |
      | Ankastre Mikrodalgalar              |
      | Ankastre Ocak                       |


