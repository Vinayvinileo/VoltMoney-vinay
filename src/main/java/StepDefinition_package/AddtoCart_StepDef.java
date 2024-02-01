package StepDefinition_package;

import PageObject_package.Cartpage_Object;
import PageObject_package.Inventorypage_Object;
import io.cucumber.java.en.Then;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.junit.Assert;

public class AddtoCart_StepDef extends BasicDefinitions
{

    @Then("User add one Item to Cart")
    public void user_add_one_item_to_cart()
    {
       inventorypage= new Inventorypage_Object(driver);
       inventorypage.clickAddtoCart_saucelabsbackpack();
    }
    @Then("Cart badge count is updated")
    public void cart_badge_count_is_updated() throws InterruptedException {
        String a=inventorypage.Cartcount();
        Thread.sleep(5000);
        if(a=="1")
        {
            System.out.println("Pass");

        }
    }

}
