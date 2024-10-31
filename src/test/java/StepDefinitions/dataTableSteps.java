package StepDefinitions;

import Pages.Elements;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;
import java.util.SplittableRandom;

public class dataTableSteps {

    Elements elements=new Elements();


    @And("User sendKeys in the Element")
    public void usersendKeysInTheElement(DataTable dtYazi) {
        List<List<String>>yazi=dtYazi.asLists();
        for (int i = 0; i <yazi.size() ; i++) {
           WebElement kutu=elements.getWebElement(yazi.get(i).get(0));
           elements.mySenkeys(kutu,yazi.get(i).get(1));

        }

    }

    @And("Click on the Element")
    public void clickOnTheElement(DataTable dtButton) {
        List<String>button=dtButton.asList();
        for (int i = 0; i < button.size(); i++) {
            elements.myClick(elements.getWebElement(button.get(i)));

        }
    }


}
