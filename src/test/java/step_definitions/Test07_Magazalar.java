package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Anasayfa;
import pages.Methodlar;
import utility.BrowserUtils;
import utility.Driver;

import java.util.List;

public class Test07_Magazalar {

    Anasayfa anasayfa =new Anasayfa();
    Methodlar methodlar=new Methodlar();

    @When("Kullanici magazalar sayfasina gitmeli")
    public void kullanici_magazalar_sayfasina_gitmeli() {
        anasayfa.magazalarButonu.click();

    }
    @When("Kullanici {string} secip magaza aramali sonuclari kontrol etmeli")
    public void kullanici_secip_magaza_aramali_sonuclari_kontrol_etmeli(String il) {
        methodlar.ilSecme(il);
        BrowserUtils.waitFor(2);
        anasayfa.magazaAraButonu.click();
        BrowserUtils.waitFor(2);

        Assert.assertTrue(Driver.get().getCurrentUrl().toUpperCase().contains(il));
        Assert.assertTrue(Driver.get().getTitle().contains(il));

    }

    @And("Kullanici {string} ve {string} secip magaza aramali sonuclari kontrol etmeli")
    public void kullaniciVeSecipMagazaAramaliSonuclariKontrolEtmeli(String il, String ilce) {
        methodlar.ilIlceSecme(il,ilce);
        BrowserUtils.waitFor(2);
        anasayfa.magazaAraButonu.click();
        BrowserUtils.waitFor(2);

        Assert.assertTrue(Driver.get().getCurrentUrl().toUpperCase().contains(il));
        Assert.assertTrue(Driver.get().getTitle().contains(il));
        Assert.assertTrue(Driver.get().getCurrentUrl().toUpperCase().contains(ilce));
        Assert.assertTrue(Driver.get().getTitle().contains(ilce));

        List<WebElement> magazalarSonuclari = Driver.get().findElements(By.cssSelector(".srv-list > [data-order] > .srv-address"));

        for (WebElement magazaSonuc : magazalarSonuclari) {
            Assert.assertTrue(magazaSonuc.getText().toLowerCase().contains(ilce.toLowerCase()));
            Assert.assertTrue(magazaSonuc.getText().toLowerCase().contains(il.toLowerCase()));


        }

    }
}
