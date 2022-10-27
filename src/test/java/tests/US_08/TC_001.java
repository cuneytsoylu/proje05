package tests.US_08;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.SpendinGoodPage;

import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.time.Duration;


public class TC_001 extends TestBaseRapor {
    public SpendinGoodPage spendinGoodPage = new SpendinGoodPage();
    public Actions actions = new Actions(Driver.getDriver());
    public Select select;
    ReusableMethods reusable = new ReusableMethods();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();


    @Test
    public void TC001() throws InterruptedException {
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
        Thread.sleep(1500);

        spendinGoodPage.inventory.click();
        //

        Assert.assertTrue(spendinGoodPage.sku.isDisplayed());
        Thread.sleep(2000);
        spendinGoodPage.SKU.click();
        spendinGoodPage.SKU.sendKeys("200");
        //ReusableMethods.jsExecutorScroll(spendinGoodPage.sku);
        //ReusableMethods.jsExecutorClick(spendinGoodPage.sku);

        actions.sendKeys(Keys.PAGE_DOWN).perform();


        Thread.sleep(2000);
        ReusableMethods.jsExecutorScroll(spendinGoodPage.manage);
        ReusableMethods.jsExecutorClick(spendinGoodPage.manage);
        // js.executeScript("arguments[0].click();",spendinGoodPage.sku);
        //js.executeScript("arguments[0].click();", spendinGoodPage.manage);
        ReusableMethods.waitFor(3);
        ReusableMethods.jsExecutorScroll(spendinGoodPage.stockQty);
        ReusableMethods.jsExecutorClick(spendinGoodPage.stockQty);
        //  spendinGoodPage.stockQty.click();
        spendinGoodPage.stockQty.clear();
        spendinGoodPage.stockQty.sendKeys("15", Keys.ENTER);
        ReusableMethods.waitFor(5);

        System.out.println(spendinGoodPage.stockQty.getText());
        Assert.assertTrue(spendinGoodPage.stockQty.isDisplayed());
        ReusableMethods.waitFor(3);




        //Manage Stock? altinda acilan Stock Qty bolumundeki kutucuga urun miktari girilir


        //Allow Backorders? Yanindaki kutucukta bulunan Allow yazisina tiklanir


            ReusableMethods.jsExecutorScroll(spendinGoodPage.allowBackordersDropdown);
            ReusableMethods.waitFor(1);
            ReusableMethods.jsExecutorClick(spendinGoodPage.allowBackordersDropdown);
            ReusableMethods.waitFor(1);
            ReusableMethods.jsExecutorScroll(spendinGoodPage.doNotAllow);
            ReusableMethods.waitFor(1);
            ReusableMethods.jsExecutorClick(spendinGoodPage.doNotAllow);


            //Submit butonuna tiklanir
            //Product Successfully Published mesajinin gorulebilir oldugu test edilir
            Thread.sleep(1000);
            ReusableMethods.jsExecutorScroll(spendinGoodPage.submit12);
            ReusableMethods.jsExecutorClick(spendinGoodPage.submit12);

            actions.sendKeys(Keys.DOWN).perform();
            ReusableMethods.waitForVisibility(spendinGoodPage.tamamYazisi, 9);
            Assert.assertTrue(spendinGoodPage.tamamYazisi.isDisplayed());
            Driver.closeDriver();
        }


    }



