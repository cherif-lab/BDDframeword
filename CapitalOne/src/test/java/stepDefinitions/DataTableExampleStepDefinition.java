package stepDefinitions;

import common.WebAPI;
import homepage.HomePage1;
import io.cucumber.java.BeforeStep;
import org.openqa.selenium.support.PageFactory;

public class DataTableExampleStepDefinition extends WebAPI {
    static HomePage1 homePage;

    @BeforeStep
    public static void getInit() {
        homePage = PageFactory.initElements(driver, HomePage1.class);
    }

}




