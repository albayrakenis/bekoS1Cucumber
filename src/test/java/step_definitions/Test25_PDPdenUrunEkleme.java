package step_definitions;

import io.cucumber.java.en.Then;
import pages.Sepet;

public class Test25_PDPdenUrunEkleme {


    Sepet sepet =new Sepet();
    @Then("Kullanici ekledigi urunu sepette kontrol etmeli")
    public void kullanici_ekledigi_urunu_sepette_kontrol_etmeli() {
        System.out.println(sepet.sepettekiUrununKodu.getText());
    }
}
