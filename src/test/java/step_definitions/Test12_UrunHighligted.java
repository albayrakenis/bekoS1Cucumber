package step_definitions;

import io.cucumber.java.en.When;
import pages.Anasayfa;
import pages.BeyazEsya;
import pages.Methodlar;

public class Test12_UrunHighligted {

    Methodlar methodlar = new Methodlar();
    BeyazEsya beyazEsya = new BeyazEsya();
    Anasayfa anasayfa =new Anasayfa();

    @When("Kullanici {string} ve {string} tiklamali")
    public void kullanici_ve_tiklamali(String KategoriAdi, String Baslik) {
        methodlar.plpdeUrunlerinHighligtedKontrolu(KategoriAdi,Baslik);
    }

    @When("Kullanici urunlere tiklamali")
    public void kullanici_urunlere_tiklamali() {
        anasayfa.urunler.click();

    }


}
