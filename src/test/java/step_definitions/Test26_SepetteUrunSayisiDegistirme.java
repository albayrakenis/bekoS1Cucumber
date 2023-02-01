package step_definitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.Sepet;
import utility.BrowserUtils;

public class Test26_SepetteUrunSayisiDegistirme {


    Sepet sepet = new Sepet();

    @Then("Kullanici urun sayisini artirmali")
    public void kullanici_urun_sayisini_artirmali() {
        System.out.println(sepet.sepettekiUrunSayisi.getAttribute("defaultValue"));
        BrowserUtils.clickWithJS(sepet.urunSayisiArtirma);
        BrowserUtils.waitFor(1);
        System.out.println(sepet.sepettekiUrunSayisi.getAttribute("defaultValue"));
        Assert.assertTrue(sepet.sepettekiUrunSayisi.getAttribute("defaultValue").contains("2"));
        BrowserUtils.clickWithJS(sepet.urunSayisiArtirma);
        BrowserUtils.waitFor(1);
        System.out.println(sepet.sepettekiUrunSayisi.getAttribute("defaultValue"));
        Assert.assertTrue(sepet.sepettekiUrunSayisi.getAttribute("defaultValue").contains("3"));
    }

    @Then("Kullanici urun sayisini dusurmeli")
    public void kullanici_urun_sayisini_dusurmeli() {
        System.out.println(sepet.sepettekiUrunSayisi.getAttribute("defaultValue"));
        BrowserUtils.clickWithJS(sepet.urunSayisiEksiltme);
        BrowserUtils.waitFor(1);
        System.out.println(sepet.sepettekiUrunSayisi.getAttribute("defaultValue"));
        Assert.assertTrue(sepet.sepettekiUrunSayisi.getAttribute("defaultValue").contains("2"));
        BrowserUtils.clickWithJS(sepet.urunSayisiEksiltme);
        BrowserUtils.waitFor(1);
        System.out.println(sepet.sepettekiUrunSayisi.getAttribute("defaultValue"));
        Assert.assertTrue(sepet.sepettekiUrunSayisi.getAttribute("defaultValue").contains("1"));
    }
}
