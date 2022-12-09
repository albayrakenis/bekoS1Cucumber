Feature: Kullanici sponsorluklari gormeli

  @sponsor
  Scenario: Kullanici sponsorluklari gorebilmeli
    Given Kullanici giris sayfasina gitmeli
    When Kullanici asagidaki sponsorluk listesini gormeli
      | Sponsorluk |
      | Barcelona  |
      | Sponsorluk |
      | Beşiktaş   |
      | Sponsorluk |
      | Fenerbahçe |