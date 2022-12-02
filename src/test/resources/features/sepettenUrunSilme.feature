Feature: Sepetten urun silme


  Background:
    Given Kullanici giris sayfasina gitmeli

  @urunSil @smoke
  Scenario: Sepete urun ekleyip bu urunleri tek tek sepetten silme
    And Kullanici urunleri sepete ekleyebilmeli
    And Kullanici sil butonuna tiklayip urunleri sepetten silebilmeli
    Then Sepette urun olmadigini kontrol edilmeli

  @urunSil @smoke
  Scenario: Sepete urun ekleyip sepeti boşalt kullanarak sepetten urunleri silme
    And Kullanici urunleri sepete ekleyebilmeli
    And Kullanici sepeti bosalt tusuna basabilmeli
    Then Sepette urun olmadigini kontrol edilmeli