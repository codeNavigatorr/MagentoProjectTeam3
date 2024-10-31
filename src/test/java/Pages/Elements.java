package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements extends ParentPage {
    public Elements() {
        PageFactory.initElements(GWD.getDriver(),this);}

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
    //TAb menu sefacan
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




}

