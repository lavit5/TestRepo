package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;



public class Contact_Us_Steps {
    private WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/drivers/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();

    }

    @After
    public void tearDown(){
       driver.quit();
}

    @Given("I access page")
    public void i_access_page() {
        driver.get("https://www.lcwaikiki.rs/en-US/RS/contact");
    }
    @When("I select first dropdown")
    public void i_select_first_dropdown() {
        WebElement dropdown = driver.findElement(By.cssSelector("a[class='chosen-single'] span"));
        dropdown.click();
        WebElement option = driver.findElement(By.cssSelector("li[data-option-array-index='1']"));
        option.click();
    }

    @And("I select second dropdown")
    public void i_select_second_dropdown() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement dropdown2 = driver.findElement(By.cssSelector("a[tabindex='5'] span"));
        dropdown2.click();
        WebElement option2 = driver.findElement(By.cssSelector("html > body > div:nth-of-type(3) > div > div:nth-of-type(3) > div > form > div > div > div:nth-of-type(2) > div > div:nth-of-type(2) > ul > li:nth-of-type(1)"));
        option2.click();
    }
    @And("I select third dropdown")
    public void i_select_third_dropdown() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement dropdown3 = driver.findElement(By.cssSelector("a[tabindex='7'] span"));
        dropdown3.click();
        WebElement option3 = driver.findElement(By.cssSelector("html > body > div:nth-of-type(3) > div > div:nth-of-type(3) > div > form > div > div > div:nth-of-type(3) > div > div:nth-of-type(2) > ul > li:nth-of-type(2)"));
        option3.click();
    }
    @And("I enter name")
    public void i_enter_name() {
        driver.findElement(By.xpath("//*[@id='FirstName']")).sendKeys("Burek");
    }
    @And("I enter lastname")
    public void i_enter_lastname() {

        driver.findElement(By.xpath("//*[@id='LastName']")).sendKeys("Burekic");
    }
    @And("I enter email")
    public void i_enter_email() {

        driver.findElement(By.xpath("//*[@id='EMailAddress']")).sendKeys("burek@burekic.com");
    }
    @And("I enter phone")
    public void i_enter_phone() {

        driver.findElement(By.xpath("//*[@id='PhoneNumber']")).sendKeys("61616161");
    }
    @And("I enter comment")
    public void i_enter_comment() {

        driver.findElement(By.xpath("//*[@id='MessageText']")).sendKeys("Test Burek!");
    }
    @And("I click on send")
    public void i_click_on_send() {

        driver.findElement(By.xpath("//*[@id='submit']")).click();
    }@Then("I should get successful message") public void i_should_get_successful_message() {
        WebElement successMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert')]"));
        Assert.assertEquals(successMessage.getText(), "Your message has been sent to our customer representatives. You will be answered shortly.");

    }


}
