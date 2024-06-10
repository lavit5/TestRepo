package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.GlobalVars;

public class ContactUsPO extends BasePO {

    private @FindBy(xpath = "//input[@name='first_name']")
    WebElement enterFirstName;

    private @FindBy(xpath = "//input[@name='last_name']")
    WebElement enterLastName;

    private @FindBy(xpath = "//input[@name='email']")
    WebElement enterEmail;

    private @FindBy(xpath = "//textarea")
    WebElement enterComment;

    private @FindBy(xpath = "//input[@type='submit']")
    WebElement clickSubmitButton;

    private @FindBy(xpath = "//h1")
    WebElement validateMessage;

    public ContactUsPO() {
        super();
    }


    public void navigateToWebDriverContactUsPage() {
        navigateToURL(GlobalVars.WEBDRIVER + "/Contact-Us/contactus.html");
    }

    public void setEnterFirstName(String firstName){
        sendKeys(enterFirstName, firstName + generatorBroja(5));
    }

    public void setEnterLastName(String lastName){
        sendKeys(enterLastName, lastName + generatorBroja(5));
    }

    public void setEnterEmail(String email){
        sendKeys(enterEmail, email);
    }

    public void setEnterComment(String comment) {
        sendKeys(enterComment, comment + generatorSlova(5));
    }

    public void setSpecificName(String name) {
        sendKeys(enterFirstName, name);
    }

    public void setSpecificLastName(String lastName) {
        sendKeys(enterLastName, lastName);
    }

    public void setSpecificEmail(String email) {
        sendKeys(enterEmail, email);
    }

    public void setSpecificComment(String comment) {
        sendKeys(enterComment, comment);
    }

    public void setClickSubmitButton(){
        waitForWebElementAndClick(clickSubmitButton);
    }

    public void setValidateMessage(){
        waitFor(validateMessage);
        Assert.assertEquals(validateMessage.getText(), "Thank You for your Message!");
    }
}
