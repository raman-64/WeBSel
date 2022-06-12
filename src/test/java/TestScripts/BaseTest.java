package TestScripts;

import Util.CommonFunctions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTest {
    CommonFunctions commonFunctions;
    public static WebDriver driver;


    @Parameters({"BROWSER_NAME"})
    @BeforeClass
    public void launchBrowser(String browser) {
        commonFunctions = new CommonFunctions();
        driver = commonFunctions.commonStartAndOpenURLBrowser(browser);
    }

    @AfterClass
    public void quitBrowser() {
        if (driver != null) {
            driver.quit();

        }
    }
}
