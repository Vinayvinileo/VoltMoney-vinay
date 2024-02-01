package StepDefinition_package;

import PageObject_package.Cartpage_Object;
import PageObject_package.CheckoutSteponepage_Object;
import PageObject_package.CheckoutSteptwopage_Object;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Checkoutform_StepDef extends BasicDefinitions
{
    @Then("User click on Checkout")
    public void user_click_on_checkout()
    {
        cartpage=new Cartpage_Object(driver);
        cartpage.clickOnCheckout();
        checkoutSteponepage= new CheckoutSteponepage_Object(driver);
        checkoutSteponepage.clickonContinue();
    }
    @Then("User Enter FN as {string}, LN as {string}, Zipcode as {string} and click on Continue")
    public void user_enter_fn_as_ln_as_zipcode_as_and_click_on_continue(String FN, String LN, String PC)
    {
     checkoutSteponepage.setFN(FN);
     checkoutSteponepage.setLN(LN);
     checkoutSteponepage.setPC(PC);
     checkoutSteponepage.clickonContinue();
    }
    @Then("User navigated to Overview, click on Finish and Checkout will be completed")
    public void user_navigated_to_overview_click_on_finish_and_checkout_will_be_completed()
    {
        checkoutSteptwopage= new CheckoutSteptwopage_Object(driver);
        checkoutSteptwopage.clickonFinish();

    }
}
