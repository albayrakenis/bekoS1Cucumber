package step_definitions;

import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.Anasayfa;

public class Test17_CokSatanlar {
    Anasayfa anasayfa =new Anasayfa();
    @When("Kullanici cok satanlar listesine gitmeli")
    public void kullanici_cok_satanlar_listesine_gitmeli() {
        System.out.println(anasayfa.cokSatanUrunlerListesi.size());
        Assert.assertTrue(anasayfa.cokSatanUrunlerListesi.size()>1);


    }
}
