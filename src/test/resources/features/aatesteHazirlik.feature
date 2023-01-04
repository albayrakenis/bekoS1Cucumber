Feature: teste baslamadan once sepetin bosaltilmasi

  @hazirlik @smoke
  Scenario: Sepette urun olmamali
    Given Kullanici giris sayfasina gitmeli
    When Kullanici login olmali
#    And Kullanici sepete gitmeli
    And Kullanici sepeti bosalt tusuna basabilmeli