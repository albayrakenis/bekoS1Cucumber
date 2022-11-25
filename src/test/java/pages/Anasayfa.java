package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

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





}
