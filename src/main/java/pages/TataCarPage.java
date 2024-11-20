package pages;

import org.openqa.selenium.By;

public class TataCarPage extends basePage {

    By TataCarPage = By.xpath("//img[@title='Tata Cars']");



    public void verifyTitle() {

    }

    public void clickOnTataCars() {
        driver.findElement(TataCarPage).click();

    }
}
