package PageObject_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutSteptwopage_Object
{
    @FindBy(id = "finish") @CacheLookup WebElement finishbtn;

    //Actions Methods
    WebDriver ldriver;
    public  CheckoutSteptwopage_Object  (WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }
    public void clickonFinish()
    {
        finishbtn.click();
    }
}
