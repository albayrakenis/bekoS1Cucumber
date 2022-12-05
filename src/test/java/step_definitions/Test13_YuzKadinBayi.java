package step_definitions;

import io.cucumber.java.en.*;
import pages.Anasayfa;
import pages.YuzBayi;
import utility.BrowserUtils;

public class Test13_YuzKadinBayi {

    Anasayfa anasayfa = new Anasayfa();
    YuzBayi yuzBayi = new YuzBayi();

    @When("Kullanici yuz bayi sayfasina tiklamali")
    public void kullanici_yuz_bayi_sayfasina_tiklamali() {
        BrowserUtils.clickWithJS(anasayfa.yuzKadinBayi);
        BrowserUtils.waitFor(2);

    }

    @When("Bayi formu ekrana gelmeli")
    public void bayi_formu_ekrana_gelmeli() {
//        BrowserUtils.scrollToElement(yuzBayi.bayiIletisimBilgileri);
//        BrowserUtils.waitFor(5);

    }

    @Then("Gonder tusuna basip sonuclar kontrol edilmeli")
    public void gonder_tusuna_basip_sonuclar_kontrol_edilmeli() {
//        BrowserUtils.scrollToElement(yuzBayi.gonderButonu);
//        BrowserUtils.clickWithJS(yuzBayi.gonderButonu);

    }
}
