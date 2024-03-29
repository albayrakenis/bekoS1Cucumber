package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

import java.util.List;

public class Bildirimler {

    public Bildirimler(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(css = "div[class='ntf-holder']")
    public WebElement bildirimIcon;

    @FindBy(xpath = "//a[@title='Tümünü Gör']")
    public WebElement tumunuGor;

    @FindBy(css = "svg[class='icon icon-notification']")
    public WebElement siparis;

    @FindBy(xpath = "(//a[@class='nav-link'])[]")
    public WebElement secenekler;

    @FindBy(xpath = "//button[@class='btn btn-outline-dark btn-new-address js-open-address-layer']")
    public WebElement yeniAdresEkle;

    @FindBy(css = "#save-address-btn")
    public WebElement adresiKaydet;

    @FindBy(css = "[data-addr-individual] .form-error-msg")
    public WebElement gecerliAdGiriniz;

    @FindBy(css = "#command > div:nth-of-type(6) .form-error-msg")
    public WebElement gecerliTelefonGiriniz;

    @FindBy(xpath = "//div[@class='container-max-1200 no-pad']//a[contains(@href,'/urunlerim')]")
    public WebElement urunlerim;

    @FindBy(xpath = "//div[@class='container-max-1200 no-pad']//a[contains(@href,'/siparislerim')]")
    public WebElement siparislerim;

    @FindBy(xpath = "//div[@class='container-max-1200 no-pad']//a[contains(@href,'/bildirimlerim')]")
    public WebElement bildirimlerim;

    @FindBy(xpath = "//div[@class='container-max-1200 no-pad']//a[contains(@href,'/taleplerim')]")
    public WebElement taleplerim;

    @FindBy(xpath = "//div[@class='container-max-1200 no-pad']//a[contains(@href,'/favorilerim')]")
    public WebElement favorilerim;

    @FindBy(xpath = "//div[@class='container-max-1200 no-pad']//a[contains(@href,'/stok-habercim')]")
    public WebElement stokHabercim;

    @FindBy(xpath = "//div[@class='container-max-1200 no-pad']//a[contains(@href,'/kuponlarim')]")
    public WebElement kuponlarim;

    @FindBy(xpath = "//div[@class='container-max-1200 no-pad']//a[contains(@href,'/hediye')]")
    public WebElement hediyeCeklerim;

    @FindBy(xpath = "//div[@class='container-max-1200 no-pad']//a[contains(@href,'/bilgilerim')]")
    public WebElement bilgilerim;

    @FindBy(xpath = "//div[@class='container-max-1200 no-pad']//a[contains(@href,'/logout')]")
    public WebElement cikisYap;

    @FindBy(xpath = "//div[@class='usr-addresses']/div//a[contains(.,'Sil')]")
    public List<WebElement> adresListesi;

    @FindBy(css = ".remove-my-all-list")
    public WebElement favorilerimListeyiBosalt;


}
