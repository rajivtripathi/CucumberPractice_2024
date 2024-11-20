package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends basePage {

    By newCars = By.xpath("//div[text()='NEW CARS']");
    By findNewCars = By.xpath("//*[text()='Find New Cars']");
    By LoginPage = By.xpath("//*[@class='o-dlrcWp o-eoatGj o-cqgkZn o-euTeMg o-eVIFUq o-cUSgRL o-frwuxB o-fzptOu']");


   // NewCarPage newCarPage ;

    public void getLoginPage() {
        driver.findElement(LoginPage).click();
    }

    public void findNewCarPage() throws InterruptedException {

       // driver.findElement(newCars).click();
        Actions action = new Actions(driver);
        WebElement newCarsEle =driver.findElement(newCars) ;
        action.moveToElement(newCarsEle).perform();
        System.out.println(" hovered to newCars ");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(findNewCars));
        WebElement findNewCarsEle = driver.findElement(findNewCars);
        action.moveToElement(findNewCarsEle).click().build().perform();
        System.out.println(" find newCars clicked ");
       // Thread.sleep(3000);
        System.out.println(" Title after find New Cars: " +driver.getTitle());
        System.out.println(" driver value: " +driver.toString());
        System.out.println(" page URL: " +driver.getCurrentUrl());
        //newCarPage =new NewCarPage();
      //  return newCarPage;

    }

    public void getPageTitle() {
        driver.getTitle();

    }
}
