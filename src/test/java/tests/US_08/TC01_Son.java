package tests.US_08;

import com.github.javafaker.Faker;
        import org.openqa.selenium.By;
        import org.openqa.selenium.JavascriptExecutor;
        import org.openqa.selenium.Keys;
        import org.openqa.selenium.interactions.Actions;
        import org.testng.Assert;
        import org.testng.annotations.Test;

import page.SpendinGoodPage;
import utilities.ConfigReader;
        import utilities.Driver;
        import utilities.ReusableMethods;
        import java.util.Random;
public class TC01_Son {
    SpendinGoodPage spendinGoodPage = new SpendinGoodPage();
    ReusableMethods reusable = new ReusableMethods();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    Actions actions = new Actions(Driver.getDriver());
    Random random =new Random();

    @Test
    public void test01() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("spendingGoodUrl"));

        spendinGoodPage.SignIn.click();

        spendinGoodPage.userNameBox.sendKeys(ConfigReader.getProperty("ortakVendorEmail"));
        spendinGoodPage.passwordBox.sendKeys(ConfigReader.getProperty("ortakVendorPassword"));
        spendinGoodPage.SignInButton.click();

        reusable.waitFor(2);
        spendinGoodPage.myAccount.click();

        spendinGoodPage.storeManager.click();

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        spendinGoodPage.storeManagerProducts.click();

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        spendinGoodPage.addNew.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        //Acilan sayfada Inventory butonuna tiklanir
       spendinGoodPage.productTitle.sendKeys(Faker.instance().name().title());
        spendinGoodPage.urunIlkResimEkleme.click();

        spendinGoodPage.mediaLibrary.click();

        spendinGoodPage.eklenecekResim.click();

        spendinGoodPage.select.click();


        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", spendinGoodPage.urunIkinciResimEkleme);
        Thread.sleep(2000);

        js.executeScript("arguments[0].click();", spendinGoodPage.eklenecekIkinciResim);
        Thread.sleep(1000);

        spendinGoodPage.addToGallery.click();
        Assert.assertTrue(spendinGoodPage.urunIlkResimEkleme.isDisplayed() && spendinGoodPage.urunIkinciResimEkleme.isDisplayed());
        ReusableMethods.waitFor(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        reusable.waitFor(2);

       // spendinGoodPage.bestSeller.click();
        ReusableMethods.jsExecutorScroll(spendinGoodPage.bestSeller);
        ReusableMethods.jsExecutorClick(spendinGoodPage.bestSeller);
        if(!spendinGoodPage.manage.isSelected()){
            spendinGoodPage.manage.click();
        }
        //Manage Stock? altinda acilan Stock Qty bolumundeki kutucuga urun miktari girilir
       // int urunMiktari =13;
        spendinGoodPage.sku.clear();
        spendinGoodPage.sku.sendKeys("200");
        Thread.sleep(1000);

        ReusableMethods.jsExecutorScroll(spendinGoodPage.manage);
        ReusableMethods.jsExecutorClick(spendinGoodPage.manage);

      //  if(!spendinGoodPage.manage.isSelected()){
        //    spendinGoodPage.manage.click();
        //Submit butonuna tiklanir
        //"Product Successfully Published" mesajinin gorulebilir oldugu test edilir


        spendinGoodPage.stockQtyTextBox.click();
        spendinGoodPage.stockQtyTextBox.sendKeys(ConfigReader.getProperty("sku1"));
        //Allow Backorders? Yanindaki kutucukta bulunan Allow yazisina tiklanir
        actions.sendKeys(Keys.TAB).perform();

        ReusableMethods.jsExecutorClick(spendinGoodPage.allow);
       // if (!spendinGoodPage.allow.isSelected()) {
         //   spendinGoodPage.allow.click();
            Thread.sleep(1000);
            ReusableMethods.jsExecutorScroll(spendinGoodPage.submitButton);
            ReusableMethods.jsExecutorClick(spendinGoodPage.submitButton);
            actions.sendKeys(Keys.DOWN).perform();
            ReusableMethods.waitForVisibility(spendinGoodPage.tamamYazisi,9);
            Assert.assertTrue(spendinGoodPage.tamamYazisi.isDisplayed());
            Driver.closeDriver();

        }

        }

