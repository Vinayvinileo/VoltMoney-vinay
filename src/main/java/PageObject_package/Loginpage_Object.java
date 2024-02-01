package PageObject_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Loginpage_Object
{
    @FindBy(id = "user-name") @CacheLookup WebElement Username;
    @FindBy(id = "password") @CacheLookup WebElement Password;
    @FindBy(id = "login-button") @CacheLookup WebElement Loginbtn;
    //Action methods
    WebDriver ldriver;
    public Loginpage_Object (WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    public void setUsername(String UN)
    {
        Username.sendKeys(UN);
    }
    public void setPassword(String PWD)
    {
        Password.sendKeys(PWD);
    }
    public void clickLogin()
    {
        Loginbtn.click();
    }

}
