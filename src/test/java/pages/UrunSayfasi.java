package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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



}
