package ApplicationUtil.Util;

import PageObject.Pages.MobilePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class MobileUtil {

    MobilePage mobilePage;
    Logger logger=Logger.getLogger(MobileUtil.class.getName());


    public MobileUtil(WebDriver driver) {
        mobilePage = new MobilePage();
        logger.info("initialize the mObile page");
        PageFactory.initElements(driver, mobilePage);
    }

    public boolean mobileListPage(WebDriver driver) throws InterruptedException {
        boolean result = false;
        logger.info("waiting");
        Thread.sleep(2000);

        Actions action = new Actions(driver);
        logger.info("Pressing escape key");
        action.sendKeys(Keys.ESCAPE).build().perform();
        Thread.sleep(2000);
        logger.info("clicking on mobile link    ");

        mobilePage.getMobileButtonButton().click();
        Thread.sleep(2000);


        return result;

    }
}
