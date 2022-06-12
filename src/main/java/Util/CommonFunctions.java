package Util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class CommonFunctions {

    static String strTargetUrl;

    static {    WebDriver driver ;
        strTargetUrl = "https://www.flipkart.com/";
    }

    public WebDriver commonStartAndOpenURLBrowser( String browser) {
  WebDriver driver = null;
        try {
            if (browser.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("FIREFOX")) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();

            } else if (browser.equalsIgnoreCase("IE")) {
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
            }
            driver.get(strTargetUrl);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        } catch (Exception e) {
            e.getMessage();
        }
        return driver;
    }


    public  static String capture(WebDriver driver, String screenShotName) throws IOException {
         String dest;
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        dest = System.getProperty("user.dir") + "/ErrorScreenshots/" + screenShotName + "_[TIME]"
                + ".png";
        System.out.println("dest:" + source.getAbsolutePath().toString());
        File destination = new File(dest);
        FileUtils.copyFile(source, destination);
        System.out.println("destination:" + destination.getAbsolutePath().toString());
        dest = dest.replaceAll("@[0-9]", "");
      /*  dest = dest.replace("var/lib/jenkins/workspace/AppAutomation/", "job/AppAutomation/ws/");
        System.out.println("dest:" + dest); */
        return dest;
    }

}
