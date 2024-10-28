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





public WebElement getWebElement(String elemenName)
{
switch (elemenName.trim())
{
    case "searchInput" :return this.searchInput;
    case "searchButton" :return this.searchButton;
    case "productPhoto" : return this.productPhoto;
    case "SKUNumber" : return this.SKUNumber;
    case "negativeMessageNotice" :return this.negativeMessageNotice;
}
return null;
}

}



