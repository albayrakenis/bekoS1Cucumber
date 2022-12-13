Feature: Saglık tarifler

  @saglik @smoke
  Scenario: Saglikli tarifler sayfasi
    Given Kullanici giris sayfasina gitmeli
    And Kullanici saglikli tarifler sayfasina gitmeli
    And Kullanici lezzetli tarifler listesini gormeli
      | Karışık Meyveli Smoothie            |
      | Yabanmersinli Muzlu Krep            |
      | Kahvaltı için Yumurtalı Muffin      |
      | Brokolili Pizza                     |
      | Havuçlu Kek                         |
      | Havuç, Armut ve Pancar Suyu         |
      | Tavuk Sulu Mercimek Çorbası         |
      | Fıstıklı Çikolata Ezmeli Kurabiye   |
      | Sağlıklı Az Yağlı Pizza             |
      | Muzlu ve Avokadolu Puding           |
      | Kabak Lazanya                       |
      | Muzlu Hurmalı Smoothie              |
      | Siyah Fasulyeli (Börülceli) Hamburg |
      | Yabanmersinli ve H.Cevizli Smoothie |
      | Böğürtlenli Chia Puding             |
      | Bezelye, Brokoli ve Kabaklı Soğuk Ç |
      | Soğuk Kabak ve Portakal Çorbası     |
      | Dondurulmuş Yoğurt Parçaları        |
      | Kabak ve Chialı Granola             |
      | Hızlı İyileştiren Sağlıklı Pizza    |
      | Tatlı Patates Dilimli Somon Balığı  |