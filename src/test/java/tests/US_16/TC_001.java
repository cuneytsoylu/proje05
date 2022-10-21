package tests.US_16;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import page.SpendinGoodPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_001 {
    SpendinGoodPage spend = new SpendinGoodPage();
    Actions action = new Actions(Driver.getDriver());
    ReusableMethods reusable = new ReusableMethods();

    @Test
    public void maneger() throws InterruptedException {
        Driver.getDriver().get("https://spendinggood.com/");
        spend.SignIn.click();
        spend.userNameBox.sendKeys(ConfigReader.getProperty("ortakVendorEmail"));
        spend.passwordBox.sendKeys(ConfigReader.getProperty("ortakVendorPassword"));
        spend.SignInButton.click();
        reusable.waitFor(2);
        spend.myAccount.click();
        Thread.sleep(3000);
        spend.StoreManager.click();
        Thread.sleep(3000);
        spend.Customers.click();
    }
}
