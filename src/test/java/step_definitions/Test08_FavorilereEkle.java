package step_definitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pages.*;
import utility.BrowserUtils;
import utility.Driver;

import java.awt.*;

public class Test08_FavorilereEkle {
    Anasayfa anasayfa = new Anasayfa();
    Methodlar methodlar = new Methodlar();
    PLP plp = new PLP();
    Sepet sepet = new Sepet();
    Login login = new Login();
    Bildirimler bildirimler = new Bildirimler();

    public Test08_FavorilereEkle() throws AWTException {
    }

    @When("Kullanici once kategori  sonra baslik tiklamali {string} {string}")
    public void kullanici_once_kategori_sonra_baslik_tiklamali() {


    }

    @And("Kullanici once kategori  sonra baslik tiklamali {string} {string} {string}")
    public void kullaniciOnceKategoriSonraBaslikTiklamali(String kategori, String baslik, String urunAdi) {

        BrowserUtils.waitFor(2);
        methodlar.plpSayfasindaFavorilereEkleme(kategori, baslik, urunAdi);
        BrowserUtils.waitFor(2);
        plp.favorilereEklemePopupKapatma.click();

    }


    @And("Kullanici favorile gidip favorileri kontrol etmeli {string}")
    public void kullaniciFavorileGidipFavorileriKontrolEtmeli(String urunAdi) {
        methodlar.favorilerdeUrunArama(urunAdi);
    }

    @And("Kullanici sepette favorilere ekleye tiklamali")
    public void kullaniciSepetteFavorilereEkleyeTiklamali() {
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(sepet.sepettenFavorilereEkleme);
    }

    @And("Kullanici sepet sayfasindan login olmali")
    public void kullaniciSepetSayfasindanLoginOlmali() {
        BrowserUtils.waitFor(2);
        login.username.sendKeys("2albay.rakenis@gmail.com");
        login.password.sendKeys("Albayrak.41");
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(login.girisYapButonu);
        BrowserUtils.waitFor(2);

    }

    @And("Kullanici favorilere cikar yazisini gormeli")
    public void kullaniciFavorilereCikarYazisiniGormeli() {
        BrowserUtils.waitFor(1);
        System.out.println(sepet.sepettenFavorilereEkleme.getAttribute("data-favorite-product"));
        Assert.assertTrue(sepet.sepettenFavorilereEkleme.getAttribute("data-favorite-product").contains("Favorilerimden Çıkar"));

    }

    @And("Kullanici favoririm sayfasinda listeyi bosalt tusuna basmali")
    public void kullaniciFavoririmSayfasindaListeyiBosaltTusunaBasmali() {
        BrowserUtils.waitFor(1);
        BrowserUtils.clickWithJS(bildirimler.favorilerimListeyiBosalt);
    }

    @And("Kullanici televizyonlardan rastgele bir urun secmeli {string} {string}")
    public void kullaniciTelevizyonlardanRastgeleBirUrunSecmeli(String kategori, String baslik) {

        methodlar.rastgeleUrunSecme(kategori, baslik);

    }
}
