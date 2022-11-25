package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Login;
import utility.BrowserUtils;
import utility.ConfigurationReader;
import utility.Driver;

import java.awt.*;

public class Test01_LoginTest {
    Login login = new Login();

    public Test01_LoginTest() throws AWTException {
    }


    @Given("Kullanici giris sayfasina gitmeli")
    public void kullaniciGirisSayfasinaGitmeli() {
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().window().maximize();

    }

    @Then("Kullanici su sayfaya gelmeli {string}")
    public void kullaniciSuSayfayaGelmeli(String string1) {
        System.out.println("giriş başarılı");
    }

    @When("Kullanici yanlis kullanici bilgilerini girmeli")
    public void kullaniciYanlisKullaniciBilgileriniGirmeli() {
        login.uyelikButonu.click();
        login.username.sendKeys(ConfigurationReader.get("username")+1);
        login.password.sendKeys(ConfigurationReader.get("password")+1);
        BrowserUtils.waitFor(1);
        BrowserUtils.clickWithJS(login.girisYapButonu);


 }

    @Then("Kullanici su sayfaya gelmeli basarisiz giris {string}")
    public void kullaniciSuSayfayaGelmeliBasarisizGiris(String string2) {
        Driver.closeDriver();

    }

    @When("Kullanici login olmali")
    public void kullaniciLoginOlmali() throws InterruptedException {
        Thread.sleep(1500);
        login.bekoLogin();

    }
}
