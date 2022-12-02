package step_definitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Anasayfa;
import pages.Methodlar;
import pages.PLP;
import utility.BrowserUtils;
import utility.Driver;

public class Test08_FavorilereEkle {
    Anasayfa anasayfa =new Anasayfa();
    Methodlar methodlar=new Methodlar();
    PLP plp =new PLP();



    @When("Kullanici once kategori  sonra baslik tiklamali {string} {string}")
    public void kullanici_once_kategori_sonra_baslik_tiklamali() {


    }

    @And("Kullanici once kategori  sonra baslik tiklamali {string} {string} {string}")
    public void kullaniciOnceKategoriSonraBaslikTiklamali(String kategori, String baslik, String urunAdi) {

        methodlar.plpSayfasindaFavorilereEkleme(kategori,baslik,urunAdi);
        plp.favorilereEklemePopupKapatma.click();

    }


    @And("Kullanici favorile gidip favorileri kontrol etmeli {string}")
    public void kullaniciFavorileGidipFavorileriKontrolEtmeli(String urunAdi) {
        methodlar.favorilerdeUrunArama(urunAdi);
    }
}
