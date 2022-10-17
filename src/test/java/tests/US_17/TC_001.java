package tests.US_17;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import page.SpendinGoodPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_001 {
    SpendinGoodPage spend = new SpendinGoodPage();
    Actions action = new Actions(Driver.getDriver());

    @Test
    public void billingAddress() {
        Driver.getDriver().get("https://spendinggood.com/");
        spend.SignIn.click();
        spend.userNameBox.sendKeys(ConfigReader.getProperty("selcukEmail"));
        spend.passwordBox.sendKeys(ConfigReader.getProperty("selcukPassword"));
        spend.SignInButton.click();
        spend.myAccount.click();
        spend.shippingAndBillingAddresses.click();
        spend.editYourBilling.click();
        spend.billingName.sendKeys(ConfigReader.getProperty("skIsim"));
        action.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("skSoyisim")).sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("skCompany")).perform();
    }
}