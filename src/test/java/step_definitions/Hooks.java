package step_definitions;

import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.BasePage;
import utility.ConfigurationReader;
import utility.Driver;

import java.util.concurrent.TimeUnit;

public class Hooks {


//        @Before
//        public void setUp(){
//            Driver.get().get(ConfigurationReader.get("demoblaze.url"));
//            Driver.get().manage().window().maximize();
//            Driver.get().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//        }

        @After
        public void tearDown(Scenario scenario){
            if(scenario.isFailed()){
                final byte[] screenshot = ((TakesScreenshot)Driver.get()).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot,"image/png","screenshot");
            }

            Driver.closeDriver();
        }


}
