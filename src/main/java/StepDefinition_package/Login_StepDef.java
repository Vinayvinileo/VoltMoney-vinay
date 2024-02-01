package StepDefinition_package;

import PageObject_package.Loginpage_Object;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class Login_StepDef extends BasicDefinitions
{
    WebDriver driver=getDriver();

    @Given("User launch browser")
    public void user_launch_browser()
    {
        loginpage = new Loginpage_Object(driver);
        driver.manage().window().maximize();
    }
    @Then("User Launch URL as {string}")
    public void user_launch_url_as(String url)
    {
        driver.get(url);
    }
    @Then("User Enter UserID as {string} and Password as {string}")
    public void user_enter_user_id_as_and_password_as(String UN, String PWD)
    {
        loginpage.setUsername(UN);
        loginpage.setPassword(PWD);
    }

    @Then("User click on Login")
    public void user_click_on_login()
    {
        loginpage.clickLogin();
    }

   @Then("User is displayed with home page {string}")
    public void user_is_displayed_with_home_page(String Eurl) throws InterruptedException {
       String Curl= driver.getCurrentUrl();
           Assert.assertEquals(Eurl,Curl);
           Thread.sleep(5000);
    }
}
