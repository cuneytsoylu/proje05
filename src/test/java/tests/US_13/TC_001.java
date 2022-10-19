package tests.US_13;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import page.SpendinGoodPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_001 extends TestBaseRapor {
    SpendinGoodPage spendinGoodPage = new SpendinGoodPage();
    Actions actions = new Actions(Driver.getDriver());
    ReusableMethods reusable = new ReusableMethods();

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
        ReusableMethods.waitForClickablility(spendinGoodPage.myAccount,2);
        spendinGoodPage.myAccount.click();
        extentTest.info("My Account butonuna tiklandi");
        spendinGoodPage.storeManager.click();
        extentTest.info("storeManagre'a tiklandi");
        spendinGoodPage.couponButton.click();
        extentTest.info("Coupons'a tiklanir");
        spendinGoodPage.couponAddNewButton.click();
        extentTest.info("Coupon'da AddNew butonuna tiklandi");



    }
}
