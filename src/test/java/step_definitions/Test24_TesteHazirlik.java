package step_definitions;

import io.cucumber.java.en.When;
import pages.Anasayfa;
import utility.BrowserUtils;

public class Test24_TesteHazirlik {

    Anasayfa anasayfa =new Anasayfa();
    @When("Kullanici sepete gitmeli")
    public void kullanici_sepete_gitmeli() {

        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(anasayfa.anasayfaSepetIcon);

    }
}
