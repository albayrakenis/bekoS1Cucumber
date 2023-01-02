package step_definitions;

import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utility.BrowserUtils;
import utility.Driver;

import java.text.BreakIterator;
import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp(){
       // Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); }

    @After
    public void tearDown()
    {
        BrowserUtils.waitFor(2);
       // Driver.closeDriver();
    }
}
