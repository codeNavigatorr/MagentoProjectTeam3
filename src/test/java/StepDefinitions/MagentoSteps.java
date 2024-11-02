package StepDefinitions;

import Pages.Elements;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class MagentoSteps {
    WebDriver driver = new ChromeDriver();
    Elements el = new Elements();


    @Given("navigate to magento")
    public void navigateToMagento() {
        GWD.getDriver().get("https://magento.softwaretestingboard.com/");
    }

    @When("Creat an account")
    public void creatAnAccount(DataTable dtclick) {
        List<String> account = dtclick.asList();

        for (int i = 0; i < account.size(); i++) {
            el.myClick(el.getWebElement(account.get(i)));
        }
    }

    @Then("enter the requested information")
    public void enterTheRequestedInformation(DataTable dtBilgiler) {
        List<List<String>> bilgiler = dtBilgiler.asLists();

        for (int i = 0; i < bilgiler.size(); i++) {
            el.mySendKeys(el.getWebElement(bilgiler.get(i).get(0)),bilgiler.get(i).get(1));

        }
    }

    @And("Return to home page")
    public void returnToHomePage() {
        driver.navigate().back();

    }

    @And("User should login successfully")
    public void userShouldLoginSuccessfully() {

            Assert.assertTrue(el.messageSuccess.getText().contains("Welcome"),"Hesap olusturulamadi");

    }
}
