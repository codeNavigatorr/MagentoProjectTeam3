package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements extends ParentPage {
    public Elements() {PageFactory.initElements(GWD.getDriver(), this);}
    //betul
    @FindBy(xpath = "//*[@name='postcode']")
    public WebElement zipcode;

    @FindBy (xpath = "//*[@class='label' and @for='primary_billing']")
    public  WebElement choicebillinaddress_magento;

    @FindBy (xpath = "//*[@class='label' and @for='primary_shipping']")
    public WebElement choiceShippingaddress_magento;

    @FindBy(xpath = "//*[text()='OK']")
    public WebElement deleteAddressOK_magento;

    @FindBy (xpath = "//*[@class='action delete']")
    public WebElement deleteaddress_magento;

    @FindBy (xpath = "//*[@class='action primary add']")
    public WebElement manageAddress;

    @FindBy(xpath = "//*[text()='Add New Address']")
    public WebElement addNewAdditionalAddress;

    @FindBy(xpath = "//*[@class='action edit']")
    public  WebElement addAdditionalnewAddresses_magento;

    @FindBy (xpath = "(//*[@class='action edit'])[2]")
    public WebElement editShippingAddress;

    @FindBy (xpath = "//*[@class='action edit']")
    public WebElement editBillingAddress;

    @FindBy(xpath = "//div[@role='alert']/div/div")
    public WebElement alertAddressSaved_magento;

    @FindBy(xpath = "//*[@data-action='save-address']")
    public WebElement save_address_magento;

    @FindBy(xpath = "//option[@value='TR']")
    public WebElement valueTRCountry_magento;

    @FindBy(xpath = "//option[@value='TO']")
    public WebElement valueTOCountry_magento;

    @FindBy(xpath = "//option[@value='TH']")
    public WebElement valueTHCountry_magento;

    @FindBy(xpath = "//*[@name='postcode']")
    public WebElement postcode_magento;

    @FindBy(xpath = "//option[@value='1']")
    public WebElement value1State_magento;

    @FindBy(xpath = "//option[@value='2']")
    public WebElement value2State_magento;

    @FindBy(xpath = "//option[@value='3']")
    public WebElement value3State_magento;

    @FindBy(xpath = "//*[@id='region_id']")
    public WebElement region_magento;

    @FindBy(xpath = "//*[@name='city']")
    public WebElement city_magento;

    @FindBy(xpath = "//*[@name='street[]']")
    public WebElement street_magento;

    @FindBy(xpath = "//*[@name='telephone']")
    public WebElement phoneNumber_magento;

    @FindBy(xpath = "//*[text()='My Account']")
    public WebElement myaccount_magento;

    @FindBy(xpath = "//*[@class='action switch']")
    public WebElement change_magento;

    @FindBy(xpath ="(//*[@class='authorization-link'])[1]/a")
    public WebElement signin_magento;

    @FindBy(xpath ="//*[@name='login[username]']")
    public WebElement email_magento;

    @FindBy(xpath ="//*[@name='login[password]']")
    public WebElement password_magento;

    @FindBy(xpath ="(//*[text()='Address Book'])[2]")
    public WebElement addressbook_magento;

    @FindBy(xpath = "(//*[@name='send'])[1]")
    public WebElement signinto_magento;

    @FindBy(id="search")
    public WebElement search;
    //betul

    //Login elementleri

    @FindBy(xpath = "(//li[@class='authorization-link']/a)[1]")
    public WebElement singIn;

    @FindBy(css = "[name='login[username]']")
    public WebElement email;

    @FindBy(css = "[name='login[password]']")
    public WebElement password1;

    @FindBy(xpath = "//button[@class='action login primary']")
    public WebElement singIng2;

    @FindBy(xpath = "(//span[text()='Forgot Your Password?'])[1]")
    public WebElement forgatPasswordButton;

    @FindBy(xpath = "(//span[@class='logged-in'])[1]")
    public WebElement loginSuccessfuly;
    // buraya kadar


    //SearchFunctionalty
    @FindBy(css = "[placeholder='Search entire store here...']")
    public WebElement searchInput;

    @FindBy(css = "[class='action search']")
    public WebElement searchButton;

    @FindBy(css = "[class='product-image-photo']")
    public WebElement productPhoto;

    @FindBy(css = "[itemprop='sku']")
    public WebElement SKUNumber;

    @FindBy(css = "[class='message notice']")
    public WebElement negativeMessageNotice;

    // US 4 TAb menu 
    @FindBy(id = "ui-id-3")
    public WebElement WhatsNew4;

    @FindBy(xpath = "//span[text()='Women']")
    public WebElement Women4;

    @FindBy(xpath = "//span[text()='Men']")
    public WebElement Men4;

    @FindBy(xpath = "//span[text()='Gear']")
    public WebElement Gear4;

    @FindBy(xpath = "//span[text()='Training']")
    public WebElement Training4;

    @FindBy(xpath = "//span[text()='Sale']")
    public WebElement Sale4;


    @FindBy(xpath = "(//a[@class='ui-corner-all'])[1]")
    public WebElement TopsWomen4;

    @FindBy(xpath = "(//a[@class='ui-corner-all'])[6]")
    public WebElement BottomsWomen4;

    @FindBy(xpath = "(//a[@class='ui-corner-all'])[9]")
    public WebElement TopsMen4;

    @FindBy(xpath = "(//a[@class='ui-corner-all'])[14]")
    public WebElement BottomsMen4;

    @FindBy(xpath = "(//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e'])[2]")
    public WebElement TopsWomenMenu4;

    @FindBy(xpath = "(//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e'])[3]")
    public WebElement  BottomsWomenMenu4;

    @FindBy(xpath = "(//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e'])[5]")
    public WebElement  TopsMenMenu4;

    @FindBy(xpath = "(//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e'])[6]")
    public WebElement  BottomsMenMenu4;

    //4 us buraya kadar

    //USER STORY 5 LOCATORS***************************
    @FindBy (xpath = "(//div[@class='product-item-info'])[1]")
    public WebElement randomItem;

    @FindBy (xpath = "(//div[@class='swatch-option text'])[2]")
    public WebElement itemSize;

    @FindBy (xpath = "(//div[@class='swatch-option color'])[2]")
    public WebElement itemColor;

    @FindBy (css = "[class='input-text qty']")
    public WebElement itemQTY;

    @FindBy (css = "[class='action primary tocart']")
    public WebElement addToCart;

    @FindBy (xpath = "//div[@class='message-success success message']//div")
    public WebElement addingMessage;

    @FindBy(xpath = "//a[@class='action showcart']")
    public WebElement shoppingCartBox;

    @FindBy (css = "[class='action delete']")
    public WebElement deleteButton;

    @FindBy (css = "[class='action-primary action-accept']")
    public WebElement OK;


    //************************************************
public WebElement getWebElement(String elemenName)
{
switch (elemenName.trim())
{
    case "searchInput" :return this.searchInput;
    case "searchButton" :return this.searchButton;
    case "productPhoto" : return this.productPhoto;
    case "SKUNumber" : return this.SKUNumber;
    case "negativeMessageNotice" :return this.negativeMessageNotice;
    case "randomItem" : return this.randomItem;
    case "itemSize" :return this.itemSize;
    case "itemColor" :return this.itemColor;
    case "itemQTY" : return this.itemQTY;
    case "addToCart" :return this.addToCart;
    case "addingMessage" :return this.addingMessage;
    case "shoppingCartBox" :return this.shoppingCartBox;
    case "deleteButton" :return this.deleteButton;
    case "OK" :return this.OK;

}
return null;




}

}



