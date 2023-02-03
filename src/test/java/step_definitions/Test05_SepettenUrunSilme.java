package step_definitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.Anasayfa;
import pages.Methodlar;
import pages.UrunSayfasi;
import utility.BrowserUtils;

public class Test05_SepettenUrunSilme {
    Methodlar methodlar =new Methodlar();
    UrunSayfasi urunSayfasi = new UrunSayfasi();
    Anasayfa anasayfa =new Anasayfa();


    @When("Kullanici urunleri sepete ekleyebilmeli")
    public void kullanici_urunleri_sepete_ekleyebilmeli() {
        methodlar.sepeteEkle("Beyaz Eşya","Bulaşık Makinesi","BM 5045 IBulaşık Makinesi");
        //methodlar.sepeteEkle("Küçük Ev Aletleri","Tost Makinesi","TM 5006 GTost Makinesi");
        //methodlar.sepeteEkle("Küçük Ev Aletleri","Tost Makinesi","TM 2946 M NaturalTost Makinesi");


    }
    @When("Kullanici sil butonuna tiklayip urunleri sepetten silebilmeli")
    public void kullanici_sil_butonuna_tiklayip_urunleri_sepetten_silebilmeli() {
        methodlar.sepettenUrunSilme();

    }

    @Then("Sepette urun olmadigini kontrol edilmeli")
    public void sepetteUrunOlmadiginiKontrolEdilmeli() {
        System.out.println(urunSayfasi.sepetindeUrunYok.getText());

        Assert.assertEquals("Sepetinde henüz ürün yok.",urunSayfasi.sepetindeUrunYok.getText());
    }

    @And("Kullanici sepeti bosalt tusuna basmali")
    public void kullaniciSepetiBosaltTusunaBasmali() {
        BrowserUtils.clickWithJS(anasayfa.anasayfaSepetIcon);
        BrowserUtils.clickWithJS(urunSayfasi.sepetiBosaltTusu);


    }
}
