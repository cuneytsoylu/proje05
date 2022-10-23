package tests.US_06;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.SpendinGoodPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;
public class TC_002 extends TestBaseRapor {
    SpendinGoodPage spendinGoodPage = new SpendinGoodPage();
    ReusableMethods reusable = new ReusableMethods();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void testCase01() throws InterruptedException {
        extentTest = extentReports.createTest("Prudoct Title ve Price goruntuleme", "Product Title ve price bilgisi ekleme");
        Driver.getDriver().get(ConfigReader.getProperty("spendingGoodUrl"));
        extentTest.info("spendingGoodUrl sitesine gidildi");
        spendinGoodPage.SignIn.click();
        extentTest.info("signIn butonuna tiklandi");
        spendinGoodPage.userNameBox.sendKeys(ConfigReader.getProperty("ortakVendorEmail"));
        spendinGoodPage.passwordBox.sendKeys(ConfigReader.getProperty("ortakVendorPassword"));
        spendinGoodPage.SignInButton.click();
        extentTest.info("email ve password girilip signin butonuna basildi");
        reusable.waitFor(2);
        spendinGoodPage.myAccount.click();
        extentTest.info("My Account butonuna tiklandi");
        spendinGoodPage.storeManager.click();
        extentTest.info("Store Manager butonuna tiklandi");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        spendinGoodPage.storeManagerProducts.click();
        extentTest.info("Products butonuna tiklandi");
        spendinGoodPage.addNew.click();
        reusable.waitFor(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        reusable.waitFor(2);
        spendinGoodPage.healthTik.click();
        spendinGoodPage.vitamin.click();
        Thread.sleep(2000);
      //  ReusableMethods.jsScrollClick(spendinGoodPage.vitamin);
        extentTest.info("vitamin kategorisi tiklandi");
        Thread.sleep(2000);
        Assert.assertTrue(spendinGoodPage.vitamin.isEnabled());
        extentTest.info("vitamin kategorisinin gorunurlugu dogrulandi");

      // ReusableMethods.jsExecutorScrool(spendinGoodPage.vitamin);
      //  ReusableMethods.jsExecutorClick(spendinGoodPage.vitamin);



    }
}
