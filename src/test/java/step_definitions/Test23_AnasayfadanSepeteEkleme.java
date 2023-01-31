package step_definitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Anasayfa;
import pages.Sepet;
import pages.UrunSayfasi;
import utility.BrowserUtils;
import utility.Driver;

public class Test23_AnasayfadanSepeteEkleme {

    Anasayfa anasayfa = new Anasayfa();
    UrunSayfasi urunSayfasi =new UrunSayfasi();
    Sepet sepet =new Sepet();

    @When("Kullanici su siradaki urunu sepete eklemeli {string}")
    public void kullanici_su_siradaki_urunu_sepete_eklemeli(String string) {

        BrowserUtils.clickWithJS(anasayfa.cokSatanlarIkinciUrun);
        BrowserUtils.waitFor(2);
        urunSayfasi.sepeteAt.click();
        urunSayfasi.sepeteGitPopup.click();
    }
    @Then("Sepete gidip urunun eklendigini kontrol etmeli")
    public void sepete_gidip_urunun_eklendigini_kontrol_etmeli() {
        System.out.println(sepet.sepettekiUrununKodu.getText());
        org.testng.Assert.assertTrue(sepet.sepettekiUrununKodu.getText().contains("RS"));
    }
}
