package PageObject_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Inventorypage_Object

{
    @FindBy(id = "add-to-cart-sauce-labs-backpack") @CacheLookup WebElement Addtocart_saucelabsbackpack;
    @FindBy(xpath = "//span[@class='shopping_cart_badge']") @CacheLookup WebElement Cartbadgecount;
    @FindBy(xpath = "//a[@class=\"shopping_cart_link\"]") @CacheLookup WebElement CartIcon;

//Action methods
    WebDriver ldriver;
    public Inventorypage_Object (WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    public void clickAddtoCart_saucelabsbackpack()
    {
        Addtocart_saucelabsbackpack.click();
    }
    public String  Cartcount()
    {
      String  x=  Cartbadgecount.getText();
      return x;
    }

    public void clickCartIcon()
    {
        CartIcon.click();
    }
}
