package TestScripts;

import TestPackage2.TestExclude1;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestExclude {
    @Parameters({"URL", "Runmode"})
    @Test
    public void MobileT1(String url, String runMOde) throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("MobileT1" + url);
     }

    @Test(groups = ("smoke"))
    public void MobileT2() {
        System.out.println("MobileT2");
    }

    @Test(dataProvider = "getData")
    public void getUNAmePW(String uName, String PW) {
        System.out.println(uName);
        System.out.println(PW);
        System.out.println("MobileT3");
    }

    @DataProvider
    public Object[] getData() {
        Object[][] data = new Object[2][2];
        data[0][0] = "FirstUserName";
        data[0][1] = "FirstPassword";
        data[1][0] = "SecondtUserName";
    data[1][1] = "SecondPassword";
        return data;

    }

    @Test
    public void MobileT4() {
        System.out.println("MobileT4");
    }

    @Test
    public void MobileT5() {
        System.out.println("MobileT5");
    }

    @Test(enabled = true)
    public void MobileT6() {
        System.out.println("MobileT6");
    }

    @Test
    public void Phone1() {
        boolean result = true;
        System.out.println("Phone1");
        Assert.assertTrue(result);
    }

    @Test(dependsOnMethods = "Phone1")
    public void Phone2() {
        System.out.println("Phone2");
    }

    @Test
    public void Phone3() {
        System.out.println("Phone3");
    }

    @Test
    public void PhoABCne1() {
        System.out.println("Phone1abc ");
    }

    @Test
    public void PhoneABC2() {
        System.out.println("Phone2 abc");
    }

}
