package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Bildirimler;
import utility.BrowserUtils;
import utility.Driver;

public class Test03_Bildirimler {

    Bildirimler bildirimler = new Bildirimler();

    @When("Kullanici bildirimleri tiklamali")
    public void kullanici_bildirimleri_tiklamali() throws InterruptedException {
        BrowserUtils.waitFor(2);
        bildirimler.bildirimIcon.click();
        bildirimler.tumunuGor.click();

    }
    @When("Kullanici urunlerim sekmesine tiklamali")
    public void kullanici_urunlerim_sekmesine_tiklamali() throws InterruptedException {
        bildirimler.urunlerim.click();
        Thread.sleep(500);

    }
    @When("Kullanici siparislerim sekmesine tiklamali")
    public void kullanici_siparislerim_sekmesine_tiklamali() throws InterruptedException{
        bildirimler.siparislerim.click();
        Thread.sleep(500);
    }
    @When("Kullanici bildirimlerim sekmesine tiklamali")
    public void kullanici_bildirimlerim_sekmesine_tiklamali() throws InterruptedException{
        bildirimler.bildirimlerim.click();
        Thread.sleep(500);
    }
    @When("Kullanici taleplerim sekmesine tiklamali")
    public void kullanici_taleplerim_sekmesine_tiklamali() throws InterruptedException{
        bildirimler.taleplerim.click();
        Thread.sleep(500);
    }
    @When("Kullanici favorilerim sekmesine tiklamali")
    public void kullanici_favorilerim_sekmesine_tiklamali()throws InterruptedException {
        bildirimler.favorilerim.click();
        Thread.sleep(500);
    }
    @When("Kullanici stok habercim sekmesine tiklamali")
    public void kullanici_stok_habercim_sekmesine_tiklamali() throws InterruptedException{
        bildirimler.stokHabercim.click();
        Thread.sleep(500);
    }
    @When("Kullanici kuponlarim sekmesine tiklamali")
    public void kullanici_kuponlarim_sekmesine_tiklamali() throws InterruptedException{
        bildirimler.kuponlarim.click();
        Thread.sleep(500);
    }
    @When("Kullanici hediye ceklerim sekmesine tiklamali")
    public void kullanici_hediye_ceklerim_sekmesine_tiklamali() throws InterruptedException{
        bildirimler.hediyeCeklerim.click();
        Thread.sleep(500);
    }
    @When("Kullanici bilgilerim sekmesine tiklamali")
    public void kullanici_bilgilerim_sekmesine_tiklamali() throws InterruptedException{
        bildirimler.bilgilerim.click();
        Thread.sleep(500);
    }
    @Then("Kullanici cikis yap sekmesine tiklamali")
    public void kullanici_cikis_yap_sekmesine_tiklamali() throws InterruptedException {
        bildirimler.cikisYap.click();
        Thread.sleep(2000);
        Driver.closeDriver();
    }


}
