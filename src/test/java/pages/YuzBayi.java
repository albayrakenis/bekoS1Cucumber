package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YuzBayi extends BasePage{

    @FindBy(xpath = "//div[.='Ad / Soyad']")
    public WebElement bayiIletisimBilgileri;

    @FindBy(css = "#SurveySubmitButtonElement")
    public WebElement gonderButonu;


}
