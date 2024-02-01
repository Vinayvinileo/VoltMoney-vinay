package StepDefinition_package;

import PageObject_package.Cartpage_Object;
import PageObject_package.Inventorypage_Object;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class RemovefromCart_StepDef extends BasicDefinitions
{

    @Then("Click on cart")
    public void click_on_cart() throws InterruptedException {
        Thread.sleep(5000);
        inventorypage= new Inventorypage_Object(driver);
        inventorypage.clickCartIcon();

    }
    @Then("User click on Remove button and Item will be removed from Cart")
    public void user_click_on_remove_button_and_item_will_be_removed_from_cart() throws InterruptedException {
        cartpage = new Cartpage_Object(driver);
        Thread.sleep(5000);
      cartpage.Remove_saucelabsbackpack();


    }
}
