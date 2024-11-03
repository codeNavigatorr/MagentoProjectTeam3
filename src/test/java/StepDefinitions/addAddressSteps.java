package StepDefinitions;

import Pages.Elements;
import Utilities.GWD;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class addAddressSteps {
    Elements em=new Elements();
    WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(15));
    JavascriptExecutor js=(JavascriptExecutor)GWD.getDriver();
    @Given("Navigate to Magento")
    public void navigateToMagento() {
        GWD.getDriver().get("https://magento.softwaretestingboard.com/");

    }

    @When("Enter username and password and click login button at Magento")
    public void enterUsernameAndPasswordAndClickLoginButtonAtMagento() {
        em.myClick(em.signin_magento);
        em.mySendKeys(em.email_magento,"jira19betul@gmail.com");
        em.mySendKeys(em.password_magento,"Magento1234");
    }

    @Then("User should login succesfully at Magento")
    public void userShouldLoginSuccesfullyAtMagento() {
    }

    @Then("User should reach address book at magento")
    public void userShouldReachAddressBookAtMagento() {
        em.myClick(em.signinto_magento);
        em.myClick(em.change_magento);
        em.myClick(em.myaccount_magento);
        em.myClick(em.addressbook_magento);
    }

    @When("Add new Additionaladdress and Create a Phone Number  as {string} Street Address as {string} City as {string} state as {string} Country as {string} Zipcode as {string}")
    public void addNewAdditionaladdressAndCreateAPhoneNumberAsStreetAddressAsCityAsStateAsCountryAsZipcodeAs(String phone, String street, String city, String state, String country, String zipcode) {

        //Adres eklmek üzere tıklanacak link

        em.myClick(em.addNewAdditionalAddress);

        js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); // tüm sayafı scroll

        //Adres alanları doldurulur

        em.mySendKeys(em.phoneNumber_magento,phone);
        em.mySendKeys(em.street_magento,street);
        em.mySendKeys(em.city_magento,city);
        em.mySendKeys(em.zipcode,zipcode);
        switch(country){
            case "Turkey":em.myClick(em.valueTRCountry_magento);break;
            case "Tonga" :em.myClick(em.valueTOCountry_magento);break;
            default: em.myClick(em.valueTHCountry_magento);
        }

        em.myClick(em.save_address_magento);
    }
    @When("Address Saved Successfully confirmation")
    public void addressSavedSuccessfullyConfirmation() {
        Assert.assertTrue(em.alertAddressSaved_magento.getText().contains("saved"),"Adress kayıt edilemedi");
    }
    // Biling adres değişimi sağlıklı yapılıyor mu?
    @Then("Edit billing address at magento PhoneNumber as {string}")
    public void editBillingAddressAtMagentoPhoneNumberAs(String editphoneNumber) {
        em.myClick(em.editBillingAddress);
        em.mySendKeys(em.phoneNumber_magento,editphoneNumber);
        em.myClick(em.save_address_magento);
    }
    // Shiping adres değişimi sağlıklı yapılıyor mu?
    @Then("Edit shipping address at magento city as {string}")
    public void editShippingAddressAtMagentoCityAs(String citynew) {
        em.myClick(em.editShippingAddress);
        em.mySendKeys(em.city_magento,citynew);
        em.myClick(em.save_address_magento);
    }
    //Adresin silinmesi sağlıklı yapılıyor mu?
    @Then("delete address from additional address entries at magento")
    public void deleteAddressFromAdditionalAddressEntriesAtMagento() {
        em.myClick(em.deleteaddress_magento);
        em.myClick(em.deleteAddressOK_magento);
    }



}


