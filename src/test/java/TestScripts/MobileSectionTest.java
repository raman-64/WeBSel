package TestScripts;

import ApplicationUtil.Util.MobileUtil;
import org.testng.annotations.Test;

public class MobileSectionTest extends BaseTest {
    MobileUtil mobileUtil;

    @Test
    public void doMobileSectionTest() throws InterruptedException {
        mobileUtil = new MobileUtil(driver);
        mobileUtil.mobileListPage(driver);

    }

}
