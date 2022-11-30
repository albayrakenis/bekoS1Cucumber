Feature: Urunler menusu butun başlıkları kontrol


  Background:
    Given Kullanici giris sayfasina gitmeli
    When Kullanici urunlere tiklamali

  @resim
  Scenario Outline Urunler Beyaz Esya sekmesinde bütün seçenekleri tek tek kontrol etme
    And Kullanici once "<Tab>" sonra "<Module>" tiklamali

    Examples:
      | Tab        | Module                      |
      | Beyaz Eşya | Derin Dondurucu             |
      | Beyaz Eşya | Çekmeceli Derin Dondurucu   |
      | Beyaz Eşya | Sandık Tipi Derin Dondurucu |
      | Beyaz Eşya | Buzdolabı                   |
      | Beyaz Eşya | No Frost Buzdolabı          |
      | Beyaz Eşya | Gardırop Tipi Buzdolabı     |
      | Beyaz Eşya | Çift Kapılı Buzdolabı       |
      | Beyaz Eşya | Mini Buzdolabı              |
      | Beyaz Eşya | Bulaşık Makinesi            |
      | Beyaz Eşya | Çamaşır Makinesi            |
      | Beyaz Eşya | Kurutma Makinesi            |
      | Beyaz Eşya | Kurutmalı Çamaşır Makinesi  |
      | Beyaz Eşya | Fırın                       |
      | Beyaz Eşya | Ocaklı Fırın                |
      | Beyaz Eşya | Mini Fırın                  |
      | Beyaz Eşya | Mikrodalga Fırın            |
      | Beyaz Eşya | Set Üstü Ocak               |
      | Beyaz Eşya | Su Sebili                   |


    Examples:
      | Tab      | Module                           |
      | Ankastre | Ankastre Set                     |
      | Ankastre | Ankastre Fırınlar                |
      | Ankastre | Ankastre Mikro Dalgalar          |
      | Ankastre | Ankastre Ocaklar                 |
      | Ankastre | Ankastre Davlumbazlar            |
      | Ankastre | Ankastre Aspiratörler            |
      | Ankastre | Ankastre Bulaşık Makineleri      |
      | Ankastre | Ankastre Buzdolabı               |
      | Ankastre | Ankastre Domino Ocaklar          |
      | Ankastre | İndiksiyonlu Ocaklar             |
      | Ankastre | Vitro Seramik Ocaklar            |
      | Ankastre | Renkli Metal Tablalı Ocaklar     |
      | Ankastre | İnoks Metal Tablalı Ocaklar      |
      | Ankastre | Camlı Tablalı Ocaklar            |
      | Ankastre | Ankastre Ada Tipi Davlumbaz      |
      | Ankastre | Ankastre Duvar Tipi Davlumbazlar |
      | Ankastre | Ankastre Sürgülü Aspiratör       |
      | Ankastre | Ankastre Gömme Aspiratör         |
      | Ankastre | Tezgah Altı Bulaşık Makinesi     |
      | Ankastre | Tam Ankastre Bulaşık Makinesi    |
      | Ankastre | Yarı Ankastre Bulaşık Makinesi   |

    Examples:
      | Tab        | Module                    |

      | Elektronik | Televizyon                |
      | Elektronik | Telefon                   |
      | Elektronik | Bilgisayar                |
      | Elektronik | Hobi Oyun                 |
      | Elektronik | Ses & Görüntü Sistemleri  |
      | Elektronik | Ödeme Sistemleri          |
      | Elektronik | Android TV                |
      | Elektronik | 4K Oled TV                |
      | Elektronik | 4K UHD Pro                |
      | Elektronik | 4K UHD TV                 |
      | Elektronik | Smart TV                  |
      | Elektronik | FHD TV                    |
      | Elektronik | LED TV                    |
      | Elektronik | Cep Telefonu              |
      | Elektronik | Telefon Aksesuarları      |
      | Elektronik | Giyilebilir Teknoloji     |
      | Elektronik | Telsiz Telefon            |
      | Elektronik | Laptop                    |
      | Elektronik | Tablet                    |
      | Elektronik | Masaüstü Bilgisayar       |
      | Elektronik | Çevre Birimleri           |
      | Elektronik | Oyunlar                   |
      | Elektronik | Oyun Konsolu              |
      | Elektronik | Fotoğraf Kamera           |
      | Elektronik | Drone                     |
      | Elektronik | Akıllı Eğitici Oyuncaklar |
      | Elektronik | Kulaklık                  |
      | Elektronik | Hopörler                  |
      | Elektronik | Radyo                     |
      | Elektronik | Yazarkasa POS             |
      | Elektronik | Android POS               |
      | Elektronik | Pompa Yazarkasa           |
      | Elektronik | Aksesuarlar               |


    Examples:
      | Tab            | Module                 |
      | Isıtma Soğutma | Klima                  |
      | Isıtma Soğutma | Kombi                  |
      | Isıtma Soğutma | Termosifon             |
      | Isıtma Soğutma | Elektrikli Isıtıcı     |
      | Isıtma Soğutma | Şofben                 |
      | Isıtma Soğutma | İç Hava Kalitesi       |
      | Isıtma Soğutma | Hava Soğutucu          |
      | Isıtma Soğutma | Vantilatör             |
      | Isıtma Soğutma | Split Klima            |
      | Isıtma Soğutma | Salon Tipi Klima       |
      | Isıtma Soğutma | Yoğuşmalı Kombi        |
      | Isıtma Soğutma | Premix Yoğuşmalı Kombi |
      | Isıtma Soğutma | Oda Termostatı         |
      | Isıtma Soğutma | Standart Termosifon    |
      | Isıtma Soğutma | Dijital Termosifon     |
      | Isıtma Soğutma | Smart Termosifon       |
      | Isıtma Soğutma | Seramik Isıtıcı        |
      | Isıtma Soğutma | Infrared Isıtıcı       |
      | Isıtma Soğutma | Yağlı Radyatör         |
      | Isıtma Soğutma | Konvektör Isıtıcı      |

    Examples:
      | Tab               | Module                     |
      | Küçük Ev Aletleri | Süpürge                    |
      | Küçük Ev Aletleri | Ütü                        |
      | Küçük Ev Aletleri | İçecek Hazırlama           |
      | Küçük Ev Aletleri | Karıştırıcı Doğrayıcı      |
      | Küçük Ev Aletleri | Pişirici                   |
      | Küçük Ev Aletleri | Kişisel Bakım              |
      | Küçük Ev Aletleri | UV Temizleme Cihazı        |
      | Küçük Ev Aletleri | Sarjlı Süpürge             |
      | Küçük Ev Aletleri | Toz Torbasız Süpürge       |
      | Küçük Ev Aletleri | Elektrikli Süpürge         |
      | Küçük Ev Aletleri | Toz Torbalı Süpürge        |
      | Küçük Ev Aletleri | Robot Süpürge              |
      | Küçük Ev Aletleri | Dikey Süpürge              |
      | Küçük Ev Aletleri | Buharlı Temizleyici        |
      | Küçük Ev Aletleri | Islak Kuru                 |
      | Küçük Ev Aletleri | Toz Torbası                |
      | Küçük Ev Aletleri | Buharlı Ütü                |
      | Küçük Ev Aletleri | Buhar Kazanlı Ütü          |
      | Küçük Ev Aletleri | Ütü Masası                 |
      | Küçük Ev Aletleri | Türk Kahve Makinesi        |
      | Küçük Ev Aletleri | Espresso Makinesi          |
      | Küçük Ev Aletleri | Filtre Kahve Makinesi      |
      | Küçük Ev Aletleri | Kahve Demleme Ekipmanları  |
      | Küçük Ev Aletleri | Çay Makinesi               |
      | Küçük Ev Aletleri | Kettle                     |
      | Küçük Ev Aletleri | Semaver                    |
      | Küçük Ev Aletleri | Katı Meyve Sıkacağı        |
      | Küçük Ev Aletleri | Narenciye Sıkacağı         |
      | Küçük Ev Aletleri | Kahve Öğütücü              |
      | Küçük Ev Aletleri | El Blender                 |
      | Küçük Ev Aletleri | Blender                    |
      | Küçük Ev Aletleri | Mikser                     |
      | Küçük Ev Aletleri | Doğrayıcı                  |
      | Küçük Ev Aletleri | Mutfak Robotu              |
      | Küçük Ev Aletleri | Mutfak Makinesi            |
      | Küçük Ev Aletleri | Kıyma Makinesi             |
      | Küçük Ev Aletleri | Yoğurt Makinesi            |
      | Küçük Ev Aletleri | Tost Makinesi              |
      | Küçük Ev Aletleri | Ekmek Kızartma Makinesi    |
      | Küçük Ev Aletleri | Çok Amaçlı Pişirici        |
      | Küçük Ev Aletleri | Fritöz                     |
      | Küçük Ev Aletleri | Izgara                     |
      | Küçük Ev Aletleri | Ekmek Yapma Makinesi       |
      | Küçük Ev Aletleri | Saç Kurutma Makinesi       |
      | Küçük Ev Aletleri | Saç Düzleştirici           |
      | Küçük Ev Aletleri | Saç Maşası                 |
      | Küçük Ev Aletleri | Baskül                     |
      | Küçük Ev Aletleri | Tıraş Makineleri           |
      | Küçük Ev Aletleri | Saç Sakal Kesme Makineleri |

    Examples:
      | Tab             | Module                     |
      | Hijyen-Aksesuar | Aktif Hijyen               |
      | Hijyen-Aksesuar | Aksesuarlar                |
      | Hijyen-Aksesuar | Temizlik Ve Bakım Ürünleri |







