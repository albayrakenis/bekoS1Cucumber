package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Sepet extends BasePage{

    @FindBy(css = ".cart-prd-title")
    public WebElement sepettekiUrununKodu;

    @FindBy(xpath = "//b[.='Sepetinde henüz ürün yok.']")
    public WebElement sepetteUrunYokText;

    @FindBy(css = ".js-remove-cart-entries")
    public WebElement sepetiBosalt;

    @FindBy(css = ".cart-plh-top > b")
    public WebElement sepetteUrunYok;

    @FindBy(xpath = "//button[@class='btn-plus ']")
    public WebElement urunSayisiArtirma;

    @FindBy(xpath = "//button[@class='btn-minus']")
    public WebElement urunSayisiEksiltme;

    @FindBy(css = ".js-update-qty-box-input")
    public WebElement sepettekiUrunSayisi;

    @FindBy(xpath = "//button[@id='formattedAddressShipping']/div[@class='drp-content']")
    public WebElement teslimatAdresiSec;

    @FindBy(css = "[title='Yeni Adres Ekle']")
    public WebElement yeniAdresEkle;

    @FindBy(css = "#tcknArea")
    public WebElement tcKimlikNumarasi;

}
