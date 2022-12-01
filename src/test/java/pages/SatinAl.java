package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

public class SatinAl {

    public SatinAl(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//button[@type='button']/span[@class='d']")
    public WebElement urunler;


    @FindBy(xpath = "//*[button='Taksit Seçenekleri']/button")
    public WebElement taksitSecenekleri;

    @FindBy(id = "nav-commercial-tab")
    public WebElement ticariKart;


    @FindBy(id = "nav-commercial-tab")
    public WebElement bireyselKart;

    @FindBy(xpath = "(//button[@title='Sepete At'])")
    public WebElement sepeteAt;

    @FindBy(xpath = "(//a[@title='İncele'])[2]")
    public WebElement inceleButton;

    @FindBy(xpath = "(//a[@title='Sepete Git'])")
    public WebElement sepeteGit;

    @FindBy(xpath = "(//a[@title='Sepeti Onayla'])")
    public WebElement sepetiOnayla;

    @FindBy(xpath = "//button[contains(.,'Kredi/Banka Kartı')]")
    public WebElement krediKarti;

    @FindBy(xpath = "(//input[@name='number'])[1]")
    public WebElement krediKartiNumarasi;

    @FindBy(xpath = "(//input[@name='cardOwner'])[1]")
    public WebElement krediKartiSahibi;

    @FindBy(xpath = "(//input[@name='expiry'])[1]")
    public WebElement krediKartiTarih;

    @FindBy(xpath = "(//input[@name='cvv'])[1]")
    public WebElement krediKartiCvv;

    @FindBy(id = "postPayment")
    public WebElement alisverisiTamamla;

    @FindBy(id = "chk_cart_sum_confirm_1")
    public WebElement onBilgilendirme;

    @FindBy(id = "chk_cart_sum_confirm_2")
    public WebElement mesafeliSatisSozlesmesi;

    @FindBy(id = "actionEntry_0")
    public WebElement sepettenSil;




}
