package answerspage;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static answerspage.AnswersPageWebElements.*;

public class AnswersPage extends WebAPI {

    @FindBy(xpath = answersLocator)
    public WebElement answers;
    @FindBy(xpath = progressiveAnswersTextLocator)
    public WebElement progressiveAnswersText;

    @FindBy(xpath = exploreProductsLocator)
    public WebElement exploreProducts;
    @FindBy(xpath = wayToSaveTextLocator)
    public WebElement wayToSaveText;

    @FindBy(xpath = claimsLocator)
    public WebElement claims;
    @FindBy(xpath = reportOrTrackAClaimTextLocator)
    public WebElement reportOrTrackAClaimText;

    @FindBy(xpath = aboutUsLocator)
    public WebElement aboutUs;
    @FindBy(xpath = aboutProgressiveTextLocator)
    public WebElement aboutProgressiveText;


    public void answers() {
        answers.click();
    }

    public void progressiveAnswersText() {

        String expectedUrl = "https://www.progressive.com/";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl, "test fail");
    }

    public void exploreProducts() {
        exploreProducts.click();
    }

    public void wayToSaveText() {

        String expectedTest = "Ways to Save";
        String actualTest = wayToSaveText.getText();
        Assert.assertEquals(expectedTest, actualTest, "test fail");
    }

    public void claims() {
        claims.click();
    }

    public void reportOrTrackAClaimText() {

        String expectedTest = "Report or track a claim";
        String actualTest = reportOrTrackAClaimText.getText();
        Assert.assertEquals(expectedTest, actualTest, "test fail");
    }
    public void aboutUs() {
        aboutUs.click();
    }

    public void aboutProgressiveText() {

        String expectedTest = "About Progressive";
        String actualTest = aboutProgressiveText.getText();
        Assert.assertEquals(expectedTest, actualTest, "test fail");
    }
}
