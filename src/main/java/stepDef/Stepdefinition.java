package stepDef;


import SelWebDriver.SelDriver;
import pages.HomePage;
import pages.NewCarPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class Stepdefinition {

    HomePage homepage = new HomePage();
    NewCarPage newCarpage = new NewCarPage();

    @Given("user is launching {string}")
    public void user_is_launching(String string) {
        SelDriver.getUrl(SelDriver.prop.getProperty("AppUrl"));
        System.out.println(" user lauched URL ");

    }


    @Given("user clicks on {string}")
    public void user_clicks_on(String string) throws InterruptedException {
        homepage.findNewCarPage();

    }

    @And("user gets homepage {string}")
    public void user_gets_homepage_browserTitle(String string) throws InterruptedException {
        homepage.getPageTitle();

    }

    @And("user clicks on login button")
    public void user_clicks_on_loginButton () throws InterruptedException {
        homepage.getLoginPage();
        System.out.println(" login page opened ");


    }
    @Given("user gets newCarPage with all brands")
    public void user_gets_new_car_page_with_all_brands() {
        //newcarPage.getNewCarPageTitle();
        // newCarpage = new NewCarPage();
        System.out.println(" newCarpage: "+newCarpage);
        System.out.println(" New Car Page title: " +newCarpage.getNewCarPageTitle());
    }

    @Given("user clicks on tatacars")
    public void user_clicks_on_tatacars() {
       // newCarpage = new NewCarPage();
        System.out.println(" newCarpage: "+newCarpage);
        newCarpage.clickOnTataCars();

    }

    @Given("user gets tatacarpage")
    public void user_gets_tatacarpage() {

    }


}
