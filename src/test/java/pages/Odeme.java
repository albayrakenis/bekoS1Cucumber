package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.BrowserUtils;
import utility.Driver;

public class Odeme extends BasePage{

    Faker faker =new Faker();

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
        cokluKartKartUzerindekiIsim.sendKeys(faker.name().fullName());
        cokluKartSonKullanmaTarihi.sendKeys("1230");
        cokluKartCvv.sendKeys("000");

    }
    @FindBy(xpath = "//input[@name='partialAmount']")
    public WebElement ilkKrediKartiOdemeMiktari;

    @FindBy(css = ".btn-mcard-pay")
    public WebElement kartiOnaylaCokluKart;


}
