package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Anasayfa;
import pages.PLP;
import utility.BrowserUtils;
import utility.Driver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class Test11_UrunArama {
    Anasayfa anasayfa =new Anasayfa();

    PLP plp =new PLP();
    Robot robot = new Robot();
    String aranacakKelime = "buzdolabı";

    public Test11_UrunArama() throws AWTException {
    }

    @When("Ana sayfada arama butonuna tikla")
    public void ana_sayfada_arama_butonuna_tikla() {
        anasayfa.aramaMetinKutusu.click();
    }
    @When("Arama bolumune aranacak urun adini yaz")
    public void arama_bolumune_aranacak_urun_adini_yaz() {

        anasayfa.aramaTextBosluk.sendKeys(aranacakKelime);
    }
    @When("Entere bas")
    public void entere_bas() {
        robot.keyPress(KeyEvent.VK_ENTER);
    }
    @When("Ara butonuna tikla")
    public void ara_butonuna_tikla() {

        anasayfa.aramaButonu.click();
    }
    @When("Gelen urunlerin isimlerini liste olarak al")
    public void gelen_urunlerin_isimlerini_liste_olarak_al() {
        List<WebElement> aramaSonuclari = Driver.get().findElements(By.xpath("//div[@class='prd-name ']"));
        for (WebElement sonuc : aramaSonuclari) {
            System.out.println(sonuc.getText());
        }

        Assert.assertTrue(aramaSonuclari.size()>0);
    }
    @Then("Urun isimleri ve arama kelimesini karsilastir")
    public void urun_isimleri_ve_arama_kelimesini_karsilastir() {
        System.out.println(plp.aramaSonucSafyasiSolTarafKategoriAdi.getText().toLowerCase());
        Assert.assertTrue(plp.aramaSonucSafyasiSolTarafKategoriAdi.getText().toLowerCase().contains(aranacakKelime));
        BrowserUtils.waitFor(8);
       // Driver.closeDriver();
    }
}
