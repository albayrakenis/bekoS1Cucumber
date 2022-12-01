package pages;


import org.junit.Before;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

import java.util.concurrent.TimeUnit;

public abstract class BasePage {



    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @Before public void time(){
        Driver.get().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }





}
