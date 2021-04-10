package stepDefinitions;

import aboutus.AboutUsPage;
import answerspage.AnswersPage;
import common.WebAPI;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class AboutUsStepDefinition extends WebAPI {
    static AboutUsPage aboutUsPage;

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
        aboutUsPage = PageFactory.initElements(driver, AboutUsPage.class);
    }

    @Given("i am on progressive home page")
    public void i_am_on_progressive_home_page() throws IOException {
        openBrowser("https://www.progressive.com");
    }

    @When("i click on AboutUs feature")
    public void i_click_on_about_us_feature() {
        aboutUsPage.clickOnAboutUs();
    }

    @Then("i should see {string} text displayed")
    public void i_should_see_text_displayed(String string) {
        aboutUsPage.checkAboutProgressiveText(string);
    }


    @Given("i click on whoWeAre")
    public void i_click_on_who_we_are() {
        aboutUsPage.clickOnWhoWeAre();
    }

    @Then("i should see {string} text1 displayed")
    public void i_should_see_text1_displayed(String string) {
        aboutUsPage.checkWhoWeAreText(string);

    }
    @When("i click on investors")
    public void i_click_on_investors() {
        aboutUsPage.clickOnInvestors();
    }
    @Then("i should see {string} text2 displayed")
    public void i_should_see_text2_displayed(String string) {
        aboutUsPage.checkRealizingAmbitiousGoalsText(string);
    }

    @When("i click on localAgents")
    public void i_click_on_local_agents() {
        aboutUsPage.clickOnLocalAgents();
    }
    @Then("i should see {string} text3 displayed")
    public void i_should_see_text3_displayed(String string) {
        aboutUsPage.checkLocalInsuranceAgentsText(string);
    }

    @When("i click on newsRoom")
    public void i_click_on_news_room() {
        aboutUsPage.clickOnNewRoom();
    }
    @Then("i should see {string} text4 displayed")
    public void i_should_see_text4_displayed(String string) {
        aboutUsPage.checkWelcomeToTheProgressiveNewsRoomTextText(string);
    }

    @When("i click on corporateResponsibility")
    public void i_click_on_corporate_responsibility() {
        aboutUsPage.clickOnCorporateResponsibility();
    }
    @Then("i should see {string} text5 displayed")
    public void i_should_see_text5_displayed(String string) {
        aboutUsPage.checkProgressiveTogetherText(string);
    }

    @When("i click on progressiveArtCollection")
    public void i_click_on_progressive_art_collection() {
        aboutUsPage.clickOnProgressiveArtCollection();
    }
    @Then("i should see {string} text6 displayed")
    public void i_should_see_text6_displayed(String string) {
        aboutUsPage.checkTheProgressiveArtCollectionText(string);
    }




}
