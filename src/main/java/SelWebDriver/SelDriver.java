package SelWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class SelDriver {

    public static SelDriver selDriver;
    public static Properties prop ;
    public FileInputStream fis;
    public static WebDriver driver;

    private SelDriver() {
        WebDriverManager.chromedriver().setup();
        try {
            fis = new FileInputStream("./src/main/resources/config/config.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        prop = new Properties();
        try {
            prop.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


     if(prop.getProperty("browserType").equalsIgnoreCase("chrome")){

         WebDriverManager.chromedriver().setup();
         ChromeOptions options = new ChromeOptions();
         options.addArguments("--disable-notifications");
         driver = new ChromeDriver(options);
     }
     else if (prop.getProperty("browserType").equalsIgnoreCase("firefox")) {
         WebDriverManager.edgedriver().setup();
         driver = new EdgeDriver();

     }

     else {
         System.out.println( " No Browser found");
     }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    public static WebDriver getDriver() {
        if (selDriver == null) {
            selDriver = new SelDriver();
        }
        return driver;
    }


    public static void closeDriver() throws InterruptedException {


        if (driver != null) {
            driver.close();
            driver.quit();
        }
        selDriver = null;

    }

    public static void getUrl(String url) {
        driver.get(url);
    }


}
