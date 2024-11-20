package pages;

import SelWebDriver.SelDriver;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class basePage {

    //public static WebDriver driver = SelDriver.getDriver();
    public static WebDriver driver;

    public basePage() {
       driver = SelDriver.getDriver();
        System.out.println(" driver from basepage: " +driver.getTitle());
        System.out.println(" page URL from basepage: " +driver.getCurrentUrl());
        System.out.println(" driver value from basepage: " +driver.toString());
    }

}
