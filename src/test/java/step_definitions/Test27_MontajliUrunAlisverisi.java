package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.Anasayfa;
import pages.Odeme;
import utility.BrowserUtils;
import utility.Driver;

public class Test27_MontajliUrunAlisverisi {

    Anasayfa anasayfa = new Anasayfa();
    Odeme odeme = new Odeme();

    @When("Arama bolumune aranacak urun adini yaz {string}")
    public void arama_bolumune_aranacak_urun_adini_yaz(String aramaKelimesi) {
        anasayfa.aramaTextBosluk.sendKeys(aramaKelimesi+ Keys.ENTER);
    }

    @And("Sonuclardan ilgili urune tiklanir")
    public void sonuclardanIlgiliUruneTiklanir() {
        WebElement ilkUrun = Driver.get().findElement(By.xpath("(//a[@title='İncele'])[1]"));
        BrowserUtils.clickWithJS(ilkUrun);

    }

    @And("Kullanici siparis onaylandigini gormeli")
    public void kullaniciSiparisOnaylandiginiGormeli() {
        BrowserUtils.waitFor(5);
        System.out.println(odeme.siparisNumarasi.getAttribute("innerText"));
        Assert.assertTrue(odeme.siparisNumarasi.getAttribute("innerText").contains("Sipariş"));

    }
}
