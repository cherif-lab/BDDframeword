package stepDefinitions;

import common.WebAPI;
import homepage.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class HomePageStepDefinition extends WebAPI {
    static HomePage homePage;


    // Cucumber Hook
    @AfterStep
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            // Take a screenshot
            final byte[] screenShot= ((TakesScreenshot)driver).getScreenshotAs(

                    OutputType.BYTES);
            scenario.attach(screenShot,"image/png","demo1");  // embed it in the report
        }
    }

    @BeforeStep
    public static void getInit(){
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @After
    public void closeBrowser(){
        cleanUp();
    }


    //login button
    @Given("I am on progressive home page")
    public void i_am_on_progressive_home_page() throws IOException {
        openBrowser("https://www.progressive.com");
    }
    @When("I click on logIn button")
    public void i_click_on_log_in_button() {
        homePage.clickOnLogInButton();
    }

    @Then("I should see Mmessage {string}")
    public void i_should_see_Mmessage(String string) {
        homePage.checkWelcomeMessage();
        Assert.assertEquals(string,homePage.checkWelcomeMessage());
    }


    //check login
    @Given("I click on logIn button function")
    public void i_click_on_log_in_button_function() {
        homePage.clickOnLogInButton();

    }
    @Given("I enter my userId in field Zip Code")
    public void i_enter_my_user_id_in_field_zip_code() {
        homePage.enterUserId();
    }
    @Given("i enter my password")
    public void i_enter_my_password() {
        homePage.enterPassword();
    }
    @Given("i check  save userid box")
    public void i_check_save_userid_box() {
        homePage.CheckSaveUserIdCheckbox();
    }
    @When("i click on log in button2")
    public void i_click_on_log_in_button2() {
        homePage.clickOnLoginButton2();
    }
    @Then("i should see {string} massage")
    public void i_should_see_massage(String string) {
        homePage.getErrorMessage1();
        Assert.assertEquals(string,homePage.getErrorMessage1());
    }



 //check register
    @When("I click on Register button")
    public void i_click_on_register_button() {
        homePage.clickOnRegisterButton();
    }
//    @Then("I should see {string} text massage")
//    public void i_should_see_text_massage() {
//        homePage.getFirstLetsFindYouText();
 //   }
    @Then("i enter my policy Policy number")
    public void i_enter_my_policy_policy_number() {
        homePage.enterMyPolicyNumber();
    }
    @Then("i enter my Last name")
    public void i_enter_my_last_name() {
        homePage.enterMyLastName();
    }
    @Then("i enter my Date of birth")
    public void i_enter_my_date_of_birth() {
        homePage.dobField();
    }
    @Then("i enter my Mailing ZIP code")
    public void i_enter_my_mailing_zip_code() {
        homePage.zipcode();
    }
    @When("i click on continue button")
    public void i_click_on_continue_button() {
        homePage.continueButton3();
    }
    @Then("I should see {string} massage2")
    public void i_should_see_massage2(String string) {
        homePage.getErrorMassage2();
        Assert.assertEquals(string, homePage.getErrorMassage2());
    }

    @When("i click on explore Products feature")
    public void i_click_on_explore_products_feature() {
        homePage.exploreProduct();
    }
    @Then("i should get title1")

    @When("i check  on AtvUtv feature")
    public void i_check_on_atv_utv_feature() {
        homePage.atvUtv();
    }

    @When("i check  on Auto feature")
    public void i_check_on_auto_feature() {
        homePage.auto();
    }

    @When("i check  on Boat feature")
    public void i_check_on_boat_feature() {
        homePage.boat();
    }
    @Then("i should get titleBoat")
    public void i_should_get_title2() {
        homePage.getTitleBoat();
    }

    @When("i check  on classicCar feature")
    public void i_check_on_classic_car_feature() {
        homePage.classicCar();
    }
    @Then("i should get title Class Car")
    public void i_should_get_title_class_car() {
        homePage.getTitleClassicCar();
    }
    @When("i check  on Golf Car feature")
    public void i_check_on_golf_car_feature() {
        homePage.golfCart();
    }
    @Then("i should get title Golf Car")
    public void i_should_get_title_golf_car() {
        homePage.getTitleGolfCart();
    }
    @When("i check  on MotorCycle feature")
    public void i_check_on_motor_cycle_feature() {
        homePage.motorCycle();
    }
    @Then("i should get Motor Cycle Car")
    public void i_should_get_motor_cycle_car() {
        homePage.getTitleMotorCycle();
    }
    @When("i check  on Mexico Auto feature")
    public void i_check_on_mexico_auto_feature() {
        homePage.mexicoAuto();
    }
    @Then("i should get Mexico Auto Car")
    public void i_should_get_mexico_auto_car() {
        homePage.getTitleMexicoAuto();
    }
    @When("i check  on PWC feature")
    public void i_check_on_pwc_feature() {
        homePage.pwc();
    }
    @Then("i should title get PWC")
    public void i_should_title_get_pwc() {
        homePage.getTitlePwc();
    }

    @When("i click  on Auto feature")
    public void i_click_on_auto_feature() {
        homePage.auto();
    }
    @Then("i should see {string} Message")
    public void i_should_see_message(String string) {
        homePage.checkCarInsuranceMessage();
        Assert.assertEquals(string,homePage.checkCarInsuranceMessage());
    }

    @Then("I should see {string} Message")
    public void i_should_see_Message(String string) {
        homePage.checkAtvUtvInsuranceMessage();
        Assert.assertEquals(string, homePage.checkAtvUtvInsuranceMessage());

    }
    @Then("i should see {string} text")
    public void i_should_see_text(String string) {
        homePage.checkVehicleText();
        Assert.assertEquals(string, homePage.checkVehicleText());
    }


}
