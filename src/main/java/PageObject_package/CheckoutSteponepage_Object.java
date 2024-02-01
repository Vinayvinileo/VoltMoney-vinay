package PageObject_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutSteponepage_Object
{
    @FindBy(id = "first-name") @CacheLookup WebElement FN ;
    @FindBy(id = "last-name") @CacheLookup WebElement LN ;
    @FindBy(id = "postal-code") @CacheLookup WebElement PC ;
    @FindBy(id = "continue") @CacheLookup WebElement continuebtn ;

    //Action Methods
    WebDriver ldriver;
    public  CheckoutSteponepage_Object  (WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    public void setFN(String firstname)
    {
        FN.sendKeys(firstname);
    }
    public void setLN(String lastname)
    {
        LN.sendKeys(lastname);
    }

    public void setPC(String postalcode)
    {
        PC.sendKeys(postalcode);
    }

    public void clickonContinue()
    {
        continuebtn.click();
    }


}
