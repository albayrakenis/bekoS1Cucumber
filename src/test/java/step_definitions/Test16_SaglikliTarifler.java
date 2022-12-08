package step_definitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.Anasayfa;
import pages.UrunSayfasi;
import utility.BrowserUtils;

import java.util.List;

public class Test16_SaglikliTarifler {

    UrunSayfasi urunSayfasi =new UrunSayfasi();
    Anasayfa anasayfa =new Anasayfa();

    @Given("Kullanici saglikli tarifler sayfasina gitmeli")
    public void kullanici_saglikli_tarifler_sayfasina_gitmeli() {
        BrowserUtils.scrollToElement(anasayfa.saglikliTarifler);
        BrowserUtils.clickWithJS(anasayfa.saglikliTarifler);

    }
    @Given("Kullanici lezzetli tarifler listesini gormeli")
    public void kullanici_lezzetli_tarifler_listesini_gormeli(List<String> saglikliLezzetlerBeklenen) {

            List<String > saglikliLezzetlerGerceklesen =BrowserUtils.getElementsText(urunSayfasi.saglikliLezzetlerListesi);
            for (WebElement tarif : urunSayfasi.saglikliLezzetlerListesi) {
                System.out.println(tarif.getText());
            }
            Assert.assertEquals(saglikliLezzetlerBeklenen,saglikliLezzetlerGerceklesen);
        }


}
