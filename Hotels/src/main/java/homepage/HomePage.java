package homepage;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.awt.Robot;

import java.awt.event.KeyEvent;
import java.awt.AWTException;

import static homepage.HomePageWebElement.*;

public class HomePage extends WebAPI {

// Action Method class

    // Find By Annotation: First Approach
    @FindBy(how = How.LINK_TEXT, using = thingsToDoLocation)
    public WebElement thingsToDo;
    @FindBy(how = How.XPATH, using = signInLocator)
    public WebElement signIn;
    @FindBy(how = How.XPATH, using = emailAddressLocator)
    public WebElement emailAddress;
    @FindBy(how = How.XPATH, using = password_Locator)
    public WebElement password;
    @FindBy(how = How.XPATH, using = signInButton_Locator)
    public WebElement signInButton;
    @FindBy(xpath = ameurMassageLocator)
    public WebElement ameurMassage;
    @FindBy(xpath = signTextLocator)
    public WebElement signText;
    @FindBy(xpath = changeYourBookingLocator)
    public WebElement changeYourBooking;
    @FindBy(xpath = helpFeatureLocator)
    public WebElement helpFeature;
    @FindBy(xpath = faqsLocator)
    public WebElement faqs;


    public void clickOnThingsToDo() {
        thingsToDo.click();
    }

    public String checkOnThingsUrl() {
        String actualUrl =driver.getCurrentUrl();
        return actualUrl;
    }

    public void clickOnSignIn() {
        signIn.click();
    }

    public String checkSignInTitle() {
        String actualTitle = driver.getTitle();
        return actualTitle;
    }

    public void entreEmailAddress() {
        emailAddress.sendKeys("cherif005@live.fr");
    }

    public void entrePassword() {
        password.sendKeys("cherif83");
    }

    public void clickOnSignIn2() {
        signInButton.click();
    }

    public void checkAmeurMassage(String expectedText) {
        String actualText = ameurMassage.getText();
        Assert.assertEquals(expectedText, actualText, "test fail");
    }

    public void clickOnHelpFeature() {
        helpFeature.click();
    }

    public void clickOnChangeYourBooking() {
        changeYourBooking.click();
    }

    public void clickOnFaqsFeature() {
        faqs.click();
    }





    @FindBy(xpath = dealsLocator) public WebElement deals;
    @FindBy(css = enterDestinationLocator)
    public WebElement enterDestination;
    @FindBy(css = checkInLocator)
    public WebElement checkIn;
    @FindBy(xpath = checkOutLocator)
    public WebElement checkOut;
    @FindBy(xpath = roomsLocator)
    public WebElement rooms;
    @FindBy(xpath = adultsLocator)
    public WebElement adults;
    @FindBy(xpath = childrenLocator)
    public WebElement children;
    @FindBy(xpath = showDealsButtonLocator)
    public WebElement showDealsButton;
    @FindBy(xpath = closeButtonLocator)
    public WebElement closeButton;
    @FindBy(xpath = checkOutDayLocator)
    public WebElement checkOutDay;
    @FindBy(xpath = clickAwayLocator)
    public WebElement clickAway;

    public void clickOnDealsFeature() {
        deals.click();
    }

    public String checkUrlDeals() {
        String actualUrl = driver.getCurrentUrl();
       return actualUrl;
    }

    public void enterDestinationFeature(String dist) {
        enterDestination.sendKeys(dist);
        clickAway.click();
    }

    public void checkIn(String in) {
        checkIn.sendKeys(in);
        // closeButton.click();
    }

    public void checkOut(String out) {
        checkOut.click();

        for (int i = 0; i <= 7; i++) {
            Actions ac = new Actions(driver);
            ac.sendKeys(Keys.BACK_SPACE).build().perform();
        }
        checkOut.sendKeys(out);
        closeButton.click();
        clickAway.click();
        System.out.println("*************checkout success");
    }
    public String checkHowDealsTitle(){
        String actualTitle=driver.getTitle();
        return actualTitle;
    }

    public void rooms(String ro) {
        selectOptionByVisibleText(rooms, ro);
    }

    public void adults(String ad) {
        selectOptionByVisibleText(adults, ad);
    }

    public void children(String ch) {
        selectOptionByVisibleText(children, ch);
    }

    public void showDealsButton() {
        showDealsButton.click();
    }

    @FindBy(xpath = usdLocator)
    public WebElement usd;
    @FindBy(xpath = usDollarLocator)
    public WebElement usDollar;

    public void clickOnUsd() {
        usd.click();
    }

    public void clickOnUsDollar() {
        usDollar.click();
    }
public String checkTitleOnUsDollar(){
        String actualTitle = driver.getTitle();
        return  actualTitle;
}
public void getUrl(){
        driver.getCurrentUrl();
}
public void navigateBackk(){
        driver.navigate().back();
}
    public String checkHelpTitle(){
        String actualTitle=driver.getTitle();
        return actualTitle;
    }

}
