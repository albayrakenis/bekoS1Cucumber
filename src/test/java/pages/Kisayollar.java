package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Kisayollar extends BasePage{

    @FindBy(xpath = "//ul[@class='ul-clear category-list']/li")
    public List<WebElement> beyazEsyaAnaBasliklar;

    @FindBy(xpath = "//ul[@class='ul-clear category-list']/li")
    public List<WebElement> ankastreAnaBasliklar;
}
