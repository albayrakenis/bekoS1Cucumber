package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

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


}
