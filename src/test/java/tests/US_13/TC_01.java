package tests.US_13;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import page.SpendinGoodPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.time.Duration;

public class TC_01 extends TestBaseRapor {
   public SpendinGoodPage spendinGoodPage = new SpendinGoodPage();
    public Actions actions = new Actions(Driver.getDriver());
    public  Select select;



    @Test
    public void TC001() {
        extentTest = extentReports.createTest("Coupon Create", "kupon olusturabilme");
        Driver.getDriver().get(ConfigReader.getProperty("spendingGoodUrl"));
        extentTest.info("spendingGood sitesine gidildi");
        spendinGoodPage.SignIn.click();
        extentTest.info("signIn butonuna tiklandi");
        spendinGoodPage.userNameBox.sendKeys(ConfigReader.getProperty("cuneytEmail"));
        spendinGoodPage.passwordBox.sendKeys(ConfigReader.getProperty("cuneytPassword"));
        spendinGoodPage.SignInButton.click();
        extentTest.info("email ve password girilip signin butonuna basildi");
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(spendinGoodPage.SignInButton));
        spendinGoodPage.myAccount.click();
        extentTest.info("My Account butonuna tiklandi");
        spendinGoodPage.storeManager.click();
        extentTest.info("storeManagre'a tiklandi");
        spendinGoodPage.couponButton.click();
        extentTest.info("Coupons'a tiklanir");
        spendinGoodPage.couponAddNewButton.click();
        extentTest.info("Coupon'da AddNew butonuna tiklandi");
        spendinGoodPage.codeText.sendKeys("FreeShop");
        extentTest.pass("urun kodu code textbox'a girildi");
    }
        @Test(dependsOnMethods ="TC001")
        public void TC002() {
            spendinGoodPage.descriptionText.sendKeys("firsat urunu");
            extentTest.pass("Description text'e tanimlama yapildi");
    }

    @Test(dependsOnMethods ="TC002")
    public void TC003() {
        select=new Select(spendinGoodPage.discountType);
        select.selectByIndex(0);
        extentTest.pass("Discount Type'da indirim secenegi secildi");
    }
    @Test(dependsOnMethods ="TC003")
    public void TC004() {
        spendinGoodPage.couponAmount.clear();
        spendinGoodPage.couponAmount.sendKeys("15");
        extentTest.pass("Coupon Amount'a kupon adeti girildi");
    }
    @Test(dependsOnMethods ="TC004")
    public void TC005() {
        spendinGoodPage.couponExpiryDate.sendKeys("2022-12-12");
        extentTest.pass("Coupon Expiry Date'a son kullanim tarihi secildi");
    }
    @Test(dependsOnMethods ="TC005")
    public void TC006() {
        ReusableMethods.jsExecutorScrool(spendinGoodPage.allowFreeShipping);
        ReusableMethods.jsExecutorClick(spendinGoodPage.allowFreeShipping);
        extentTest.pass("Allow Free Shipping tiklandi");
    }
    @Test(dependsOnMethods ="TC006")
    public void TC007() {
        ReusableMethods.jsExecutorScrool(spendinGoodPage.showOnStore);
        ReusableMethods.jsExecutorClick(spendinGoodPage.showOnStore);
        extentTest.pass("Show On Store tiklandi");
    }


}

