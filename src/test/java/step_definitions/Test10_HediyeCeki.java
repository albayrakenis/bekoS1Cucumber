package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Anasayfa;
import pages.SatinAl;
import utility.BrowserUtils;
import utility.Driver;

import java.util.List;

public class Test10_HediyeCeki {

    Anasayfa anasayfa = new Anasayfa();
    SatinAl satinAl = new SatinAl();

    @When("Kullanici hediye cekine tiklamali")
    public void kullanici_hediye_cekine_tiklamali() {
        BrowserUtils.verifyElementDisplayed(anasayfa.hediyeCekiButton);
        anasayfa.hediyeCekiButton.click();

    }

    @When("Kullanici {int} tane hediye ceki gormeli")
    public void kullanici_tane_hediye_ceki_gormeli(Integer int1) {
        List<WebElement> cekListesi = Driver.get().findElements(By.xpath("//span[@class='js-prd-name']"));
        System.out.println("Hediye çeki sayısı: " + cekListesi.size());
        Assert.assertTrue(cekListesi.size() == 3);
        System.out.println(cekListesi.get(0).getText());
        System.out.println(cekListesi.get(1).getText());
        System.out.println(cekListesi.get(2).getText());
    }

    @When("Kullanicii hediye cekini sepete eklemeli")
    public void kullanicii_hediye_cekini_sepete_eklemeli() {
        satinAl.inceleButton.click();
        satinAl.sepeteAt.click();
        satinAl.sepeteGit.click();


    }

    @When("Kullanici ceki kullanacak kisi bilgilerini doldurmali")
    public void kullanici_ceki_kullanacak_kisi_bilgilerini_doldurmali() {


    }

    @When("Kullanici hediye cekini silmeli")
    public void kullanici_hediye_cekini_silmeli() {


    }

    @Then("Kullanici sepetin bos oldugunu kontrol etmeli")
    public void kullanici_sepetin_bos_oldugunu_kontrol_etmeli() {


    }
}
