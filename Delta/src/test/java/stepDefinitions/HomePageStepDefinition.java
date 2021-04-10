package stepDefinitions;

import common.WebAPI;
import homepage.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import skymiles.SkyMilesPage;
import travelinfo.TravelInfoPage;

import java.io.IOException;

public class HomePageStepDefinition extends WebAPI {
    static HomePage homePage;
    static TravelInfoPage travelInfoPge;
    static SkyMilesPage skyMilesPage;

    @AfterStep
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot
            final byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", "demo1");  // embed it in the report
        }
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @BeforeStep
    public void getInit() {

        homePage = PageFactory.initElements(driver, HomePage.class);
        travelInfoPge = PageFactory.initElements(driver, TravelInfoPage.class);
        skyMilesPage = PageFactory.initElements(driver, SkyMilesPage.class);
    }

    @Given("I am on delta Home Page")
    public void i_am_on_delta_home_page() throws IOException {
        openBrowser("https://www.delta.com");
    }

    @And("I click on logIn button")
    public void i_click_on_log_in_button() {
        homePage.clickOnLogIn();
    }

    @And("I enter my user name")
    public void i_enter_my_user_name() {
        homePage.enterMyUserName();
    }

    @And("I enter my password")
    public void i_enter_my_password() {
        homePage.enterMyPassword();
    }

    @And("I click on box keep me login")
    public void i_click_on_box_keep_me_login() {
        homePage.clickOnKeepMeloggedCheckBox();
    }

    @When("I click on button login")
    public void i_click_on_button_login() {
        homePage.clickOnLogInButton();
    }

    @Then("I shouldn't see me login successfully")
    public void i_shouldn_t_see_me_login_successfully() {
        String expectedText = "Whoops! Looks like these login credentials aren't working. Please try again.";
        String actualText = homePage.ErrorLoggingText.getText();
        Assert.assertEquals(expectedText, actualText, "test fail");

    }

    //#################################################
    //travel info step definitions
    @When("I mouse hover on Travel Info feature")
    public void i_mouse_hover_on_travel_info_feature() {
        travelInfoPge.travelInfo();
    }

    @Then("I click on DELTA ONE® function")
    public void i_click_on_delta_one_function() {
        travelInfoPge.deltaOne();
    }

    @And("I should see title window displayed")
    public void i_should_see_title_window_displayed() {
        travelInfoPge.deltaOneTitle();
    }


//delta comfort plus

    @When("I click on deltaComfortPlus function")
    public void i_click_on_delta_comfort_plus_function() {
        travelInfoPge.deltaComfortPlus();
    }

    @Then("I should see title3 window displayed")
    public void i_should_see_title3_window_displayed() {
        travelInfoPge.deltaComfortPlusTitle3();
    }


    // first class
    @When("I click on firstClass function")
    public void i_click_on_first_class_function() {
        travelInfoPge.firstClass();
    }

    @Then("I should see title2 window displayed")
    public void i_should_see_title2_window_displayed() {
        travelInfoPge.firstClassTitle2();
    }

//delta premium select

    @When("I click on delta premium select function")
    public void i_click_on_delta_premium_select_function() {
        travelInfoPge.deltaPremiumSelect();
    }

    @Then("I should see title5 window displayed")
    public void i_should_see_title5_window_displayed() {
        travelInfoPge.deltaPremiumSelectTitle5();
    }

    //    main cabin function
    @When("I click on mainCabin function")
    public void i_click_on_main_cabin_function() {
        travelInfoPge.mainCabin();
    }

    @Then("I should see title4 window displayed")
    public void i_should_see_title4_window_displayed() {
        travelInfoPge.mainCabinTitle4();
    }

    //########################################

    //  join Sky Miles For Free feature

    @Given("I mouse hover on sky miles")
    public void i_mouse_hover_on_sky_miles() {
        skyMilesPage.skyMiles();
    }

    @When("I click on join Sky Miles For Free feature")
    public void i_click_on_join_sky_miles_for_free_feature() {
        skyMilesPage.joinSkyMilesForFree();
    }

    @Then("I should see JOIN SKYMILES text")
    public void i_should_see_join_skymiles_text() {
        skyMilesPage.JOINSKYMILESText();
    }

    // my sky miles feature

    @When("I click on my Sky Miles  feature")
    public void i_click_on_my_sky_miles_feature() {
        skyMilesPage.mySkyMiles();
    }
    @Then("I should see Log In To Delta text1")
    public void i_should_see_log_in_to_delta_text1() {
        skyMilesPage.logInToDeltaText();
    }

    // get To Know Sky Miles feature
    @When("I click on get To Know Sky Miles feature")
    public void i_click_on_get_to_know_sky_miles_feature() {
        skyMilesPage.getToKnowSkyMiles();
    }
    @Then("I should see SkyMiles Program text2")
    public void i_should_see_sky_miles_program_text2() {
        skyMilesPage.SkyMilesProgramText();
    }


    //how To Use Miles feature
    @When("I click on  how To Use Miles feature")
    public void i_click_on_how_to_use_miles_feature() {
        skyMilesPage.howToEarnMiles();
    }
    @Then("I should see How to Earn Miles text3")
    public void i_should_see_how_to_earn_miles_text3() {
        skyMilesPage.howToEarnMilesText();
    }

    // how To Earn Miles feature
    @When("I click how To Earn Miles feature")
    public void i_click_how_to_earn_miles_feature() {
        skyMilesPage.howToUseMiles();
    }
    @Then("I should see JOIN SKY MILES text4")
    public void i_should_see_join_sky_miles_text4() {
        skyMilesPage.howToUseMilesText();
    }
}