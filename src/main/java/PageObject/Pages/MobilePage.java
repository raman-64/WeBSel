package PageObject.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;
public class MobilePage {

    @FindBy(xpath = "//*[@alt='Mobiles']")
    private WebElement mobileButton;
    public WebElement getMobileButtonButton() {
        return mobileButton;
    }

    @FindBy(css = ".IiD88i._351hSN")
    private List<WebElement> userNamePw;
    public List<WebElement> getUserNamePw() {
        return userNamePw;
    }

}
