package step_definitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.Methodlar;
import pages.UrunSayfasi;
import utility.BrowserUtils;

public class Test15_MagazadaAra {

    UrunSayfasi urunSayfasi = new UrunSayfasi();
    Methodlar methodlar = new Methodlar();

    @When("Kullanici magazada ara secegini tiklamali")
    public void kullanici_magazada_ara_secegini_tiklamali() {

        BrowserUtils.scrollToElement(urunSayfasi.hangiMagazadaVar);
        BrowserUtils.clickWithJS(urunSayfasi.hangiMagazadaVar);

    }

    @When("Kullanici {string} ve {string} secip magaza ara tiklamali sonuclari kontrol etmeli")
    public void kullanici_ve_secip_magaza_ara_tiklamali_sonuclari_kontrol_etmeli(String il, String ilce) {
        methodlar.ilIlceSecme(il, ilce);
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(urunSayfasi.MagazaBul);
      //  System.out.println(BrowserUtils.getElementsText(urunSayfasi.magazaBulSonuclari));

        for (WebElement magazaSonuclari : urunSayfasi.magazaBulSonuclari) {
            System.out.println(magazaSonuclari.getText());
            Assert.assertTrue(magazaSonuclari.getText().contains(il));

        }

        for (WebElement km : urunSayfasi.magazaBulSonuclarikm) {


            int noktaElemani =km.getText().indexOf("."); // nokta kaçıncı elaman
            int kacKilometre = Integer.parseInt((km.getText().substring(0, noktaElemani))); // 0 dan noktaya kadar yazdırma
            //System.out.println(" nokta kacıncı eleman "+km.getText().indexOf("."));
            System.out.println("kac kilometre = " + kacKilometre);

            Assert.assertTrue(kacKilometre<15);
        }

    }
}
