package step_definitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.*;
import utility.BrowserUtils;
import utility.Driver;

import java.util.List;

public class Test06_AdresEkleme extends BasePage {



    Anasayfa anasayfa = new Anasayfa();
    Bildirimler bildirimler = new Bildirimler();
    Methodlar methodlar = new Methodlar();
    Hesabim hesabim =new Hesabim();

    @When("Kullanici adres bilgilerini tam olarak girmeli {string} {string} {string}")
    public void kullanici_adres_bilgilerini_tam_olarak_girmeli(String il, String ilce, String mahalle) {
        anasayfa.hesabimButton.click();
        bildirimler.bilgilerim.click();
        BrowserUtils.scrollToElement(bildirimler.yeniAdresEkle);
        BrowserUtils.clickWithJS(bildirimler.yeniAdresEkle);
        BrowserUtils.waitFor(2);
        methodlar.ilIlceMahalleSecme(il,ilce,mahalle);
        BrowserUtils.waitFor(2);
        methodlar.adresBilgileriDoldurma();
        BrowserUtils.waitFor(2);
        Assert.assertFalse(bildirimler.adresiKaydet.isDisplayed());
        BrowserUtils.waitFor(2);
    }


    @And("Kulanici adres bilgilerini eksik girmeli {string} {string}")
    public void kulaniciAdresBilgileriniEksikGirmeli(String adSoyad, String telefonNumarasi) {
        anasayfa.hesabimButton.click();
        bildirimler.bilgilerim.click();
        BrowserUtils.scrollToElement(bildirimler.yeniAdresEkle);
        BrowserUtils.clickWithJS(bildirimler.yeniAdresEkle);
        BrowserUtils.waitFor(2);
        methodlar.ilIlceMahalleSecme("ANKARA","BALA","BAHÇEKARADALAK");
        BrowserUtils.waitFor(2);
        methodlar.adresBilgileriEksikDoldurma(adSoyad,telefonNumarasi);
        System.out.println(bildirimler.gecerliTelefonGiriniz.getText());
        System.out.println(bildirimler.gecerliAdGiriniz.getText());
        Assert.assertTrue(bildirimler.gecerliAdGiriniz.getText().contains("geçerli"));
        Assert.assertTrue(bildirimler.gecerliTelefonGiriniz.getText().contains("geçerli"));

        BrowserUtils.waitFor(1);
    }


    @And("Kullanici hesabim sayfasina gitmeli")
    public void kullaniciHesabimSayfasinaGitmeli() {
        anasayfa.hesabimButton.click();
    }

    @And("Son adres haric butun adresleri silebilmeli")
    public void sonAdresHaricButunAdresleriSilebilmeli() {
        List<WebElement> adresListesi = Driver.get().findElements(By.xpath("//div[@class='usr-addresses']/div//a[contains(.,'Sil')]"));


        int adresSayisi=adresListesi.size();
        for (int i=1; i<adresSayisi-1;i++){
            BrowserUtils.clickWithJS(hesabim.ilkAdresSilButonu);
            BrowserUtils.clickWithJS(hesabim.silmeyiOnayliyormusunuzButonu);

            BrowserUtils.waitFor(2);
        }
        System.out.println(adresListesi.size());


    }

    @And("Kullanici adres ekleme popup kapatmali")
    public void kullaniciAdresEklemePopupKapatmali() {
        hesabim.adresEklemePopupKapatmaButonu.click();
    }


}
