package stepDef;

import SelWebDriver.SelDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void launchBrowser() {

       driver= SelDriver.getDriver();
       System.out.println(" Browser is launched ");

    }

    @After
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(5000);
        SelDriver.closeDriver();
        System.out.println(" Browser is closed ");
    }



}
