package SelWebDriver;

import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class roughClass {


    public static void main(String[] args) throws IOException {

//        System.out.println(System.getProperty("user.dir")+"/src/main/resources/config/config.properties");
//        System.out.println(("./src/main/resources/config/config.properties"));

        WebDriver driver =SelDriver.getDriver();
        System.out.println(" driver value : "+driver);

        driver.get("https://www.yahoo.com");

        WebDriver d2 =SelDriver.getDriver();
        WebDriver d3 =SelDriver.getDriver();

        System.out.println(" driver value is d2 : "+d2);
        System.out.println(" driver value is d3 : "+d3);



    }
}
