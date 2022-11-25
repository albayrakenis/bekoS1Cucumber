package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Anasayfa;
import utility.BrowserUtils;

public class Test09_Kampanyalar {
    Anasayfa anasayfa = new Anasayfa();


    @When("Kullanici kampanyalari tiklamali")
    public void kullanici_kampanyalari_tiklamali() {
        anasayfa.kampanyalarButton.click();
        BrowserUtils.waitFor(1);
    }

    @When("Kullanici tum kampanyalari tiklamali")
    public void kullanici_tum_kampanyalari_tiklamali() {
        anasayfa.tumKampanyalar.click();
        BrowserUtils.waitFor(1);
    }

    @When("Kullanici kampanyalar beyaz esyayi tiklamali")
    public void kullanici_kampanyalar_beyaz_esyayi_tiklamali() {
        anasayfa.beyazEsyaKampanyalari.click();
        BrowserUtils.waitFor(1);
    }

    @When("Kullanici kucuk ev aletlerini tiklamali")
    public void kullanici_kucuk_ev_aletlerini_tiklamali() {

        anasayfa.kucukEvAletleriKampanyalari.click();
        BrowserUtils.waitFor(1);
    }

    @When("Kullanici size ozeli tiklamali")
    public void kullanici_size_ozeli_tiklamali() {
        anasayfa.sizeOzelKampanyalari.click();
        BrowserUtils.waitFor(1);
    }

    @Then("Kullanici kampanyalar yazisini gormeli")
    public void kullanici_kampanyalar_yazisini_gormeli() {
        anasayfa.tumKampanyalar.click();
        System.out.println("Kategori adı=  " + anasayfa.kampanyalarText.getText());
        BrowserUtils.waitFor(1);
        Assert.assertEquals("Kampanyalar",anasayfa.kampanyalarText.getText());
    }
}
