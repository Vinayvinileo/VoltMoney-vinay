package StepDefinition_package;

import PageObject_package.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class BasicDefinitions
    {
        public static WebDriver driver; // By using static even after class is teardown still holds the value
        public WebDriver getDriver()
        {
            if (driver==null)
            {
                WebDriverManager.chromedriver().setup(); // for Chrome Browser
                driver=new ChromeDriver();
            }
            return driver;
        }
        public Loginpage_Object loginpage;
        public Inventorypage_Object inventorypage;
        public Cartpage_Object cartpage;

        public CheckoutSteptwopage_Object checkoutSteptwopage;
        public CheckoutSteponepage_Object checkoutSteponepage;
}
