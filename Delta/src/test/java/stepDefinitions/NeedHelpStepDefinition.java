package stepDefinitions;

import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import needhelp.NeedHelpPage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

public class NeedHelpStepDefinition extends WebAPI {
    static NeedHelpPage needHelpPage;

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

        needHelpPage = PageFactory.initElements(driver, NeedHelpPage.class);
    }

    @After
    public void closeBrowser(){
        cleanUp();
    }

    @When("user mouse hover on need help feature")
    public void user_mouse_hover_on_need_help_feature() {
        needHelpPage.needHelpMouseHoverAction();
    }

    //Change cancel help links
    @When("user clicks on change cancel help link")
    public void user_clicks_on_change_cancel_help_link() {
        needHelpPage.clickOnChangeCancelHelp();
    }
    @Then("user should see Flight Help : Delta Air Lines {string} window displayed")
    public void user_should_see_flight_help_delta_air_lines_window_displayed(String string) {
        needHelpPage.checkTitleChangeCancelHelp(string);
    }

    //Refund help link
    @When("user clicks on refund help link")
    public void user_clicks_on_refund_help_link() {
        needHelpPage.clickOnRefundHelp();
    }
    @Then("user should see Delta Cancellation & Refund Policy : Delta Air Lines {string} window displayed")
    public void user_should_see_delta_cancellation_refund_policy_delta_air_lines_window_displayed(String string) {
        needHelpPage.checkTitleRefundlHelp(string);
    }

    //Seats help link
    @When("user clicks on seats help link")
    public void user_clicks_on_seats_help_link() {
        needHelpPage.clickOnSeatsHelp();
    }
    @Then("user should see Seat Support : Delta Air Lines {string} window displayed")
    public void user_should_see_seat_support_delta_air_lines_window_displayed(String string) {
        needHelpPage.checkTitleSeatsHelp(string);
    }

    //Baggage help link
    @When("user clicks on baggage help link")
    public void user_clicks_on_baggage_help_link() {
        needHelpPage.clickOnBaggageHelp();
    }
    @Then("user should see Baggage Policy and Fees | Delta Air Lines {string} window displayed")
    public void user_should_see_baggage_policy_and_fees_delta_air_lines_window_displayed(String string) {
        needHelpPage.checkTitleBaggageHelp(string);
    }

    //Comment Complaint link
    @When("user clicks on comment complaint link")
    public void user_clicks_on_comment_complaint_link() {
        needHelpPage.clickOnCommentComplaintHelp();
    }
    @Then("user should see Help Center : Get Help with Reservations, Baggage & More : Delta Air Lines {string} window displayed")
    public void user_should_see_help_center_get_help_with_reservations_baggage_more_delta_air_lines_window_displayed(String string) {
        needHelpPage.checkTitlecommentComplaintHelp(string);
    }

    //Coronavirus Travel FAQs
    @When("user clicks on Coronavirus Travel FAQs link")
    public void user_clicks_on_coronavirus_travel_fa_qs_link() {
        needHelpPage.clickOnCoronavirusTravelFaqs();
    }
    @Then("user should see Coronavirus Travel: FAQs | Delta Air Lines | Delta Air Lines {string} window displayed")
    public void user_should_see_coronavirus_travel_fa_qs_delta_air_lines_delta_air_lines_window_displayed(String string) {
        needHelpPage.checkTitleCoronavirusTravelFaqs(string);
    }

    //Need Help ?
    @When("user clicks on Need Help ? link")
    public void user_clicks_on_need_help_link() {
        needHelpPage.clickOnNeedHelp();
    }

    @Then("user should see Need Help {string} window displayed")
    public void user_should_see_need_help_window_displayed(String string) {
        needHelpPage.checkTitleNeedHelp(string);
    }

    //Receipts
    @When("user clicks on receipts link")
    public void user_clicks_on_receipts_link() {
        needHelpPage.clickOnReceipts();
    }
    @Then("user should see Other Information : Delta Need Help {string} window displayed")
    public void user_should_see_other_information_delta_need_help_window_displayed(String string) {
        needHelpPage.checkTitleNeedHelp(string);
    }

    //Ceritificate And eCredits
    @When("user clicks on Certificates And eCredits link")
    public void user_clicks_on_certificates_and_e_credits_link() {
        needHelpPage.clickOnCertificatesEcredits();
    }
    @Then("user should see View or Redeem Multiple Certificates or Ecredits or Gift Cards : Delta Air  Lines {string} window displayed")
    public void user_should_see_view_or_redeem_multiple_certificates_or_ecredits_or_gift_cards_delta_air_lines_window_displayed(String string) {
        needHelpPage.checkTitleCertificatesEcredits(string);
    }

    //Child And Enfant Travel
    @When("user clicks on Child And Enfant Travel  link")
    public void user_clicks_on_child_and_enfant_travel_link() {
        needHelpPage.clickOnChildInfantTravel();
    }
    @Then("user should see Children & Infant Travel Policy : Delta Air Lines {string} window displayed")
    public void user_should_see_children_infant_travel_policy_delta_air_lines_window_displayed(String string) {
        needHelpPage.checkTitleChildInfantTravel(string);
    }
}
