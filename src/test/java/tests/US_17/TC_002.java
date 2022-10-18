package tests.US_17;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import page.SpendinGoodPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
public class TC_002 {
    SpendinGoodPage spend = new SpendinGoodPage();
    Actions action = new Actions(Driver.getDriver());
    ReusableMethods reusable= new ReusableMethods();
    @Test  public void shippingAddress(){
        Driver.getDriver().get("https://spendinggood.com/");
        spend.SignIn.click();
        spend.userNameBox.sendKeys(ConfigReader.getProperty("selcukEmail"));
        spend.passwordBox.sendKeys(ConfigReader.getProperty("selcukPassword"));
        spend.SignInButton.click();
        reusable.waitFor(2);
        spend.myAccount.click();
        spend.shippingAndBillingAddresses.click();
        action.sendKeys(Keys.PAGE_DOWN).perform();
        reusable.waitFor(2);



    }
}
