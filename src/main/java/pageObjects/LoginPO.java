package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.GlobalVars;

public class LoginPO extends BasePO {
    private @FindBy(xpath = "//*[@id='text']")
    WebElement usernameTextField;

    private @FindBy(xpath = "//*[@id='password']")
    WebElement passwordTextField;

    private @FindBy(xpath = "//*[@id='login-button']")
    WebElement clickLogin;
    public LoginPO() {

        super();

    }

    public void navigateToWebDriverLoginPage() {
        navigateToURL(GlobalVars.WEBDRIVER + "/Login-Portal/index.html");
    }

    public void setUsername(String username) {
        sendKeys(usernameTextField, username);
    }

    public void setPassword (String password) {
        sendKeys(passwordTextField, password);
    }

    public void clickLogin () {
        waitForWebElementAndClick(clickLogin);
    }

}
