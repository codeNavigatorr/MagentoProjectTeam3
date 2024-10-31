package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements extends ParentPage {
    public Elements() {PageFactory.initElements(GWD.getDriver(), this);}

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
    //USER STORY 5 LOCATORS***************************
    @FindBy (xpath = "(//img[@alt='Radiant Tee'])[2]")
    public WebElement randomItem;

    @FindBy (xpath = "(//div[@class='swatch-option text'])[2]")
    public WebElement itemSize;

    @FindBy (xpath = "(//div[@class='swatch-option color'])[2]")
    public WebElement itemColor;

    @FindBy (css = "[class='input-text qty']")
    public WebElement itemQTY;

    @FindBy (css = "[class='action primary tocart']")
    public WebElement addToCart;

    @FindBy (css = "[data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    public WebElement addingMessage;

    @FindBy(css = "[class='action showcart active']")
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



