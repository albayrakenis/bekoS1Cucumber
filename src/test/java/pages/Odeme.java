package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.BrowserUtils;
import utility.Driver;

public class Odeme extends BasePage{

    Faker faker =new Faker();
    static Odeme odeme =new Odeme();

    public void odemeYontemiBelirle(String str){
        WebElement odemeYontemi = Driver.get().findElement(By.xpath("//button[contains(.,'" + str + "')]"));
        BrowserUtils.scrollToElement(odemeYontemi);
        BrowserUtils.clickWithJS(odemeYontemi);
        BrowserUtils.waitFor(1);
    }


    @FindBy(xpath = "//button[@id='yes']")
    public WebElement mastercardOnaylamaSayfasi;

    @FindBy(css = ".js-card-installment-input-partial")
    public WebElement cokluKartKrediKartiNumarasi;

    @FindBy(css = "[value][name='cardOwner']")
    public WebElement cokluKartKartUzerindekiIsim;

    @FindBy(css = "#partialPaymentForm [name='expiry']")
    public WebElement cokluKartSonKullanmaTarihi;

    @FindBy(css = "#partialPaymentForm [name='cvv']")
    public WebElement cokluKartCvv;


    public void cokluKrediKartiIleOdeme(String kartNumarasi){
        cokluKartKrediKartiNumarasi.sendKeys(kartNumarasi);
        cokluKartKartUzerindekiIsim.sendKeys("enes bayrak");
        cokluKartSonKullanmaTarihi.sendKeys("1230");
        cokluKartCvv.sendKeys("000");

    }
    @FindBy(xpath = "//input[@name='partialAmount']")
    public WebElement ilkKrediKartiOdemeMiktari;

    @FindBy(xpath = "//button[@class='btn btn-outline-primary btn-mcard-pay js-confirm-mcard-step']")
    public WebElement kartiOnaylaCokluKart;

    @FindBy(css = ".result-grid-header > .t")
    public WebElement siparisinizBizeUlastiEftOdeme;

    @FindBy(css = ".result-grid-header > .p")
    public WebElement siparisNumarasi;

    public static String  siparisNumarasiAlma(){
        String siparisNumarasi = odeme.siparisNumarasi.getAttribute("innerText");
        int a=siparisNumarasi.indexOf(": ");

        String substring = siparisNumarasi.substring(a + 2);
        return substring;
    }

}
