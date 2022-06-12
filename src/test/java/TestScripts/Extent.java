package TestScripts;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.Test;

import java.io.IOException;

public class Extent {

    @Test

    public void extentTest() throws IOException {
        System.out.println("login");
        ExtentHtmlReporter reporter = new ExtentHtmlReporter("./REPORTS/SuiteReport.html");
        ExtentReports extentReports = new ExtentReports();
        extentReports.attachReporter(reporter);
        ExtentTest logger = extentReports.createTest("Login Test");

        System.out.println("logout");

        logger.log(Status.INFO, "login Info");
        logger.log(Status.PASS, "Title verified");
        extentReports.flush();

    }

}
