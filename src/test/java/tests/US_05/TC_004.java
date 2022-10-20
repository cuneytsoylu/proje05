package tests.US_05;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.SpendinGoodPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import static org.testng.AssertJUnit.assertTrue;

public class TC_004 extends TestBaseRapor {
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
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        spendinGoodPage.addNew.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("addNew butonuna tiklandi");

        spendinGoodPage.urunIlkResimEkleme.click();
        extentTest.info("ilk urun ekleme bolumune tiklandi");
        spendinGoodPage.mediaLibrary.click();
        extentTest.info("mediaLibrary butonuna tiklandi");
        spendinGoodPage.eklenecekResim.click();
        extentTest.info("eklenecek ilk resme tiklandi");
        spendinGoodPage.select.click();
        extentTest.info("Select butonuna tiklandi");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", spendinGoodPage.urunIkinciResimEkleme);
        Thread.sleep(2000);
        extentTest.info("Ikinci urun ekleme bolumune tiklandi");
        js.executeScript("arguments[0].click();", spendinGoodPage.eklenecekIkinciResim);
        Thread.sleep(1000);
        extentTest.info("Ikinci urun eklendi");
        spendinGoodPage.addToGallery.click();
        Assert.assertTrue(spendinGoodPage.urunIlkResimEkleme.isDisplayed() && spendinGoodPage.urunIkinciResimEkleme.isDisplayed());
        extentTest.info("eklenen iki urunun gorunurlugu dogrulandi");










    }
}























