package step_definitions;

import io.cucumber.java.en.*;
import pages.Methodlar;
import pages.Odeme;
import pages.SatinAl;
import utility.BrowserUtils;

import java.awt.*;

public class Test21_CokluKart {

    Odeme odeme =new Odeme();
    Methodlar methodlar=new Methodlar();
    SatinAl satinAl=new SatinAl();
    Robot robot =new Robot();

    public Test21_CokluKart() throws AWTException {
    }

    @When("Kullanici {string} odeme yontemini secmeli")
    public void kullanici_odeme_yontemini_secmeli(String eft) {
        odeme.odemeYontemiBelirle(eft);

    }
    @And("Kullanici kredi karti bilgilerini doldurmali {string}")
    public void kullaniciKrediKartiBilgileriniDoldurmali(String kartNumarasi) {
        odeme.cokluKrediKartiIleOdeme(kartNumarasi);
    }
    @When("Kullanici ilk kredi karti ile {string} lira odemeli ve karti onaylamali")
    public void kullanici_ilk_kredi_karti_ile_lira_odemeli_ve_karti_onaylamali(String kacLiraIlkKrediKart) {
        odeme.ilkKrediKartiOdemeMiktari.sendKeys(kacLiraIlkKrediKart);
        BrowserUtils.waitFor(2);
        methodlar.onBilgilendirmeVeSatisSozlesmesiOnaylama();
        BrowserUtils.scrollToElement(odeme.kartiOnaylaCokluKart);
        BrowserUtils.waitFor(2);
        //BrowserUtils.clickWithJS(odeme.kartiOnaylaCokluKart);
        //BrowserUtils.waitFor(2);

       // odeme.mastercardOnaylamaSayfasi.click();
    }


}
