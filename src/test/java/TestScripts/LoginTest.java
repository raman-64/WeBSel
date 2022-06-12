package TestScripts;

import ApplicationUtil.Util.LoginUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    LoginUtil loginUtil;

    @Test
    public void loginTest() throws InterruptedException {
        boolean result = true;
        loginUtil = new LoginUtil(driver);
        loginUtil.doLogin(driver);
        Assert.assertTrue(result);

    }


}
