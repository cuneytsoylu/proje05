package tests.US_17;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import page.SpendinGoodPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_001 {
    SpendinGoodPage spend = new SpendinGoodPage();
    Actions action = new Actions(Driver.getDriver());
    ReusableMethods reusable= new ReusableMethods();

    @Test
    public void billingAddress() throws InterruptedException {
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
        spend.editYourBilling.click();
        spend.billingName.sendKeys("Kamil");
        action.sendKeys(Keys.TAB).sendKeys("Yilmaz").sendKeys(Keys.TAB)
                .sendKeys("Borval").perform();
        spend.countryRegion.click();
        spend.belgium.click();
        action.sendKeys(Keys.TAB,"Bargiesstraat").sendKeys(Keys.TAB,"40")
                .sendKeys(Keys.TAB,"8900").sendKeys(Keys.TAB,"Leper")
                .sendKeys(Keys.TAB,"053593862728")
                .sendKeys(Keys.TAB,"borval54@yandex.com").perform();
        action.sendKeys(Keys.PAGE_DOWN).perform();
        reusable.waitFor(2);
        spend.saveAddress.click();




    }
}