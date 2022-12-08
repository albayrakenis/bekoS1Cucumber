package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.Driver;

import java.util.List;

public class Destek extends BasePage{

    @FindBy(xpath = "//a[contains(.,'Yetkili Servis Ara')]")
    public WebElement yetkiliServisAra;

    @FindBy(xpath = "//a[contains(.,'Servis Bul')]")
    public WebElement servisBul;

    @FindBy(xpath = "//ul[@class='yCmsContentSlot ul-clear category-list']//span")
    public List<WebElement> destekSayfasiBasliklar;

    @FindBy(xpath = "//div[@class='srv-list']//div[@class='srv-address']")
    public List<WebElement> yetkiliServisListesi;


}
