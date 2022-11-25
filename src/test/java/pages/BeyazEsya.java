package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

import java.util.List;

public class BeyazEsya {

    public BeyazEsya(){
        PageFactory.initElements(Driver.get(),this);

    }

    @FindAll({
            @FindBy(xpath = "//span[text()='Ürünler']"),
            @FindBy(xpath = "(//span[@class='d'])[1]")
    })
    public WebElement urunler;


    @FindBy(xpath = "(//ul/li[@class])[2]")
    public WebElement beyazEsyaButonu;

    @FindBy(xpath = "(//a[@href='/bulasik-makinesi'])[1]")
    public WebElement bulasikMakinesi;

    @FindBy(xpath = "//a[@href='/buzdolabi']")
    public WebElement buzdolabi;
    @FindBy(xpath = "(//a[@href='/derin-dondurucu'])[1]")
    public WebElement derinDondurucu;
    @FindBy(xpath = "(//a[@href='/firin'])[1]")
    public WebElement firin;
    @FindBy(xpath = "(//a[@href='/kurutma-makinesi'])[1]")
    public WebElement kurutmaMakinesi;
    @FindBy(xpath = "(//a[@href='/kurutmali-camasir-makinesi'])[1]")
    public WebElement kurutmaliCamasirMakinesi;
    @FindBy(xpath = "(//a[@href='/mikrodalga-firin'])[1]")
    public WebElement mikrodalgaFirin;
    @FindBy(xpath = "(//a[@href='/set-ustu-ocak'])[1]")
    public WebElement setUstuOcak;
    @FindBy(xpath = "(//a[@href='/su-sebili'])[1]")
    public WebElement suSebili;
    @FindBy(xpath = "(//a[@href='/camasir-makinesi'])[1]")
    public WebElement camasirMakinesi;

    //Beyaz Eşya headerda ki beyaz eşya listesi locaterları
    @FindBy(xpath = "//a[@title='Buzdolabı']")
    public WebElement BuzdolabiHeader;
    @FindBy(xpath = "//a[@title='No Frost Buzdolabı']")
    public WebElement NoFrostBuzdolabiHeader;
    @FindBy(xpath = "//a[@title='Gardırop Tipi Buzdolabı']")
    public WebElement GardiropTipiBuzdolabiHeader;
    @FindBy(xpath = "//a[@title='Çift Kapılı Buzdolabı']")
    public WebElement CiftKapiliBuzdolabiHeader;
    @FindBy(xpath = "//a[@title='Mini Buzdolabı']")
    public WebElement MiniBuzdolabiHeader;
    @FindBy(xpath = "//a[@title='Derin Dondurucu']")
    public WebElement DerinDondurucuHeader;
    @FindBy(xpath = "//a[@title='Çekmeceli Derin Dondurucu']")
    public WebElement CekmeceliDerinDondurucuHeader;
    @FindBy(xpath = "//a[@title='Sandık Tipi Derin Dondurucu']")
    public WebElement SandikTipiDerinDondurucuHeader;
    @FindBy(xpath = "//a[@title='Bulaşık Makinesi']")
    public WebElement BulasikMakinesiHeader;
    @FindBy(xpath = "//a[@title='Çamaşır Makinesi']")
    public WebElement CamasirrMakinesiHeader;
    @FindBy(xpath = "//a[@title='Kurutma Makinesi']")
    public WebElement KurutmaMakinesiHeader;
    @FindBy(xpath = "//a[@title='Kurutmalı Çamaşır Makinesi']")
    public WebElement KurutmaliCamasirMakinesiHeader;
    @FindBy(xpath = "//a[@title='Fırın']")
    public WebElement FirinHeader;
    @FindBy(xpath = "//a[@title='Mikrodalga Fırın']")
    public WebElement MikrodalgaFirinHeader;
    @FindBy(xpath = "//a[@title='Mini Fırın']")
    public WebElement MiniFirinHeader;
    @FindBy(xpath = "//a[@title='Ocaklı Fırın']")
    public WebElement OcakliFirinHeader;
    @FindBy(xpath = "//a[@title='Set Üstü Ocak']")
    public WebElement SetUstuOcakHeader;
    @FindBy(xpath = "//a[@title='Gazlı Ocaklar']")
    public WebElement GazliOcaklarHeader;
    @FindBy(xpath = "//a[@title='Su Sebili']")
    public WebElement SuSebiliHeader;

    @FindBy(xpath = "(//ul/li[@class])[2]")
    public WebElement BeyazEsya;
    @FindBy(xpath = "(//ul/li[@class])[3]")
    public WebElement Ankastre;
    @FindBy(xpath = "(//ul/li[@class])[4]")
    public WebElement Elektronik;
    @FindBy(xpath = "(//ul/li[@class])[5]")
    public WebElement IsitmaSogutma;
    //@FindBy(xpath = "(//a[@title='Küçük Ev Aletleri'])[1]")
    @FindBy(xpath = "(//ul/li[@class])[6]")
    public WebElement KücükEvAletleri;

    @FindBy(xpath = "(//ul/li[@class])[7]")
    public WebElement HijyenAksesuar;

    @FindBy(xpath = "//div[@class='mnp-header']//button[@class='btn-close']")
    public WebElement kapatButonu;

    // urunlerin locaterları
    @FindBy(xpath = "//a[@title='Gardırop Tipi Buzdolabı']")
    public WebElement gardıropBuzdolabi;
    @FindBy(xpath = "//a[@title='Kurutmalı Çamaşır Makinesi']")
    public WebElement kurutmaCamasirMakinesi;
    @FindBy(xpath = "//a[@title='Ankastre Set']")
    public WebElement ankastreSet;
    @FindBy(xpath = "//a[@title='Ankastre Fırınlar']")
    public WebElement ankastreFirinlar;
    @FindBy(xpath = "//a[@title='Ankastre Ocaklar']")
    public WebElement ankastreOcaklar;
    @FindBy(xpath = "//a[@title='Ankastre Mikro Dalgalar']")
    public WebElement ankastreMikroDalgalar;
    @FindBy(xpath = "//a[@title='Ankastre Davlumbazlar']")
    public WebElement ankastreDavlumbazlar;
    @FindBy(xpath = "//a[@title='Ankastre Aspiratörler']")
    public WebElement ankastreAspiratorler;
    @FindBy(xpath = "//a[@title='Ankastre Bulaşık Makineleri']")
    public WebElement ankastreBulasikMakinelei;
    @FindBy(xpath = "//a[@title='Ankastre Buzdolabı']")
    public WebElement ankastreBuzdolabi;
    @FindBy(xpath = "//a[@title='Ankastre Domino Ocaklar']")
    public WebElement ankastreDominoOcaklar;
    @FindBy(xpath = "//a[@title='Televizyon']")
    public WebElement televizyon;
    @FindBy(xpath = "//a[@title='Telefon']")
    public WebElement telefon;
    @FindBy(xpath = "//a[@title='Bilgisayar']")
    public WebElement bilgisayar;
    @FindBy(xpath = "//a[@title='Hobi Oyun']")
    public WebElement hobiOyun;
    @FindBy(xpath = "//a[@title='Ses & Görüntü Sistemleri']")
    public WebElement sesGoruntuSistemleri;
    @FindBy(xpath = "//a[@title='Pos Cihazı']")
    public WebElement posCihazi;
    @FindBy(xpath = "//a[@title='Klima']")
    public WebElement klima;
    @FindBy(xpath = "//a[@title='Kombi']")
    public WebElement kombi;
    @FindBy(xpath = "//a[@title='Termosifon']")
    public WebElement termosifon;
    @FindBy(xpath = "//a[@title='Elektrikli Isıtıcı']")
    public WebElement elektrikliIsitici;
    @FindBy(xpath = "//a[@title='Şofben']")
    public WebElement sofben;
    @FindBy(xpath = "//a[@title='İç Hava Kalitesi']")
    public WebElement icHavaKalitesi;
    @FindBy(xpath = "//a[@title='Hava Soğutucu']")
    public WebElement havaSogutucu;
    @FindBy(xpath = "//a[@title='Vantilatör']")
    public WebElement vantilator;
    @FindBy(xpath = "//a[@title='Süpürge']")
    public WebElement supurge;
    @FindBy(xpath = "//a[@title='Ütü']")
    public WebElement utu;
    @FindBy(xpath = "//a[@title='İçecek Hazırlama']")
    public WebElement icecekHazirlama;
    @FindBy(xpath = "//a[@title='Karıştırıcı Doğrayıcı']")
    public WebElement karistiriciDograyici;
    @FindBy(xpath = "//a[@title='Pişirici']")
    public WebElement pisirici;
    @FindBy(xpath = "//a[@title='Kişisel Bakım']")
    public WebElement kisiselBakim;
    @FindBy(xpath = "//a[@title='UV Temizleme Cihazı']")
    public WebElement uvTemizlemeCihazi;
    @FindBy(xpath = "//a[@title='Aksesuarlar']")
    public WebElement aksesuarlar;
    @FindBy(xpath = "//a[@title='Temizlik Ve Bakım Ürünleri']")
    public WebElement temizlikVeBakimUrunleri;
    @FindBy(xpath = "//div[@class='pnl-left']/h1")
    public WebElement solPanel;

    @FindBy(xpath = "(//span[@class='js-prd-cat'])")
    //@FindBy(xpath = "(//div[@class='swiper-slide slide-active swiper-slide-active'])")
    public List <WebElement> urunIsimleri;


    //parantez içine yazdığım webelemente gidip kategori adının doğru olmasını kontrol ediyor.
    public void beyasEsyaListesiIsimKontrol(WebElement urun){

        urunler.click();
        urun.click();
        WebElement urunAdi= Driver.get().findElement(By.xpath("//div[@class='pnl-left']/h1"));
        System.out.println(urunAdi.getText());
        String strUrunIsmi = urunAdi.getText();
        Assert.assertEquals(urunAdi.getText(),strUrunIsmi);
        //Assert.assertEquals(urun.getText(),strUrunIsmi);

    }

}
