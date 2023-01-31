package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class UrunSayfasi extends BasePage{

    @FindBy(xpath = "//span[contains(.,'Ana Sayfa')]")
    public WebElement kilavuzAnasayfa;

    @FindBy(xpath = "(//button[@title='Sepete At'])")
    public WebElement sepeteAt;

    @FindBy(xpath = "//div[@id='cart-notifier']//button[@class='btn-close']")
    public WebElement sepeteEklendiPopupCarpi;

    @FindBy(xpath = "//b[.='Sepetinde henüz ürün yok.']")
    public WebElement sepetindeUrunYok;

    @FindBy(css = ".js-remove-cart-entries")
    public WebElement sepetiBosaltTusu;

    @FindBy(css = ".btn-light")
    public WebElement stogaGelinceHaberVer;

    @FindBy(xpath = "//input[@id='sr_email']")
    public WebElement stokHabercimEposta;

    @FindBy(css = ".js-stock-reminder-btn")
    public WebElement stokHabercimMailGonder;

    @FindBy(xpath = "//div[.='Talebiniz Alındı.Teşekkür Ederiz.']")
    public WebElement stokHabercimTalebinizAlinmistir;

    @FindBy(xpath = "//a[contains(.,'Stok Habercim')]")
    public WebElement stokHabercimeGit;

    @FindBy(xpath = "//button[.='Hangi Mağazada Var']")
    public WebElement hangiMagazadaVar;

    @FindBy(css = ".js-find-store-btn")
    public WebElement MagazaBul;

    @FindBy(xpath = "//div[@class='srv-address']")
    public List<WebElement> magazaBulSonuclari;

    @FindBy(xpath = "//div[@class='srv-distance']")
    public List<WebElement> magazaBulSonuclarikm;

    @FindBy(xpath = "//div[@class='banner bnr-static bnr-left']//div[@class='bnr-title']")
    public List<WebElement> saglikliLezzetlerListesi;

    @FindBy(xpath = "//a[contains(.,'Sepete Git')]")
    public WebElement sepeteGitPopup;

}
