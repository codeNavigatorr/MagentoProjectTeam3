package StepDefinitions;

import Pages.Elements;
import Utilities.GWD;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class tabMenuSteps {
    Elements elements=new Elements();
    Actions actions=new Actions(GWD.getDriver());
    @When("Clicking on each main category should display relevant subcategories.")
    public void clickingOnEachMainCategoryShouldDisplayRelevantSubcategories() {
        Assert.assertTrue(elements.WhatsNew4.isDisplayed(),"Whats new cannot be displayed");
        Assert.assertTrue(elements.Women4.isDisplayed(),"Women cannot be displayed");
        Assert.assertTrue(elements.Men4.isDisplayed(),"Men cannot be displayed");
        Assert.assertTrue(elements.Gear4.isDisplayed(),"Gear cannot be displayed");
        Assert.assertTrue(elements.Training4.isDisplayed(),"Training cannot be displayed");
        Assert.assertTrue(elements.Sale4.isDisplayed(),"Sale cannot be displayed");
    }
    @When("Clicking on each main category should display the relevant subcategories and displayed Tops and Bottoms")
    public void clickingOnEachMainCategoryShouldDisplayTheRelevantSubcategoriesAndDisplayedTopsAndBottoms() {
        actions.moveToElement(elements.Women4).build().perform();
        Assert.assertTrue(elements.TopsWomen4.isDisplayed(),"TopsWomen cannot be displayed");
        Assert.assertTrue(elements.BottomsWomen4.isDisplayed(),"BottomsWomen cannot be displayed");
        actions.moveToElement(elements.Men4).build().perform();
        Assert.assertTrue(elements.TopsMen4.isDisplayed(),"TopsMen cannot be displayed");
        Assert.assertTrue(elements.BottomsMen4.isDisplayed(),"BottomsMen cannot be displayed");
        actions.moveToElement(elements.Gear4).build().perform();
        actions.moveToElement(elements.Training4).build().perform();
    }


    @When("Clicking on the Tops and Bottoms subcategories should display the relevant product subcategories.")
    public void clickingOnTheTopsAndBottomsSubcategoriesShouldDisplayTheRelevantProductSubcategories() {
        actions.moveToElement(elements.Women4).build().perform();
        actions.moveToElement(elements.TopsWomenMenu4).build().perform();
        actions.moveToElement(elements.BottomsWomenMenu4).build().perform();
        actions.moveToElement(elements.Men4).build().perform();
        actions.moveToElement(elements.TopsMenMenu4).build().perform();

        actions.moveToElement(elements.BottomsMenMenu4).build().perform();
    }


}
