package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Sepet extends BasePage{

    @FindBy(css = ".cart-prd-title")
    public WebElement sepettekiUrununKodu;
}
