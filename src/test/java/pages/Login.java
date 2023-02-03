package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.BrowserUtils;
import utility.ConfigurationReader;
import utility.Driver;

import java.awt.*;
import java.awt.event.KeyEvent;


public class Login {

    public Login() throws AWTException {

        PageFactory.initElements(Driver.get(), this);
    }

    Robot robot =new Robot();
    @FindAll({
            @FindBy(xpath = "//*[text()='Üyelik']"),
            @FindBy(xpath = "//a[@data-selector='user-name']")
    })
    public WebElement uyelikButonu;

    @FindBy(id = "j_username")
    public WebElement username;

    @FindBy(id = "j_password")
    public WebElement password;

    @FindBy(id = "login-failed-div")
    public WebElement yanlisSifre;

    @FindBy(xpath = "(//a[@class='nav-link'])[9]")
    public WebElement cikisYap;

    @FindBy(xpath = "//button[@id='g-recaptcha-btn-login']")
    public WebElement girisYapButonu;




    public void bekoLogin() throws InterruptedException {
        BrowserUtils.waitFor(1);
        uyelikButonu.click();
        username.sendKeys("2albay.rakenis@gmail.com");
        //username.sendKeys("2.albayrakeni.s@gmail.com");
        Thread.sleep(1500);
        password.sendKeys("Albayrak.41");
        //password.sendKeys("Albayrak.41");
        Thread.sleep(1000);
        BrowserUtils.clickWithJS(girisYapButonu);

        BrowserUtils.waitFor(6);
    }
    @FindBy(xpath = "//button[@class='btn btn-light']")
    public WebElement uyeOlmadanDevamEt;

    @FindBy(xpath = "//input[@id='guest_email']")
    public WebElement guest_email;

    @FindBy(css = ".btn-guest")
    public WebElement uyeOlmadanDevamEtButonu;


}
