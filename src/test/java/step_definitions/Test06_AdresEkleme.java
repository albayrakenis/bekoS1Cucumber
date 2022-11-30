package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import pages.Anasayfa;
import pages.BasePage;
import pages.Bildirimler;
import pages.Methodlar;
import utility.BrowserUtils;
import utility.Driver;

public class Test06_AdresEkleme extends BasePage {



    Anasayfa anasayfa = new Anasayfa();
    Bildirimler bildirimler = new Bildirimler();
    Methodlar methodlar = new Methodlar();

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
}
