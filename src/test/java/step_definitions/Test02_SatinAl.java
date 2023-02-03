package step_definitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Methodlar;
import pages.SatinAl;
import utility.BrowserUtils;
import utility.ConfigurationReader;
import utility.Driver;

import java.util.concurrent.TimeUnit;

public class Test02_SatinAl {

    SatinAl satinAl = new SatinAl();
    Methodlar methodlar = new Methodlar();
    Faker faker =new Faker();


    @When("Kullanici urun secmeli {string} {string} {string}")
    public void kullaniciUrunSecmeli(String kategoriAdi, String baslikAdi,String urunAdi) {

        methodlar.urunSayfasinaGitme(kategoriAdi,baslikAdi,urunAdi);


    }

    @When("Kullanici sepete eklemeli")
    public void kullanici_sepete_eklemeli() {
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        BrowserUtils.waitFor(2);


        BrowserUtils.clickWithJS(satinAl.sepeteAt);
        BrowserUtils.clickWithJS(satinAl.sepeteGit);




    }

    @When("Kullanici odeme adimina gitmeli")
    public void kullanici_odeme_adimina_gitmeli() {

        BrowserUtils.clickWithJS(satinAl.sepetiOnayla);
        BrowserUtils.waitFor(2);


    }

    @Then("Kullanici kart bilgilerini girmeli")
    public void kullanici_kart_bilgilerini_girmeli() {

        BrowserUtils.clickWithJS(satinAl.krediKarti);
        satinAl.krediKartiNumarasi.sendKeys(ConfigurationReader.get("krediKartiNumarasi"));
        satinAl.krediKartiSahibi.sendKeys(faker.name().fullName());
        BrowserUtils.waitFor(2);
        satinAl.krediKartiTarih.sendKeys("1230");
        satinAl.krediKartiCvv.sendKeys("000");
        satinAl.onBilgilendirme.click();
        satinAl.mesafeliSatisSozlesmesi.click();

    }


    @Then("Kullanici eft havale ile odemeyi tamamlamali")
    public void kullaniciEftHavaleIleOdemeyiTamamlamali() {
        BrowserUtils.scrollToElement(satinAl.eftHavale);
        BrowserUtils.clickWithJS(satinAl.eftHavale);
        satinAl.onBilgilendirme.click();
        satinAl.mesafeliSatisSozlesmesi.click();
    }

    @And("Kullanici odemeyi onaylamali")
    public void kullaniciOdemeyiOnaylamali() {
        BrowserUtils.clickWithJS(satinAl.alisverisiTamamla);
        BrowserUtils.clickWithJS(satinAl.odemeOnaylama);
    }
}
