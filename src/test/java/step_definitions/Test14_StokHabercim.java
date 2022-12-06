package step_definitions;

import io.cucumber.java.en.*;
import pages.Methodlar;
import pages.UrunSayfasi;

import java.lang.reflect.Method;

public class Test14_StokHabercim {

    Methodlar methodlar=new Methodlar();
    UrunSayfasi urunSayfasi =new UrunSayfasi();
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

    }
    @When("Kullanici talebiniz alindi yazisini gormeli")
    public void kullanici_talebiniz_alindi_yazisini_gormeli() {

    }
    @When("Kullanici Stok habercime gitmeli")
    public void kullanici_stok_habercime_gitmeli() {

    }
    @Then("Stok habercimde urunun oldugunu gormeli")
    public void stok_habercimde_urunun_oldugunu_gormeli() {


    }
}
