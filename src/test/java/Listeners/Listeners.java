package Listeners;

import ApplicationUtil.Util.MobileUtil;
import TestScripts.BaseTest;
import Util.CommonFunctions;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;
import java.util.logging.Logger;

public class Listeners implements ITestListener {

    CommonFunctions commonFunctions;
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();
    Logger logger=Logger.getLogger(MobileUtil.class.getName());

     @Override
    public void onTestFailure(ITestResult result) {
      /*ITestListener.super.onTestFailure(result);
         System.out.println(" [Listener] :  TEST CASE FAILED");
        System.out.println("TC NAME IS:" +  result.getName());
        try {
            logger.info("Getting path of Screenshot  calling  commonFunctions.capture");
             String path=  commonFunctions.capture(BaseTest.driver,result.getName()+"FailedSS");
            logger.info("[CALLING:] test.get().fail(result.getThrowable());");

           // test.get().fail(result.getThrowable());
            logger.info("[CALLING:] t  test.get().fail( MediaEntityBuilder.createScreenCaptureFromPath(path).build());");

            test.get().fail("details", MediaEntityBuilder.createScreenCaptureFromPath(path).build());
        } catch (IOException e) {
            e.printStackTrace();
        }*/


       String s=result.getName();
         try {
             commonFunctions.capture(BaseTest.driver,result.getName()+"FailedSS");
         } catch (IOException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         }
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ITestListener.super.onTestSuccess(result);
        System.out.println(" [Listener] :TEST CASE PASS");

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);
        System.out.println(" [Listener] :TEST CASE Skipped");

    }

    @Override
    public void onTestStart(ITestResult result) {
        ITestListener.super.onTestStart(result);
        System.out.println(" [Listener] :TEST CASE START");

    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
        System.out.println(" [Listener] :TEST CASE Faile Timeout");

    }
}

