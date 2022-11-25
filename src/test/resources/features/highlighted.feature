Feature: Urun Highlighted Ozellikleri

  @high
  Scenario Outline: Urun highlighted ozelliklerinin kontrolu
    Given Kullanici giris sayfasina gitmeli
    When Kullanici urunlere tiklamali
    And Kullanici "<Tab>" ve "<Module>" tiklamali


  Examples:
  |Tab |Module|
  |Elektronik|Laptop|
  |Elektronik|Tablet|

