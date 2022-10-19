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
    public void maneger() {
        Driver.getDriver().get("https://spendinggood.com/");
        spend.SignIn.click();
        spend.userNameBox.sendKeys("ufukk031@gmail.com");
        spend.passwordBox.sendKeys("Team05");
        spend.SignInButton.click();
        reusable.waitFor(2);
        spend.myAccount.click();
    }
}
