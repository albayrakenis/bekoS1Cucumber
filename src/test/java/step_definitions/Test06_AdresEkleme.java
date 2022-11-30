package step_definitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.Anasayfa;
import pages.Bildirimler;
import pages.Methodlar;
import utility.BrowserUtils;

public class Test06_AdresEkleme {
    Anasayfa anasayfa = new Anasayfa();
    Bildirimler bildirimler = new Bildirimler();
    Methodlar methodlar = new Methodlar();

    @When("Kullanici hesabimi tiklamali")
    public void kullanici_hesabimi_tiklamali() {
        anasayfa.hesabimButton.click();

    }

    @When("Kullanici yeni adres ekleye tiklamali")
    public void kullanici_yeni_adres_ekleye_tiklamali() {
        BrowserUtils.clickWithJS(bildirimler.yeniAdresEkle);
        BrowserUtils.waitFor(2);
    }

    @When("Kullanici adres bilgilerini doldurmali")
    public void kullanici_adres_bilgilerini_doldurmali() {
        methodlar.ilIlceMahalleSecme("KONYA", "DERBENT", "KARALAR");
    }

    @And("Kullanici adres bilgilerini doldurmali {string} {string} {string}")
    public void kullaniciAdresBilgileriniDoldurmali(String il, String ilce, String mahalle) {
        methodlar.ilIlceMahalleSecme(il, ilce, mahalle);
    }

    @Then("Adres eklendigi kontrol edilmeli")
    public void adres_eklendigi_kontrol_edilmeli() {

        Assert.assertFalse(bildirimler.adresiKaydet.isDisplayed());
    }

    @And("Kullanici adres bilgilerini eksik doldurmali {string} {string}")
    public void kullaniciAdresBilgileriniEksikDoldurmali(String fullName, String phoneNumber) {
        methodlar.adresBilgileriEksikDoldurma(fullName, phoneNumber);
    }

    @Then("Adres eklenmedigi kontrol edilmeli")
    public void adresEklenmedigiKontrolEdilmeli() {

        Assert.assertTrue(bildirimler.gecerliAdGiriniz.getText().contains("geçerli"));
        Assert.assertTrue(bildirimler.gecerliTelefonGiriniz.getText().contains("telefon"));
    }


}
