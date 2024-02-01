package PageObject_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartpage_Object
{
    @FindBy(xpath = "//span[@class='shopping_cart_badge']") @CacheLookup WebElement Cartbadgecount;
    @FindBy(id = "remove-sauce-labs-backpack") @CacheLookup WebElement Remove_saucelabsbackpack ;
    @FindBy(id = "checkout") @CacheLookup WebElement Checkoutbtn ;

    //Action methods
    WebDriver ldriver;
    public Cartpage_Object (WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }
    public String  Cartcount()
    {
        String  x=  Cartbadgecount.getText();
        return x;
    }
    public void Remove_saucelabsbackpack()
    {
        Remove_saucelabsbackpack.click();
    }

    public String RemovedItem() throws InterruptedException {
        Thread.sleep(3000);
        WebElement RemovedItem= ldriver.findElement(By.xpath( "class=\"removed_cart_item\""));
        String str=RemovedItem.getAttribute("class");
        return str;
    }

    public void clickOnCheckout()
    {
        Checkoutbtn.click();
    }
}
