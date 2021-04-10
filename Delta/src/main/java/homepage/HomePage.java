package homepage;

import common.WebAPI;
import homepage.HomePageWebElements;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static homepage.HomePageWebElements.*;


public class HomePage extends WebAPI {

    @FindBy(xpath = HomePageWebElements.loginLocator)
    public WebElement login;
    @FindBy(xpath = userNameLocator)
    public WebElement userName;
    @FindBy(xpath = keepMeLoggedINLocator)
    public WebElement keepMeLoggedIN;
    @FindBy(xpath = passwordLocator)
    public WebElement password;
    @FindBy(xpath = loginButtonLocator)
    public WebElement loginButton;
    @FindBy(xpath = ErrorLoggingTextLocator)
    public WebElement ErrorLoggingText;
    @FindBy(xpath = searchButtonLocator)
    public WebElement searchButton;
    @FindBy(xpath = searchBoxLocator)
    public WebElement searchBox;
    @FindBy(xpath = searchResultsTextLocator)
    public WebElement searchResultText;

    public void clickOnLogIn() {
        login.click();
    }

    public void enterMyUserName() {
        userName.sendKeys("samir");
    }

    public void enterMyPassword() {
        password.sendKeys("jfhhdstts634535");
    }

    public void clickOnKeepMeloggedCheckBox() {
        keepMeLoggedIN.click();
    }

    public void clickOnLogInButton() {
        loginButton.click();
    }

    public void searchButton() {
        searchButton.click();
    }

    public void searchBox(String topics) {
        searchBox.sendKeys(topics, Keys.ENTER);
    }

    public void verifySearchResult(String expectedResult){
        String actualText=searchResultText.getText();
        Assert.assertEquals(expectedResult,actualText,"test fail");
    }
}
