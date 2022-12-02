package pages;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utility.BrowserUtils;
import utility.Driver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Methodlar {

    public Methodlar() {
        PageFactory.initElements(Driver.get(), this);
    }

    BeyazEsya byzEsya = new BeyazEsya();
    PLP plp = new PLP();
    SatinAl satinAl = new SatinAl();
    UrunSayfasi urunSayfasi = new UrunSayfasi();
    Anasayfa anasayfa = new Anasayfa();
    Faker faker =new Faker();


    public void getText(WebElement element) {

        System.out.println(" Ürün adı " + element.getText().toLowerCase());
    }


    public void plpdeUrunlerinHighligtedKontrolu(String kategoriAdi, String urunAdi) {
        BrowserUtils.waitFor(2);
        WebElement AnasayfaKategorideIsmi = Driver.get().findElement(By.xpath("//span[.='" + kategoriAdi + "']"));
        BrowserUtils.verifyElementDisplayed(AnasayfaKategorideIsmi);
        BrowserUtils.hover(AnasayfaKategorideIsmi);

        WebElement AnasayfaUrunIsmi = Driver.get().findElement(By.xpath("//span[.='" + urunAdi + "']"));
        BrowserUtils.waitFor(2);
        AnasayfaUrunIsmi.click();
        BrowserUtils.waitFor(2);


        List<WebElement> plpUrunler = Driver.get().findElements(By.xpath("//div[@class='prd-inner']//div[@class='prd-features']/ul/li"));

        BrowserUtils.waitFor(1);
        WebElement sayfaSonu = Driver.get().findElement(By.xpath("//li[.='Ürünler']"));
        BrowserUtils.scrollToElement(sayfaSonu);
        BrowserUtils.waitFor(2);
        BrowserUtils.scrollToElement(sayfaSonu);
        BrowserUtils.waitFor(2);
        BrowserUtils.scrollToElement(sayfaSonu);
        BrowserUtils.waitFor(2);

        for (WebElement plpUrun : plpUrunler) {
            BrowserUtils.scrollToElement(plpUrun);
            System.out.println("Urun Adi  = " + plpUrun.getText());

        }

    }


    public void urunSayfasiKontrol(String kategoriAdi, String baslikAdi) {
        BrowserUtils.waitFor(1);
        WebElement AnasayfaKategoriIsmi = Driver.get().findElement(By.xpath("//span[.='" + kategoriAdi + "']"));
        BrowserUtils.hover(AnasayfaKategoriIsmi);

        WebElement AnasayfaUrunIsmi = Driver.get().findElement(By.xpath("//span[.='" + baslikAdi + "']"));
        BrowserUtils.waitFor(1);
        AnasayfaUrunIsmi.click();
        WebElement sonucSayisi = plp.plpdeBulunanSonucSayisi;
        System.out.println(plp.aramaSonucSafyasiSolTarafKategoriAdi.getText());

        int sonuc = Integer.parseInt(sonucSayisi.getText());
        if (sonuc > 0) {
            for (int i = 0; i < sonuc / 20; i++) {
                BrowserUtils.scrollToElement(plp.footerUrunler);
                BrowserUtils.waitFor(1);
                BrowserUtils.scrollToElement(plp.footerUrunler);
            }
        }
        Assert.assertEquals("kategori adı ve pdp ekranı aynı", baslikAdi, plp.aramaSonucSafyasiSolTarafKategoriAdi.getText());

        System.out.println("urunAdi = " + baslikAdi);
        System.out.println("sol panel = " + plp.aramaSonucSafyasiSolTarafKategoriAdi.getText());
    }


    public void satinAlma(String kategoriAdi, String baslikAdi, String urunAdi) {
        satinAl.urunler.click();
        BrowserUtils.waitFor(1);
        WebElement AnasayfaKategoriIsmi = Driver.get().findElement(By.xpath("//span[.='" + kategoriAdi + "']"));
        BrowserUtils.hover(AnasayfaKategoriIsmi);

        WebElement AnasayfaUrunIsmi = Driver.get().findElement(By.xpath("//span[.='" + baslikAdi + "']"));
        BrowserUtils.waitFor(1);
        AnasayfaUrunIsmi.click();
        BrowserUtils.waitFor(1);
        WebElement sepeteEklenecekUrun = Driver.get().findElement(By.cssSelector("[title='" + urunAdi + "'] [data-order='2']"));
        BrowserUtils.waitFor(3);
        BrowserUtils.scrollToElement(sepeteEklenecekUrun);
        BrowserUtils.clickWithJS(sepeteEklenecekUrun);

    }

    public void sepettenUrunSilme() {
        anasayfa.anasayfaSepetIcon.click();
        List<WebElement> sepettekiUrunSayisi = Driver.get().findElements(By.xpath("//div[@class='cart-prd-details']"));
        System.out.println(sepettekiUrunSayisi.size());
        int urunSayisi = sepettekiUrunSayisi.size();
        for (int i = 0; i < urunSayisi; i++) {
            BrowserUtils.scrollToElement(satinAl.sepettenSil);
            BrowserUtils.clickWithJS(satinAl.sepettenSil);
        }

    }

    public void sepeteEkle(String kategoriAdi, String baslikAdi, String urunAdi) {
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        BrowserUtils.waitFor(2);
        satinAl.urunler.click();
        BrowserUtils.waitFor(1);
        WebElement AnasayfaKategoriIsmi = Driver.get().findElement(By.xpath("//span[.='" + kategoriAdi + "']"));
        BrowserUtils.hover(AnasayfaKategoriIsmi);

        WebElement AnasayfaUrunIsmi = Driver.get().findElement(By.xpath("//span[.='" + baslikAdi + "']"));
        BrowserUtils.waitFor(1);
        AnasayfaUrunIsmi.click();
        BrowserUtils.waitFor(1);
        WebElement sepeteEklenecekUrun = Driver.get().findElement(By.cssSelector("[title='" + urunAdi + "'] [data-order='2']"));
        BrowserUtils.waitFor(3);
        BrowserUtils.scrollToElement(sepeteEklenecekUrun);
        BrowserUtils.clickWithJS(sepeteEklenecekUrun);
        satinAl.sepeteAt.click();
        BrowserUtils.waitForPageToLoad(10);
        urunSayfasi.sepeteEklendiPopupCarpi.click();
        urunSayfasi.kilavuzAnasayfa.click();
    }

    public void ilIlceSecme(String il, String ilce){

        Select select = new Select(Driver.get().findElement(By.id("cityCode")));
        select.selectByVisibleText(il);
        Select selectIlce = new Select(Driver.get().findElement(By.id("townCode")));
        selectIlce.selectByVisibleText(ilce);
    }

    public void ilSecme(String il){

        Select select = new Select(Driver.get().findElement(By.id("cityCode")));
        select.selectByVisibleText(il);

    }

    public void ilIlceMahalleSecme(String il, String ilce, String mahalle){

        Select select = new Select(Driver.get().findElement(By.id("cityCode")));
        select.selectByVisibleText(il);
        Select selectIlce = new Select(Driver.get().findElement(By.id("townCode")));
        selectIlce.selectByVisibleText(ilce);
        Select selectMahalle = new Select(Driver.get().findElement(By.id("neighborhood")));
        selectMahalle.selectByVisibleText(mahalle);

    }
    public void adresBilgileriDoldurma(){

        Driver.get().findElement(By.id("fullName")).sendKeys(faker.name().fullName());
        BrowserUtils.waitFor(2);
        Driver.get().findElement(By.id("phone")).sendKeys(faker.phoneNumber().phoneNumber());
        Driver.get().findElement(By.id("line1")).sendKeys(faker.name().title());
        Driver.get().findElement(By.id("addressName")).sendKeys(faker.address().cityName()+faker.name().title());
        WebElement adresiKaydet = Driver.get().findElement(By.cssSelector("button[title='Adresi Kaydet']"));
        BrowserUtils.clickWithJS(adresiKaydet);

    }

    public void adresBilgileriEksikDoldurma(String fullName,String phoneNumber){

        Driver.get().findElement(By.id("fullName")).sendKeys(fullName);
        BrowserUtils.waitFor(2);
        Driver.get().findElement(By.id("phone")).sendKeys(phoneNumber);
        Driver.get().findElement(By.id("line1")).sendKeys(faker.name().title()+faker.address().cityName());
        Driver.get().findElement(By.id("addressName")).sendKeys(faker.address().cityName()+faker.name().title());
        WebElement adresiKaydet = Driver.get().findElement(By.cssSelector("button[title='Adresi Kaydet']"));
        BrowserUtils.clickWithJS(adresiKaydet);

    }
    public void plpSayfasinaGitme(String kategori,String baslik){
        satinAl.urunler.click();
        BrowserUtils.waitFor(1);
        WebElement AnasayfaKategoriIsmi = Driver.get().findElement(By.xpath("//span[.='" + kategori + "']"));
        BrowserUtils.hover(AnasayfaKategoriIsmi);

        WebElement AnasayfaUrunIsmi = Driver.get().findElement(By.xpath("//span[.='" + baslik + "']"));
        BrowserUtils.waitFor(1);
        AnasayfaUrunIsmi.click();
    }

    public void plpSayfasindaFavorilereEkleme(String kategori, String baslik, String urunAdi){
        satinAl.urunler.click();
        BrowserUtils.waitFor(1);
        WebElement AnasayfaKategoriIsmi = Driver.get().findElement(By.xpath("//span[.='" + kategori + "']"));
        BrowserUtils.hover(AnasayfaKategoriIsmi);

        WebElement AnasayfaUrunIsmi = Driver.get().findElement(By.xpath("//span[.='" + baslik + "']"));
        BrowserUtils.waitFor(1);
        AnasayfaUrunIsmi.click();

        WebElement secilenUrunUcNokta = Driver.get().findElement(By.cssSelector("[data-title='" + urunAdi + "']"));
        BrowserUtils.scrollToElement(secilenUrunUcNokta);
        BrowserUtils.clickWithJS(secilenUrunUcNokta);
        plp.favorilereEklemeYildizi.click();

    }

    public void favorilerdeUrunArama(String urunAdi){
        List<WebElement> favorilenenUrunler = Driver.get().findElements(By.xpath("//div[@class='fav-name']"));
        for (WebElement favoriUrun : favorilenenUrunler) {
            System.out.println(favoriUrun.getText());
            Assert.assertTrue(favoriUrun.getText().contains(urunAdi));
        }

    }


}
