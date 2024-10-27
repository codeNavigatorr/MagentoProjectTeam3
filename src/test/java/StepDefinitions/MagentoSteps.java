package StepDefinitions;


import Pages.Elements;
import Utilities.GWD;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MagentoSteps {
    Elements elements=new Elements();
    @Given("Navigate to the website")
    public void navigateToTheWebsite() {
        GWD.getDriver().get("https://magento.softwaretestingboard.com/");
    }

    @When("Click on the  sing in button")
    public void clickOnTheSingInButton() {
        elements.myClick(elements.singIn);
    }
    @When("Enter userName and Password and click sing in button")
    public void enterUserNameAndPasswordAndClickSingInButton() {
        elements.mySenkeys(elements.email,"yusuf@gmail.com");
        elements.mySenkeys(elements.password1,"Yusuf1234");
        elements.myClick(elements.singIng2);
    }
    @Then("User should login  successfully")
    public void userShouldLoginSuccessfully() {
        Assert.assertTrue(elements.loginSuccessfuly.getText().contains("Welcome"));
    }
}
