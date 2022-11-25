package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PLP extends BasePage {



    @FindBy(xpath = "//div[@class='pnl-left']")
    public WebElement aramaSonucSafyasiSolTarafKategoriAdi;

    @FindBy(xpath = "//div[@class='container-max-1200']//span[@id='article-length']")
    public WebElement plpdeBulunanSonucSayisi;

    @FindBy(xpath = "//li[.='Ürünler']")
    public WebElement footerUrunler;


}
