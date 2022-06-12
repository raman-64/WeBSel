package TestScripts;

import Util.CommonFunctions;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class ExtentScreenshot {
    ExtentTest logger;
    ExtentReports extentReports;
    WebDriver driver;

    @BeforeMethod
    public void extentTest() throws IOException {
        ExtentHtmlReporter reporter = new ExtentHtmlReporter("./REPORTS/SuiteReport1.html");
        extentReports = new ExtentReports();
        extentReports.attachReporter(reporter);
        logger = extentReports.createTest("Login Test");
    }

    @Test
    public void loginTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        Assert.assertTrue(driver.getTitle().contains("raman"));
    }

    @AfterMethod
    public void tearDown(ITestResult result) throws IOException {
        if (result.getStatus() == ITestResult.FAILURE) {
            String temp = CommonFunctions.capture(driver, "ExtentTest");
            logger.fail("Failed bcoz Title is incoorect ",
                    MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
             extentReports.flush();
        }
    }
}