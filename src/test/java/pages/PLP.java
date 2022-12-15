package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.Driver;

public class PLP extends BasePage {



    @FindBy(xpath = "//div[@class='pnl-left']")
    public WebElement aramaSonucSafyasiSolTarafKategoriAdi;

    @FindBy(xpath = "//div[@class='container-max-1200']//span[@id='article-length']")
    public WebElement plpdeBulunanSonucSayisi;

    @FindBy(xpath = "//li[.='Ürünler']")
    public WebElement footerUrunler;

    @FindBy(css = ".icon-star")
    public WebElement favorilereEklemeYildizi;

    @FindBy(xpath = "//button[@id='g-recaptcha-btn-favourite']/span[1]")
    public WebElement favorilerimdenCikarText;

    @FindBy(css = "#prd_popup > .mnp-header .icon")
    public WebElement favorilereEklemePopupKapatma;

    public void rastgeleUrunSecme(String numara){
        Driver.get().findElement(By.xpath("(//div[@class='prd-media swiper-multiple-product-image activeted'])["+numara+"]"));
    }


}
