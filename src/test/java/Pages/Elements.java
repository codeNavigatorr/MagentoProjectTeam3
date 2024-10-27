package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements extends ParentPage {
    public Elements() {
        PageFactory.initElements(GWD.getDriver(),this);}

    @FindBy(xpath = "(//li[@class='authorization-link']/a)[1]")
    public WebElement singIn;

    @FindBy(css = "[name='login[username]']")
    public WebElement email;

    @FindBy(css = "[name='login[password]']")
    public WebElement password1;

    @FindBy(xpath = "//button[@class='action login primary']")
    public WebElement singIng2;

    @FindBy(xpath = "(//span[@class='logged-in'])[1]")
    public WebElement loginSuccessfuly;




}

