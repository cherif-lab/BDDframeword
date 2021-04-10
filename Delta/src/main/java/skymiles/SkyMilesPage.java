package skymiles;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static skymiles.SkyMilesWebElements.*;

public class SkyMilesPage extends WebAPI {

    @FindBy(linkText = skyMilesLocator) public WebElement skyMiles;
    @FindBy(xpath = joinSkyMilesForFreeLocator) public WebElement joinSkyMilesForFree;
    @FindBy(css = mySkyMilesLocator) public WebElement mySkyMiles;
    @FindBy(css = getToKnowSkyMilesLocator) public WebElement getToKnowSkyMiles;
    @FindBy(css = howToEarnMilesLocator) public WebElement howToEarnMiles;
    @FindBy(css = howToUseMilesLocator) public WebElement howToUseMiles;
    @FindBy(xpath = JOINSKYMILESTextLocator) public WebElement JOINSKYMILESText;
    @FindBy(xpath = logInToDeltaTextLocator) public WebElement logInToDeltaText;
    @FindBy(xpath = SkyMilesProgramTextLocator) public WebElement SkyMilesProgramText;
    @FindBy(xpath = howToEarnMilesTextLocator) public WebElement howToEarnMilesText;
    @FindBy(xpath = howToUseMilesTextLocator) public WebElement howToUseMilesText;

    public void skyMiles(){
            Actions actions = new Actions(driver);
            actions.moveToElement(skyMiles).build().perform();
    }
    public void joinSkyMilesForFree(){
        skyMiles();
        joinSkyMilesForFree.click();
    }
    public void JOINSKYMILESText(){
        String expectedText="JOIN SKYMILES";
        String actualText=JOINSKYMILESText.getText();
        Assert.assertEquals(expectedText,actualText,"testfail");
    }

    public void mySkyMiles(){
        skyMiles();
        mySkyMiles.click();
    }
    public void logInToDeltaText(){
        String expectedText="Log In To Delta";
        String actualText=logInToDeltaText.getText();
        Assert.assertEquals(expectedText,actualText,"test fail");
    }
    public void getToKnowSkyMiles(){
        skyMiles();
        getToKnowSkyMiles.click();
    }
    public void SkyMilesProgramText(){
        String expectedText="SkyMiles Program";
        String actualText=SkyMilesProgramText.getText();
        Assert.assertEquals(expectedText,actualText,"test fail");
    }
    public void howToEarnMiles(){
        skyMiles();
        howToEarnMiles.click();
    }
    public void howToEarnMilesText(){
        String expectedText="How to Earn Miles";
        String actualText=howToEarnMilesText.getText();
        Assert.assertEquals(expectedText,actualText,"test fail");
    }
    public void howToUseMiles(){
        skyMiles();
        howToUseMiles.click();
    }
    public void howToUseMilesText(){
        String expectedText="How to Use Miles";
        String actualText=howToUseMilesText.getText();
        Assert.assertEquals(expectedText,actualText,"test fail");
    }
}
