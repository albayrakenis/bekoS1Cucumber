package step_definitions;

import io.cucumber.java.en.When;
import pages.Methodlar;
import pages.PLP;
import utility.Driver;

public class Test04_HeaderMenu {

    Methodlar methodlar = new Methodlar();
    PLP plp = new PLP();

    @When("Kullanici once {string} sonra {string} tiklamali")
    public void kullanici_once_sonra_tiklamali(String kategoriAdi, String baslik) {
       methodlar.urunSayfasiKontrol(kategoriAdi,baslik);



    }

}
