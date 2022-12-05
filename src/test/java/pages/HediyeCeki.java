package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HediyeCeki extends BasePage{

    @FindBy(xpath = "//span[@class='js-prd-name']")
    public List<WebElement> hediyeCekListesi;
}
