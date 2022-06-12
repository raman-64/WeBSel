package PageObject.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LoginPage {
    @FindBy(css = "_1_3w1N")
    private WebElement loginButton;

    public WebElement getLoginButton() {
        return loginButton;
    }

    @FindBy(css = "_2doB4z")
    private WebElement closeButton;

    public WebElement getCloseButton() {
        return closeButton;
    }

    @FindBy(css = ".IiD88i._351hSN")
    private List<WebElement> userNamePw;

    public List<WebElement> getUserNamePw() {
        return userNamePw;
    }

}
