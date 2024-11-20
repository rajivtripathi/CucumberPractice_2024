package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NewCarPage extends basePage {

    By FindNewCar = By.xpath("//*[text()='Find New Cars']");
    By NewCar = By.xpath("//h1[text()='New Cars']");
    By TataCars = By.xpath("//img[@title='Tata Cars']");

    //By TataCarPage = By.xpath("//img[@title='Tata Cars']");
    ////img[@title='Tata Cars']
    //h1[text()='New Cars']

    public String  getNewCarPageTitle() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(TataCars));
        wait.until(ExpectedConditions.titleIs("New Cars in India 2024 | New Car Information | Best New Cars - CarWale"));

        String newCarTitle = driver.getTitle();
        System.out.println(" page URL " +driver.getCurrentUrl());
        return newCarTitle;
    }

    public void clickOnTataCars() {
        driver.findElement(TataCars).click();

    }

    public void getKiaPage() {

    }

}
