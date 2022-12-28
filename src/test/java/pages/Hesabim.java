package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Hesabim {

    @FindBy(css = ".js-popup-trigger-func")
    public WebElement silmeyiOnayliyormusunuzButonu;

    @FindBy(xpath = "//div[@class='usr-addresses']/div[1]//a[contains(.,'Sil')]")
    public WebElement ilkAdresSilButonu;

    @FindBy(css = "#modal-add-new-address .icon")
    public WebElement adresEklemePopupKapatmaButonu;

}
