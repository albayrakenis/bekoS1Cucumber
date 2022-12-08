package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.Anasayfa;
import pages.Destek;
import pages.Methodlar;
import utility.BrowserUtils;

import java.util.List;

public class Test18_Destek {
    Anasayfa anasayfa = new Anasayfa();
    Destek destek = new Destek();
    Methodlar methodlar =new Methodlar();

    @And("Kullanici destek sayfasina gitmeli")
    public void kullaniciDestekSayfasinaGitmeli() {
        anasayfa.destekButton.click();

    }

    @Given("Kullanici destek sayfasina gitmeli ve asagidaki listeyi gormeli")
    public void kullanici_destek_sayfasina_gitmeli_ve_asagidaki_listeyi_gormeli(List<String> beklenenDestekBasliklari) {

        List<String> gerceklesenDestekBasliklar = BrowserUtils.getElementsText(destek.destekSayfasiBasliklar);
        for (String s : gerceklesenDestekBasliklar) {
            System.out.println(s);
        }
        Assert.assertEquals(beklenenDestekBasliklari, gerceklesenDestekBasliklar);

    }

    @Given("Kullanici servis bul sayfasina gitmeli")
    public void kullanici_servis_bul_sayfasina_gitmeli() {
        BrowserUtils.scrollToElement(destek.servisBul);
        BrowserUtils.clickWithJS(destek.servisBul);

    }


    @And("Kullanici {string} ve {string} secip yetkili servis aramali")
    public void kullaniciVeSecipYetkiliServisAramali(String il, String ilce) {
        methodlar.ilIlceSecme(il,ilce);
        BrowserUtils.waitFor(4);
        BrowserUtils.clickWithJS(destek.yetkiliServisAra);

        System.out.println(BrowserUtils.getElementsText(destek.yetkiliServisListesi));
        Assert.assertTrue(destek.yetkiliServisListesi.contains(il));
        Assert.assertTrue(destek.yetkiliServisListesi.contains(ilce));
    }

    @And("Kullanici yetkili servis listesini kontrol etmeli")
    public void kullaniciYetkiliServisListesiniKontrolEtmeli() {

        //bir önceki adımda kontrol edilmiştiir
    }
}
