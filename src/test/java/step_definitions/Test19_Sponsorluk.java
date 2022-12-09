package step_definitions;

import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.Anasayfa;
import utility.BrowserUtils;

import java.util.List;

public class Test19_Sponsorluk {

    Anasayfa anasayfa =new Anasayfa();
    @When("Kullanici asagidaki sponsorluk listesini gormeli")
    public void kullanici_asagidaki_sponsorluk_listesini_gormeli(List<String> gerceklesenSponsorlukListesi) {
        BrowserUtils.scrollToElement(anasayfa.sponsorlukYazisi);

        for (WebElement sponsorluk : anasayfa.anasayfaSponsorlukListesi) {
            System.out.println(sponsorluk.getText());
            // Assert.assertTrue(gerceklesenSponsorlukListesi.contains(sponsorluk));
        }

    }
}
