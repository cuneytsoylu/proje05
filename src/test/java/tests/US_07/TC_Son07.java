package tests.US_07;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.SpendinGoodPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_Son07 extends TestBaseRapor {
    public SpendinGoodPage spendinGoodPage = new SpendinGoodPage();
    public Actions actions = new Actions(Driver.getDriver());
    public Select select;
    ReusableMethods reusable = new ReusableMethods();



    @Test
    public void TC001() {
        extentTest = extentReports.createTest("Urun brandlerini belirleyebilme");
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
         actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();

    }

    @Test(dependsOnMethods = "TC001")
    public void TC002() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        ReusableMethods.jsExecutorScrool(spendinGoodPage.elegantAutoGroup);
        ReusableMethods.jsExecutorClick(spendinGoodPage.elegantAutoGroup);

        Assert.assertTrue(spendinGoodPage.storeManagerProducts.isDisplayed());
        extentTest.pass("elegantAutoGroup brandi oldugu dogrulandi ve tiklandi");
    }

    @Test(dependsOnMethods = "TC002")
    public void TC003() {
        ReusableMethods.jsExecutorScrool(spendinGoodPage.greenGrace);
        ReusableMethods.jsExecutorClick(spendinGoodPage.greenGrace);

        Assert.assertTrue(spendinGoodPage.storeManagerProducts.isDisplayed());
        extentTest.pass("greenGrace brandi oldugu dogrulandi ve tiklandi");

    }

    @Test(dependsOnMethods = "TC003")
    public void TC004() {
        ReusableMethods.jsExecutorScrool(spendinGoodPage.nodeJs);
        ReusableMethods.jsExecutorClick(spendinGoodPage.nodeJs);

        Assert.assertTrue(spendinGoodPage.storeManagerProducts.isDisplayed());
        extentTest.pass("nodeJs brandi oldugu dogrulandi ve tiklandi");

    }

    @Test(dependsOnMethods = "TC004")
    public void TC005() {
        ReusableMethods.jsExecutorScrool(spendinGoodPage.ns8);
        ReusableMethods.jsExecutorClick(spendinGoodPage.ns8);

        Assert.assertTrue(spendinGoodPage.storeManagerProducts.isDisplayed());
        extentTest.pass("ns8 brandi oldugu dogrulandi ve tiklandi");
    }

    @Test(dependsOnMethods = "TC005")
    public void TC006() {
        ReusableMethods.jsExecutorScrool(spendinGoodPage.red);
        ReusableMethods.jsExecutorClick(spendinGoodPage.red);

        Assert.assertTrue(spendinGoodPage.storeManagerProducts.isDisplayed());
        extentTest.pass("red brandi oldugu dogrulandi ve tiklandi");
    }
    @Test(dependsOnMethods = "TC006")
    public void TC007() {
        ReusableMethods.jsExecutorScrool(spendinGoodPage.skySuiteTech);
        ReusableMethods.jsExecutorClick(spendinGoodPage.skySuiteTech);

        Assert.assertTrue(spendinGoodPage.storeManagerProducts.isDisplayed());
        extentTest.pass("skySuiteTech brandi oldugu dogrulandi ve tiklandi");
    }
    @Test(dependsOnMethods = "TC007")
    public void TC008() {
        ReusableMethods.jsExecutorScrool(spendinGoodPage.sterling);
        ReusableMethods.jsExecutorClick(spendinGoodPage.sterling);

        Assert.assertTrue(spendinGoodPage.storeManagerProducts.isDisplayed());
        extentTest.pass("sterling brandi oldugu dogrulandi ve tiklandi");
    }
    public static void run() {
        TC_Son07 test = new TC_Son07();
        test.TC001();
        test.TC002();
        test.TC003();
        test.TC004();
        test.TC005();
        test.TC006();
        test.TC007();
}

}