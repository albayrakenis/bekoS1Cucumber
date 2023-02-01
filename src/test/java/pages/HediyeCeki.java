package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HediyeCeki extends BasePage{

    @FindBy(xpath = "//span[@class='js-prd-name']")
    public List<WebElement> hediyeCekListesi;

    @FindBy(xpath = "//input[@id='j_username']")
    public WebElement hediyeCekiAdSoyad;

    @FindBy(xpath = "//input[@id='j_tel']")
    public WebElement hediyeCekiTelefon;

    @FindBy(xpath = "//input[@id='J_mail']")
    public WebElement hediyeCekiEmail;

    @FindBy(xpath = "//button[@id='save']")
    public WebElement hediyeCekiKaydet;

    @FindBy(xpath = "//button[@id='edit']")
    public WebElement hediyeCekiDuzenle;


}
