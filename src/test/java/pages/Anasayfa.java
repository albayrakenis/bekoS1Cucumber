package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

import java.util.List;

public class Anasayfa {

    public Anasayfa(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//div[@class='d']//a[@title='Kampanyalar']")
    public WebElement kampanyalarButton;

    @FindBy(xpath = "//button[@type='button']/span[@class='d']")
    public WebElement urunler;

    //kampanyalar sayfası locaterlari
    @FindBy(xpath = "//div[@class='page-title centered']/h1")
    public WebElement kampanyalarText;

    @FindBy(xpath = "//a[@href='/sepetim ']")
    public WebElement anasayfaSepetIcon;

    @FindBy(xpath = "(//a[@href='/kampanyalar/beyaz-esya-kampanyalari'])")
    public WebElement beyazEsyaKampanyalari;
    @FindBy(xpath = "(//a[@href='/kampanyalar/kucuk-ev-aletleri-kampanyalari'])")
    public WebElement kucukEvAletleriKampanyalari;
    @FindBy(xpath = "(//a[@href='/kampanyalar/size-ozel'])")
    public WebElement sizeOzelKampanyalari;
    @FindBy(xpath = "(//a[@href='/kampanyalar'])[3]")
    public WebElement tumKampanyalar;

    @FindBy(xpath = "//div[@class='d']//a[@title='Hediye Çeki']")
    public WebElement hediyeCekiButton;

    @FindBy(xpath = "//div[@class='d']//a[@title='Teknolojiler']")
    public WebElement teknolojilerButton;

    @FindBy(xpath = "//div[@class='col-12 col-lg-4 col-search']//div[@class='placeholder']")
    public WebElement aramaMetinKutusu;

    @FindBy(id = "searchText")
    public WebElement aramaTextBosluk;

    @FindBy(css = ".btn-search-post > .icon")
    public WebElement aramaButonu;

    @FindBy(xpath = "//div[@class='hum']/a[.='Hesabım']")
    public WebElement hesabimButton;

    @FindBy(xpath = "//a[.='Mağazalar']")
    public WebElement magazalarButonu;

    @FindBy(xpath = "//a[contains(.,'Mağaza Ara')]")
    public WebElement magazaAraButonu;

    @FindBy(xpath = "//a[@href='/100kadinbayi']")
    public WebElement yuzKadinBayi;

    @FindBy(xpath = "//a[@href='/evimize-saglik/tarifler']")
    public WebElement saglikliTarifler;

    @FindBy(xpath = "//div[@data-optimize-type='BESTSELLER']")
    public List<WebElement> cokSatanUrunlerListesi;

    @FindBy(xpath = "//div[@id='product-swiper']//div[@class='swiper-slide slide-active swiper-slide-next']//a[contains(.,'İncele')]")
    public WebElement cokSatanlarIkinciUrun;

    @FindBy(css = ".col-top > [href='/destek']")
    public WebElement destekButton;

    @FindBy(xpath = "//div[@class='banner bnr-cover bnr-left bnr-icon bnr-gr-2']//h1[@class='bnr-title']")
    public List<WebElement> anasayfaSponsorlukListesi;

    @FindBy(xpath = "//p[.='Sponsorluklar']")
    public WebElement sponsorlukYazisi;

    @FindBy(xpath = "//input[@id='otpromo_mobile']")
    public WebElement kampanyalarTelefonNoDogrulama;

    @FindBy(xpath = "//button[@class='btn btn-outline-primary btn-narrow js-send-otp']")
    public WebElement sizeOzelTelefonNumarasiDogrulama;

    @FindBy(xpath = "//div[@class='logo']//img[1]")
    public WebElement anasayfadaBekoIcon;

}
