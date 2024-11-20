@reg
Feature: Login feature

  @reg
  Scenario Outline: Search new Car via CarWale.com
    And user is launching "<website>"
    And user gets homepage "<browserTitle>"
    And user clicks on "<findNewCar>"
    And user gets newCarPage with all brands
    And user clicks on tatacars
    And user gets tatacarpage

    Examples:
    |website                 |NewCar    |findNewCar     |
    |https://www.carwale.com/| NEW CARS | Find New cars |


  Scenario Outline: Login into CarWale.com
    And user is launching "<website>"
    And user gets homepage "<browserTitle>"
    And user clicks on login button


    Examples:
      |website                 |NewCar    |Login     |
      |https://www.carwale.com/| NEW CARS | Login |




