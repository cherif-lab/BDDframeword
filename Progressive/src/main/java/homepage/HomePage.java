package homepage;

import common.WebAPI;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static homepage.HomePageWebElement.*;

public class HomePage extends WebAPI {

// Action Method class

    // Find By Annotation: First Approach
    @FindBy(xpath = logInLocator)
    public WebElement logIn;
    @FindBy(xpath = welcomeMassageLocator)
    public WebElement welcomeMassage;
    @FindBy(xpath = userIdLocator)
    public WebElement userId;
    @FindBy(xpath = passwordLocator)
    public WebElement password;
    @FindBy(xpath = saveUserIdCheckboxLocator)
    public WebElement saveUserIdCheckbox;
    @FindBy(xpath = loginButtonLocator)
    public WebElement loginButton;
    @FindBy(xpath = errorMessage1Locator)
    public WebElement errorMessage1;


    @FindBy(xpath = registerButtonLocator)
    public WebElement registerButton;
    @FindBy(xpath = firstLetsFindYouTextLocator)
    public WebElement firstLetsFindYouText;
    @FindBy(xpath = policyNumberLocator)
    public WebElement policyNumber;
    @FindBy(xpath = lastNameLocator)
    public WebElement lastName;
    @FindBy(xpath = dobFieldLocator)
    public WebElement dobField;
    @FindBy(xpath = zipcodeLocator)
    public WebElement zipcode;
    @FindBy(xpath = continueButton3Locator)
    public WebElement continueButton3;
    @FindBy(xpath = errorMassage2Locator)
    public WebElement errorMassage2;
    @FindBy(xpath = welcomeMessageLocator)
    public WebElement welcomeMessage;


    public WebElement getLogIn() {
        return logIn;
    }

    public void clickOnLogInButton() {
        getLogIn().click();
    }

    public String checkWelcomeMessage() {
        String actualMessage = welcomeMessage.getText();
        return actualMessage;
    }

    public void enterUserId() {
        userId.sendKeys("bcgbxxzvzfzv");
    }

    public void enterPassword() {
        password.sendKeys("fdbshbzg");
    }

    public void CheckSaveUserIdCheckbox() {
        saveUserIdCheckbox.click();
    }

    public void clickOnLoginButton2() {
        loginButton.click();
    }

    public String getErrorMessage1() {
        String actualMassage = errorMessage1.getText();
        return actualMassage;
    }
    public void clickOnRegisterButton() {
        registerButton.click();
    }

//    public void getFirstLetsFindYouText() {
//        String expectedMassage="First, let's find you";
//        String actualMassage = firstLetsFindYouText.getText();
//        Assert.assertEquals(expectedMassage, actualMassage, "massage doest not match");
//    }

    public void enterMyPolicyNumber() {
        policyNumber.sendKeys("7474636367272728");
    }

    public void enterMyLastName() {
        lastName.sendKeys("hdbgxbxgzb");
    }

    public void dobField() {
        dobField.sendKeys("08/30/2000");
    }

    public void zipcode() {
        zipcode.sendKeys("6445356");

    }

    public void continueButton3() {
        continueButton3.click();
    }

    public String getErrorMassage2() {
       String actualMssage=errorMassage2.getText();
       return actualMssage;
    }

    @FindBy(xpath = exploreProductLocator)
    public WebElement exploreProduct;
    @FindBy(xpath = vehicleTextLocator)
    public WebElement vehicleText;
    @FindBy(xpath = atvUtvLocator)
    public WebElement atvUtv;
    @FindBy(xpath = atvUtvInsuranceMessageLocator)
    public WebElement atvUtvInsuranceMessage;
    @FindBy(xpath = autoLocator)
    public WebElement auto;
    @FindBy(xpath = carInsuranceTextLocator)
    public WebElement carInsuranceText;
    @FindBy(xpath = boatLocator)
    public WebElement boat;
    @FindBy(xpath = classicCarLocator)
    public WebElement classicCar;
    @FindBy(xpath = golfCartLocator)
    public WebElement golfCart;
    @FindBy(xpath = mexicoAutoLocator)
    public WebElement mexicoAuto;
    @FindBy(xpath = motorCycleLocator) public WebElement motorCycle;
    @FindBy(xpath = pwcLocator) public WebElement pwc;


    public void exploreProduct() {
        exploreProduct.click();
    }

    public String checkVehicleText(){
        String actualMessage = vehicleText.getText();
        return actualMessage;
    }

    public void boat() {
        boat.click();
    }

    public void getTitleBoat() {
        String expectedTitle = "Boat Insurance: Get a Quote Online | Progressive";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    public void classicCar() {
        classicCar.click();
    }

    public void getTitleClassicCar() {
        String expectedTitle = "Get a Quote for Classic Car Insurance | Progressive";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    public void golfCart() {
        golfCart.click();
    }

    public void getTitleGolfCart() {
        String expectedTitle = "Golf Cart Insurance: Get a Quote Online | Progressive";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    public void mexicoAuto() {
        mexicoAuto.click();
    }

    public void getTitleMexicoAuto() {
        String expectedTitle = "Get the Right Coverage With Mexico Auto Insurance | Progressive";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    public void motorCycle() {
        motorCycle.click();
    }

    public void getTitleMotorCycle() {
        String expectedTitle = "Motorcycle Insurance: Get a Quote Online | Progressive";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    public void atvUtv() {
        atvUtv.click();
    }
    public String checkAtvUtvInsuranceMessage(){
        String actualMessage = atvUtvInsuranceMessage.getText();
        return actualMessage;
    }

    public void auto() {
        auto.click();
    }
    public String checkCarInsuranceMessage(){
        String actualMessage = carInsuranceText.getText();
        return actualMessage;
    }
    public void pwc() {
        pwc.click();
    }

    public void getTitlePwc() {
        String expectedTitle = "PWC Insurance for Jet Skis, WaveRunners &amp; More | Progressive";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }
}











