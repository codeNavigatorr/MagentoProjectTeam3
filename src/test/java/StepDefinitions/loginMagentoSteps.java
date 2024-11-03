package StepDefinitions;

import Pages.Elements;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class loginMagentoSteps {

    Elements elements = new Elements();
    WebDriverWait wait=new WebDriverWait(GWD.getDriver(),Duration.ofSeconds(20));


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
        elements.mySendKeys(elements.email, "team3@gmail.com");
        elements.mySendKeys(elements.password1, "Team31234");
        elements.myClick(elements.singIng2);
    }

    @When("The Forgot Your Password? should be displayed")
    public void theForgotYourPasswordShouldBeDisplayed() {
        Assert.assertTrue(elements.forgatPasswordButton.isEnabled());
    }

    @Then("User should login  successfully")
    public void userShouldLoginSuccessfully() {
        wait.until(ExpectedConditions.visibilityOf(elements.loginSuccessfuly));
        Assert.assertTrue(elements.loginSuccessfuly.isDisplayed());


    }


    @Then("SKU number should be displayed")
    public void skuNumberShouldBeDisplayed() {
        String skuNo = "MJ12";
        String skuNo2 = elements.SKUNumber.getText();
        Assert.assertEquals(skuNo, skuNo2);

    }

    @Then("Negative message notice should be displayed")
    public void negativeMessageNoticeShouldBeDisplayed() {
        Assert.assertTrue(elements.addingMessage.isDisplayed());
    }


    @And("The message product added to cart should appear.")
    public void theMessageProductAddedToCartShouldAppear() {
        WebDriverWait wait=new WebDriverWait(GWD.getDriver(),Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(elements.addingMessage));
        Assert.assertTrue(elements.addingMessage.getText().contains("You added"), "Product is not founds");
    }
}

