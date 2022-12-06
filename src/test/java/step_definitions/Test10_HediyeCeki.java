package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Anasayfa;
import pages.HediyeCeki;
import pages.Methodlar;
import pages.SatinAl;
import utility.BrowserUtils;
import utility.Driver;

import java.util.List;

public class Test10_HediyeCeki {

    Anasayfa anasayfa = new Anasayfa();
    SatinAl satinAl = new SatinAl();
    HediyeCeki hediyeCeki =new HediyeCeki();
    Methodlar methodlar =new Methodlar();


    @When("Kullanici hediye cekine tiklamali")
    public void kullanici_hediye_cekine_tiklamali() {
        BrowserUtils.verifyElementDisplayed(anasayfa.hediyeCekiButton);
        anasayfa.hediyeCekiButton.click();

    }


    @And("Kullanici hediye ceki listesi gormeli")
    public void kullaniciHediyeCekiListesiGormeli(List<String> beklenenHediyeCekiListesi) {
        List<String> gerceklesenHediyeCekiListesi= BrowserUtils.getElementsText(hediyeCeki.hediyeCekListesi);
        Assert.assertEquals(beklenenHediyeCekiListesi,gerceklesenHediyeCekiListesi);

        for (String s : gerceklesenHediyeCekiListesi) {
            System.out.println(s);

        }
    }


    @When("Kullanicii hediye cekini sepete eklemeli")
    public void kullanicii_hediye_cekini_sepete_eklemeli() {
        BrowserUtils.clickWithJS(satinAl.inceleButton);
        BrowserUtils.clickWithJS(satinAl.sepeteAt);
        BrowserUtils.clickWithJS(satinAl.sepeteGit);


    }

    @When("Kullanici ceki kullanacak kisi bilgilerini doldurmali")
    public void kullanici_ceki_kullanacak_kisi_bilgilerini_doldurmali() {
        methodlar.hediyeCekiBilgireniDoldurma();
        System.out.println(hediyeCeki.hediyeCekiDuzenle.getText());
        Assert.assertEquals(hediyeCeki.hediyeCekiDuzenle.getText(),"Düzenle");

    }

    @When("Kullanici hediye cekini silmeli")
    public void kullanici_hediye_cekini_silmeli() {
        BrowserUtils.waitFor(2);
        hediyeCeki.sepetiBosalt.click();
    }

    @Then("Kullanici sepetin bos oldugunu kontrol etmeli")
    public void kullanici_sepetin_bos_oldugunu_kontrol_etmeli() {

        System.out.println(hediyeCeki.sepetteUrunYok.getText());
        Assert.assertTrue(hediyeCeki.sepetteUrunYok.getText().contains("ürün yok"));

    }
}
