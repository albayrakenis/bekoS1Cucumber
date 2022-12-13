Feature: Cok satanlar kontrolu

  @cokSatan @smoke
  Scenario: Kullanici ana sayfada cok satan urunleri görmeli
    Given Kullanici giris sayfasina gitmeli
    When Kullanici cok satanlar listesine gitmeli