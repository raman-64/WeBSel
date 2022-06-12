package ApplicationUtil.Util;

import PageObject.Pages.LoginPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;


public class LoginUtil {
    LoginPage loginPageObj;


    public LoginUtil(WebDriver driver) {
        loginPageObj = new LoginPage();
        PageFactory.initElements(driver, loginPageObj);
    }


    public boolean doLogin(WebDriver driver) throws InterruptedException {
        boolean result = false;
        Thread.sleep(2000);
        try {
            Actions action = new Actions(driver);
            action.sendKeys(Keys.ESCAPE).build().perform();
            Thread.sleep(2000);
            System.out.println();
        }catch (Exception e){
            e.getMessage();
            System.out.println("error in Login");
        }
        return result;

    }

}
