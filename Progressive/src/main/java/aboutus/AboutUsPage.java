package aboutus;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static aboutus.AboutUsWebElements.*;
import static answerspage.AnswersPageWebElements.aboutProgressiveTextLocator;

public class AboutUsPage extends WebAPI {
    @FindBy(xpath = aboutUsLocator) public WebElement aboutUs;
    @FindBy(xpath = whoWeAreLocator) public WebElement whoWeAre;
    @FindBy(xpath = investorsLocator) public WebElement investors;
    @FindBy(xpath = localAgentsLocator) public WebElement localAgents;
    @FindBy(xpath = newsRoomLocator) public WebElement newsRoom;
    @FindBy(xpath = corporateResponsibilityLocator) public WebElement corporateResponsibility;
    @FindBy(xpath = progressiveArtCollectionLocator) public WebElement progressiveArtCollection;
    @FindBy(xpath = aboutProgressiveTextLocator1) public WebElement aboutProgressiveText9;
    @FindBy(xpath = whoWeHAveAlwaysBeenTextLocator) public WebElement whoWeHAveAlwaysBeenText;
    @FindBy(xpath = realizingAmbitiousGoalsTextLocator) public WebElement realizingAmbitiousGoalsText;
    @FindBy(xpath = localInsuranceAgentsTextLocator) public WebElement localInsuranceAgentsText;
    @FindBy(xpath = welcomeToTheProgressiveNewsRoomTextLocator) public WebElement welcomeToTheProgressiveNewsRoomText;
    @FindBy(xpath = progressiveTogetherTextLocator) public WebElement progressiveTogetherText;
    @FindBy(xpath = theProgressiveArtCollectionTextLocator) public WebElement theProgressiveArtCollectionText;

    public WebElement getAboutUs() {
        return aboutUs;
    }
    public void clickOnAboutUs(){
        getAboutUs().click();
    }
    public void checkAboutProgressiveText(String expectedText){
        String actualText=aboutProgressiveText9.getText();
        Assert.assertEquals(expectedText,actualText,"test fail");
    }
    public WebElement getWhoWeAre(){
        return whoWeAre;
    }
    public void clickOnWhoWeAre(){
        getWhoWeAre().click();
    }
    public void checkWhoWeAreText(String expectedText){
        String actualText =whoWeHAveAlwaysBeenText.getText();
        Assert.assertEquals(expectedText,actualText,"text does not match");
    }

    public WebElement getInvestors() {
        return investors;
    }
    public void clickOnInvestors(){
        getInvestors().click();
    }
    public void checkRealizingAmbitiousGoalsText(String expectedText){
        String actualText=realizingAmbitiousGoalsText.getText();
        Assert.assertEquals(expectedText,actualText,"text does not match");
    }

    public WebElement getLocalAgents() {
        return localAgents;
    }
    public void clickOnLocalAgents(){
        getLocalAgents().click();
    }
    public void checkLocalInsuranceAgentsText(String expectedText){
        String actualText=localInsuranceAgentsText.getText();
        Assert.assertEquals(expectedText,actualText,"text does not match");
    }

    public WebElement getNewsRoom() {
        return newsRoom;
    }
    public void clickOnNewRoom(){
        getNewsRoom().click();
    }
    public void checkWelcomeToTheProgressiveNewsRoomTextText(String expectedText){
        String actualText=welcomeToTheProgressiveNewsRoomText.getText();
        Assert.assertEquals(expectedText,actualText,"text does not match");
    }

    public WebElement getCorporateResponsibility() {
        return corporateResponsibility;
    }
    public void clickOnCorporateResponsibility(){
        getCorporateResponsibility().click();
    }
    public void checkProgressiveTogetherText(String expectedText){
        String actualText=progressiveTogetherText.getText();
        Assert.assertEquals(expectedText,actualText,"text does not match");
    }

    public WebElement getProgressiveArtCollection() {
        return progressiveArtCollection;
    }
    public void clickOnProgressiveArtCollection(){
        getProgressiveArtCollection().click();
    }
    public void checkTheProgressiveArtCollectionText(String expectedText){
        String actualText=theProgressiveArtCollectionText.getText();
        Assert.assertEquals(expectedText,actualText,"text does not match");
    }
}
