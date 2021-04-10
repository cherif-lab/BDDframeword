package stepDefinitions;

import answerspage.AnswersPage;
import common.WebAPI;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import homepage.HomePage;

public class AnswersPageStepDefinition extends WebAPI {
    static AnswersPage answersPage;

    // Cucumber Hook
    @AfterStep
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot
            final byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(

                    OutputType.BYTES);
            scenario.attach(screenShot, "image/png", "demo1");  // embed it in the report
        }
    }

    @BeforeStep
    public static void getInit() {
        answersPage = PageFactory.initElements(driver, AnswersPage.class);
    }

    @When("I click on answers function")
    public void i_click_on_answers_function() {
        answersPage.answers();
    }

    @Then("I should see should see Progressive Answers text1")
    public void i_should_see_should_see_progressive_answers_text1() {
        answersPage.progressiveAnswersText();
    }

    //################# click exploreProducts     #################
    @When("I click exploreProducts")
    public void i_click_explore_products() {
        answersPage.exploreProducts();
    }

    @Then("I should see should see Way to Save text2")
    public void i_should_see_should_see_way_to_save_text2() {
        answersPage.wayToSaveText();

    }
//    ##################     click on claims function

    @When("I click on claims function")
    public void i_click_on_claims_function() {
        answersPage.claims();
    }

    @Then("I should see should see report Or Track A Claim text3")
    public void i_should_see_should_see_report_or_track_a_claim_text3() {
        answersPage.reportOrTrackAClaimText();
    }

//    #################  aboutUs function
    @When("I click on aboutUs function")
    public void i_click_on_about_us_function() {
        answersPage.aboutUs();
    }
    @Then("I should see should see about Progressive  text4")
    public void i_should_see_should_see_about_progressive_text4() {
        answersPage.aboutProgressiveText();
    }

}