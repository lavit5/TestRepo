package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageObjects.BasePO;
import pageObjects.ContactUsPO;


public class ContactUsSteps extends BasePO {
    private WebDriver driver = getDriver();

    private ContactUsPO contactUsPO;

    public ContactUsSteps(ContactUsPO contactUsPO) {
        this.contactUsPO = contactUsPO;
    }


    @Given("I access the webdriver contact us page")
    public void accessPage() {
        contactUsPO.navigateToWebDriverContactUsPage();
    }

    @When("I enter a unique first name")
    public void enterName() {
        contactUsPO.setEnterFirstName("Burek");

    }

    @And("I enter a unique last name")
    public void enterLastName() {

        contactUsPO.setEnterLastName("Burekic");

    }

    @And("I enter a unique email address")
    public void enterEmail() {
       contactUsPO.setEnterEmail("burekburekic@bureklija.net");

    }

    @And("I add comment")
    public void addComment() {
        contactUsPO.setEnterComment("Sa Sirom!");

    }

    @And("I enter a specific first name {word}")
    public void i_enter_a_specific_first_name(String name) {
        contactUsPO.setSpecificName(name);

    }

    @And("I enter a specific last name {word}")
    public void i_enter_a_specific_last_name(String lastName) {
        contactUsPO.setSpecificLastName(lastName);

    }

    @And("I enter a specific email address {word}")
    public void i_enter_a_specific_email_address(String email) {
        contactUsPO.setSpecificEmail(email);

    }

    @And("I enter specific comment {string}")
    public void i_enter_specific_comment(String comment) {
        contactUsPO.setSpecificComment(comment);

    }

    @And("I click on the submit button")
    public void clickSubmit() {
        contactUsPO.setClickSubmitButton();

    }

    @Then("I should be presented with successful message")
    public void i_should_be_presented_with_successful_message() {
        contactUsPO.setValidateMessage();


    }

}
