package travelinfo;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static travelinfo.TravelInfoPageWebElements.*;

public class TravelInfoPage extends WebAPI {


    @FindBy(css = travelInfoLocator) public WebElement travelInfo;
    @FindBy(xpath = deltaOneLocator) public WebElement deltaOne;
    @FindBy(linkText = deltaPremiumSelectLocator) public WebElement deltaPremiumSelect;
    @FindBy(linkText = firstClassLocator) public WebElement firstClass;
    @FindBy(css = deltaComfortPlusLocator) public WebElement deltaComfortPlus;
    @FindBy(linkText = mainCabinLocator) public WebElement mainCabin;

    public void travelInfo(){
    Actions actions = new Actions(driver);
    actions.moveToElement(travelInfo).build().perform();

 }
     public void deltaOne(){
     travelInfo();
     deltaOne.click();
 }
 public void deltaOneTitle(){
        String expectedTitle="Delta One® | Delta Air Lines";
        String actualTitle=driver.getTitle();
     Assert.assertEquals(expectedTitle,actualTitle,"test fail" );

 }
 public void firstClass(){
     travelInfo();
     firstClass.click();
 }

    public void firstClassTitle2() {
        String expectedTitle = "First Class | Delta Air Lines";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle, "test fail");
    }


    public void deltaPremiumSelect(){
        travelInfo();
        deltaPremiumSelect.click();
    }
public void deltaPremiumSelectTitle5() {
    String expectedTitle = "Premium Select | Delta Air Lines";
    String actualTitle = driver.getTitle();
    Assert.assertEquals(expectedTitle, actualTitle, "test fail");
}

    public void deltaComfortPlus() {
        travelInfo();
        deltaComfortPlus.click();
    }
    public void deltaComfortPlusTitle3() {
        String expectedTitle = "Comfort Plus | Delta Air Lines";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle, "test fail");
    }

    public void mainCabin(){
        travelInfo();
        mainCabin.click();
    }
    public void mainCabinTitle4() {
        String expectedTitle = "Main Cabin | Delta Air Lines";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle, "test fail");
    }


}
