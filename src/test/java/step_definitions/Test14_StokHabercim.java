package step_definitions;

import io.cucumber.java.en.*;
import org.apache.commons.logging.Log;
import org.junit.Assert;
import pages.Login;
import pages.Methodlar;
import pages.UrunSayfasi;

import java.awt.*;
import java.lang.reflect.Method;

public class Test14_StokHabercim {

    Methodlar methodlar=new Methodlar();
    UrunSayfasi urunSayfasi =new UrunSayfasi();
    Login login =new Login();

    public Test14_StokHabercim() throws AWTException {
    }

    @When("Kullanici {string} {string} {string} gitmeli")
    public void kullanici_gitmeli(String kategoriAdi, String baslikAdi, String urunAdi) {
        methodlar.urunSayfasinaGitme(kategoriAdi,baslikAdi,urunAdi);
    }
    @When("Stoga gelince haber vere tiklamali")
    public void stoga_gelince_haber_vere_tiklamali() {
        urunSayfasi.stogaGelinceHaberVer.click();
    }
    @When("Mail adresini doldurmali ve gondere tiklamali")
    public void mail_adresini_doldurmali_ve_gondere_tiklamali() {
        urunSayfasi.stokHabercimEposta.sendKeys("2albay.rakenis@gmail.com");
        urunSayfasi.stokHabercimMailGonder.click();
    }
    @When("Kullanici talebiniz alindi yazisini gormeli")
    public void kullanici_talebiniz_alindi_yazisini_gormeli() {
        System.out.println(urunSayfasi.stokHabercimTalebinizAlinmistir.getAttribute("innerText"));
        Assert.assertTrue(urunSayfasi.stokHabercimTalebinizAlinmistir.getAttribute("innerText").toLowerCase().contains("teşekkür"));
    }
    @When("Kullanici Stok habercime gitmeli")
    public void kullanici_stok_habercime_gitmeli() throws InterruptedException {
        urunSayfasi.stokHabercimeGit.click();
        login.bekoLogin();
    }
    @Then("Stok habercimde urunun oldugunu gormeli")
    public void stok_habercimde_urunun_oldugunu_gormeli() {


    }
}
