package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.Anasayfa;
import pages.Kisayollar;
import pages.Methodlar;
import utility.BrowserUtils;
import utility.Driver;

import java.util.List;

public class Test20_AnasayfaKisayol {

    Methodlar methodlar = new Methodlar();
    Kisayollar kisayollar = new Kisayollar();
    Anasayfa anasayfa =new Anasayfa();

    @When("Kullanici anasayfadaki {string} basligina gitmeli")
    public void kullanici_anasayfadaki_basligina_gitmeli(String kategori) {
        methodlar.anasayfaKisayollari(kategori);
        for (WebElement kisayol : kisayollar.beyazEsyaAnaBasliklar) {
            System.out.println(kisayol.getText());
        }

    }

    @And("Kullanici asagidaki beyaz esya kisayol listesini gormeli")
    public void kullaniciAsagidakiBeyazEsyaKisayolListesiniGormeli(List<String> beklenenBeyazKisayollari) {
        List<String> gerceklesenBeyazKisayollari =BrowserUtils.getElementsText(kisayollar.beyazEsyaAnaBasliklar);
        Assert.assertEquals(beklenenBeyazKisayollari,gerceklesenBeyazKisayollari);

        System.out.println(BrowserUtils.getElementsText(kisayollar.beyazEsyaAnaBasliklar));
        BrowserUtils.clickWithJS(anasayfa.anasayfadaBekoIcon);
        BrowserUtils.waitFor(1);

    }

    @And("Kullanici asagidaki ankastre kisayol listesini gormeli")
    public void kullaniciAsagidakiAnkastreKisayolListesiniGormeli(List<String> beklenenAnkastreKisayollari) {
        List<String> gerceklesenAnkastreKisayollari =BrowserUtils.getElementsText(kisayollar.ankastreAnaBasliklar);
        Assert.assertEquals(beklenenAnkastreKisayollari,gerceklesenAnkastreKisayollari);

        System.out.println(BrowserUtils.getElementsText(kisayollar.ankastreAnaBasliklar));
        BrowserUtils.clickWithJS(anasayfa.anasayfadaBekoIcon);
        BrowserUtils.waitFor(1);
    }
}
