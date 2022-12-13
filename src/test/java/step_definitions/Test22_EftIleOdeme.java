package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Methodlar;
import pages.Odeme;
import pages.SatinAl;
import utility.BrowserUtils;
import utility.Driver;

public class Test22_EftIleOdeme extends Odeme {

    Methodlar methodlar=new Methodlar();
    SatinAl satinAl = new SatinAl();
    Odeme odeme =new Odeme();
    @When("Kullanici mesafeli satis sozlesmesini onaylamali")
    public void kullanici_mesafeli_satis_sozlesmesini_onaylamali() {
        methodlar.onBilgilendirmeVeSatisSozlesmesiOnaylama();

    }

    @Then("Kullanici alisverisi tamamlayi tiklamali")
    public void kullaniciAlisverisiTamamlayiTiklamali() {
        BrowserUtils.clickWithJS(satinAl.alisverisiTamamla);

        Assert.assertTrue(odeme.siparisinizBizeUlastiEftOdeme.getAttribute("innerText").contains("Teşekkürler"));
        String siparisinizUlastiYazisi = odeme.siparisinizBizeUlastiEftOdeme.getAttribute("innerText");
        System.out.println(siparisinizUlastiYazisi.indexOf("bize"));
        System.out.println(odeme.siparisinizBizeUlastiEftOdeme.getAttribute("innerText"));
    }

    @And("Kullanici siparis numarasini gormeli")
    public void kullaniciSiparisNumarasiniGormeli() {
        String siparisNumarasi = odeme.siparisNumarasi.getAttribute("innerText");
        int a=siparisNumarasi.indexOf(": ");
        System.out.println(": index "+siparisNumarasi.indexOf(": "));

        System.out.println("a +2 ile başlar "+siparisNumarasi.substring(a+2));

        System.out.println(siparisNumarasiAlma());


    }

    @And("Kullanici hybris ekranına gider ve login olmali")
    public void kullaniciHybrisEkranınaGiderVeLoginOlmali() {
        String siparisNumarasi= siparisNumarasiAlma();


        Driver.get().get("https://backoffice.c1m0wu3z2z-arcelikas1-s1-public.model-t.cc.commerce.ondemand.com/backoffice/login.zul");
        Driver.get().manage().window().maximize();

        BrowserUtils.waitFor(2);

        Driver.get().findElement(By.xpath("//input[@name='j_username']")).sendKeys("enis.albayrak@arcelik.com");
        Driver.get().findElement(By.xpath("//input[@name='j_password']")).sendKeys("gebze1993");

        BrowserUtils.waitFor(2);

        BrowserUtils.clickWithJS(Driver.get().findElement(By.xpath("//button[@class='login_btn y-btn-primary z-button']")));
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(Driver.get().findElement(By.xpath("//button[@class='yw-selector-btn y-btn-primary z-button']")));
        BrowserUtils.waitFor(3);

        //order tıkla
        BrowserUtils.clickWithJS(Driver.get().findElement(By.xpath("//span[.='Order']")));
        //orders tıkla
        BrowserUtils.clickWithJS(Driver.get().findElement(By.xpath("//span[.='Orders']")));

        BrowserUtils.waitFor(2);

        Driver.get().findElement(By.xpath("//input[@class='z-bandbox-input z-bandbox-rightedge']")).sendKeys(siparisNumarasi);

        BrowserUtils.waitFor(3);

        BrowserUtils.clickWithJS(Driver.get().findElement(By.cssSelector(".yw-textsearch-searchbutton")));

//        WebElement backOfficeSiparisNumarasi = Driver.get().findElement(By.cssSelector("#uUoXfm tr:nth-of-type(1) span:nth-of-type(2)"));
//        System.out.println("backOfficeSiparisNumarasi = " + backOfficeSiparisNumarasi);

        //Assert.assertTrue(siparisNumarasi.contains(backOfficeSiparisNumarasi.getText()));


    }
}
