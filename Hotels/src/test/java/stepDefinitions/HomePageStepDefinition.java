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

import java.awt.*;
import java.io.IOException;

public class HomePageStepDefinition  extends WebAPI {
    static HomePage homePage;

    // Cucumber Hook
    @AfterStep
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            // Take a screenshot
            final byte[] screenShot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png","demo1");  // embed it in the report
        }
    }

    @BeforeStep
    public static void getInit(){
        homePage= PageFactory.initElements(driver,HomePage.class);
    }

    @After
    public void closeBrowser(){
        cleanUp();
    }



    @Given("I am on Hotels home page")
    public void i_am_on_hotels_home_page() throws IOException {
       openBrowser("https://www.hotels.com");
    }
    //check Things To Do functionality
    @When("I click on Things To Do feature")
    public void i_click_on_things_to_do_feature() {
        homePage.clickOnThingsToDo();
    }
    @Then("verify url  {string}")
    public void verify_url(String string) {
        homePage.checkOnThingsUrl();
        Assert.assertEquals(string,homePage.checkOnThingsUrl());
    }

//check signIn feature functionality
    @When("I click on signIn button")
    public void i_click_on_sign_in_button() {
        homePage.clickOnSignIn();
    }
    @Then("I verify text {string} is displayed")
    public void i_verify_title_is_displayed(String string) {
        homePage.checkSignInTitle();
        Assert.assertEquals(string, homePage.checkSignInTitle(), "test fail");
    }
    @Given("I enter my email address")
    public void i_enter_my_email_address() {
        homePage.entreEmailAddress();
    }
    @Given("I enter my password")
    public void i_enter_my_password() {
        homePage.entrePassword();
    }
    @When("I click on signIn2 button")
    public void i_click_on_sign_in2_button() {
        homePage.clickOnSignIn2();
    }
    @Then("I should see {string} mesage at the top right of the window")
    public void i_should_see_mesage_at_the_top_right_of_the_window(String string) {
        homePage.checkAmeurMassage(string);
    }
//    check help feature functionality
    @Given("I click on help feature")
    public void i_click_on_help_feature() {
        homePage.clickOnHelpFeature();
    }
    @Given("I click on change my booking")
    public void i_click_on_change_my_booking() {
      homePage.clickOnChangeYourBooking();
    }
    @When("I click on FAQs")
    public void i_click_on_fa_qs() {
        homePage.clickOnFaqsFeature();
    }

    @Given("i click on Deals feature")
    public void i_click_on_deals_feature() {
        homePage.clickOnDealsFeature();

  }

    @Then("page with  {string} should displayed")
    public void page_with_should_displayed(String string) {
        homePage.checkUrlDeals();
        Assert.assertEquals(string, homePage.checkUrlDeals());
    }



    @Given("i enter my destination {string}")
    public void i_enter_my_destination(String string) {
        homePage.enterDestinationFeature(string);
    }
    @Given("i choose my checkIn {string} date")
    public void i_choose_my_check_in_date(String string) {
        homePage.checkIn(string);
    }
    @Given("i choose my checkOut {string} date")
    public void i_choose_my_check_out_date(String string) throws AWTException, InterruptedException {
      homePage.checkOut(string);
    }

//    @Given("choose checkOutDate")
//    public void choose_check_out_date() {
//        homePage.checkOut();
//    }
    @Given("i choose rooms {string}")
    public void i_choose_rooms(String string) {
       homePage.rooms(string);
    }
    @Given("i choose adults {string}")
    public void i_choose_adults(String string) {
       homePage.adults(string);
    }
    @Given("i choose  children {string}")
    public void i_choose_children(String string) {
     homePage.children(string);
    }
    @Then("i click on show deals button")
    public void i_click_on_show_deals_button() {
       homePage.showDealsButton();
    }

    @Then("verify title {string}")
    public void verify_title(String string) {
        homePage.checkHowDealsTitle();
        Assert.assertEquals(string, homePage.checkHowDealsTitle());
    }

@Then("I should verify {string} title window displayed")
public void i_should_verify_title_window_displayed(String string) {

}
//check USD feature functionality
    @Given("i click on USD feature")
    public void i_click_on_usd_feature() {
        homePage.clickOnUsd();
    }
    @When("i click on US Dollar feature")
    public void i_click_on_us_dollar_feature() {
        homePage.clickOnUsDollar();
    }
    @Then("verify TiTle {string} of page displayed")
    public void verify_ti_tle_of_page_displayed(String string) {
        homePage.checkTitleOnUsDollar();
        Assert.assertEquals(string, homePage.checkTitleOnUsDollar());
    }

    @Then("I get url")
    public void get_url() {
        homePage.getUrl();
    }
    @Then("i navigate back to help page")
    public void i_navigate_back_to_help_page() {
        homePage.navigateBackk();
    }
   @Then("I verify titLe {string}")
public void i_verify_tit_le(String string) {
       homePage.checkHelpTitle();
    Assert.assertEquals(string,homePage.checkHelpTitle() );
}
}
