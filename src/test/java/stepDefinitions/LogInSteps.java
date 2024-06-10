package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.BasePO;
import pageObjects.LoginPO;




public class LogInSteps extends BasePO {

    private WebDriver driver = getDriver();

    private LoginPO loginPO;

    public LogInSteps(LoginPO loginPO) {
        this.loginPO = loginPO;
    }


    @Given("I access the webdriver login page")
    public void accessPage() {
        loginPO.navigateToWebDriverLoginPage();
    }

    @When("I enter a unique username {word}")
    public void i_enter_a_unique_username(String username) {
        loginPO.setUsername(username);

    }
    @And("I enter a unique password {word}")
    public void i_enter_a_unique_password(String password) {
        loginPO.setPassword(password);
    }

    @And("I click on Login button")
    public void i_click_on_login_button() {
        loginPO.clickLogin();
    }

    @Then("I should be presented with proper {}")
    public void properMessage(String message) {
        waitForAlertAndValidateText(message);
    }



}
