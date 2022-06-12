package TestPackage2;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestExclude1 {

    @Parameters({"BROWSER_NAME"})
    @BeforeClass
    public void MobileT1(String browser) {
        System.out.println("MobileT1 before class");
        //    boolean result = false;
        //  Assert.assertTrue(result);
        System.out.println(browser + "   browser");
    }

    @Test(timeOut = 4000)
    public void MobileT2() throws InterruptedException {


        Thread.sleep(3000);
        System.out.println("MobileT2");
    }


}
